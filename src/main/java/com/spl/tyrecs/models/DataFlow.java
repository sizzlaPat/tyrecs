package com.spl.tyrecs.models;

public class DataFlow {
	private String flowID;
	private String sourceIP;
	private String sourcePort;
	private String destinationIP;
	private String destinationPort;
	private String protocol;
	private String timestamp;
	private String flowDuration;
	private String totalFwdPacket;
	private String totalBackwardPackets;
	private String totalLengthOFwdPackets;
	private String totalLengthOfBwdPackets;
	private String fwdPacketLengthMax;
	private String fwdPacketLengthMin;
	private String fwdPacketLengthMean;
	private String fwdPacketLengthStd;
	private String bwdPacketLengthMax;
	private String bwdPacketLengthMin;
	private String bwdPacketLengthMean;
	private String bwdPacketLengthStd;
	private String flowBytesPerSecond;
	private String flowPacketsPerSecond;
	private String flowIATMean;
	private String flowIATStd;
	private String flowIATMax;
	private String flowIATMin;
	private String fwdIATTotal;
	private String fwdIATMean;
	private String fwdIATStd;
	private String fwdIATMax;
	private String fwdIATMin;
	private String bwdIATTotal;
	private String bwdIATMean;
	private String bwdIATStd;
	private String bwdIATMax;
	private String bwdIATMin;
	private String fwdPSHFlags;
	private String bwdPSHFlags;
	private String fwdURGFlags;
	private String bwdURGFlags;
	private String fwdHeaderLengt;
	private String bwdHeaderLength;
	private String fwdPacketsPerSecond;
	private String bwdPacketsPerSecond;
	private String minPacketLength;
	private String maxPacketLength;
	private String packetLengthMean;
	private String packetLengthStd;
	private String packetLengthVariance;
	private String fINFlagCount;
	private String sYNFlagCount;
	private String rSTFlagCount;
	private String pSHFlagCount;
	private String aCKFlagCount;
	private String uRGFlagCount;
	private String cWEFlagCount;
	private String eCEFlagCount;
	private String downUpRatio;
	private String averagePacketSize;
	private String avgFwdSegmentSize;
	private String avgBwdSegmentSize;
	private String fwdAvgBytesPerBulk;
	private String fwdAvgPacketsPerBulk;
	private String fwdAvgBulkRate;
	private String bwdAvgBytesPerBulk;
	private String bwdAvgPacketsPerBulk;
	private String bwdAvgBulkRate;
	private String subflowFwdPackets;
	private String subflowFwdBytes;
	private String subflowBwdPackets;
	private String subflowBwdBytes;
	private String init_Win_bytes_forward;
	private String init_Win_bytes_backward;
	private String act_data_pkt_fwd;
	private String min_seg_size_forward;
	private String activeMean;
	private String activeStd;
	private String activeMax;
	private String activeMin;
	private String idleMean;
	private String idleStd;
	private String idleMax;
	private String idleMin;
	private String label;

	public DataFlow() {
		super();
	}

