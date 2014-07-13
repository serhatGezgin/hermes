package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Package

class PackageGenerator extends BaseGenerator {
	var entityGenerator = new EntityGenerator
	var entityControllerGenerator = new EntityControllerGenerator
	var objectifyRegistryGenerator = new ObjectifyRegistryGenerator

	def generateFile(Package p, IFileSystemAccess fsa) {

		/* Base package kaydet. */
		basePackage = p

		p.allEntities.forEach [
			entityGenerator.generateFile(it, fsa)
			entityControllerGenerator.generateFile(it, fsa)
		]

		/* Entity siniflarini kayit eden yapiyi uret. */
		objectifyRegistryGenerator.generateFile(p, fsa)
	}
}
