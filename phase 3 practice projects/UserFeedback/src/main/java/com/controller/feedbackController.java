package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.feedback;
import com.service.feedbackService;

@RestController
public class feedbackController {
	@Autowired
	feedbackService feedService;
	
	
	@RequestMapping(value = "storeFeedback",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
	public String storeFeedback(@RequestBody feedback feed) {		// scan the value from reqeust body in the form json 
		return feedService.storeFeedback(feed);
	}

}
