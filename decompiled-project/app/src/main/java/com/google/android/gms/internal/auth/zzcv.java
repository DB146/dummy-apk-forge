package com.google.android.gms.internal.auth;

import X.c;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l10, boolean z8) {
        super(zzczVar, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder n6 = c.n("Invalid long value for ", this.zzc, ": ");
            n6.append((String) obj);
            Log.e("PhenotypeFlag", n6.toString());
            return null;
        }
    }
}
