package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1026u implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1028w f15818a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC1028w f15819b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15820c = false;

    public AbstractC1026u(AbstractC1028w abstractC1028w) {
        this.f15818a = abstractC1028w;
        this.f15819b = (AbstractC1028w) abstractC1028w.f(4);
    }

    public final AbstractC1028w a() {
        AbstractC1028w b2 = b();
        if (b2.i()) {
            return b2;
        }
        throw new Db.d();
    }

    public final AbstractC1028w b() {
        if (this.f15820c) {
            return this.f15819b;
        }
        AbstractC1028w abstractC1028w = this.f15819b;
        abstractC1028w.getClass();
        X x2 = X.f15745c;
        x2.getClass();
        x2.a(abstractC1028w.getClass()).a(abstractC1028w);
        this.f15820c = true;
        return this.f15819b;
    }

    public final void c() {
        if (this.f15820c) {
            AbstractC1028w abstractC1028w = (AbstractC1028w) this.f15819b.f(4);
            AbstractC1028w abstractC1028w2 = this.f15819b;
            X x2 = X.f15745c;
            x2.getClass();
            x2.a(abstractC1028w.getClass()).e(abstractC1028w, abstractC1028w2);
            this.f15819b = abstractC1028w;
            this.f15820c = false;
        }
    }

    public final Object clone() {
        AbstractC1026u abstractC1026u = (AbstractC1026u) this.f15818a.f(5);
        abstractC1026u.d(b());
        return abstractC1026u;
    }

    public final void d(AbstractC1028w abstractC1028w) {
        c();
        AbstractC1028w abstractC1028w2 = this.f15819b;
        X x2 = X.f15745c;
        x2.getClass();
        x2.a(abstractC1028w2.getClass()).e(abstractC1028w2, abstractC1028w);
    }
}
