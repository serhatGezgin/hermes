package org.yazgel.hermes.codegenerator.template

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class CodeGenerator implements IGenerator {
	var extension PackageGenerator = new PackageGenerator

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
			o.compile(fsa)
		}
	}

	def dispatch compile(org.yazgel.hermes.Package p, IFileSystemAccess fsa) {
		p.generateFile(fsa)
	}

	def dispatch compile(EObject o, IFileSystemAccess fsa) {
	}
}
