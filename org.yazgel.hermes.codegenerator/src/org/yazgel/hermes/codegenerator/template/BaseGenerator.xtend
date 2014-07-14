package org.yazgel.hermes.codegenerator.template

import java.util.List
import java.util.Stack
import org.yazgel.hermes.Entity
import org.yazgel.hermes.Feature
import org.yazgel.hermes.NamedElement
import org.yazgel.hermes.Package

class BaseGenerator {

	/* Base Package hatirlanmasi gerek. */
	protected static Package basePackage;

	protected def objectifyRegistryPackage() {
		basePackage.name + '.controller.util'
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

	protected def variablename(Entity e) {
		'_' + e.name.toLowerCase
	}

	protected def qualifiedname(Entity e) {
		e.packagename + '.' + e.name
	}

	protected def controllerpackagename(Entity e) {
		val p = e.packageNameList
		p.add('controller')
		p.join('.')
	}

	protected def packageNameList(Entity e) {
		val list = newArrayList
		var pack = e.eContainer as Package

		list.addAll(pack.name.split('\\.'))

		list
	}

	protected def List<Entity> allEntities(Package p) {
		val list = newArrayList
		var Stack<NamedElement> stack = new Stack
		stack.push(p)

		while (!stack.isEmpty) {
			var item = stack.pop

			if (item instanceof Package) {
				stack.addAll(item.entities)
			} else if (item instanceof Entity) {
				list.add(item)
			}
		}

		list
	}

	protected def gettername(Feature f) {
		'get' + f.name.toFirstUpper
	}

	protected def settername(Feature f) {
		'set' + f.name.toFirstUpper
	}
}
