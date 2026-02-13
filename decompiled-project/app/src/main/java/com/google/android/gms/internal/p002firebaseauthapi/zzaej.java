package com.google.android.gms.internal.p002firebaseauthapi;

import I5.a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import j8.InterfaceC1387b;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes.dex */
public interface zzaej {
    public static final a zza = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context zza();

    Uri.Builder zza(Intent intent, String str, String str2);

    String zza(String str);

    HttpURLConnection zza(URL url);

    void zza(Uri uri, String str, InterfaceC1387b interfaceC1387b);

    void zza(String str, Status status);
}
