package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entity.Mobile;
import com.rest.service.MobileService;
@RestController
public class MobileController {

	@Autowired
	private MobileService ms;
	
	@PostMapping("/mobiles")
	public void addMobile(@RequestBody Mobile mobile)
	{
		ms.addMobile(mobile);
	}
	@GetMapping("/mobiles")
	public List<Mobile> getAllMobile()
	{
		return ms.getAllMobile();
	}
	@PutMapping("/mobiles")
	public void updateMobile(@RequestBody Mobile updatedMobile)
	{
		ms.addMobile(updatedMobile);
	}
	@DeleteMapping("/mobiles/{id}")
	public void removeMobile(@PathVariable Integer id)
	{
		ms.removeMobile(id);
	}
	@GetMapping("/mobiles/{id}")
	public Mobile getOneMobile(@PathVariable Integer id)
	{
		return ms.getOneMobile(id);
	}
	@PatchMapping("/mobiles/{id}")
	public void updateMob(@PathVariable Integer id,@RequestBody Mobile mobile)
	{
		ms.updateMobile(id, mobile.getColor(), mobile.getPrice());
	}
	

}
