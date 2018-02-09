/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.actuate.autoconfigure.metrics.export.atlas;

import java.time.Duration;

import org.springframework.boot.actuate.autoconfigure.metrics.export.properties.StepRegistryProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * {@link ConfigurationProperties} for configuring Atlas metrics export.
 *
 * @since 2.0.0
 * @author Jon Schneider
 */
@ConfigurationProperties(prefix = "management.metrics.export.atlas")
public class AtlasProperties extends StepRegistryProperties {

	/**
	 * URI of the Atlas server.
	 */
	private String uri;

	/**
	 * Time to live for meters that do not have any activity. After this period the meter
	 * will be considered expired and will not get reported.
	 */
	private Duration meterTimeToLive;

	/**
	 * Enable streaming to Atlas LWC.
	 */
	private Boolean lwcEnabled;

	/**
	 * Frequency for refreshing config settings from the LWC service.
	 */
	private Duration configRefreshFrequency;

	/**
	 * Time to live for subscriptions from the LWC service.
	 */
	private Duration configTimeToLive;

	/**
	 * URI for the Atlas LWC endpoint to retrieve current subscriptions.
	 */
	private String configUri;

	/**
	 * URI for the Atlas LWC endpoint to evaluate the data for a subscription.
	 */
	private String evalUri;

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public Duration getMeterTimeToLive() {
		return this.meterTimeToLive;
	}

	public void setMeterTimeToLive(Duration meterTimeToLive) {
		this.meterTimeToLive = meterTimeToLive;
	}

	public Boolean getLwcEnabled() {
		return this.lwcEnabled;
	}

	public void setLwcEnabled(Boolean lwcEnabled) {
		this.lwcEnabled = lwcEnabled;
	}

	public Duration getConfigRefreshFrequency() {
		return this.configRefreshFrequency;
	}

	public void setConfigRefreshFrequency(Duration configRefreshFrequency) {
		this.configRefreshFrequency = configRefreshFrequency;
	}

	public Duration getConfigTimeToLive() {
		return this.configTimeToLive;
	}

	public void setConfigTimeToLive(Duration configTimeToLive) {
		this.configTimeToLive = configTimeToLive;
	}

	public String getConfigUri() {
		return this.configUri;
	}

	public void setConfigUri(String configUri) {
		this.configUri = configUri;
	}

	public String getEvalUri() {
		return this.evalUri;
	}

	public void setEvalUri(String evalUri) {
		this.evalUri = evalUri;
	}
}
