package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzaiz implements zzaer<zzaiz> {
    private static final String zza = "zzaiz";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzahq> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzaiz zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            e.a(jSONObject.optString("localId", null));
            e.a(jSONObject.optString("email", null));
            e.a(jSONObject.optString("displayName", null));
            this.zzb = e.a(jSONObject.optString("idToken", null));
            e.a(jSONObject.optString("photoUrl", null));
            this.zzc = e.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzahq.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
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
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzahq> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }
}
