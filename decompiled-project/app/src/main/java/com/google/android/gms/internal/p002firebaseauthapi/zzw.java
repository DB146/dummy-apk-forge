package com.google.android.gms.internal.p002firebaseauthapi;

import h3.o;

/* loaded from: classes.dex */
public final class zzw {
    public static int zza(int i7, int i10) {
        String zza;
        if (i7 >= 0 && i7 < i10) {
            return i7;
        }
        if (i7 < 0) {
            zza = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i7));
        } else {
            if (i10 < 0) {
                throw new IllegalArgumentException(o.l(i10, "negative size: "));
            }
            zza = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(zza);
    }

    public static int zza(int i7, int i10, String str) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zzb(i7, i10, str));
        }
        return i7;
    }

    public static <T> T zza(T t5) {
        t5.getClass();
        return t5;
    }

    public static void zza(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? zzb(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? zzb(i10, i11, "end index") : zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static void zza(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException(zzr.zza(obj));
        }
    }

    public static int zzb(int i7, int i10) {
        if (i7 < 0 || i7 > i10) {
            throw new IndexOutOfBoundsException(zzb(i7, i10, "index"));
        }
        return i7;
    }

    private static String zzb(int i7, int i10, String str) {
        if (i7 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i10 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
        }
        throw new IllegalArgumentException(o.l(i10, "negative size: "));
    }
}
