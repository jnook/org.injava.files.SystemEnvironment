package org.injava.system.properties;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.injava.lang.designbycontract.Preconditions.requireNonNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

import org.injava.system.properties.impl.SystemProperty;
import org.injava.system.properties.impl.UserPropertiesService;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SystemUserPropertiesTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	private UserPropertiesService userProperties = new UserPropertiesService();

	@Before
	public void setUp() {
		userProperties.readProperties();
	}

	@Test
	public void whenAUserNameExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasUserName());
		assertThat(userProperties.getUsername(), equalTo(getSystemProperty(SystemProperty.USER_NAME)));
	}

	@Test
	public void whenCountryExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasCountry());
		assertThat(userProperties.getCountry(), equalTo(getSystemProperty(SystemProperty.USER_COUNTRY)));
	}

	@Test
	public void whenHomeDirectoryExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasHomeDirectory());
		assertThat(userProperties.getHomeDirectory(), equalTo(getSystemProperty(SystemProperty.USER_HOME)));
	}

	@Test
	public void whenLanguageExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasLanguage());
		assertThat(userProperties.getLanguage(), equalTo(getSystemProperty(SystemProperty.USER_LANGUAGE)));
	}

	@Test
	public void whenTimezoneExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasTimeZone());
		assertThat(userProperties.getTimezone(), equalTo(getSystemProperty(SystemProperty.USER_TIMEZONE)));
	}

	@Test
	public void whenWorkingDirectoryExistsExpectItsTheSameAsProvidedBySystemProperty() {
		assumeTrue(userProperties.hasWorkingDirectory());
		assertThat(userProperties.getWorkingDirectory(), equalTo(getSystemProperty(SystemProperty.USER_DIR)));
	}
	
	@Test
	public void whenPropertiesWereNotReadExpectException() {
		final UserPropertiesService uninitializedService = new UserPropertiesService();

		thrown.expect(IllegalStateException.class);
		
		uninitializedService.getUsername();
	}
	
	private String getSystemProperty(final String key) {
		requireNonNull(key);
		return System.getProperty(key);
	}

}
