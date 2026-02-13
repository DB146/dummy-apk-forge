package P4;

import android.util.Pair;
import m4.J0;
import m4.K0;
import m4.L0;
import m5.C1620q;
import n5.AbstractC1705a;

/* renamed from: P4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0473v extends p0 {

    /* renamed from: A, reason: collision with root package name */
    public final K0 f8142A;

    /* renamed from: B, reason: collision with root package name */
    public final J0 f8143B;

    /* renamed from: C, reason: collision with root package name */
    public C0471t f8144C;

    /* renamed from: D, reason: collision with root package name */
    public C0470s f8145D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f8146E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f8147F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8148G;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f8149z;

    public C0473v(AbstractC0453a abstractC0453a, boolean z8) {
        super(abstractC0453a);
        this.f8149z = z8 && abstractC0453a.j();
        this.f8142A = new K0();
        this.f8143B = new J0();
        L0 h10 = abstractC0453a.h();
        if (h10 == null) {
            this.f8144C = new C0471t(new C0472u(abstractC0453a.i()), K0.f19999F, C0471t.f8138e);
        } else {
            this.f8144C = new C0471t(h10, null, null);
            this.f8148G = true;
        }
    }

    @Override // P4.p0
    public final B A(B b2) {
        Object obj = b2.f8157a;
        Object obj2 = this.f8144C.f8140d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = C0471t.f8138e;
        }
        return b2.b(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c9  */
    @Override // P4.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(L0 l02) {
        long j;
        C0471t c0471t;
        C0470s c0470s;
        B b2;
        C0471t c0471t2;
        if (this.f8147F) {
            C0471t c0471t3 = this.f8144C;
            this.f8144C = new C0471t(l02, c0471t3.f8139c, c0471t3.f8140d);
            C0470s c0470s2 = this.f8145D;
            if (c0470s2 != null) {
                E(c0470s2.f8137u);
            }
        } else if (l02.p()) {
            if (this.f8148G) {
                C0471t c0471t4 = this.f8144C;
                c0471t2 = new C0471t(l02, c0471t4.f8139c, c0471t4.f8140d);
            } else {
                c0471t2 = new C0471t(l02, K0.f19999F, C0471t.f8138e);
            }
            this.f8144C = c0471t2;
        } else {
            K0 k02 = this.f8142A;
            l02.n(0, k02);
            long j10 = k02.f20014A;
            Object obj = k02.f20019a;
            C0470s c0470s3 = this.f8145D;
            if (c0470s3 != null) {
                C0471t c0471t5 = this.f8144C;
                Object obj2 = c0470s3.f8131a.f8157a;
                J0 j02 = this.f8143B;
                c0471t5.g(obj2, j02);
                long j11 = j02.f19967e + c0470s3.f8132b;
                this.f8144C.m(0, k02, 0L);
                if (j11 != k02.f20014A) {
                    j = j11;
                    Pair i7 = l02.i(this.f8142A, this.f8143B, 0, j);
                    Object obj3 = i7.first;
                    long longValue = ((Long) i7.second).longValue();
                    if (this.f8148G) {
                        c0471t = new C0471t(l02, obj, obj3);
                    } else {
                        C0471t c0471t6 = this.f8144C;
                        c0471t = new C0471t(l02, c0471t6.f8139c, c0471t6.f8140d);
                    }
                    this.f8144C = c0471t;
                    c0470s = this.f8145D;
                    if (c0470s != null) {
                        E(longValue);
                        B b10 = c0470s.f8131a;
                        Object obj4 = this.f8144C.f8140d;
                        Object obj5 = b10.f8157a;
                        if (obj4 != null && obj5.equals(C0471t.f8138e)) {
                            obj5 = this.f8144C.f8140d;
                        }
                        b2 = b10.b(obj5);
                        this.f8148G = true;
                        this.f8147F = true;
                        o(this.f8144C);
                        if (b2 == null) {
                            C0470s c0470s4 = this.f8145D;
                            c0470s4.getClass();
                            c0470s4.b(b2);
                            return;
                        }
                        return;
                    }
                }
            }
            j = j10;
            Pair i72 = l02.i(this.f8142A, this.f8143B, 0, j);
            Object obj32 = i72.first;
            long longValue2 = ((Long) i72.second).longValue();
            if (this.f8148G) {
            }
            this.f8144C = c0471t;
            c0470s = this.f8145D;
            if (c0470s != null) {
            }
        }
        b2 = null;
        this.f8148G = true;
        this.f8147F = true;
        o(this.f8144C);
        if (b2 == null) {
        }
    }

    @Override // P4.p0
    public final void C() {
        if (this.f8149z) {
            return;
        }
        this.f8146E = true;
        z(null, this.f8123y);
    }

    @Override // P4.AbstractC0453a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final C0470s b(B b2, C1620q c1620q, long j) {
        C0470s c0470s = new C0470s(b2, c1620q, j);
        AbstractC1705a.m(c0470s.f8134d == null);
        AbstractC0453a abstractC0453a = this.f8123y;
        c0470s.f8134d = abstractC0453a;
        if (this.f8147F) {
            Object obj = this.f8144C.f8140d;
            Object obj2 = b2.f8157a;
            if (obj != null && obj2.equals(C0471t.f8138e)) {
                obj2 = this.f8144C.f8140d;
            }
            c0470s.b(b2.b(obj2));
        } else {
            this.f8145D = c0470s;
            if (!this.f8146E) {
                this.f8146E = true;
                z(null, abstractC0453a);
            }
        }
        return c0470s;
    }

    public final void E(long j) {
        C0470s c0470s = this.f8145D;
        int b2 = this.f8144C.b(c0470s.f8131a.f8157a);
        if (b2 == -1) {
            return;
        }
        C0471t c0471t = this.f8144C;
        J0 j02 = this.f8143B;
        c0471t.f(b2, j02, false);
        long j10 = j02.f19966d;
        if (j10 != -9223372036854775807L && j >= j10) {
            j = Math.max(0L, j10 - 1);
        }
        c0470s.f8137u = j;
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void k() {
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        C0470s c0470s = (C0470s) interfaceC0476y;
        if (c0470s.f8135e != null) {
            AbstractC0453a abstractC0453a = c0470s.f8134d;
            abstractC0453a.getClass();
            abstractC0453a.p(c0470s.f8135e);
        }
        if (interfaceC0476y == this.f8145D) {
            this.f8145D = null;
        }
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void r() {
        this.f8147F = false;
        this.f8146E = false;
        super.r();
    }
}
