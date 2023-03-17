package com.facebookspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.facebookspringboot.dao.FacebookDAOInterface;
import com.facebookspringboot.entity.FacebookUser;

@Service
@Transactional
public class FacebookService implements FacebookServiceInterface{
	
	@Autowired
	FacebookDAOInterface fd;

	@Override
	public List<FacebookUser> getAllProfileService() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}

}
