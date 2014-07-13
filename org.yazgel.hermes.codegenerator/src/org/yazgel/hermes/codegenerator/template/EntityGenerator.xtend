package org.yazgel.hermes.codegenerator.template

import org.yazgel.hermes.Entity
import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.EntityAnnotation

class EntityGenerator extends BaseGenerator {
	var extension FeatureGenerator fg = new FeatureGenerator

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.filename, e.entityContent)
	}

	def entityContent(Entity e) '''
		package «e.packagename»;
		
		«e.entityAnnotations»
		@com.googlecode.objectify.annotation.Entity
		public class «e.name» {
			«FOR f : e.ownedFeature»
				«f.generateFeature»
			«ENDFOR»
			
			«FOR f : e.ownedFeature»
				«f.generateGetterSetter»
			«ENDFOR»
		}
	'''

	def entityAnnotations(Entity e) {
		var annotations = new StringBuilder

		for (a : e.annotations) {
			if (a == EntityAnnotation.CACHE) {
				annotations.append('@com.googlecode.objectify.annotation.Cache')
			}
		}

		annotations.toString
	}
}
