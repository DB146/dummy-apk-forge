package com.google.ads.interactivemedia.v3.internal;

import h3.o;

/* loaded from: classes.dex */
public final class zzrm {
    public static int zza(int i7, int i10, String str) {
        String zzb;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            zzb = zzro.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.l(i10, "negative size: "));
            }
            zzb = zzro.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(zzb);
    }

    public static int zzb(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zzi(i7, i10, "index"));
        }
        return i7;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z8, String str, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(zzro.zzb(str, obj));
        }
    }

    public static void zzg(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? zzi(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? zzi(i10, i11, "end index") : zzro.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static void zzh(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzi(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzro.zzb("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzro.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.l(i10, "negative size: "));
    }
}
