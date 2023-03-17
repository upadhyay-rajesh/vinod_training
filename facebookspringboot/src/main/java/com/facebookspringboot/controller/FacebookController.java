package com.facebookspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebookspringboot.entity.FacebookUser;
import com.facebookspringboot.service.FacebookServiceInterface;

@RestController
public class FacebookController {
	@Autowired
	FacebookServiceInterface fs;
	
	@GetMapping("showAllRecord")
	public List<FacebookUser> showRecord() {
		return fs.getAllProfileService();
	}
	@PostMapping("createRecord")
	public String register() {
		return "profile created";
	}
	@PutMapping("editRecord")
	public String editRecord() {
		return "profile updated";
	}
	@DeleteMapping("deleteRecord")
	public String deleteRecord() {
		return "profile deleted";
	}

}
