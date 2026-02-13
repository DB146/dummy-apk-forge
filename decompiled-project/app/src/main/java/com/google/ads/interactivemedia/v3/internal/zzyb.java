package com.google.ads.interactivemedia.v3.internal;

import y.S;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyb implements zzyz {
    final /* synthetic */ Class zza;

    public zzyb(zzyl zzylVar, Class cls) {
        this.zza = cls;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyz
    public final Object zza() {
        try {
            return zzzk.zzc.zza(this.zza);
        } catch (Exception e2) {
            throw new RuntimeException(S.b("Unable to create instance of ", String.valueOf(this.zza), ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem."), e2);
        }
    }
}
