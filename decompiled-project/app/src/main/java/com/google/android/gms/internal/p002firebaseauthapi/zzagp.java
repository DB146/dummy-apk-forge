package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import com.google.android.gms.common.internal.G;
import n7.C1711b;
import n7.C1713d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagp implements zzaes {
    private static final String zza = "zzagp";
    private final String zzb;
    private final String zzc;
    private final C1713d zzd;
    private final String zze;
    private final String zzf;

    static {
        String[] strArr = new String[0];
        if (strArr.length != 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str);
            }
            sb2.append("] ");
        }
        for (int i7 = 2; i7 <= 7 && !Log.isLoggable(zza, i7); i7++) {
        }
    }

    public zzagp(C1713d c1713d, String str, String str2) {
        G.g(c1713d);
        this.zzd = c1713d;
        String str3 = c1713d.f21281a;
        G.d(str3);
        this.zzb = str3;
        String str4 = c1713d.f21283c;
        G.d(str4);
        this.zzc = str4;
        this.zze = str;
        this.zzf = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() {
        C1711b c1711b;
        String str = this.zzc;
        int i7 = C1711b.f21278c;
        G.d(str);
        try {
            c1711b = new C1711b(str);
        } catch (IllegalArgumentException unused) {
            c1711b = null;
        }
        String str2 = c1711b != null ? c1711b.f21279a : null;
        String str3 = c1711b != null ? c1711b.f21280b : null;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", this.zzb);
        if (str2 != null) {
            jSONObject.put("oobCode", str2);
        }
        if (str3 != null) {
            jSONObject.put("tenantId", str3);
        }
        String str4 = this.zze;
        if (str4 != null) {
            jSONObject.put("idToken", str4);
        }
        String str5 = this.zzf;
        if (str5 != null) {
            zzajc.zza(jSONObject, "captchaResp", str5);
        } else {
            zzajc.zza(jSONObject);
        }
        return jSONObject.toString();
    }

    public final C1713d zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }
}
