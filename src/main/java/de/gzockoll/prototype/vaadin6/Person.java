package de.gzockoll.prototype.vaadin6;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public class Person implements Serializable {
	@NotNull
	private String name;
	private String city;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}
}
