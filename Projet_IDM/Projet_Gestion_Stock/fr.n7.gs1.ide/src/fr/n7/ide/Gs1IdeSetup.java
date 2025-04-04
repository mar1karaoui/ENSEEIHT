/*
 * generated by Xtext 2.32.0
 */
package fr.n7.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import fr.n7.Gs1RuntimeModule;
import fr.n7.Gs1StandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class Gs1IdeSetup extends Gs1StandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new Gs1RuntimeModule(), new Gs1IdeModule()));
	}
	
}
