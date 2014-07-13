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
			
			«e.methodInsert»
			
			«e.methodGet»
			
			«e.methodDelete»
		}
	'''

	def methodInsert(Entity e) '''
		public static «e.qualifiedname» insert(«e.insertParams»){
			/* Create new instance. */
			«e.qualifiedname» «e.variablename» = new «e.qualifiedname»();
			
			/* Set properties. */
			«FOR f : e.ownedFeature.filter(DataType)»
				«e.variablename».«f.settername»(«f.name»);
			«ENDFOR»
			
			/* Save object. */
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

	def methodGet(Entity e) '''
		public static «e.qualifiedname» get(Long id) {
			if (id == null) {
				return null;
			}
		
			return com.googlecode.objectify.ObjectifyService.ofy().load().type(«e.qualifiedname».class).id(id).now();
		}
	'''

	def methodDelete(Entity e) '''
		public void delete(Long id) {
			com.googlecode.objectify.ObjectifyService.ofy().delete().type(«e.qualifiedname».class).id(id).now();
		}
	'''
}
