package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzjf {
    public static void zza(boolean z8) {
        if (!z8) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z8, String str, char c10) {
        if (!z8) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(int i7, int i10, int i11) {
        if (i7 < 0 || i10 < i7 || i10 > i11) {
            throw new IndexOutOfBoundsException((i7 < 0 || i7 > i11) ? zzf(i7, i11, "start index") : (i10 < 0 || i10 > i11) ? zzf(i10, i11, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i7)));
        }
    }

    public static void zze(boolean z8, Object obj) {
        if (!z8) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i7, int i10, String str) {
        return i7 < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i7)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i10));
    }
}
