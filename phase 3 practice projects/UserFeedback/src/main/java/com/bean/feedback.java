package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class feedback {
private String name;
@Id
private String email;
@Column(name ="feedbackReview")
private String FeedbackReview;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getFeedbackReview() {
	return FeedbackReview;
}
public void setFeedbackReview(String feedbackReview) {
	FeedbackReview = feedbackReview;
}
@Override
public String toString() {
	return "feedback [name=" + name + ", email=" + email + ", FeedbackReview=" + FeedbackReview + "]";
}
public feedback(String name, String email, String feedbackReview) {
	super();
	this.name = name;
	this.email = email;
	FeedbackReview = feedbackReview;
}
public feedback() {
	super();
	// TODO Auto-generated constructor stub
}

}
