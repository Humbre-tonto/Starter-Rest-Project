package com.trials.trial1.controller;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
