package com.google.ads.interactivemedia.v3.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zznj {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zznj(int i7, String str, Object obj, zzni zzniVar) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = obj;
        zznc.zza().zzb(this);
    }

    public static zznj zze(int i7, String str, float f4) {
        return new zzng(1, str, Float.valueOf(f4));
    }

    public static zznj zzf(int i7, String str, int i10) {
        return new zzne(1, str, Integer.valueOf(i10));
    }

    public static zznj zzg(int i7, String str, long j) {
        return new zznf(1, str, Long.valueOf(j));
    }

    public static zznj zzh(int i7, String str, Boolean bool) {
        return new zznd(i7, str, bool);
    }

    public static zznj zzi(int i7, String str, String str2) {
        return new zznh(1, str, str2);
    }

    public static zznj zzj(int i7, String str) {
        zznj zzi = zzi(1, "gads:sdk_core_constants:experiment_id", null);
        zznc.zza().zza(zzi);
        return zzi;
    }

    public abstract Object zza(JSONObject jSONObject);

    public abstract Object zzb(Bundle bundle);

    public abstract Object zzc(SharedPreferences sharedPreferences);

    public final int zzd() {
        return this.zza;
    }

    public final Object zzk() {
        return this.zzc;
    }

    public final String zzl() {
        return this.zzb;
    }
}
