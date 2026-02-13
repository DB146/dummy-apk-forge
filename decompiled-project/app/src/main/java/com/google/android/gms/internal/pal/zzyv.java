package com.google.android.gms.internal.pal;

import java.util.Arrays;
import y.S;

/* loaded from: classes.dex */
public final class zzyv {
    private final byte[] zza;

    private zzyv(byte[] bArr, int i7, int i10) {
        byte[] bArr2 = new byte[i10];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zzyv zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzyv(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzyv) {
            return Arrays.equals(((zzyv) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return S.b("Bytes(", zzyj.zza(this.zza), ")");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
