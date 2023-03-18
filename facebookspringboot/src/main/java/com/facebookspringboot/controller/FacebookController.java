package com.facebookspringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
	public String register(@RequestBody FacebookUser fuser) {
		
		int i=fs.createProfileService(fuser);
		
		return "profile created";
	}
	@PutMapping("editRecord/{id}")
	public String editRecord(@PathVariable("id") String a,@RequestBody FacebookUser f) {
		int i=fs.editProfileService(f);
		return "profile updated";
	}
	@DeleteMapping("deleteRecord/{id}")
	public String deleteRecord(@PathVariable("id") String a) {
		int i=fs.deleteProfileService(a);
		return "profile deleted";
	}

}
