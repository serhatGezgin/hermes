/*
* generated by Xtext
*/
package org.yazgel.hermes.xtext;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class HermesStandaloneSetup extends HermesStandaloneSetupGenerated{

	public static void doSetup() {
		new HermesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

