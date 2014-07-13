package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity
import java.util.List

class PackageGenerator extends BaseGenerator {
	var extension EntityGenerator entityGenerator = new EntityGenerator

	def generateFile(org.yazgel.hermes.Package p, IFileSystemAccess fsa) {

		/* Base package adini kaydet. */
		basePackage = p.name

		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]

		/* Entity siniflarini kayit eden yapiyi uret. */
		generateObjectifyRegistry(fsa)
	}

	def void iteratePackage(org.yazgel.hermes.Package p, IFileSystemAccess fsa) {
		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]
	}

	def void iterateEntity(Entity e, IFileSystemAccess fsa) {
		e.generateFile(fsa)

		/* Entity'leri topla. */
		entityList.add(e)
	}

	def generateObjectifyRegistry(IFileSystemAccess fsa) {
		fsa.generateFile(objectifyRegistryQName.replace('.', '/') + '.java', objectifyRegistryContent(entityList))
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
