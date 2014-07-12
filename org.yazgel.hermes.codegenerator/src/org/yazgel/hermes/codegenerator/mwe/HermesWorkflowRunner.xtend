package org.yazgel.hermes.codegenerator.mwe

import org.eclipse.emf.common.util.URI

class HermesWorkflowRunner extends AbstractWorkflowRunner {

	override protected workflowURI() {
		var resource = getClass().getClassLoader().getResource("org/yazgel/hermes/codegenerator/mwe/workflow.mwe2")

		return URI.createURI(resource.toExternalForm)
	}
}
