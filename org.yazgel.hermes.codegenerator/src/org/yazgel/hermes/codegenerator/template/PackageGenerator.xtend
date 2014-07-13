package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity
import org.yazgel.hermes.Package

class PackageGenerator extends BaseGenerator {
	var entityGenerator = new EntityGenerator
	var entityControllerGenerator = new EntityControllerGenerator
	var objectifyRegistryGenerator = new ObjectifyRegistryGenerator

	def generateFile(Package p, IFileSystemAccess fsa) {

		/* Base package adini kaydet. */
		basePackage = p.name

		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]

		/* Entity siniflarini kayit eden yapiyi uret. */
		objectifyRegistryGenerator.generateFile(fsa)
	}

	def void iteratePackage(Package p, IFileSystemAccess fsa) {
		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]
	}

	def void iterateEntity(Entity e, IFileSystemAccess fsa) {
		entityGenerator.generateFile(e, fsa)
		entityControllerGenerator.generateFile(e, fsa)

		/* Entity'leri topla. */
		entityList.add(e)
	}
}
