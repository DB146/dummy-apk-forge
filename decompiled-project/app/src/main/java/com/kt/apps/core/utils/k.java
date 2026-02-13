package com.kt.apps.core.utils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes2.dex */
public final /* synthetic */ class k implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean trustEveryone$lambda$0;
        trustEveryone$lambda$0 = NetworkUtilsKt.trustEveryone$lambda$0(str, sSLSession);
        return trustEveryone$lambda$0;
    }
}
