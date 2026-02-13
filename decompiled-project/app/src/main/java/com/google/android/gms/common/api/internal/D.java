package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.base.zau;
import o7.C1818h;

/* loaded from: classes.dex */
public final class D implements InterfaceC0961b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14916b;

    public /* synthetic */ D(Object obj, int i7) {
        this.f14915a = i7;
        this.f14916b = obj;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0961b
    public final void a(boolean z8) {
        switch (this.f14915a) {
            case 0:
                zau zauVar = ((C0967h) this.f14916b).f14987B;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z8)));
                return;
            default:
                if (z8) {
                    ((o7.r) this.f14916b).f22107c = true;
                    C1818h c1818h = ((o7.r) this.f14916b).f22106b;
                    c1818h.f22092d.removeCallbacks(c1818h.f22093e);
                    return;
                } else {
                    ((o7.r) this.f14916b).f22107c = false;
                    o7.r rVar = (o7.r) this.f14916b;
                    if (rVar.f22105a <= 0 || rVar.f22107c) {
                        return;
                    }
                    ((o7.r) this.f14916b).f22106b.a();
                    return;
                }
        }
    }
}
