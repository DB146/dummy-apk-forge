package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzaha implements zzaes {
    private String zza;

    public zzaha(String str) {
        G.d(str);
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("idToken", this.zza);
        return jSONObject.toString();
    }
}
