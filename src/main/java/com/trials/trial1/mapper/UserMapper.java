package com.trials.trial1.mapper;

import org.springframework.stereotype.Component;

import com.trials.trial1.DTO.UserDto;
import com.trials.trial1.entity.User;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class UserMapper extends AbstractModelMapper<User, UserDto, Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public UserDto toDto(User entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected User toEntity(UserDto dto, boolean nullId) {
		// TODO Auto-generated method stub
		return null;
	}

}