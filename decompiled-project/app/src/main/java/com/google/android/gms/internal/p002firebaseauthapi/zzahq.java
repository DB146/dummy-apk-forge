package com.google.android.gms.internal.p002firebaseauthapi;

import M5.e;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.G;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahq {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzair zze;

    private zzahq(String str, String str2, String str3, long j, zzair zzairVar) {
        if (!TextUtils.isEmpty(str) && zzairVar != null) {
            Log.e("MfaInfo", "Cannot have both MFA phone_info and totp_info");
            throw new IllegalArgumentException("Cannot have both MFA phone_info and totp_info");
        }
        this.zza = str;
        G.d(str2);
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = j;
        this.zze = zzairVar;
    }

    private static long zza(String str) {
        try {
            return zzaoe.zza(zzaoe.zza(str));
        } catch (ParseException e2) {
            Log.w("MfaInfo", "Could not parse timestamp as ISOString. Invalid ISOString \"" + str + "\"", e2);
            return 0L;
        }
    }

    public static zzahq zza(JSONObject jSONObject) {
        zzahq zzahqVar = new zzahq(e.a(jSONObject.optString("phoneInfo")), e.a(jSONObject.optString("mfaEnrollmentId")), e.a(jSONObject.optString("displayName")), zza(jSONObject.optString("enrolledAt", "")), jSONObject.opt("totpInfo") != null ? new zzair() : null);
        jSONObject.optString("unobfuscatedPhoneInfo");
        return zzahqVar;
    }

    public static List<zzahq> zza(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(zza(jSONArray.getJSONObject(i7)));
        }
        return arrayList;
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzair zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zza;
    }
}
