package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzags implements zzaer<zzags> {
    private static final String zza = "zzags";
    private String zzb;
    private String zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzags zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = e.a(jSONObject.optString("idToken"));
            this.zzc = e.a(jSONObject.optString("refreshToken"));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zzc;
    }
}
