package com.kt.apps.core.utils;

import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes2.dex */
public final class NetworkUtilsKt {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, javax.net.ssl.HostnameVerifier] */
    public static final void trustEveryone() {
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new Object());
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new X509TrustManager[]{new X509TrustManager() { // from class: com.kt.apps.core.utils.NetworkUtilsKt$trustEveryone$2
                @Override // javax.net.ssl.X509TrustManager
                public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                }

                @Override // javax.net.ssl.X509TrustManager
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }}, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean trustEveryone$lambda$0(String str, SSLSession sSLSession) {
        return true;
    }
}
