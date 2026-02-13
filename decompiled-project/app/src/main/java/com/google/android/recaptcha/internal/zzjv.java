package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public abstract class zzjv {
    private static final char[] zza = "0123456789abcdef".toCharArray();
    public static final /* synthetic */ int zzb = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof zzjv) {
            zzjv zzjvVar = (zzjv) obj;
            if (zzb() == zzjvVar.zzb() && zzc(zzjvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] zze = zze();
        int i7 = zze[0] & 255;
        for (int i10 = 1; i10 < zze.length; i10++) {
            i7 |= (zze[i10] & 255) << (i10 * 8);
        }
        return i7;
    }

    public final String toString() {
        byte[] zze = zze();
        int length = zze.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b2 : zze) {
            char[] cArr = zza;
            sb2.append(cArr[(b2 >> 4) & 15]);
            sb2.append(cArr[b2 & 15]);
        }
        return sb2.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzjv zzjvVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}
