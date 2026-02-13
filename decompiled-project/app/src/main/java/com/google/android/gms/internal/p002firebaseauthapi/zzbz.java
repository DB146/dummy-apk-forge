package com.google.android.gms.internal.p002firebaseauthapi;

import X.c;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzbz {
    private static final CopyOnWriteArrayList<zzca> zza = new CopyOnWriteArrayList<>();

    public static zzca zza(String str) {
        Iterator<zzca> it = zza.iterator();
        while (it.hasNext()) {
            zzca next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(c.t("No KMS client does support: ", str));
    }
}
