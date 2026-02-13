package x;

import Q.C0480b;
import Q.C0487e0;

/* renamed from: x.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2253x extends C9.h {

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f26160b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487e0 f26161c;

    public C2253x(Object obj) {
        super(11);
        this.f26160b = C0480b.o(obj);
        this.f26161c = C0480b.o(obj);
    }

    @Override // C9.h
    public final void D(Object obj) {
        this.f26160b.setValue(obj);
    }

    @Override // C9.h
    public final void H(i0 i0Var) {
    }

    @Override // C9.h
    public final void I() {
    }

    @Override // C9.h
    public final Object l() {
        return this.f26160b.getValue();
    }

    @Override // C9.h
    public final Object n() {
        return this.f26161c.getValue();
    }
}
