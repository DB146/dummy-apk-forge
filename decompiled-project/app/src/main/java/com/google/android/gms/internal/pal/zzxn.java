package com.google.android.gms.internal.pal;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class zzxn {
    private static final Charset zza = Charset.forName("UTF-8");

    public static byte[] zza(String str, int i7) {
        byte[] bytes = str.getBytes(zza);
        int length = bytes.length;
        zzxm zzxmVar = new zzxm(2, new byte[(length * 3) / 4]);
        if (!zzxmVar.zza(bytes, 0, length, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i10 = zzxmVar.zzb;
        byte[] bArr = zzxmVar.zza;
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }
}
