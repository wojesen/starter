package com.jason.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by jason
 */
@ConfigurationProperties(prefix = "jason")
public class BaseProperties {
	String project;
	String app;

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}
}
