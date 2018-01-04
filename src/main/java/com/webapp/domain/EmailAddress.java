package com.webapp.domain;

import java.util.regex.Pattern;

import javax.persistence.Column;

import org.springframework.util.Assert;

public class EmailAddress {

	private static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

	@Column(name = "email")
	private String emailAddress;

	public EmailAddress(String emailAddress) {
		Assert.isTrue(isValid(emailAddress), "Invalid email address!");
		this.emailAddress = emailAddress;
	}

	protected EmailAddress() {
	}

	public boolean isValid(String candidate) {
		return PATTERN.matcher(candidate).matches();
	}

}
