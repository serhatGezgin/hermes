package org.yazgel.hermes.codegenerator.template

import org.yazgel.hermes.DataType
import org.yazgel.hermes.Feature
import org.yazgel.hermes.Ref

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

	def dispatch featureContent(Ref r) '''
		«IF r.many»
			private java.util.List<com.googlecode.objectify.Ref<«r.refTo.name»>> «r.name» = new java.util.ArrayList<>();
		«ELSE»
			private com.googlecode.objectify.Ref<«r.refTo.name»> «r.name»;
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

	def dispatch generateGetterSetter(Ref ref) '''
		«IF ref.many»
			public java.util.List<«ref.refTo.name»> «ref.gettername»() {
				java.util.List<«ref.refTo.name»> list = new java.util.ArrayList<>();
				for (com.googlecode.objectify.Ref<«ref.refTo.name»> i : this.«ref.name») {
					list.add(i.getValue());
				}
				return list;
			}

			public void «ref.settername»(java.util.List<«ref.refTo.name»> «ref.name») {
				for («ref.refTo.name» i : «ref.name») {
					this.«ref.name».add(com.googlecode.objectify.Ref.create(i));
				}
			}
		«ELSE»
			public «ref.refTo.name» «ref.gettername»() {
				if (this.«ref.name» == null) {
					return null;
				}
				return this.«ref.name».getValue();
			}
			
			public void «ref.settername»(«ref.refTo.name» «ref.name») {
				if («ref.name» != null) {
					this.«ref.name» = com.googlecode.objectify.Ref.create(«ref.name»);
				}
			}
		«ENDIF»
		'''

	def gettername(Feature f) {
		'get' + f.name.toFirstUpper
	}

	def settername(Feature f) {
		'set' + f.name.toFirstUpper
	}
}
