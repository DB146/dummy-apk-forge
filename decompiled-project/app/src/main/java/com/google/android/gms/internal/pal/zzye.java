package com.google.android.gms.internal.pal;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzye implements zzyh {
    @Override // com.google.android.gms.internal.pal.zzyh
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
