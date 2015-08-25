package com.zd.net;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

public class NetworkTask {
	public static final int RequestType_Ciat = 11;

	public boolean cancel = false;
	private String ext = null;
	private HostnameVerifier hnv;
	private String imei = "";
	public NetworkParam param = null;
	private java.net.Proxy proxy = null;
	protected String url;
	private X509TrustManager xtm;

	public NetworkTask(NetworkParam paramNetworkParam) {
		this.xtm = new X509TrustManager() {

			public X509Certificate[] getAcceptedIssuers() {
				// TODO Auto-generated method stub
				return null;
			}

			public void checkServerTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
				// TODO Auto-generated method stub

			}

			public void checkClientTrusted(X509Certificate[] chain,
					String authType) throws CertificateException {
				// TODO Auto-generated method stub

			}
		};

		this.hnv = new HostnameVerifier() {

			public boolean verify(String hostname, SSLSession session) {
				// TODO Auto-generated method stub
				return true;
			}
		};
		this.param = paramNetworkParam;
	}

	public byte[] run() {
		if (param.url == null)
			return null;

		return null;
	}

}
