package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzlw extends zzmh {
    public zzlw(zzkt zzktVar, String str, String str2, zzaf zzafVar, int i7, int i10) {
        super(zzktVar, "4QA96k7kU+TEBvZ6Vs0skN4JRvLlH5fRQQCjtxifVFniF3kHpb6WYIXzoqorvEyw", "0muaWUHzKRAgkCJ0R9TiJ7nEPK8cDnTRY2bsBoH2Q6c=", zzafVar, i7, 73);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmh
    public final void zza() {
        try {
            boolean booleanValue = ((Boolean) this.zzf.invoke(null, this.zzb.zzb())).booleanValue();
            zzaf zzafVar = this.zze;
            int i7 = 1;
            if (true == booleanValue) {
                i7 = 2;
            }
            zzafVar.zzaf(i7);
        } catch (InvocationTargetException unused) {
            this.zze.zzaf(3);
        }
    }
}
