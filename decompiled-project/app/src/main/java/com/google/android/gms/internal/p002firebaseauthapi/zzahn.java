package com.google.android.gms.internal.p002firebaseauthapi;

import G5.a;
import M5.e;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.bumptech.glide.d;
import com.google.android.gms.common.internal.G;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahn extends a implements zzaer<zzahn> {
    public static final Parcelable.Creator<zzahn> CREATOR = new zzahm();
    private static final String zza = "zzahn";
    private String zzb;
    private String zzc;
    private Long zzd;
    private String zze;
    private Long zzf;

    public zzahn() {
        this.zzf = Long.valueOf(System.currentTimeMillis());
    }

    public zzahn(String str, String str2, Long l10, String str3) {
        this(str, str2, l10, str3, Long.valueOf(System.currentTimeMillis()));
    }

    public zzahn(String str, String str2, Long l10, String str3, Long l11) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = l10;
        this.zze = str3;
        this.zzf = l11;
    }

    public static zzahn zzb(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzahn zzahnVar = new zzahn();
            zzahnVar.zzb = jSONObject.optString("refresh_token", null);
            zzahnVar.zzc = jSONObject.optString("access_token", null);
            zzahnVar.zzd = Long.valueOf(jSONObject.optLong("expires_in"));
            zzahnVar.zze = jSONObject.optString("token_type", null);
            zzahnVar.zzf = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzahnVar;
        } catch (JSONException e2) {
            Log.d(zza, "Failed to read GetTokenResponse from JSONObject");
            throw new zzaag(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaer
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahn zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = e.a(jSONObject.optString("refresh_token"));
            this.zzc = e.a(jSONObject.optString("access_token"));
            this.zzd = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.zze = e.a(jSONObject.optString("token_type"));
            this.zzf = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e2) {
            throw zzajc.zza(e2, zza, str);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int M3 = d.M(20293, parcel);
        d.H(parcel, 2, this.zzb, false);
        d.H(parcel, 3, this.zzc, false);
        d.F(parcel, 4, Long.valueOf(zza()));
        d.H(parcel, 5, this.zze, false);
        Long l10 = this.zzf;
        l10.getClass();
        d.F(parcel, 6, l10);
        d.N(M3, parcel);
    }

    public final long zza() {
        Long l10 = this.zzd;
        if (l10 == null) {
            return 0L;
        }
        return l10.longValue();
    }

    public final long zzb() {
        return this.zzf.longValue();
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzc(String str) {
        G.d(str);
        this.zzb = str;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.zzb);
            jSONObject.put("access_token", this.zzc);
            jSONObject.put("expires_in", this.zzd);
            jSONObject.put("token_type", this.zze);
            jSONObject.put("issued_at", this.zzf);
            return jSONObject.toString();
        } catch (JSONException e2) {
            Log.d(zza, "Failed to convert GetTokenResponse to JSON");
            throw new zzaag(e2);
        }
    }

    public final boolean zzg() {
        return System.currentTimeMillis() + 300000 < (this.zzd.longValue() * 1000) + this.zzf.longValue();
    }
}
