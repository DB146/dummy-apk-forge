package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkv {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlq zzd;
    public int zze;

    public zzkv() {
        int i7 = zzlq.zzb;
        int i10 = zznt.zza;
        this.zzd = zzlq.zza;
    }

    public zzkv(zzlq zzlqVar) {
        zzlqVar.getClass();
        this.zzd = zzlqVar;
    }

    public static /* synthetic */ String zza(int i7, int i10, byte b2, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + b2 + String.valueOf(i7).length());
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(i7);
        return sb2.toString();
    }
}
