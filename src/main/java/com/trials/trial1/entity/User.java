package com.trials.trial1.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedEntityGraphs;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Entity
@Table(name = "APP_USER_V")
@Data
@ToString(of = {"id", "name", "age"})
@EqualsAndHashCode(of = {"name", "age"}, callSuper = false)

@NamedEntityGraphs({
	@NamedEntityGraph(name = "User.fat",
					  attributeNodes = {
							  @NamedAttributeNode(value = "organizationUnit"),
							  @NamedAttributeNode(value = "role"),
							  @NamedAttributeNode(value = "userType")
					  })
})

public class User extends DomainEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "email", nullable = false)
	private String email;
	@Column(name = "age", nullable = false)
	private Long age;

	@Column(name = "created_at", nullable = false)
	@CreatedDate
	private Date createdAt;
	@Column(name = "created_by", nullable = false)
	@CreatedBy
	private String createdBy;
	@Column(name = "updated_at", nullable = false)
	@LastModifiedDate
	private Date updatedAt;
	@Column(name = "updated_by", nullable = false)
	@LastModifiedBy
	private String updatedBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}