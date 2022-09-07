package com.shopping.portal.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "USER_ACCOUNT")
public class User implements Serializable {

	private static final long serialVersionUID = 651937881891555149L;

	@Id
	@Column(name = "USER_NAME")
	private String username;

	@Column(name = "USER_PASSWORD", nullable = false)
	private String password;

	@Transient
	private String confirmPassword;

	@ColumnDefault("1")
	@Column(name = "ENABLED")
	private Boolean enabled = true;

	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "CONTACT_NO")
	private String contactNo;

	@Column(name = "FULL_NAME")
	private String fullName;

//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private Cart cart;
//
//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
//	private Set<Order> orders = new HashSet<>();

//	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH }, fetch = FetchType.LAZY)
//	@JoinTable(name = "USER_ROLES", joinColumns = @JoinColumn(name = "USER_NAME"), inverseJoinColumns = @JoinColumn(name = "ROLE_TYPE"))
//	private Set<Role> roles = new HashSet<>();

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
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

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(username, other.username);
	}

}