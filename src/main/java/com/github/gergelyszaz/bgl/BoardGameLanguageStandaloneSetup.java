/*
 * generated by Xtext 2.18.0
 */
package com.github.gergelyszaz.bgl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class BoardGameLanguageStandaloneSetup extends BoardGameLanguageStandaloneSetupGenerated {

	public static void doSetup() {
		new BoardGameLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
