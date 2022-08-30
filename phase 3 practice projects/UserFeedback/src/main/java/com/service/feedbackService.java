package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.feedback;
import com.dao.feedbackDao;
@Service
public class feedbackService {
	@Autowired
	feedbackDao feedDao;
	public String storeFeedback(feedback feed) {
		if(feedDao.storeFeedback(feed)>0) {
			return "Record stored";
		}else {
			return "Record didnt stored";
		}
	}

}
