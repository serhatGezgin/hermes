package org.yazgel.hermes.codegenerator.mwe

import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Module
import java.io.File
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.ISetup
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.parser.IEncodingProvider
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule
import org.eclipse.xtext.resource.generic.AbstractGenericResourceSupport
import org.eclipse.xtext.resource.generic.XMLEncodingProvider
import org.yazgel.hermes.codegenerator.template.CodeGenerator

class EntityGeneratorModule extends AbstractGenericResourceRuntimeModule {

	override String getLanguageName() {
		return "com.mdd4cca.entity.EntityEditorID";
	}

	override String getFileExtensions() {
		return "entity";
	}

	def Class<? extends IGenerator> bindIGenerator() {
		CodeGenerator
	}

	def Class<? extends ResourceSet> bindResourceSet() {
		ResourceSetImpl
	}

	override Class<? extends IEncodingProvider> bindIEncodingProvider() {
		UTF8EncodingProvider
	}
}

class UTF8EncodingProvider extends XMLEncodingProvider {

	override String getEncoding(URI uri) {
		if (uri == null || !new File(uri.toFileString()).exists()) {
			return "UTF-8"
		}

		return super.getEncoding(uri)
	}
}

class EntityGeneratorSetup implements ISetup {

	override Injector createInjectorAndDoEMFRegistration() {
		Guice.createInjector(new EntityGeneratorModule)
	}
}

class EntityGeneratorSupport extends AbstractGenericResourceSupport {

	override Module createGuiceModule() {
		new EntityGeneratorModule
	}
}
