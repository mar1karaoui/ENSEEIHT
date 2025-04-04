/*
 * generated by Xtext 2.32.0
 */
package fr.n7.ui;

import com.google.inject.Injector;
import fr.n7.gs1.ui.internal.Gs1Activator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class Gs1ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(Gs1Activator.class);
	}
	
	@Override
	protected Injector getInjector() {
		Gs1Activator activator = Gs1Activator.getInstance();
		return activator != null ? activator.getInjector(Gs1Activator.FR_N7_GS1) : null;
	}

}
