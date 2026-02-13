package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import Y6.i;
import Y6.k;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import h7.C1257c;
import h7.C1259e;
import h8.d;
import h8.f;
import j7.InterfaceC1385a;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final class zzaew {
    private Context zza;
    private zzafp zzb;
    private String zzc;
    private final i zzd;
    private boolean zze;
    private String zzf;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zzaew(i iVar, String str) {
        this(iVar.f12041a, iVar, str);
        iVar.b();
    }

    public zzaew(Context context, i iVar, String str) {
        this.zze = false;
        G.g(context);
        this.zza = context;
        G.g(iVar);
        this.zzd = iVar;
        this.zzc = c.t("Android/Fallback/", str);
    }

    private static String zza(i iVar) {
        InterfaceC1385a interfaceC1385a = (InterfaceC1385a) FirebaseAuth.getInstance(iVar).f15840p.get();
        if (interfaceC1385a == null) {
            return null;
        }
        try {
            C1257c c1257c = (C1257c) Tasks.await(((C1259e) interfaceC1385a).b(false));
            k kVar = c1257c.f17833b;
            if (kVar != null) {
                Log.w("LocalRequestInterceptor", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(kVar)));
            }
            return c1257c.f17832a;
        } catch (InterruptedException e2) {
            e = e2;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("LocalRequestInterceptor", "Unexpected error getting App Check token: " + e.getMessage());
            return null;
        }
    }

    private static String zzb(i iVar) {
        f fVar = (f) FirebaseAuth.getInstance(iVar).f15841q.get();
        if (fVar != null) {
            try {
                return (String) Tasks.await(((d) fVar).a());
            } catch (InterruptedException | ExecutionException e2) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: " + e2.getMessage());
            }
        }
        return null;
    }

    public final void zza(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zza(URLConnection uRLConnection) {
        String h10 = this.zze ? c.h(this.zzc, "/FirebaseUI-Android") : c.h(this.zzc, "/FirebaseCore-Android");
        if (this.zzb == null) {
            this.zzb = new zzafp(this.zza);
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.zzb.zzb());
        uRLConnection.setRequestProperty("X-Android-Cert", this.zzb.zza());
        uRLConnection.setRequestProperty("Accept-Language", zzaev.zza());
        uRLConnection.setRequestProperty("X-Client-Version", h10);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.zzf);
        i iVar = this.zzd;
        iVar.b();
        uRLConnection.setRequestProperty("X-Firebase-GMPID", iVar.f12043c.f12055b);
        uRLConnection.setRequestProperty("X-Firebase-Client", zzb(this.zzd));
        String zza = zza(this.zzd);
        if (!TextUtils.isEmpty(zza)) {
            uRLConnection.setRequestProperty("X-Firebase-AppCheck", zza);
        }
        this.zzf = null;
    }

    public final void zzb(String str) {
        this.zzf = str;
    }
}