	public DataFlow(String flowID, String sourceIP, String sourcePort, String destinationIP, String destinationPort,
			String protocol, String timestamp, String flowDuration, String totalFwdPacket, String totalBackwardPackets,
			String totalLengthOFwdPackets, String totalLengthOfBwdPackets, String fwdPacketLengthMax,
			String fwdPacketLengthMin, String fwdPacketLengthMean, String fwdPacketLengthStd, String bwdPacketLengthMax,
			String bwdPacketLengthMin, String bwdPacketLengthMean, String bwdPacketLengthStd, String flowBytesPerSecond,
			String flowPacketsPerSecond, String flowIATMean, String flowIATStd, String flowIATMax, String flowIATMin,
			String fwdIATTotal, String fwdIATMean, String fwdIATStd, String fwdIATMax, String fwdIATMin,
			String bwdIATTotal, String bwdIATMean, String bwdIATStd, String bwdIATMax, String bwdIATMin,
			String fwdPSHFlags, String bwdPSHFlags, String fwdURGFlags, String bwdURGFlags, String fwdHeaderLengt,
			String bwdHeaderLength, String fwdPacketsPerSecond, String bwdPacketsPerSecond, String minPacketLength,
			String maxPacketLength, String packetLengthMean, String packetLengthStd, String packetLengthVariance,
			String fINFlagCount, String sYNFlagCount, String rSTFlagCount, String pSHFlagCount, String aCKFlagCount,
			String uRGFlagCount, String cWEFlagCount, String eCEFlagCount, String downUpRatio, String averagePacketSize,
			String avgFwdSegmentSize, String avgBwdSegmentSize, String fwdAvgBytesPerBulk, String fwdAvgPacketsPerBulk,
			String fwdAvgBulkRate, String bwdAvgBytesPerBulk, String bwdAvgPacketsPerBulk, String bwdAvgBulkRate,
			String subflowFwdPackets, String subflowFwdBytes, String subflowBwdPackets, String subflowBwdBytes,
			String init_Win_bytes_forward, String init_Win_bytes_backward, String act_data_pkt_fwd,
			String min_seg_size_forward, String activeMean, String activeStd, String activeMax, String activeMin,
			String idleMean, String idleStd, String idleMax, String idleMin, String label) {
		super();
		this.flowID = flowID;
		this.sourceIP = sourceIP;
		this.sourcePort = sourcePort;
		this.destinationIP = destinationIP;
		this.destinationPort = destinationPort;
		this.protocol = protocol;
		this.timestamp = timestamp;
		this.flowDuration = flowDuration;
		this.totalFwdPacket = totalFwdPacket;
		this.totalBackwardPackets = totalBackwardPackets;
		this.totalLengthOFwdPackets = totalLengthOFwdPackets;
		this.totalLengthOfBwdPackets = totalLengthOfBwdPackets;
		this.fwdPacketLengthMax = fwdPacketLengthMax;
		this.fwdPacketLengthMin = fwdPacketLengthMin;
		this.fwdPacketLengthMean = fwdPacketLengthMean;
		this.fwdPacketLengthStd = fwdPacketLengthStd;
		this.bwdPacketLengthMax = bwdPacketLengthMax;
		this.bwdPacketLengthMin = bwdPacketLengthMin;
		this.bwdPacketLengthMean = bwdPacketLengthMean;
		this.bwdPacketLengthStd = bwdPacketLengthStd;
		this.flowBytesPerSecond = flowBytesPerSecond;
		this.flowPacketsPerSecond = flowPacketsPerSecond;
		this.flowIATMean = flowIATMean;
		this.flowIATStd = flowIATStd;
		this.flowIATMax = flowIATMax;
		this.flowIATMin = flowIATMin;
		this.fwdIATTotal = fwdIATTotal;
		this.fwdIATMean = fwdIATMean;
		this.fwdIATStd = fwdIATStd;
		this.fwdIATMax = fwdIATMax;
		this.fwdIATMin = fwdIATMin;
		this.bwdIATTotal = bwdIATTotal;
		this.bwdIATMean = bwdIATMean;
		this.bwdIATStd = bwdIATStd;
		this.bwdIATMax = bwdIATMax;
		this.bwdIATMin = bwdIATMin;
		this.fwdPSHFlags = fwdPSHFlags;
		this.bwdPSHFlags = bwdPSHFlags;
		this.fwdURGFlags = fwdURGFlags;
		this.bwdURGFlags = bwdURGFlags;
		this.fwdHeaderLengt = fwdHeaderLengt;
		this.bwdHeaderLength = bwdHeaderLength;
		this.fwdPacketsPerSecond = fwdPacketsPerSecond;
		this.bwdPacketsPerSecond = bwdPacketsPerSecond;
		this.minPacketLength = minPacketLength;
		this.maxPacketLength = maxPacketLength;
		this.packetLengthMean = packetLengthMean;
		this.packetLengthStd = packetLengthStd;
		this.packetLengthVariance = packetLengthVariance;
		this.fINFlagCount = fINFlagCount;
		this.sYNFlagCount = sYNFlagCount;
		this.rSTFlagCount = rSTFlagCount;
		this.pSHFlagCount = pSHFlagCount;
		this.aCKFlagCount = aCKFlagCount;
		this.uRGFlagCount = uRGFlagCount;
		this.cWEFlagCount = cWEFlagCount;
		this.eCEFlagCount = eCEFlagCount;
		this.downUpRatio = downUpRatio;
		this.averagePacketSize = averagePacketSize;
		this.avgFwdSegmentSize = avgFwdSegmentSize;
		this.avgBwdSegmentSize = avgBwdSegmentSize;
		this.fwdAvgBytesPerBulk = fwdAvgBytesPerBulk;
		this.fwdAvgPacketsPerBulk = fwdAvgPacketsPerBulk;
		this.fwdAvgBulkRate = fwdAvgBulkRate;
		this.bwdAvgBytesPerBulk = bwdAvgBytesPerBulk;
		this.bwdAvgPacketsPerBulk = bwdAvgPacketsPerBulk;
		this.bwdAvgBulkRate = bwdAvgBulkRate;
		this.subflowFwdPackets = subflowFwdPackets;
		this.subflowFwdBytes = subflowFwdBytes;
		this.subflowBwdPackets = subflowBwdPackets;
		this.subflowBwdBytes = subflowBwdBytes;
		this.init_Win_bytes_forward = init_Win_bytes_forward;
		this.init_Win_bytes_backward = init_Win_bytes_backward;
		this.act_data_pkt_fwd = act_data_pkt_fwd;
		this.min_seg_size_forward = min_seg_size_forward;
		this.activeMean = activeMean;
		this.activeStd = activeStd;
		this.activeMax = activeMax;
		this.activeMin = activeMin;
		this.idleMean = idleMean;
		this.idleStd = idleStd;
		this.idleMax = idleMax;
		this.idleMin = idleMin;
		this.label = label;
	}

