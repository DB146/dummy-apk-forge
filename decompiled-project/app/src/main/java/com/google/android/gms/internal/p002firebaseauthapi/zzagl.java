package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import y.S;

/* loaded from: classes.dex */
public class zzagl implements zzaer<zzagl> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzagl";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e2) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e2.getMessage());
            throw new zzaci(S.b("Failed to parse error for string [", str, "]"), e2);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
