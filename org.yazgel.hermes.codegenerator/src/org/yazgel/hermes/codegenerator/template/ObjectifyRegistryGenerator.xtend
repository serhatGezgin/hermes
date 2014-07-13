package org.yazgel.hermes.codegenerator.template

import java.util.List
import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity
import org.yazgel.hermes.Package

class ObjectifyRegistryGenerator extends BaseGenerator {

	def generateFile(Package p, IFileSystemAccess fsa) {
		fsa.generateFile(objectifyRegistryQName.replace('.', '/') + '.java', objectifyRegistryContent(p.allEntities))
	}

	def objectifyRegistryContent(List<Entity> entities) '''
		package «objectifyRegistryPackage»;
		
		public class «objectifyRegistryName» {
			public static void register() {
				«FOR e : entities»
					com.googlecode.objectify.ObjectifyService.register(«e.packagename + '.' + e.name + '.class'»);
				«ENDFOR»
			}
		}
	'''
}
