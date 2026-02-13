package com.google.android.gms.internal.p002firebaseauthapi;

import y.S;

/* loaded from: classes.dex */
final class zzh extends zzi {
    private final char zza;

    public zzh(char c10) {
        this.zza = c10;
    }

    public final String toString() {
        char c10 = this.zza;
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i7 = 0; i7 < 4; i7++) {
            cArr[5 - i7] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        return S.b("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzf
    public final boolean zza(char c10) {
        return c10 == this.zza;
    }
}
