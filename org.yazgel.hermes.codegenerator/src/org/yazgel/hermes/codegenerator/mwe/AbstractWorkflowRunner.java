package org.yazgel.hermes.codegenerator.mwe;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.mwe2.language.Mwe2StandaloneSetup;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Runner;

import com.google.inject.Injector;

public abstract class AbstractWorkflowRunner {
	static final Logger LOG = Logger.getLogger(AbstractWorkflowRunner.class.getName());

	protected abstract URI workflowURI();

	protected String workflowModelPathVariableName() {
		return "modelPath";
	}

	protected String workflowTargetDirVariableName() {
		return "targetDir";
	}

	protected String defaultOutputFolder() {
		return "src-gen";
	}

	/**
	 * Workflow calistirir.
	 * 
	 * @param modelPath
	 *            Model dosyalarinin oldugu klasor.
	 * @param targetDir
	 *            Uretilen dosyalarin konulacagi klasor.
	 */
	public void generate(String modelPath, String targetDir) {
		if (modelPath == null || modelPath.trim().isEmpty()
				|| targetDir == null || targetDir.trim().isEmpty()) {
			LOG.severe("Parametreler null.");
			return;
		}

		String normalizedOutputFolder = normalizePath(targetDir);

		/* Parametreleri olustur. */
		Map<String, String> param = new HashMap<>();
		param.put(workflowModelPathVariableName(), modelPath);
		param.put(workflowTargetDirVariableName(), normalizedOutputFolder);
		/* Alt siniflarin parametre duzenlemesine izin ver. */
		adjustParams(param);

		Injector injector = new Mwe2StandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		Mwe2Runner mweRunner = injector.getInstance(Mwe2Runner.class);
		mweRunner.run(workflowURI(), param);

		LOG.info("mwe2 workflow run.");
	}

	protected void adjustParams(Map<String, String> param) {
		/* Alt siniflar parametreleri ayarlayabilsin diye metot. */
	}

	protected String normalizePath(String path) {
		if (defaultOutputFolder() == null || defaultOutputFolder().isEmpty())
			return path;

		File folder = new File(path);
		String folderName = folder.getName();

		/*
		 * Varsayilan klasor adi ile bitmiyorsa, klasor adini sona ekle.
		 */
		if (!folderName.equals(defaultOutputFolder())) {
			path = folder.toString() + File.separator + defaultOutputFolder();
		}

		return path;
	}
}
