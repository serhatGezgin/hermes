package org.yazgel.hermes.codegenerator.template

import java.util.Set
import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity

class ObjectifyRegistryGenerator extends BaseGenerator{
	
	def generateFile(IFileSystemAccess fsa) {
		fsa.generateFile(objectifyRegistryQName.replace('.', '/') + '.java', objectifyRegistryContent(entityList))
	}
	
	def objectifyRegistryContent(Set<Entity> entities) '''
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
