package com.spl.tyrecs.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.spl.tyrecs.models.DataFlow;
import com.spl.tyrecs.models.Device;

@Service
public class IdeviceImpl implements IDevice{

	@Override
	public List<DataFlow> flowInByDevice(Device device) {
		// TODO Auto-generated method stub
		List <DataFlow> flowsInByDevice= new ArrayList<DataFlow>();
		device.getDataFlows().forEach(flow->{
			if ( flow.getSourceIP().equals(device.getDeviceIP())) {
				flowsInByDevice.add(flow);
			}
		});
		
		return flowsInByDevice;
	}

	@Override
	public List<DataFlow> flowIOutByDevice(Device device) {
		// TODO Auto-generated method stub
		List <DataFlow> flowsOutByDevice= new ArrayList<DataFlow>();
		device.getDataFlows().forEach(flow->{
			if ( flow.getDestinationIP().equals(device.getDeviceIP())) {
				flowsOutByDevice.add(flow);
			}
		});
		
		return flowsOutByDevice;
	}

}
