package com.spl.tyrecs.services;

import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.spl.tyrecs.models.DataFlow;

public class CsvConvertTab {

	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception {

		URL fileUrl = CsvConvertTab.class.getClassLoader().getResource("wednesday_workinghours_2_courtCorriger.csv");

		// Build reader instance
		// Read data.csv
		// Default separator is comma
		// Start reading from line number 2 (line numbers start from zero)
		CSVParser csvParser = new CSVParserBuilder().withSeparator(',').withIgnoreQuotations(true).build();

		CSVReader csvReader = new CSVReaderBuilder(new FileReader(fileUrl.getFile())).withSkipLines(1)
				.withCSVParser(csvParser).build();

		// Read CSV line by line and use the string array as you want
		String[] nextLine;
		List<DataFlow> dataflows = new ArrayList<>();
		;
		while ((nextLine = csvReader.readNext()) != null) {
			if (nextLine != null) {
				// Verifying the read data here

				System.out.println(Arrays.toString(nextLine));

			}

			String elementsElement = nextLine[0];
			String[] elements = elementsElement.split(";");
			String flowID = elements[0];
			String sourceIP = elements[1];
			String sourcePort = elements[2];
			String destinationIP = elements[3];
			String destinationPort = elements[4];
			String protocol = elements[5];
			String timestamp = elements[6];
			String flowDuration = elements[7];
			String totalFwdPacket = elements[8];
			String totalBackwardPackets = elements[9];
			String totalLengthOFwdPackets = elements[10];
			String totalLengthOfBwdPackets = elements[11];
			String fwdPacketLengthMax = elements[12];
			String fwdPacketLengthMin = elements[13];
			String fwdPacketLengthMean = elements[14];
			String fwdPacketLengthStd = elements[15];
			String bwdPacketLengthMax = elements[16];
			String bwdPacketLengthMin = elements[17];
			String bwdPacketLengthMean = elements[18];
			String bwdPacketLengthStd = elements[19];
			String flowBytesPerSecond = elements[20];
			String flowPacketsPerSecond = elements[21];
			String flowIATMean = elements[22];
			String flowIATStd = elements[23];
			String flowIATMax = elements[24];
			String flowIATMin = elements[25];
			String fwdIATTotal = elements[26];
			String fwdIATMean = elements[27];
			String fwdIATStd = elements[28];
			String fwdIATMax = elements[29];
			String fwdIATMin = elements[30];
			String bwdIATTotal = elements[31];
			String bwdIATMean = elements[32];
			String bwdIATStd = elements[33];
			String bwdIATMax = elements[34];
			String bwdIATMin = elements[35];
			String fwdPSHFlags = elements[36];
			String bwdPSHFlags = elements[37];
			String fwdURGFlags = elements[38];
			String bwdURGFlags = elements[39];
			String fwdHeaderLengt = elements[40];
			String bwdHeaderLength = elements[41];
			String fwdPacketsPerSecond = elements[42];
			String bwdPacketsPerSecond = elements[43];
			String minPacketLength = elements[44];
			String maxPacketLength = elements[45];
			String packetLengthMean = elements[46];
			String packetLengthStd = elements[47];
			String packetLengthVariance = elements[48];
			String fINFlagCount = elements[49];
			String sYNFlagCount = elements[50];
			String rSTFlagCount = elements[51];
			String pSHFlagCount = elements[52];
			String aCKFlagCount = elements[53];
			String uRGFlagCount = elements[54];
			String cWEFlagCount = elements[55];
			String eCEFlagCount = elements[56];
			String downUpRatio = elements[57];
			String averagePacketSize = elements[58];
			String avgFwdSegmentSize = elements[59];
			String avgBwdSegmentSize = elements[60];
			String fwdAvgBytesPerBulk = elements[61];
			String fwdAvgPacketsPerBulk = elements[62];
			String fwdAvgBulkRate = elements[63];
			String bwdAvgBytesPerBulk = elements[64];
			String bwdAvgPacketsPerBulk = elements[65];
			String bwdAvgBulkRate = elements[66];
			String subflowFwdPackets = elements[67];
			String subflowFwdBytes = elements[68];
			String subflowBwdPackets = elements[69];
			String subflowBwdBytes = elements[70];
			String init_Win_bytes_forward = elements[71];
			String init_Win_bytes_backward = elements[72];
			String act_data_pkt_fwd = elements[73];
			String min_seg_size_forward = elements[74];
			String activeMean = elements[75];
			String activeStd = elements[76];
			String activeMax = elements[77];
			String activeMin = elements[78];
			String idleMean = elements[79];
			String idleStd = elements[80];
			String idleMax = elements[81];
			String idleMin = elements[82];
			String label = elements[83];

			// Creation d'un nouveau DataFlow

			DataFlow newDataFlow = new DataFlow(flowID, sourceIP, sourcePort, destinationIP, destinationPort, protocol,
					timestamp, flowDuration, totalFwdPacket, totalBackwardPackets, totalLengthOFwdPackets,
					totalLengthOfBwdPackets, fwdPacketLengthMax, fwdPacketLengthMin, fwdPacketLengthMean,
					fwdPacketLengthStd, bwdPacketLengthMax, bwdPacketLengthMin, bwdPacketLengthMean, bwdPacketLengthStd,
					flowBytesPerSecond, flowPacketsPerSecond, flowIATMean, flowIATStd, flowIATMax, flowIATMin,
					fwdIATTotal, fwdIATMean, fwdIATStd, fwdIATMax, fwdIATMin, bwdIATTotal, bwdIATMean, bwdIATStd,
					bwdIATMax, bwdIATMin, fwdPSHFlags, bwdPSHFlags, fwdURGFlags, bwdURGFlags, fwdHeaderLengt,
					bwdHeaderLength, fwdPacketsPerSecond, bwdPacketsPerSecond, minPacketLength, maxPacketLength,
					packetLengthMean, packetLengthStd, packetLengthVariance, fINFlagCount, sYNFlagCount, rSTFlagCount,
					pSHFlagCount, aCKFlagCount, uRGFlagCount, cWEFlagCount, eCEFlagCount, downUpRatio,
					averagePacketSize, avgFwdSegmentSize, avgBwdSegmentSize, fwdAvgBytesPerBulk, fwdAvgPacketsPerBulk,
					fwdAvgBulkRate, bwdAvgBytesPerBulk, bwdAvgPacketsPerBulk, bwdAvgBulkRate, subflowFwdPackets,
					subflowFwdBytes, subflowBwdPackets, subflowBwdBytes, init_Win_bytes_forward,
					init_Win_bytes_backward, act_data_pkt_fwd, min_seg_size_forward, activeMean, activeStd, activeMax,
					activeMin, idleMean, idleStd, idleMax, idleMin, label);

			// Verification de la creation du DataFlow
			System.out.println("****************newdataFlow*****************");
			System.out.println("****************newdataFlow sourceIP*****************");
			System.out.println(newDataFlow.getSourceIP());
			System.out.println("****************newdataFlow destinationIP*****************");
			System.out.println(newDataFlow.getDestinationIP());
			System.out.println("****************newdataFlow ID*****************");
			System.out.println(newDataFlow.getFlowID());
			System.out.println("****************newdataFlow Label*****************");
			System.out.println(newDataFlow.getLabel());

			// Ajout d'un nouveau DataFlow dans la liste
			dataflows.add(newDataFlow);

		}

	}

}
