package org.yazgel.hermes.codegenerator.template

import org.eclipse.xtext.generator.IFileSystemAccess
import org.yazgel.hermes.Entity

class PackageGenerator extends BaseGenerator {
	var extension EntityGenerator entityGenerator = new EntityGenerator

	def generateFile(org.yazgel.hermes.Package p, IFileSystemAccess fsa) {
		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]
	}

	def void iteratePackage(org.yazgel.hermes.Package p, IFileSystemAccess fsa) {
		p.subPackage.forEach[iteratePackage(fsa)]
		p.ownedEntity.forEach[iterateEntity(fsa)]
	}

	def void iterateEntity(Entity e, IFileSystemAccess fsa) {
		e.generateFile(fsa)
	}
}
