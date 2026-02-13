package com.google.android.gms.internal.pal;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class zzya implements zzyh {
    @Override // com.google.android.gms.internal.pal.zzyh
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
