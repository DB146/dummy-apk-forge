package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.security.Key;
import javax.crypto.Mac;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzym extends ThreadLocal {
    final /* synthetic */ zzyn zza;

    public zzym(zzyn zzynVar) {
        this.zza = zzynVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzxz zzxzVar = zzxz.zzb;
            str = this.zza.zzb;
            Mac mac = (Mac) zzxzVar.zza(str);
            key = this.zza.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }
}
