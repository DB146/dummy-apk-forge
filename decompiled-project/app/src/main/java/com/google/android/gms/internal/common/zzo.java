package com.google.android.gms.internal.common;

import y.S;

/* loaded from: classes.dex */
final class zzo extends zzn {
    private final char zza;

    public zzo(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i7 = this.zza;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(i7 & 15);
            i7 >>= 4;
        }
        return S.b("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.common.zzr
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
