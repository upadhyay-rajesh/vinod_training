package com.facebook.dao;

import com.facebook.entity.FacebookUser;

public interface FacebooDAOInterface {

	int createProfileDAO(FacebookUser fb);

	int loginProfileDAO(FacebookUser fb);

}
