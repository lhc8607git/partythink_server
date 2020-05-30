package com.example.demo.server.repository.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
	@Id
	private @Column(name = "email") String email;
    private @Column(name = "accessKey") String accessKey;
}
