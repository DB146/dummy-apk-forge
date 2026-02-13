package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.G;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzage {
    private final String zza;

    public zzage(String str) {
        G.d(str);
        this.zza = str;
    }

    public final JSONObject zza() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appSignatureHash", this.zza);
        return jSONObject;
    }
}
