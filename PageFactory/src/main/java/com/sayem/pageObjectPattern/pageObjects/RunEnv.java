package com.sayem.pageObjectPattern.pageObjects;

public class RunEnv {

	public String os;
	public String env;
	public String browser;

	public RunEnv() {
	}

	public RunEnv(String env, String browser) {
		this.env = env;
		this.browser = browser;
	}

	public RunEnv(String os, String env, String browser) {
		this.os = os;
		this.env = env;
		this.browser = browser;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getEnv() {
		return env;
	}

	public void setEnv(String env) {
		this.env = env;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

}
