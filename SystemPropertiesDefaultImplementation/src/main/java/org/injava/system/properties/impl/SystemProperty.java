package org.injava.system.properties.impl;

/**
 * Common system properties as defined in <a href=
 * "http://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html"
 * >http
 * ://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html</a>.
 * 
 * @author Jens Birger Hahn
 * @since 0
 */
public interface SystemProperty {
	/**
	 * Default line separator for text files in this environment, usually a
	 * linefeed (LF) on *nix like systems and CR/LF on Windows.
	 */
	public static final String LINE_SEPARATOR = "line.separator";

	/** File encoding, such as <code>UTF-8</code> */
	public static final String FILE_ENCODING = "file.encoding";

	/** Base package that Java runtime searches for encoding classes. */
	public static final String FILE_ENCODING_PKG = "file.encoding.pkg";

	/**
	 * File separator, such as <code>/</code> as in
	 * <code>/home/johndoe/spreadsheets</code>.
	 */
	public static final String FILE_SEPARATOR = "file.separator";

	/**
	 * The system path separator, usually <code>:</code> on *nix and
	 * <code>;</code> on Windows systems.
	 */
	public static final String PATH_SEPARATOR = "path.separator";

	/** User working directory */
	public static final String USER_DIR = "user.dir";

	/** User home directory */
	public static final String USER_HOME = "user.home";

	/** User account name */
	public static final String USER_NAME = "user.name";

	/** User country, i.e. "de" for Germany. */
	public static final String USER_COUNTRY = "user.country";

	/** User language, i.e. "DE". */
	public static final String USER_LANGUAGE = "user.language";

	/** User timezone, i.e. "Europe/Berlin". */
	public static final String USER_TIMEZONE = "user.timezone";
}
