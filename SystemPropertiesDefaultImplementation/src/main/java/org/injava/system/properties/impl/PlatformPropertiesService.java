package org.injava.system.properties.impl;

import org.injava.lang.designbycontract.Preconditions;
import org.injava.systemproperties.PlatformProperties;

/**
 * {@link PlatformPropertiesService} reads properties via JVM
 * {@link System#getProperty(String)} and provides queries for existence and
 * value of most used file-related properties.
 * 
 * @author Jens Birger Hahn
 * @since 1
 */
public class PlatformPropertiesService implements PlatformProperties {

	private boolean initialized;

	private String lineSeparator;
	private String fileEncoding;
	private String fileSeparator;
	private String pathSeparator;

	public PlatformPropertiesService() {
	}

	/**
	 * Read properties from {@link System}. This method can be invoked only
	 * once. Queries can only be invoked after properties are read.
	 */
	public void readProperties() {
		Preconditions.requireState(!initialized);

		lineSeparator = System.getProperty(SystemProperty.LINE_SEPARATOR);
		fileEncoding = System.getProperty(SystemProperty.FILE_ENCODING);
		fileSeparator = System.getProperty(SystemProperty.FILE_SEPARATOR);
		pathSeparator = System.getProperty(SystemProperty.PATH_SEPARATOR);

		initialized = true;
	}

	public boolean hasLineSeparator() {
		Preconditions.requireState(initialized);
		return lineSeparator != null && !lineSeparator.isEmpty();
	}

	public String getLineSeparator() {
		return lineSeparator;
	}

	public boolean hasFileEncoding() {
		Preconditions.requireState(initialized);
		return fileEncoding != null && !fileEncoding.isEmpty();
	}

	public String getFileEncoding() {
		Preconditions.require(hasFileEncoding());
		return fileEncoding;
	}

	public boolean hasFileSeparator() {
		Preconditions.requireState(initialized);
		return fileSeparator != null && !fileSeparator.isEmpty();
	}

	public String getFileSeparator() {
		Preconditions.require(hasFileSeparator());
		return fileSeparator;
	}

	public boolean hasPathSeparator() {
		Preconditions.requireState(initialized);
		return pathSeparator != null && !pathSeparator.isEmpty();
	}

	public String getPathSeparator() {
		Preconditions.require(hasPathSeparator());
		return pathSeparator;
	}
}
