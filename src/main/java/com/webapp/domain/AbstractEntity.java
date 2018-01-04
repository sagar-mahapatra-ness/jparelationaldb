package com.webapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class AbstractEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		AbstractEntity that = (AbstractEntity) o;

		if (getID() != null ? !getID().equals(that.getID()) : that.getID() != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return (getID() == null) ? System.identityHashCode(this) : getID().hashCode();
	}

	private Long getID() {
		return id;
	}

	
}
