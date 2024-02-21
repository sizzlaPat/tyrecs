package com.spl.tyrecs.services;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.opencsv.exceptions.CsvValidationException;
import com.spl.tyrecs.models.DataFlow;
import com.spl.tyrecs.models.Device;

@Service
public class DeviceFactory {

	private CsvDataFactory csvDatas = new CsvDataFactory("wednesday_workinghours_2_courtCorriger.csv");

	public DeviceFactory() {
		super();
	}

	public Set<Device> deviceFactory() throws CsvValidationException, IOException {

		List<DataFlow> dataflows = this.csvDatas.csvToData();
		Set<Device> listUniqueDevices = new HashSet<>();
		Set<String> listIP = new HashSet<>();
		// Récupération de toutes les adresses IP dans un tableau
		dataflows.forEach(data -> {
			listIP.add(data.getSourceIP());
			listIP.add(data.getDestinationIP());
		});

		// Creation d'une liste de Devices
		listIP.forEach(ip -> {
			Device device = new Device(ip);

			dataflows.forEach(flow -> {

				if ((ip.equals(flow.getSourceIP())) || (ip.equals(flow.getDestinationIP()))) {
					device.addDataFlows(flow);

				}

			});
			listUniqueDevices.add(device);

		});

		return listUniqueDevices;
	}

	public Device getDeviceByIP(String ip) throws CsvValidationException, IOException {

		List<DataFlow> dataflows = this.csvDatas.csvToData();
		if (ip == null) {
			return null; // Ou lancez une IllegalArgumentException selon la logique de votre application
		}

		Set<Device> devices = deviceFactory();
		if (devices == null) {
			return null; // Ou lancez une IllegalStateException selon la logique de votre application
		}

		return devices.stream().filter(device -> ip.equals(device.getDeviceIP())).findFirst().orElse(null); // Ou une
																											// valeur
																											// par
																											// défaut
																											// selon la
																											// logique
																											// de votre
																											// application
	}

}
