package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzzg<JcePrimitiveT> implements zzzh<JcePrimitiveT> {
    private final zzzj<JcePrimitiveT> zza;

    private zzzg(zzzj<JcePrimitiveT> zzzjVar) {
        this.zza = zzzjVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzh
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzzd.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e2) {
                if (exc == null) {
                    exc = e2;
                }
            }
        }
        return this.zza.zza(str, null);
    }
}
