package org.yazgel.hermes.codegenerator.template

import java.util.Set
import org.yazgel.hermes.Entity
import org.yazgel.hermes.Package

class BaseGenerator {
	protected static var basePackage = ''
	protected static val Set<Entity> entityList = newHashSet

	protected def objectifyRegistryPackage() {
		basePackage + '.controller.util'
	}

	protected def objectifyRegistryName() {
		'ObjectifyRegistry'
	}

	protected def objectifyRegistryQName() {
		objectifyRegistryPackage + '.' + objectifyRegistryName
	}

	protected def filename(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.join('/') + '/' + e.name + '.java'
	}

	protected def controllerfilename(Entity e) {
		val p = e.packageNameList
		p.add('controller')
		p.join('/') + '/' + e.controllername + '.java'
	}

	protected def controllername(Entity e) {
		e.name + 'Controller'
	}

	protected def packagename(Entity e) {
		val p = e.packageNameList
		p.add('model')
		p.join('.')
	}

	protected def controllerpackagename(Entity e) {
		val p = e.packageNameList
		p.add('controller')
		p.join('.')
	}

	protected def packageNameList(Entity e) {
		var list = newArrayList
		var pack = e.eContainer as Package

		do {
			list.add(0, pack.name)
			pack = pack.eContainer as Package
		} while (pack != null && pack instanceof Package);

		list
	}
}
