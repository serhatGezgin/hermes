package org.yazgel.hermes.codegenerator.template

import org.yazgel.hermes.Entity
import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.EntityAnnotation

class EntityGenerator extends BaseGenerator {
	var extension FeatureGenerator fg = new FeatureGenerator

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.filename, e.entityContent)
	}

	def filename(Entity e) {
		e.packageNameList.join('/') + '/' + e.name + '.java'
	}

	def packagename(Entity e) {
		e.packageNameList.join('.')
	}

	def private packageNameList(Entity e) {
		var list = newArrayList
		var pack = e.eContainer as org.yazgel.hermes.Package

		do {
			list.add(0, pack.name)
			pack = pack.eContainer as org.yazgel.hermes.Package
		} while (pack != null && pack instanceof org.yazgel.hermes.Package);

		list
	}

	def entityContent(Entity e) '''
		package «e.packagename»;
		
		import com.googlecode.objectify.annotation.*;
		
		«e.entityAnnotations»
		@Entity
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
				annotations.append('@Cached')
				annotations.append(' ')
			}
		}

		annotations.toString
	}
}
