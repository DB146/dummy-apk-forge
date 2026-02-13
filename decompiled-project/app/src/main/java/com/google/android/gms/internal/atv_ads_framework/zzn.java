package com.google.android.gms.internal.atv_ads_framework;

import h3.o;

/* loaded from: classes.dex */
public final class zzn {
    public static int zza(int i7, int i10, String str) {
        String zza;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            zza = zzs.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.l(i10, "negative size: "));
            }
            zza = zzs.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zzb(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zze(i7, i10, "index"));
        }
        return i7;
    }

    public static void zzc(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzd(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? zze(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? zze(i10, i11, "end index") : zzs.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    private static String zze(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzs.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzs.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.l(i10, "negative size: "));
    }
}
