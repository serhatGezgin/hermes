package org.yazgel.hermes.codegenerator.template

import java.util.List
import org.yazgel.hermes.Entity

class BaseGenerator {
	protected val List<Entity> entityList = newArrayList
	protected var basePackage = ''

	protected def objectifyRegistryPackage() {
		basePackage + '.controller.util'
	}

	protected def objectifyRegistryName() {
		'ObjectifyRegistry'
	}

	protected def objectifyRegistryQName() {
		objectifyRegistryPackage + '.' + objectifyRegistryName
	}
}
