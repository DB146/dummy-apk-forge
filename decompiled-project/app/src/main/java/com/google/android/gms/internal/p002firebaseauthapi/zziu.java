package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zziu extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        try {
            Cipher zza = zzzd.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzhc.zza(zza)) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
