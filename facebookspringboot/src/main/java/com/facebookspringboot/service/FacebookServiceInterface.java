package com.facebookspringboot.service;

import java.util.List;

import com.facebookspringboot.entity.FacebookUser;

public interface FacebookServiceInterface {
	public List<FacebookUser> getAllProfileService();

	public int createProfileService(FacebookUser fuser);

	public int editProfileService(FacebookUser f);

	public int deleteProfileService(String a);

	public FacebookUser loginProfileService(FacebookUser f);
}
