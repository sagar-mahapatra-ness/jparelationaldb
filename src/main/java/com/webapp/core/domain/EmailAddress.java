package com.webapp.core.domain;

import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.springframework.util.Assert;

@Embeddable
public class EmailAddress {

	public static final String EMAIL_REGEX = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	public static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

	@Column(name = "email")
	public String emailAddress;

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
