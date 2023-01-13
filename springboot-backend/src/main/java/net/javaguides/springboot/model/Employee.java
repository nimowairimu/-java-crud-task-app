//A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type.

package net.javaguides.springboot.model;

import javax.persistence.*;

import lombok.Data;

//@Data
@Entity
@Table(name = "employees")
//public (accessible from any class)
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private (accessible within the class where defined)
	private long id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
}