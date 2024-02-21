package com.spl.tyrecs.services;

import java.util.List;
import java.util.Set;

import com.spl.tyrecs.models.DataFlow;
import com.spl.tyrecs.models.Device;

public interface IDevice {
 public  List<DataFlow> flowInByDevice(Device device);
 public  List<DataFlow> flowIOutByDevice(Device device);
 
}
