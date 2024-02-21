package com.spl.tyrecs;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class TyrecsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TyrecsApplication.class, args);

		/*
		 * Test OK
		 * 
		 * String csv ="wednesday_workinghours_2_courtCorriger.csv"; DataFlowFactory
		 * test =new DataFlowFactory(); test.setCsvFileName(csv); List<DataFlow>
		 * listFlows=test.csvConvertToDataFlow(); // Verification de la creation du
		 * DataFlow listFlows.forEach(newDataFlow ->{
		 * 
		 * System.out.println("****************newdataFlow*****************");
		 * System.out.println("****************newdataFlow sourceIP*****************");
		 * System.out.println(newDataFlow.getSourceIP()); System.out.
		 * println("****************newdataFlow destinationIP*****************");
		 * System.out.println(newDataFlow.getDestinationIP());
		 * System.out.println("****************newdataFlow ID*****************");
		 * System.out.println(newDataFlow.getFlowID());
		 * System.out.println("****************newdataFlow Label*****************");
		 * System.out.println(newDataFlow.getLabel());
		 * 
		 * 
		 * });
		 */

		/*Test Device Factory OK
		 * String csv = "wednesday_workinghours_2_courtCorriger.csv"; DataFlowFactory
		 * test = new DataFlowFactory(); test.setCsvFileName(csv); List<DataFlow>
		 * listFlows = test.csvConvertToDataFlow();
		 * 
		 * DeviceFactory devices = new DeviceFactory(); devices.setDataflows(listFlows);
		 * Set<Device> listUniqueDevices=devices.deviceFactory();
		 * listUniqueDevices.forEach(device->{
		 * System.out.println("*********device.getDeviceIP()***************");
		 * System.out.println(device.getDeviceIP()); System.out.
		 * println("*************List de FlowID/Label*****************************");
		 * device.getDataFlows().forEach(flow->{ System.out.println(flow.getFlowID());
		 * System.out.println(flow.getLabel()); });
		 * 
		 * 
		 * });
		 */

	}

}
