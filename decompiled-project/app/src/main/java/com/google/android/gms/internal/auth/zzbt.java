package com.google.android.gms.internal.auth;

import B5.a;
import com.google.android.gms.common.api.internal.H;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.internal.G;

/* loaded from: classes.dex */
public final class zzbt {
    public final q getSpatulaHeader(o oVar) {
        G.g(oVar);
        return ((H) oVar).f14936b.doWrite((l) new zzbs(this, oVar));
    }

    public final q performProxyRequest(o oVar, a aVar) {
        G.g(oVar);
        G.g(aVar);
        return ((H) oVar).f14936b.doWrite((l) new zzbq(this, oVar, aVar));
    }
}
