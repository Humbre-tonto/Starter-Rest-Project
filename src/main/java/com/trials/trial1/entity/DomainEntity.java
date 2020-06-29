package com.trials.trial1.entity;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import com.trials.trial1.DTO.DomainModel;

import lombok.Data;

@MappedSuperclass
@Data
public abstract class DomainEntity<T extends Serializable> implements DomainModel<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7353309897348767159L;

}
