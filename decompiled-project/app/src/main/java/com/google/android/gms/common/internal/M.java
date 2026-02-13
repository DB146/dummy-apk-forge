package com.google.android.gms.common.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class M extends A {
    public final /* synthetic */ AbstractC0990f g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC0990f abstractC0990f, int i7, Bundle bundle) {
        super(abstractC0990f, i7, bundle);
        this.g = abstractC0990f;
    }

    @Override // com.google.android.gms.common.internal.A
    public final void a(F5.b bVar) {
        AbstractC0990f abstractC0990f = this.g;
        if (abstractC0990f.enableLocalFallback() && AbstractC0990f.zzo(abstractC0990f)) {
            AbstractC0990f.zzk(abstractC0990f, 16);
        } else {
            abstractC0990f.zzc.a(bVar);
            abstractC0990f.onConnectionFailed(bVar);
        }
    }

    @Override // com.google.android.gms.common.internal.A
    public final boolean b() {
        this.g.zzc.a(F5.b.f4086e);
        return true;
    }
}
