package com.trials.trial1.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.trials.trial1.DTO.DomainModel;
import com.trials.trial1.DTO.UserModel;

public interface ModelMapper<E extends DomainModel<ID>, D extends UserModel<ID>, ID extends Serializable> extends Serializable{
	
	
	D toDto(E entity);
	List<D> toDto(List<E> entities);
	Set<D> toDto(Set<E> entities);
	
	E toEntity(D dto);
	List<E> toEntity(List<D> dtos);
	Set<E> toEntity(Set<D> dtos);

	
	E toNewEntity(D dto);
	List<E> toNewEntity(List<D> dtos);
	Set<E> toNewEntity(Set<D> dtos);
}
