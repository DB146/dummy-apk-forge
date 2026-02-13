package com.google.android.gms.internal.pal;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class zzyg implements zzyh {
    @Override // com.google.android.gms.internal.pal.zzyh
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
