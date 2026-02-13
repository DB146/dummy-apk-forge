package com.google.android.gms.internal.pal;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class zzgc {
    private final int zza;
    private final String zzb;
    private final Object zzc;

    public /* synthetic */ zzgc(int i7, String str, Object obj, zzgb zzgbVar) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = obj;
        zzfv.zza().zzb(this);
    }

    public static zzgc zze(int i7, String str, float f4) {
        return new zzfz(1, str, Float.valueOf(f4));
    }

    public static zzgc zzf(int i7, String str, int i10) {
        return new zzfx(1, str, Integer.valueOf(i10));
    }

    public static zzgc zzg(int i7, String str, long j) {
        return new zzfy(1, str, Long.valueOf(j));
    }

    public static zzgc zzh(int i7, String str, Boolean bool) {
        return new zzfw(i7, str, bool);
    }

    public static zzgc zzi(int i7, String str, String str2) {
        return new zzga(1, str, str2);
    }

    public static zzgc zzj(int i7, String str) {
        zzgc zzi = zzi(1, "gads:sdk_core_constants:experiment_id", null);
        zzfv.zza().zza(zzi);
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
