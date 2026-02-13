package z0;

import Q.C0480b;
import Q.C0487e0;
import Q5.e;
import ia.C1358d;
import x0.AbstractC2256a;

/* renamed from: z0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2582d extends e {

    /* renamed from: d, reason: collision with root package name */
    public final C1358d f28153d;

    /* renamed from: e, reason: collision with root package name */
    public final C0487e0 f28154e = C0480b.o(null);

    public C2582d(C1358d c1358d) {
        this.f28153d = c1358d;
    }

    @Override // Q5.e
    public final boolean r(C1358d c1358d) {
        return c1358d == this.f28153d;
    }

    @Override // Q5.e
    public final Object w(C1358d c1358d) {
        if (c1358d != this.f28153d) {
            AbstractC2256a.b("Check failed.");
        }
        Object value = this.f28154e.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
