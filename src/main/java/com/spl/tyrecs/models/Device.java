package com.spl.tyrecs.models;

import java.util.ArrayList;
import java.util.List;

public class Device {
	private String deviceIP;
	private String deviceName;
	private List<DataFlow> dataFlows=new ArrayList<DataFlow>();
	
	public Device() {
		super();
		this.dataFlows = new ArrayList<>();
	}

	public Device(String deviceIP) {
		super();
		this.deviceIP = deviceIP;
		this.dataFlows = new ArrayList<>();
	}

	public String getDeviceIP() {
		return deviceIP;
	}

	public void setDeviceIP(String deviceIP) {
		this.deviceIP = deviceIP;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public List<DataFlow> getDataFlows() {
		return dataFlows;
	}

	public void addDataFlows(DataFlow dataFlow) {
		dataFlows.add(dataFlow);
	}
	
	

}
