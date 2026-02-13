package P4;

import java.util.ArrayList;
import m4.K0;
import m4.L0;
import m5.C1620q;
import n5.AbstractC1705a;

/* renamed from: P4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459g extends p0 {

    /* renamed from: A, reason: collision with root package name */
    public final long f8031A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f8032B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f8033C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f8034D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f8035E;

    /* renamed from: F, reason: collision with root package name */
    public final K0 f8036F;

    /* renamed from: G, reason: collision with root package name */
    public C0457e f8037G;

    /* renamed from: H, reason: collision with root package name */
    public C0458f f8038H;

    /* renamed from: I, reason: collision with root package name */
    public long f8039I;

    /* renamed from: J, reason: collision with root package name */
    public long f8040J;

    /* renamed from: z, reason: collision with root package name */
    public final long f8041z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0459g(AbstractC0453a abstractC0453a, long j, long j10, boolean z8, boolean z10, boolean z11) {
        super(abstractC0453a);
        abstractC0453a.getClass();
        AbstractC1705a.h(j >= 0);
        this.f8041z = j;
        this.f8031A = j10;
        this.f8032B = z8;
        this.f8033C = z10;
        this.f8034D = z11;
        this.f8035E = new ArrayList();
        this.f8036F = new K0();
    }

    @Override // P4.p0
    public final void B(L0 l02) {
        if (this.f8038H != null) {
            return;
        }
        D(l02);
    }

    public final void D(L0 l02) {
        long j;
        long j10;
        long j11;
        K0 k02 = this.f8036F;
        l02.n(0, k02);
        long j12 = k02.f20018E;
        C0457e c0457e = this.f8037G;
        ArrayList arrayList = this.f8035E;
        long j13 = this.f8031A;
        if (c0457e == null || arrayList.isEmpty() || this.f8033C) {
            boolean z8 = this.f8034D;
            long j14 = this.f8041z;
            if (z8) {
                long j15 = k02.f20014A;
                j14 += j15;
                j = j15 + j13;
            } else {
                j = j13;
            }
            this.f8039I = j12 + j14;
            this.f8040J = j13 != Long.MIN_VALUE ? j12 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                C0456d c0456d = (C0456d) arrayList.get(i7);
                long j16 = this.f8039I;
                long j17 = this.f8040J;
                c0456d.f8024e = j16;
                c0456d.f8025f = j17;
            }
            j10 = j14;
            j11 = j;
        } else {
            long j18 = this.f8039I - j12;
            j11 = j13 != Long.MIN_VALUE ? this.f8040J - j12 : Long.MIN_VALUE;
            j10 = j18;
        }
        try {
            C0457e c0457e2 = new C0457e(l02, j10, j11);
            this.f8037G = c0457e2;
            o(c0457e2);
        } catch (C0458f e2) {
            this.f8038H = e2;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((C0456d) arrayList.get(i10)).f8026u = this.f8038H;
            }
        }
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(B b2, C1620q c1620q, long j) {
        C0456d c0456d = new C0456d(this.f8123y.b(b2, c1620q, j), this.f8032B, this.f8039I, this.f8040J);
        this.f8035E.add(c0456d);
        return c0456d;
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void k() {
        C0458f c0458f = this.f8038H;
        if (c0458f != null) {
            throw c0458f;
        }
        super.k();
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        ArrayList arrayList = this.f8035E;
        AbstractC1705a.m(arrayList.remove(interfaceC0476y));
        this.f8123y.p(((C0456d) interfaceC0476y).f8020a);
        if (!arrayList.isEmpty() || this.f8033C) {
            return;
        }
        C0457e c0457e = this.f8037G;
        c0457e.getClass();
        D(c0457e.f8122b);
    }

    @Override // P4.AbstractC0462j, P4.AbstractC0453a
    public final void r() {
        super.r();
        this.f8038H = null;
        this.f8037G = null;
    }
}
