package u0;

import A0.AbstractC0017g;
import A0.y0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cc.C0944m;
import cc.D0;
import cc.F;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y extends c0.l implements InterfaceC2083m, V0.c, y0 {

    /* renamed from: C, reason: collision with root package name */
    public Object f24811C;

    /* renamed from: D, reason: collision with root package name */
    public Object f24812D;

    /* renamed from: E, reason: collision with root package name */
    public PointerInputEventHandler f24813E;

    /* renamed from: F, reason: collision with root package name */
    public D0 f24814F;

    /* renamed from: G, reason: collision with root package name */
    public C2075e f24815G = AbstractC2090t.f24799a;

    /* renamed from: H, reason: collision with root package name */
    public final S.e f24816H;

    /* renamed from: I, reason: collision with root package name */
    public final S.e f24817I;

    /* renamed from: J, reason: collision with root package name */
    public final S.e f24818J;

    /* renamed from: K, reason: collision with root package name */
    public C2075e f24819K;
    public long L;

    public y(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f24811C = obj;
        this.f24812D = obj2;
        this.f24813E = pointerInputEventHandler;
        S.e eVar = new S.e(new v[16]);
        this.f24816H = eVar;
        this.f24817I = eVar;
        this.f24818J = new S.e(new v[16]);
        this.L = 0L;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // A0.y0
    public final void H(C2075e c2075e, EnumC2076f enumC2076f, long j) {
        this.L = j;
        if (enumC2076f == EnumC2076f.f24757a) {
            this.f24815G = c2075e;
        }
        if (this.f24814F == null) {
            this.f24814F = F.B(d0(), null, 4, new x(this, null), 1);
        }
        p0(c2075e, enumC2076f);
        ?? r52 = c2075e.f24754a;
        int size = r52.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c2075e = null;
                break;
            } else if (!u.b((C2080j) r52.get(i7))) {
                break;
            } else {
                i7++;
            }
        }
        this.f24819K = c2075e;
    }

    @Override // A0.y0
    public final void I() {
        q0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // A0.y0
    public final void L() {
        C2075e c2075e = this.f24819K;
        if (c2075e == null) {
            return;
        }
        ?? r12 = c2075e.f24754a;
        int size = r12.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((C2080j) r12.get(i7)).f24766d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    C2080j c2080j = (C2080j) r12.get(i10);
                    long j = c2080j.f24763a;
                    boolean z8 = c2080j.f24766d;
                    int i11 = c2080j.f24770i;
                    long j10 = c2080j.f24764b;
                    long j11 = c2080j.f24765c;
                    arrayList.add(new C2080j(j, j10, j11, false, c2080j.f24767e, j10, j11, z8, z8, i11, 0L));
                }
                C2075e c2075e2 = new C2075e(arrayList, null);
                this.f24815G = c2075e2;
                p0(c2075e2, EnumC2076f.f24757a);
                p0(c2075e2, EnumC2076f.f24758b);
                p0(c2075e2, EnumC2076f.f24759c);
                this.f24819K = null;
                return;
            }
        }
    }

    @Override // A0.InterfaceC0024m, A0.y0
    public final void a() {
        q0();
    }

    @Override // V0.c
    public final float f() {
        return AbstractC0017g.t(this).L.f();
    }

    @Override // c0.l
    public final void i0() {
        q0();
    }

    @Override // V0.c
    public final float k() {
        return AbstractC0017g.t(this).L.k();
    }

    public final void p0(C2075e c2075e, EnumC2076f enumC2076f) {
        C0944m c0944m;
        C0944m c0944m2;
        synchronized (this.f24817I) {
            S.e eVar = this.f24818J;
            eVar.c(eVar.f8961c, this.f24816H);
        }
        try {
            int ordinal = enumC2076f.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    S.e eVar2 = this.f24818J;
                    int i7 = eVar2.f8961c - 1;
                    Object[] objArr = eVar2.f8959a;
                    if (i7 < objArr.length) {
                        while (i7 >= 0) {
                            v vVar = (v) objArr[i7];
                            if (enumC2076f == vVar.f24804d && (c0944m2 = vVar.f24803c) != null) {
                                vVar.f24803c = null;
                                c0944m2.resumeWith(c2075e);
                            }
                            i7--;
                        }
                    }
                } else if (ordinal != 2) {
                }
            }
            S.e eVar3 = this.f24818J;
            Object[] objArr2 = eVar3.f8959a;
            int i10 = eVar3.f8961c;
            for (int i11 = 0; i11 < i10; i11++) {
                v vVar2 = (v) objArr2[i11];
                if (enumC2076f == vVar2.f24804d && (c0944m = vVar2.f24803c) != null) {
                    vVar2.f24803c = null;
                    c0944m.resumeWith(c2075e);
                }
            }
        } finally {
            this.f24818J.g();
        }
    }

    public final void q0() {
        D0 d02 = this.f24814F;
        if (d02 != null) {
            d02.q(new c0.n("Pointer input was reset", 1));
            this.f24814F = null;
        }
    }
}
