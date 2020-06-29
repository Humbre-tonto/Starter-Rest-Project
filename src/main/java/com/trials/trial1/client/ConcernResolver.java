package com.trials.trial1.client;

import org.springframework.data.mongodb.core.MongoAction;

import com.mongodb.WriteConcern;

public class ConcernResolver implements WriteConcernResolver {

	public WriteConcern resolve(MongoAction action) {
		if (action.getClass().getSimpleName().contains("Audit")) {
			return WriteConcern.UNACKNOWLEDGED;
		} else if (action.getClass().getSimpleName().contains("Metadata")) {
			return WriteConcern.ACKNOWLEDGED;
		}
		return action.getDefaultWriteConcern();
	}
}