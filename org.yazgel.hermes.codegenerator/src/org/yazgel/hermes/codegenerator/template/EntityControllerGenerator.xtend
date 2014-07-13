package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity
import org.yazgel.hermes.DataType

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
			
			«e.insertMethod»
		}
	'''

	def insertMethod(Entity e) '''
		public static «e.qualifiedname» insert(«e.insertParams») throws Exception{
			«e.qualifiedname» «e.variablename» = new «e.qualifiedname»();
			«FOR f : e.ownedFeature.filter(DataType)»
				«e.variablename».«f.settername»(«f.name»);
			«ENDFOR»
			com.googlecode.objectify.ObjectifyService.ofy().save().entity(«e.variablename»).now();
			
			return «e.variablename»;
		}
	'''

	def insertParams(Entity e) {
		val sb = newArrayList

		e.ownedFeature.filter(DataType).forEach [
			sb.add(it.type + ' ' + it.name)
		]

		sb.join(',')
	}
}
