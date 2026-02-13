package com.google.android.gms.internal.pal;

/* loaded from: classes.dex */
public final class zzkk {
    private final zzvt zza;

    private zzkk(zzvt zzvtVar) {
        this.zza = zzvtVar;
    }

    public static zzkk zzd(String str, byte[] bArr, int i7) {
        zzvs zza = zzvt.zza();
        zza.zza(str);
        zza.zzb(zzaby.zzn(bArr));
        int i10 = i7 - 1;
        zza.zzc(i10 != 0 ? i10 != 1 ? 5 : 4 : 3);
        return new zzkk((zzvt) zza.zzan());
    }

    public final String zza() {
        return this.zza.zzf();
    }

    public final byte[] zzb() {
        return this.zza.zze().zzt();
    }

    public final int zzc() {
        int zzi = this.zza.zzi() - 2;
        int i7 = 1;
        if (zzi != 1) {
            i7 = 2;
            if (zzi != 2) {
                i7 = 3;
                if (zzi != 3) {
                    if (zzi == 4) {
                        return 4;
                    }
                    throw new IllegalArgumentException("Unknown output prefix type");
                }
            }
        }
        return i7;
    }
}