	public String getFlowID() {
		return flowID;
	}

	public void setFlowID(String flowID) {
		this.flowID = flowID;
	}

	public String getSourceIP() {
		return sourceIP;
	}

	public void setSourceIP(String sourceIP) {
		this.sourceIP = sourceIP;
	}

	public String getSourcePort() {
		return sourcePort;
	}

	public void setSourcePort(String sourcePort) {
		this.sourcePort = sourcePort;
	}

	public String getDestinationIP() {
		return destinationIP;
	}

	public void setDestinationIP(String destinationIP) {
		this.destinationIP = destinationIP;
	}

	public String getDestinationPort() {
		return destinationPort;
	}

	public void setDestinationPort(String destinationPort) {
		this.destinationPort = destinationPort;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getFlowDuration() {
		return flowDuration;
	}

	public void setFlowDuration(String flowDuration) {
		this.flowDuration = flowDuration;
	}

	public String getTotalFwdPacket() {
		return totalFwdPacket;
	}

	public void setTotalFwdPacket(String totalFwdPacket) {
		this.totalFwdPacket = totalFwdPacket;
	}

	public String getTotalBackwardPackets() {
		return totalBackwardPackets;
	}

	public void setTotalBackwardPackets(String totalBackwardPackets) {
		this.totalBackwardPackets = totalBackwardPackets;
	}

	public String getTotalLengthOFwdPackets() {
		return totalLengthOFwdPackets;
	}

	public void setTotalLengthOFwdPackets(String totalLengthOFwdPackets) {
		this.totalLengthOFwdPackets = totalLengthOFwdPackets;
	}

	public String getTotalLengthOfBwdPackets() {
		return totalLengthOfBwdPackets;
	}

	public void setTotalLengthOfBwdPackets(String totalLengthOfBwdPackets) {
		this.totalLengthOfBwdPackets = totalLengthOfBwdPackets;
	}

	public String getFwdPacketLengthMax() {
		return fwdPacketLengthMax;
	}

	public void setFwdPacketLengthMax(String fwdPacketLengthMax) {
		this.fwdPacketLengthMax = fwdPacketLengthMax;
	}

	public String getFwdPacketLengthMin() {
		return fwdPacketLengthMin;
	}

	public void setFwdPacketLengthMin(String fwdPacketLengthMin) {
		this.fwdPacketLengthMin = fwdPacketLengthMin;
	}

	public String getFwdPacketLengthMean() {
		return fwdPacketLengthMean;
	}

	public void setFwdPacketLengthMean(String fwdPacketLengthMean) {
		this.fwdPacketLengthMean = fwdPacketLengthMean;
	}

	public String getFwdPacketLengthStd() {
		return fwdPacketLengthStd;
	}

	public void setFwdPacketLengthStd(String fwdPacketLengthStd) {
		this.fwdPacketLengthStd = fwdPacketLengthStd;
	}

	public String getBwdPacketLengthMax() {
		return bwdPacketLengthMax;
	}

	public void setBwdPacketLengthMax(String bwdPacketLengthMax) {
		this.bwdPacketLengthMax = bwdPacketLengthMax;
	}

	public String getBwdPacketLengthMin() {
		return bwdPacketLengthMin;
	}

	public void setBwdPacketLengthMin(String bwdPacketLengthMin) {
		this.bwdPacketLengthMin = bwdPacketLengthMin;
	}

	public String getBwdPacketLengthMean() {
		return bwdPacketLengthMean;
	}

	public void setBwdPacketLengthMean(String bwdPacketLengthMean) {
		this.bwdPacketLengthMean = bwdPacketLengthMean;
	}

	public String getBwdPacketLengthStd() {
		return bwdPacketLengthStd;
	}

	public void setBwdPacketLengthStd(String bwdPacketLengthStd) {
		this.bwdPacketLengthStd = bwdPacketLengthStd;
	}

	public String getFlowBytesPerSecond() {
		return flowBytesPerSecond;
	}

	public void setFlowBytesPerSecond(String flowBytesPerSecond) {
		this.flowBytesPerSecond = flowBytesPerSecond;
	}

	public String getFlowPacketsPerSecond() {
		return flowPacketsPerSecond;
	}

	public void setFlowPacketsPerSecond(String flowPacketsPerSecond) {
		this.flowPacketsPerSecond = flowPacketsPerSecond;
	}

	public String getFlowIATMean() {
		return flowIATMean;
	}

	public void setFlowIATMean(String flowIATMean) {
		this.flowIATMean = flowIATMean;
	}

	public String getFlowIATStd() {
		return flowIATStd;
	}

	public void setFlowIATStd(String flowIATStd) {
		this.flowIATStd = flowIATStd;
	}

	public String getFlowIATMax() {
		return flowIATMax;
	}

	public void setFlowIATMax(String flowIATMax) {
		this.flowIATMax = flowIATMax;
	}

	public String getFlowIATMin() {
		return flowIATMin;
	}

	public void setFlowIATMin(String flowIATMin) {
		this.flowIATMin = flowIATMin;
	}

	public String getFwdIATTotal() {
		return fwdIATTotal;
	}

	public void setFwdIATTotal(String fwdIATTotal) {
		this.fwdIATTotal = fwdIATTotal;
	}

	public String getFwdIATMean() {
		return fwdIATMean;
	}

	public void setFwdIATMean(String fwdIATMean) {
		this.fwdIATMean = fwdIATMean;
	}

	public String getFwdIATStd() {
		return fwdIATStd;
	}

	public void setFwdIATStd(String fwdIATStd) {
		this.fwdIATStd = fwdIATStd;
	}

	public String getFwdIATMax() {
		return fwdIATMax;
	}

	public void setFwdIATMax(String fwdIATMax) {
		this.fwdIATMax = fwdIATMax;
	}

	public String getFwdIATMin() {
		return fwdIATMin;
	}

	public void setFwdIATMin(String fwdIATMin) {
		this.fwdIATMin = fwdIATMin;
	}

	public String getBwdIATTotal() {
		return bwdIATTotal;
	}

	public void setBwdIATTotal(String bwdIATTotal) {
		this.bwdIATTotal = bwdIATTotal;
	}

	public String getBwdIATMean() {
		return bwdIATMean;
	}

	public void setBwdIATMean(String bwdIATMean) {
		this.bwdIATMean = bwdIATMean;
	}

	public String getBwdIATStd() {
		return bwdIATStd;
	}

	public void setBwdIATStd(String bwdIATStd) {
		this.bwdIATStd = bwdIATStd;
	}

	public String getBwdIATMax() {
		return bwdIATMax;
	}

	public void setBwdIATMax(String bwdIATMax) {
		this.bwdIATMax = bwdIATMax;
	}

	public String getBwdIATMin() {
		return bwdIATMin;
	}

	public void setBwdIATMin(String bwdIATMin) {
		this.bwdIATMin = bwdIATMin;
	}

	public String getFwdPSHFlags() {
		return fwdPSHFlags;
	}

	public void setFwdPSHFlags(String fwdPSHFlags) {
		this.fwdPSHFlags = fwdPSHFlags;
	}

	public String getBwdPSHFlags() {
		return bwdPSHFlags;
	}

	public void setBwdPSHFlags(String bwdPSHFlags) {
		this.bwdPSHFlags = bwdPSHFlags;
	}

	public String getFwdURGFlags() {
		return fwdURGFlags;
	}

	public void setFwdURGFlags(String fwdURGFlags) {
		this.fwdURGFlags = fwdURGFlags;
	}

	public String getBwdURGFlags() {
		return bwdURGFlags;
	}

	public void setBwdURGFlags(String bwdURGFlags) {
		this.bwdURGFlags = bwdURGFlags;
	}

	public String getFwdHeaderLengt() {
		return fwdHeaderLengt;
	}

	public void setFwdHeaderLengt(String fwdHeaderLengt) {
		this.fwdHeaderLengt = fwdHeaderLengt;
	}

	public String getBwdHeaderLength() {
		return bwdHeaderLength;
	}

	public void setBwdHeaderLength(String bwdHeaderLength) {
		this.bwdHeaderLength = bwdHeaderLength;
	}

	public String getFwdPacketsPerSecond() {
		return fwdPacketsPerSecond;
	}

	public void setFwdPacketsPerSecond(String fwdPacketsPerSecond) {
		this.fwdPacketsPerSecond = fwdPacketsPerSecond;
	}

	public String getBwdPacketsPerSecond() {
		return bwdPacketsPerSecond;
	}

	public void setBwdPacketsPerSecond(String bwdPacketsPerSecond) {
		this.bwdPacketsPerSecond = bwdPacketsPerSecond;
	}

	public String getMinPacketLength() {
		return minPacketLength;
	}

	public void setMinPacketLength(String minPacketLength) {
		this.minPacketLength = minPacketLength;
	}

	public String getMaxPacketLength() {
		return maxPacketLength;
	}

	public void setMaxPacketLength(String maxPacketLength) {
		this.maxPacketLength = maxPacketLength;
	}

	public String getPacketLengthMean() {
		return packetLengthMean;
	}

	public void setPacketLengthMean(String packetLengthMean) {
		this.packetLengthMean = packetLengthMean;
	}

	public String getPacketLengthStd() {
		return packetLengthStd;
	}

	public void setPacketLengthStd(String packetLengthStd) {
		this.packetLengthStd = packetLengthStd;
	}

	public String getPacketLengthVariance() {
		return packetLengthVariance;
	}

	public void setPacketLengthVariance(String packetLengthVariance) {
		this.packetLengthVariance = packetLengthVariance;
	}

	public String getfINFlagCount() {
		return fINFlagCount;
	}

	public void setfINFlagCount(String fINFlagCount) {
		this.fINFlagCount = fINFlagCount;
	}

	public String getsYNFlagCount() {
		return sYNFlagCount;
	}

	public void setsYNFlagCount(String sYNFlagCount) {
		this.sYNFlagCount = sYNFlagCount;
	}

	public String getrSTFlagCount() {
		return rSTFlagCount;
	}

	public void setrSTFlagCount(String rSTFlagCount) {
		this.rSTFlagCount = rSTFlagCount;
	}

	public String getpSHFlagCount() {
		return pSHFlagCount;
	}

	public void setpSHFlagCount(String pSHFlagCount) {
		this.pSHFlagCount = pSHFlagCount;
	}

	public String getaCKFlagCount() {
		return aCKFlagCount;
	}

	public void setaCKFlagCount(String aCKFlagCount) {
		this.aCKFlagCount = aCKFlagCount;
	}

	public String getuRGFlagCount() {
		return uRGFlagCount;
	}

	public void setuRGFlagCount(String uRGFlagCount) {
		this.uRGFlagCount = uRGFlagCount;
	}

	public String getcWEFlagCount() {
		return cWEFlagCount;
	}

	public void setcWEFlagCount(String cWEFlagCount) {
		this.cWEFlagCount = cWEFlagCount;
	}

	public String geteCEFlagCount() {
		return eCEFlagCount;
	}

	public void seteCEFlagCount(String eCEFlagCount) {
		this.eCEFlagCount = eCEFlagCount;
	}

	public String getDownUpRatio() {
		return downUpRatio;
	}

	public void setDownUpRatio(String downUpRatio) {
		this.downUpRatio = downUpRatio;
	}

	public String getAveragePacketSize() {
		return averagePacketSize;
	}

	public void setAveragePacketSize(String averagePacketSize) {
		this.averagePacketSize = averagePacketSize;
	}

	public String getAvgFwdSegmentSize() {
		return avgFwdSegmentSize;
	}

	public void setAvgFwdSegmentSize(String avgFwdSegmentSize) {
		this.avgFwdSegmentSize = avgFwdSegmentSize;
	}

	public String getAvgBwdSegmentSize() {
		return avgBwdSegmentSize;
	}

	public void setAvgBwdSegmentSize(String avgBwdSegmentSize) {
		this.avgBwdSegmentSize = avgBwdSegmentSize;
	}

	public String getFwdAvgBytesPerBulk() {
		return fwdAvgBytesPerBulk;
	}

	public void setFwdAvgBytesPerBulk(String fwdAvgBytesPerBulk) {
		this.fwdAvgBytesPerBulk = fwdAvgBytesPerBulk;
	}

	public String getFwdAvgPacketsPerBulk() {
		return fwdAvgPacketsPerBulk;
	}

	public void setFwdAvgPacketsPerBulk(String fwdAvgPacketsPerBulk) {
		this.fwdAvgPacketsPerBulk = fwdAvgPacketsPerBulk;
	}

	public String getFwdAvgBulkRate() {
		return fwdAvgBulkRate;
	}

	public void setFwdAvgBulkRate(String fwdAvgBulkRate) {
		this.fwdAvgBulkRate = fwdAvgBulkRate;
	}

	public String getBwdAvgBytesPerBulk() {
		return bwdAvgBytesPerBulk;
	}

	public void setBwdAvgBytesPerBulk(String bwdAvgBytesPerBulk) {
		this.bwdAvgBytesPerBulk = bwdAvgBytesPerBulk;
	}

	public String getBwdAvgPacketsPerBulk() {
		return bwdAvgPacketsPerBulk;
	}

	public void setBwdAvgPacketsPerBulk(String bwdAvgPacketsPerBulk) {
		this.bwdAvgPacketsPerBulk = bwdAvgPacketsPerBulk;
	}

	public String getBwdAvgBulkRate() {
		return bwdAvgBulkRate;
	}

	public void setBwdAvgBulkRate(String bwdAvgBulkRate) {
		this.bwdAvgBulkRate = bwdAvgBulkRate;
	}

	public String getSubflowFwdPackets() {
		return subflowFwdPackets;
	}

	public void setSubflowFwdPackets(String subflowFwdPackets) {
		this.subflowFwdPackets = subflowFwdPackets;
	}

	public String getSubflowFwdBytes() {
		return subflowFwdBytes;
	}

	public void setSubflowFwdBytes(String subflowFwdBytes) {
		this.subflowFwdBytes = subflowFwdBytes;
	}

	public String getSubflowBwdPackets() {
		return subflowBwdPackets;
	}

	public void setSubflowBwdPackets(String subflowBwdPackets) {
		this.subflowBwdPackets = subflowBwdPackets;
	}

	public String getSubflowBwdBytes() {
		return subflowBwdBytes;
	}

	public void setSubflowBwdBytes(String subflowBwdBytes) {
		this.subflowBwdBytes = subflowBwdBytes;
	}

	public String getInit_Win_bytes_forward() {
		return init_Win_bytes_forward;
	}

	public void setInit_Win_bytes_forward(String init_Win_bytes_forward) {
		this.init_Win_bytes_forward = init_Win_bytes_forward;
	}

	public String getInit_Win_bytes_backward() {
		return init_Win_bytes_backward;
	}

	public void setInit_Win_bytes_backward(String init_Win_bytes_backward) {
		this.init_Win_bytes_backward = init_Win_bytes_backward;
	}

	public String getAct_data_pkt_fwd() {
		return act_data_pkt_fwd;
	}

	public void setAct_data_pkt_fwd(String act_data_pkt_fwd) {
		this.act_data_pkt_fwd = act_data_pkt_fwd;
	}

	public String getMin_seg_size_forward() {
		return min_seg_size_forward;
	}

	public void setMin_seg_size_forward(String min_seg_size_forward) {
		this.min_seg_size_forward = min_seg_size_forward;
	}

	public String getActiveMean() {
		return activeMean;
	}

	public void setActiveMean(String activeMean) {
		this.activeMean = activeMean;
	}

	public String getActiveStd() {
		return activeStd;
	}

	public void setActiveStd(String activeStd) {
		this.activeStd = activeStd;
	}

	public String getActiveMax() {
		return activeMax;
	}

	public void setActiveMax(String activeMax) {
		this.activeMax = activeMax;
	}

	public String getActiveMin() {
		return activeMin;
	}

	public void setActiveMin(String activeMin) {
		this.activeMin = activeMin;
	}

	public String getIdleMean() {
		return idleMean;
	}

	public void setIdleMean(String idleMean) {
		this.idleMean = idleMean;
	}

	public String getIdleStd() {
		return idleStd;
	}

	public void setIdleStd(String idleStd) {
		this.idleStd = idleStd;
	}

	public String getIdleMax() {
		return idleMax;
	}

	public void setIdleMax(String idleMax) {
		this.idleMax = idleMax;
	}

	public String getIdleMin() {
		return idleMin;
	}

	public void setIdleMin(String idleMin) {
		this.idleMin = idleMin;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String toString() {
		return "DataFlow [flowID=" + flowID + ", sourceIP=" + sourceIP + ", sourcePort=" + sourcePort
				+ ", destinationIP=" + destinationIP + ", destinationPort=" + destinationPort + ", protocol=" + protocol
				+ ", timestamp=" + timestamp + "]";
	}
	

}
