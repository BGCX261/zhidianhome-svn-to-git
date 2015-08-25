package com.zd.net;

public class NetworkParam {
	public int addType = 0;
	public boolean blocked = false;
	public String hostPath = "";
	public int key = -1;
	public String progressMessage = "";
	public String progressTitle = "";
	public Object resultObject = null;
	public int type = -1;
	public String url = null;
	public String urlSource = "";

	public NetworkParam() {
	}

	public NetworkParam(String paramString1, String paramString2) {
		this.progressMessage = paramString2;
		this.progressTitle = paramString1;
	}
}
