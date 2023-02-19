package com.facebook.service;

import com.facebook.dao.FacebooDAOInterface;
import com.facebook.dao.FacebookDAO;
import com.facebook.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser fb) {
		FacebooDAOInterface fd=new FacebookDAO();
		int i=fd.createProfileDAO(fb);
		return i;
	}

	@Override
	public int loginProfileService(FacebookUser fb) {
		FacebooDAOInterface fd=new FacebookDAO();
		int i=fd.loginProfileDAO(fb);
		return i;
	}

}
