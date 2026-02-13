package l2;

import ma.C1652c;

/* renamed from: l2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1465i implements I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19218b;

    public /* synthetic */ C1465i(Object obj, int i7) {
        this.f19217a = i7;
        this.f19218b = obj;
    }

    @Override // l2.I
    public final void b(Object obj) {
        Object obj2 = this.f19218b;
        switch (this.f19217a) {
            case 0:
                ((ec.q) ((ec.r) obj2)).h(obj);
                return;
            default:
                y9.I dataState = (y9.I) obj;
                int i7 = xa.i.f26297r2;
                kotlin.jvm.internal.l.e(dataState, "dataState");
                xa.i t5 = (xa.i) obj2;
                kotlin.jvm.internal.l.e(t5, "t");
                if (dataState instanceof y9.G) {
                    t5.M0().a();
                    t5.m1((C1652c) ((y9.G) dataState).f27483a);
                    return;
                } else if (dataState instanceof y9.E) {
                    t5.M0().b();
                    return;
                } else {
                    if (dataState instanceof y9.D) {
                        t5.M0().a();
                        return;
                    }
                    return;
                }
        }
    }
}
