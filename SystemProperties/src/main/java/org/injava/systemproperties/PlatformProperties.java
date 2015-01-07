package org.injava.systemproperties;

/**
 * Common {@link PlatformProperties} in a format provided by the Java runtime.
 * <p>
 * As every property might be null or empty when delivered by a real runtime
 * existence checks like {@link PlatformProperties#hasFileSeparator()} are
 * provided. Only existent values may be queried.
 * 
 * @author Jens Birger Hahn
 * @since 1
 */
public interface PlatformProperties {

	/**
	 * Gets the line separator.
	 *
	 * @return the line separator
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getLineSeparator();

	/**
	 * Gets the file encoding.
	 *
	 * @return the file encoding
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getFileEncoding();

	/**
	 * Gets the file separator.
	 *
	 * @return the file separator
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getFileSeparator();

	/**
	 * Gets the path separator.
	 *
	 * @return the path separator
	 * @throws IllegalStateException
	 *             when property is {@code null} or empty.
	 */
	public String getPathSeparator();

	/**
	 * Checks for path separator.
	 *
	 * @return true, if successful
	 */
	public boolean hasPathSeparator();

	/**
	 * Checks for file separator.
	 *
	 * @return true, if successful
	 */
	public boolean hasFileSeparator();

	/**
	 * Checks for file encoding.
	 *
	 * @return true, if successful
	 */
	public boolean hasFileEncoding();

	/**
	 * Checks for line separator.
	 *
	 * @return true, if successful
	 */
	public boolean hasLineSeparator();
}
