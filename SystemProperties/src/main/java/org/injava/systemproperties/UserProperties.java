package org.injava.systemproperties;

/**
 * Common {@link UserProperties} in a format provided by the Java runtime.
 * <p>
 * As every property might be null or empty when delivered by a real runtime
 * existence checks like {@link UserProperties#hasWorkingDirectory()} are
 * provided. Only existent values may be queried.
 * 
 * @author Jens Birger Hahn
 * @since 1
 */
public interface UserProperties {

	/**
	 * Checks for working directory.
	 *
	 * @return true, if successful
	 */
	public boolean hasWorkingDirectory();

	/**
	 * Checks for user name.
	 *
	 * @return true, if successful
	 */
	public boolean hasUserName();

	/**
	 * Checks for home directory.
	 *
	 * @return true, if successful
	 */
	public boolean hasHomeDirectory();

	/**
	 * Checks for country.
	 *
	 * @return true, if successful
	 */
	public boolean hasCountry();

	/**
	 * Checks for language.
	 *
	 * @return true, if successful
	 */
	public boolean hasLanguage();

	/**
	 * Checks for time zone.
	 *
	 * @return true, if successful
	 */
	public boolean hasTimeZone();

	/**
	 * Gets the users current working directory.
	 *
	 * @return the working directory
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getWorkingDirectory();

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getUsername();

	/**
	 * Gets the user home directory.
	 *
	 * @return the user home directory
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getHomeDirectory();

	/**
	 * Gets the user country.
	 *
	 * @return the user country
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getCountry();

	/**
	 * Gets the user language.
	 *
	 * @return the user language
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getLanguage();

	/**
	 * Gets the user timezone.
	 *
	 * @return the user timezone
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getTimezone();
}
