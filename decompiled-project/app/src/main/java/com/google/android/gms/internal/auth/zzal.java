package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import w5.AbstractC2218a;

/* loaded from: classes.dex */
public final class zzal {
    private static final Status zza = new Status(13, null, null, null);

    public final q addWorkAccount(o oVar, String str) {
        return ((H) oVar).f14936b.doWrite((l) new zzae(this, AbstractC2218a.f25806a, oVar, str));
    }

    public final q removeWorkAccount(o oVar, Account account) {
        return ((H) oVar).f14936b.doWrite((l) new zzag(this, AbstractC2218a.f25806a, oVar, account));
    }

    public final void setWorkAuthenticatorEnabled(o oVar, boolean z8) {
        setWorkAuthenticatorEnabledWithResult(oVar, z8);
    }

    public final q setWorkAuthenticatorEnabledWithResult(o oVar, boolean z8) {
        return ((H) oVar).f14936b.doWrite((l) new zzac(this, AbstractC2218a.f25806a, oVar, z8));
    }
}
