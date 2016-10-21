package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.StatusUpdate;
import com.test.model.StatusUpdateDao;

@Service
public class StatusUpdateService {
	
	
	@Autowired
	private StatusUpdateDao statusUpdateDao;

	public void save(StatusUpdate statusUpdate) {
		statusUpdateDao.save(statusUpdate);
	}
	
	
	public StatusUpdate getLatest() {
		return statusUpdateDao.findFirstByOrderByIdDesc();
	}
}
