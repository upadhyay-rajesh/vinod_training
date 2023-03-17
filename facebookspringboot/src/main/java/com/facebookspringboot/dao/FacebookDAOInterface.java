package com.facebookspringboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.facebookspringboot.entity.FacebookUser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, String>{

}
