package com.Day19;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
/**
 * In this class we have written the Test cases and check if the method passes the test case.
 * We have used the AssertTrue & False to check if the string passes the pattern.
 *
 */
public class UserRegistrationTest {
	UserRegistration junitUserRegistration = new UserRegistration();

	/**
	 * We have created this Test case to check if the first name is proper & if passes the regex pattern.
	 * The assertTrue will check if the result is true and the it will pass the test.
	 */
	@Test
	public void givenFirstName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.firstName("Vishal");
		assertTrue(actualResult);
	
	}
	/**
	 * We have created this test case to check if the test fails if we pass the wrong pattern for first name
	 * The assertFalse will check if the result is false and the it will pass the test.
	 */
	@Test
	public void givenFirstName_IsProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.firstName("vishal");
		assertFalse(actualResult);
	}

	/**
	 * We have created this Test case to check if the last name is proper & if passes the regex pattern.
	 * The assertEquals will check if true or false and the output result.
	 */
	@Test
	public void givenLastName_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.lastName("Kavatkar");
		Assert.assertEquals(true, actualResult);
	}

	/**
	 * We have created this test case to check if the test fails if we pass the wrong pattern for last name
	 * The assertEquals will check if true or false and the output result.
	 */
	@Test
	public void givenLastName_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.lastName("kavaTkar");
		Assert.assertEquals(false, actualResult);
	}

	//Test case to check valid email
	@Test
	public void givenEmailId_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.emailId("vkavatkar11@gmail.com");
		Assert.assertEquals(true, actualResult);
	}

	//Test case to check invalid email
	@Test
	public void givenEmailId_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.emailId("vishalkavatkargmail.com");
		Assert.assertEquals(false, actualResult);
	}

	//Test case to check valid mobile number
	@Test
	public void givenMobileNumber_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.mobileNumber("91 9420196236");
		Assert.assertEquals(true, actualResult);
	}

	//Test case to check invalid mobile number
	@Test
	public void givenMobileNumber_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.mobileNumber("919420196236");
		Assert.assertEquals(false, actualResult);
	}

	//Test case to check valid password
	@Test
	public void givenPassword_IsProper_ReturnTrue() {
		boolean actualResult = junitUserRegistration.password("ggfvcV@$11");
		Assert.assertEquals(true, actualResult);
	}

	//Test case to check invalid password
	@Test
	public void givenPassword_IsNotProper_ReturnFalse() {
		boolean actualResult = junitUserRegistration.password("test1234");
		Assert.assertEquals(false, actualResult);
	}
}