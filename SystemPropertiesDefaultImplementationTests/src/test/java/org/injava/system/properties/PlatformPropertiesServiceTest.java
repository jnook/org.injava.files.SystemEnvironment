package org.injava.system.properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.injava.lang.designbycontract.Preconditions.requireNonNull;
import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.injava.system.properties.impl.PlatformPropertiesService;
import org.injava.system.properties.impl.SystemProperty;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PlatformPropertiesServiceTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private PlatformPropertiesService platformProperties = new PlatformPropertiesService();

	@Before
	public void setUp() {
		platformProperties.readProperties();
	}

	@Test
	public void whenFileEncodingExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(platformProperties.hasFileEncoding());
		assertThat(platformProperties.getFileEncoding(), equalTo(getSystemProperty(SystemProperty.FILE_ENCODING)));
	}

	@Test
	public void whenCountryExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(platformProperties.hasFileSeparator());
		assertThat(platformProperties.getFileSeparator(), equalTo(getSystemProperty(SystemProperty.FILE_SEPARATOR)));
	}

	@Test
	public void whenHomeDirectoryExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(platformProperties.hasLineSeparator());
		assertThat(platformProperties.getLineSeparator(), equalTo(getSystemProperty(SystemProperty.LINE_SEPARATOR)));
	}

	@Test
	public void whenLanguageExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(platformProperties.hasPathSeparator());
		assertThat(platformProperties.getPathSeparator(), equalTo(getSystemProperty(SystemProperty.PATH_SEPARATOR)));
	}
	
	@Test
	public void whenPropertiesWereNotReadExpectException() {
		final PlatformPropertiesService uninitializedService = new PlatformPropertiesService();

		thrown.expect(IllegalStateException.class);
		
		uninitializedService.getFileEncoding();
	}

	private String getSystemProperty(final String key) {
		requireNonNull(key);
		return System.getProperty(key);
	}
}
