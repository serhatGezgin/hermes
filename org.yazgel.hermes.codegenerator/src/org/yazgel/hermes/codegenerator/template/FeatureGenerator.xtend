package org.yazgel.hermes.codegenerator.template

import java.sql.Ref
import org.yazgel.hermes.DataType
import org.yazgel.hermes.Feature
import org.yazgel.hermes.Reference

class FeatureGenerator extends BaseGenerator {

	def generateFeature(Feature d) {
		d.featureAnnotation + d.featureContent
	}

	def featureAnnotation(Feature f) {
		val sb = new StringBuilder

		f.annotations.forEach [
			sb.append('@com.googlecode.objectify.annotation.' + it.toString)
			sb.append('\n')
		]

		sb.toString
	}

	def dispatch featureContent(Feature f) {
	}

	def dispatch featureContent(DataType d) '''
		private «d.type» «d.name»;
	'''

	def dispatch featureContent(Reference r) '''
		«IF r.many»
			private java.util.List<com.googlecode.objectify.Ref<«r.reference.name»>> «r.name» = new java.util.ArrayList<>();
		«ELSE»
			private com.googlecode.objectify.Ref<«r.reference.name»> «r.name»;
		«ENDIF»
	'''

	def dispatch generateGetterSetter(Feature f) {
	}

	def dispatch generateGetterSetter(DataType dt) '''
		public «dt.type» «dt.gettername»(){
			return this.«dt.name»;
		}
		
		public void «dt.settername»(«dt.type» «dt.name»){
			this.«dt.name» = «dt.name»;
		}
	'''

	def dispatch generateGetterSetter(Reference ref) '''
		«IF ref.many»
			public java.util.List<«ref.reference.name»> «ref.gettername»() {
				java.util.List<«ref.reference.name»> list = new java.util.ArrayList<>();
				for (com.googlecode.objectify.Ref<«ref.reference.name»> i : this.«ref.name») {
					list.add(i.getValue());
				}
				return list;
			}

			public void «ref.settername»(java.util.List<«ref.reference.name»> «ref.name») {
				for («ref.reference.name» i : «ref.name») {
					this.«ref.name».add(com.googlecode.objectify.Ref.create(i));
				}
			}
		«ELSE»
			public «ref.reference.name» «ref.gettername»() {
				if (this.«ref.name» == null) {
					return null;
				}
				return this.«ref.name».getValue();
			}
			
			public void «ref.settername»(«ref.reference.name» «ref.name») {
				if («ref.name» != null) {
					this.«ref.name» = com.googlecode.objectify.Ref.create(«ref.name»);
				}
			}
		«ENDIF»
		'''
}
