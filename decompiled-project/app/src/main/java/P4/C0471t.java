package P4;

import m4.J0;
import m4.K0;
import m4.L0;

/* renamed from: P4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0471t extends AbstractC0468p {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8138e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f8139c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8140d;

    public C0471t(L0 l02, Object obj, Object obj2) {
        super(l02);
        this.f8139c = obj;
        this.f8140d = obj2;
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final int b(Object obj) {
        Object obj2;
        if (f8138e.equals(obj) && (obj2 = this.f8140d) != null) {
            obj = obj2;
        }
        return this.f8122b.b(obj);
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        this.f8122b.f(i7, j02, z8);
        if (n5.D.a(j02.f19964b, this.f8140d) && z8) {
            j02.f19964b = f8138e;
        }
        return j02;
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final Object l(int i7) {
        Object l10 = this.f8122b.l(i7);
        return n5.D.a(l10, this.f8140d) ? f8138e : l10;
    }

    @Override // P4.AbstractC0468p, m4.L0
    public final K0 m(int i7, K0 k02, long j) {
        this.f8122b.m(i7, k02, j);
        if (n5.D.a(k02.f20019a, this.f8139c)) {
            k02.f20019a = K0.f19999F;
        }
        return k02;
    }
}
