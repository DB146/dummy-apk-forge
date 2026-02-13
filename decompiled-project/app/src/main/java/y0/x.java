package y0;

import A0.T;

/* loaded from: classes.dex */
public final class x extends AbstractC2322G {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26632b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26633c;

    public /* synthetic */ x(Object obj, int i7) {
        this.f26632b = i7;
        this.f26633c = obj;
    }

    @Override // y0.AbstractC2322G
    public final V0.l b() {
        switch (this.f26632b) {
            case 0:
                return ((T) this.f26633c).getLayoutDirection();
            default:
                return ((B0.D) this.f26633c).getLayoutDirection();
        }
    }

    @Override // y0.AbstractC2322G
    public final int c() {
        switch (this.f26632b) {
            case 0:
                return ((T) this.f26633c).I();
            default:
                return ((B0.D) this.f26633c).getRoot().f61T.f105p.f26554a;
        }
    }
}
