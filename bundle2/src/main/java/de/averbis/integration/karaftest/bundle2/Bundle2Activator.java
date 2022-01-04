package de.averbis.integration.karaftest.bundle2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Bundle2Activator implements BundleActivator {

	public void start(BundleContext bundleContext) throws Exception {
		final int sleepDuration=0;
		if (sleepDuration>0) {
			System.out.println("activating bundle2 sleep " + sleepDuration + "s ...");
			Thread.sleep(sleepDuration * 1000);
		}
		System.out.println("bundle2 activated");
	}

	public void stop(BundleContext bundleContext) throws Exception {

	}
}
