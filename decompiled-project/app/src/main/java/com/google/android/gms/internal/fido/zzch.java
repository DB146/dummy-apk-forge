package com.google.android.gms.internal.fido;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class zzch {
    private static final zzch zza = new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzch zzb = new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzch zzc = new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzch zzd = new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzch zze = new zzce("base16()", "0123456789ABCDEF");

    public static zzch zzf() {
        return zze;
    }

    public abstract void zzb(Appendable appendable, byte[] bArr, int i7, int i10);

    public abstract int zzc(int i7);

    public abstract zzch zzd();

    public final String zzg(byte[] bArr, int i7, int i10) {
        zzap.zze(0, i10, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzc(i10));
        try {
            zzb(sb2, bArr, 0, i10);
            return sb2.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
