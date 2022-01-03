package de.averbis.integration.karaftest.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Bundle2Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("activating bundle2 sleep 20s...");
		Thread.sleep(20000);
		System.out.println("bundle2 activated");
	}

	public void stop(BundleContext bundleContext) throws Exception {

	}
}
