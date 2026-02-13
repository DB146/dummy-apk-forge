package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0815s implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0817u f13455a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0817u f13456b;

    public AbstractC0815s(AbstractC0817u abstractC0817u) {
        this.f13455a = abstractC0817u;
        if (abstractC0817u.i()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f13456b = abstractC0817u.k();
    }

    public final AbstractC0817u a() {
        AbstractC0817u b2 = b();
        b2.getClass();
        if (AbstractC0817u.h(b2, true)) {
            return b2;
        }
        throw new c0();
    }

    public final AbstractC0817u b() {
        if (!this.f13456b.i()) {
            return this.f13456b;
        }
        AbstractC0817u abstractC0817u = this.f13456b;
        abstractC0817u.getClass();
        T t5 = T.f13352c;
        t5.getClass();
        t5.a(abstractC0817u.getClass()).a(abstractC0817u);
        abstractC0817u.j();
        return this.f13456b;
    }

    public final void c() {
        if (this.f13456b.i()) {
            return;
        }
        AbstractC0817u k = this.f13455a.k();
        AbstractC0817u abstractC0817u = this.f13456b;
        T t5 = T.f13352c;
        t5.getClass();
        t5.a(k.getClass()).d(k, abstractC0817u);
        this.f13456b = k;
    }

    public final Object clone() {
        AbstractC0815s abstractC0815s = (AbstractC0815s) this.f13455a.e(5);
        abstractC0815s.f13456b = b();
        return abstractC0815s;
    }
}
