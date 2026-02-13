package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaix implements zzaer<zzaix> {
    private static final String zza = "zzaix";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaix zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = e.a(jSONObject.optString("idToken", null));
            this.zzc = e.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = jSONObject.optBoolean("isNewUser", false);
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zze;
    }
}
