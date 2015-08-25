package com.zd.net;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetNetworkTask extends NetworkTask {
	public GetNetworkTask(NetworkParam paramNetworkParam) {
		super(paramNetworkParam);
	}

	@Override
	public byte[] run() {
		HttpURLConnection httpurlconnection = null;
		try {
			URL url1 = new java.net.URL(param.url);
			httpurlconnection = (HttpURLConnection) url1.openConnection();
			if (httpurlconnection == null)
				return null;

			httpurlconnection.setConnectTimeout(30000);
			httpurlconnection.setReadTimeout(30000);
			httpurlconnection.setRequestMethod("GET");
			httpurlconnection.setRequestProperty("Content-Type",
					"application/x-www-form-urlencoded");
			httpurlconnection.connect();

			InputStream inputstream = httpurlconnection.getInputStream();
			ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();

			int k = inputstream.read();
			while (k != -1) {
				bytearrayoutputstream.write(k);
				k = inputstream.read();
			}
			inputstream.close();
			byte[] abyte0 = bytearrayoutputstream.toByteArray();

			if (httpurlconnection != null)
				httpurlconnection.disconnect();
			bytearrayoutputstream.close();
			return abyte0;

		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return null;
	}

}
