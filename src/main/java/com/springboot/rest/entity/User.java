package com.springboot.rest.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Schema(description = "User Resource")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Schema(description = "User First Name")
	@Column(nullable = false)
	private String firstName;
	@Schema(description = "User Last Name")
	@Column(nullable = false)
	private String lastName;
	@Schema(description = "User Email Address")
	@Column(nullable = false,unique = true)
	private String emaill;

}
