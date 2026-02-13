package com.google.android.gms.internal.pal;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zzyq {
    private static final ThreadLocal zza = new zzyp();

    public static byte[] zza(int i7) {
        byte[] bArr = new byte[i7];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
