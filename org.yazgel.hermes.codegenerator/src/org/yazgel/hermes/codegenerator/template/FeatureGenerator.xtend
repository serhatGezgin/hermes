package org.yazgel.hermes.codegenerator.template

import org.yazgel.hermes.DataType
import org.yazgel.hermes.Feature

class FeatureGenerator extends BaseGenerator {

	def dispatch generateFeature(Feature d) {
	}

	def dispatch generateFeature(DataType d) {
		d.featureAnnotation + d.featureContent
	}

	def featureAnnotation(DataType d) {
		var sb = new StringBuilder

		for (fa : d.annotations) {
			sb.append('@' + fa.toString)
			sb.append('\n')
		}

		sb.toString
	}

	def featureContent(DataType d) '''
		private «d.type» «d.name»;
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
