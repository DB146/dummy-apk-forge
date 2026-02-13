package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahj implements zzaer<zzahj> {
    private static final String zza = "zzahj";
    private String zzb;

    public zzahj() {
    }

    public zzahj(String str) {
        this.zzb = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahj zza(String str) {
        try {
            this.zzb = e.a(new JSONObject(str).optString("producerProjectNumber"));
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
