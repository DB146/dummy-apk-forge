package com.google.android.gms.internal.auth;

import X.c;
import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d10, boolean z8) {
        super(zzczVar, str, d10, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    public final /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder n6 = c.n("Invalid double value for ", this.zzc, ": ");
            n6.append((String) obj);
            Log.e("PhenotypeFlag", n6.toString());
            return null;
        }
    }
}
