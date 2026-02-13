package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaia implements zzaer<zzaia> {
    private static final String zza = "zzaia";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaia zza(String str) {
        try {
            this.zzb = e.a(new JSONObject(str).optString("sessionInfo", null));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
