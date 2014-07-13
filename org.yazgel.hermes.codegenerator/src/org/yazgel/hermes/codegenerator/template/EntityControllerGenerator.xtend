package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity

class EntityControllerGenerator extends BaseGenerator {

	def generateFile(Entity e, IFileSystemAccess fsa) {
		fsa.generateFile(e.controllerfilename, e.controllerContent)
	}

	def controllerContent(Entity e) '''
		package «e.controllerpackagename»;
		
		public class «e.controllername» {
			
			static {
				«objectifyRegistryQName».register();
			}
		}
	'''
}
