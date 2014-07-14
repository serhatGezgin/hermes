package org.yazgel.hermes.codegenerator.template

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.yazgel.hermes.Module

class CodeGenerator implements IGenerator {
	var extension PackageGenerator = new PackageGenerator

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (EObject o : resource.contents) {
			o.compile(fsa)
		}
	}

	def dispatch void compile(Module m, IFileSystemAccess fsa) {
		m.packages.forEach[it.generateFile(fsa)]
	}

	def dispatch void compile(EObject o, IFileSystemAccess fsa) {
		throw new Exception('Dispatch error. Root element is not known.')
	}
}
