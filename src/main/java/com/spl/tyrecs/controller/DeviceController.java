package com.spl.tyrecs.controller;

import java.io.IOException;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.exceptions.CsvValidationException;
import com.spl.tyrecs.models.Device;

import com.spl.tyrecs.services.DeviceFactory;

@RestController
public class DeviceController {
	
	@Autowired
	private DeviceFactory deviceFactory;
	

	@GetMapping("/devices")
	@ResponseBody
	public Set<Device> getAllDevice() throws CsvValidationException, IOException {
		
		return deviceFactory.deviceFactory();

	}

	@GetMapping("/devices/ip")
	@ResponseBody
	public Device getDeviceByIp(@RequestParam String ip) throws CsvValidationException, IOException {

		return deviceFactory.getDeviceByIP(ip);

	}

}
