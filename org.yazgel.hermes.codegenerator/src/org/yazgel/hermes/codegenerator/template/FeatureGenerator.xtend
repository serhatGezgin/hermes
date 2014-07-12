package org.yazgel.hermes.codegenerator.template

import org.yazgel.hermes.DataType
import org.yazgel.hermes.Feature
import org.yazgel.hermes.Ref

class FeatureGenerator extends BaseGenerator {

	def generateFeature(Feature d) {
		d.featureAnnotation + d.featureContent
	}

	def featureAnnotation(Feature f) {
		var sb = new StringBuilder

		for (fa : f.annotations) {
			sb.append('@' + fa.toString)
			sb.append('\n')
		}

		sb.toString
	}

	def dispatch featureContent(Feature f) {
	}

	def dispatch featureContent(DataType d) '''
		private «d.type» «d.name»;
	'''

	def dispatch featureContent(Ref r) '''
		«IF r.many»
			private java.util.List<Ref<«r.refTo.name»>> «r.name»;
		«ELSE»
			private Ref<«r.refTo.name»> «r.name»;
		«ENDIF»
	'''

	def dispatch generateGetterSetter(Feature f) {
	}

	def dispatch generateGetterSetter(DataType dt) '''
		public «dt.gettername»(){
			return this.«dt.name»;
		}
		
		public void «dt.settername»(«dt.type» «dt.name»){
			this.«dt.name» = «dt.name»;
		}
	'''

	def gettername(DataType dt) {
		'get' + dt.name.toFirstUpper
	}

	def settername(DataType dt) {
		'set' + dt.name.toFirstUpper
	}
}
