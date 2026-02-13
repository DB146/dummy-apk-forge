package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaja implements zzaes {
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzaja(String str, String str2, String str3) {
        G.d(str);
        this.zza = str;
        G.d(str2);
        this.zzb = str2;
        this.zzc = str3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        jSONObject.put("mfaEnrollmentId", this.zzb);
        String str = this.zzc;
        if (str != null) {
            jSONObject.put("tenantId", str);
        }
        return jSONObject.toString();
    }
}
