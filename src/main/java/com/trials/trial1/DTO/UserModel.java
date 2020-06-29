package com.trials.trial1.DTO;

import java.io.Serializable;

public interface UserModel<T extends Serializable> extends Serializable{
	T getId();
	void setId(T id);
}
