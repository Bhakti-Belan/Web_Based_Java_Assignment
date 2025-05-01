package com.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.entity.Color;
import com.rest.entity.Mobile;
import com.rest.repo.MobileRepo;

@Service
public class MobileService {
	@Autowired
    private MobileRepo mr;
	
	public void addMobile(Mobile newMobile)
	{
		mr.save(newMobile);
	}
	public List<Mobile> getAllMobile()
	{
		return mr.findAll();
	}
	public void updateMobile(Mobile updatedMobile)
	{
		mr.save(updatedMobile);
	}
	public void removeMobile(Integer id)
	{
		mr.deleteById(id);
	}
	public Mobile getOneMobile(Integer id)
	{
		Mobile mobile=null;
	Optional foundMobile=mr.findById(id);
	if(foundMobile.isPresent())
	{
		 mobile=(Mobile) foundMobile.get();
	}
	else
	{
		throw new MobileNotFoundException("Mobile With This Id Is Not Found!!!");
	}
	return mobile;
	/*
	 * return mr.findById(id).
	 * orElseThrow(()->new MobileNotFoundException("Mobile With This Id Is Not Found!!!");
	 * */
	}
	public void updateMobile(Integer id,Color color,Double price)
	{
		Optional<Mobile> oldMobile=mr.findById(id);
		Mobile oldMob=oldMobile.get();
		oldMob.setColor(color);
		oldMob.setPrice(price);
		mr.save(oldMob);
		
	}
	
}
