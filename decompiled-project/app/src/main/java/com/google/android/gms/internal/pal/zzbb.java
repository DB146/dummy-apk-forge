package com.google.android.gms.internal.pal;

import android.util.Base64;
import android.util.Log;
import com.google.ads.interactivemedia.pal.NonceLoaderException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzbb implements zzba {
    private final zzjy zza;

    public zzbb(zzjy zzjyVar) {
        this.zza = zzjyVar;
    }

    @Override // com.google.android.gms.internal.pal.zzba
    public final String zza(String str) {
        try {
            return Base64.encodeToString(this.zza.zza(str.getBytes("UTF-8"), new byte[0]), 10);
        } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e2) {
            Log.e("NonceGenerator", "Failed to encrypt the string.", e2);
            throw new NonceLoaderException(204, e2);
        }
    }
}
