package org.injava.system.properties.impl;

import org.injava.lang.designbycontract.Preconditions;
import org.injava.systemproperties.UserProperties;

/**
 * {@link UserPropertiesService} reads properties via JVM {@link System#getProperty(String)}
 * and provides queries for existence and value of most used user/context-related properties.
 * 
 * @author Jens Birger Hahn
 * @since 1
 */
public class UserPropertiesService implements UserProperties {

	private boolean initialized;
	
	private String username;
	private String workingDirectory;
	private String homeDirectory;
	private String country;
	private String language;
	private String timezone;

	public UserPropertiesService() {
	}
	
	/**
	 * Read properties from {@link System}. This method can be invoked only
	 * once. Queries can only be invoked after properties are read.
	 */

	public void readProperties() {
		Preconditions.requireState(!initialized);
		
		username = System.getProperty(SystemProperty.USER_NAME);
		workingDirectory = System.getProperty(SystemProperty.USER_DIR);
		homeDirectory = System.getProperty(SystemProperty.USER_HOME);
		country = System.getProperty(SystemProperty.USER_COUNTRY);
		language= System.getProperty(SystemProperty.USER_LANGUAGE);
		timezone = System.getProperty(SystemProperty.USER_TIMEZONE);
		
		initialized = true;
	}

	public String getUsername() {
		Preconditions.requireState(initialized);
		return username;
	}

	public String getWorkingDirectory() {
		Preconditions.requireState(initialized);
		return workingDirectory;
	}

	public String getHomeDirectory() {
		Preconditions.requireState(initialized);
		return homeDirectory;
	}

	public String getCountry() {
		Preconditions.requireState(initialized);
		return country;
	}

	public String getLanguage() {
		Preconditions.requireState(initialized);
		return language;
	}

	public String getTimezone() {
		Preconditions.requireState(hasTimeZone());
		return timezone;
	}

	public boolean hasWorkingDirectory() {
		Preconditions.requireState(initialized);
		return workingDirectory != null && !workingDirectory.isEmpty(); 
	}

	public boolean hasUserName() {
		Preconditions.requireState(initialized);
		return username != null && !username.isEmpty(); 
	}

	public boolean hasHomeDirectory() {
		Preconditions.requireState(initialized);
		return homeDirectory != null && !homeDirectory.isEmpty(); 
	}

	public boolean hasCountry() {
		Preconditions.requireState(initialized);
		return country != null && !country.isEmpty(); 
	}

	public boolean hasLanguage() {
		Preconditions.requireState(initialized);
		return language != null && !language.isEmpty(); 
	}

	public boolean hasTimeZone() {
		Preconditions.requireState(initialized);
		return timezone != null && !timezone.isEmpty(); 
	}
	
}
