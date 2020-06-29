package com.trials.trial1.client;

import org.springframework.data.mongodb.core.MongoAction;

import com.mongodb.WriteConcern;

public interface WriteConcernResolver {
	WriteConcern resolve(MongoAction action);
}