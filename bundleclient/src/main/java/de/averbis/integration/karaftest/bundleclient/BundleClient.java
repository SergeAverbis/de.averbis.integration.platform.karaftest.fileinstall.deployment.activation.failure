/*
 * Copyright (c) 2022, Averbis GmbH. All rights reserved.
 */

package de.averbis.integration.karaftest.bundleclient;

import de.averbis.integration.karaftest.bundleapi.BundleApi;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class BundleClient {

	@Reference
	BundleApi bundleApi;


	@Activate
	public void activate() {

		System.out.println(">>>>>>>>>>>>>>>>>> ACTIVATING "+getClass().getSimpleName()+" "+BundleApi.class.getSimpleName()+" says '"+bundleApi.api()+"'");
	}
}
