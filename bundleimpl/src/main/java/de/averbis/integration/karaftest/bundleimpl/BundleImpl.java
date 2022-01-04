/*
 * Copyright (c) 2022, Averbis GmbH. All rights reserved.
 */

package de.averbis.integration.karaftest.bundleimpl;

import de.averbis.integration.karaftest.bundleapi.BundleApi;
import org.graalvm.compiler.lir.CompositeValue;
import org.osgi.service.component.annotations.Component;

@Component
public class BundleImpl implements BundleApi {

	public String api() {
		return "My Name is "+getClass().getSimpleName()+" James "+getClass().getName();
	}
}
