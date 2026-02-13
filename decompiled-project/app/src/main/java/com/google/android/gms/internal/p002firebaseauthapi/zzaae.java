package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import y.S;

/* loaded from: classes.dex */
public final class zzaae {
    private final byte[] zza;

    private zzaae(byte[] bArr, int i7, int i10) {
        byte[] bArr2 = new byte[i10];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zzaae zza(byte[] bArr) {
        if (bArr != null) {
            return zza(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static zzaae zza(byte[] bArr, int i7, int i10) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        if (i10 > bArr.length) {
            i10 = bArr.length;
        }
        return new zzaae(bArr, 0, i10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaae) {
            return Arrays.equals(((zzaae) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return S.b("Bytes(", zzzr.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
