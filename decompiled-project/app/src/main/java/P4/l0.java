package P4;

import N6.t0;
import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import m4.C1558a0;
import m4.C1562c0;
import m5.C1619p;
import m5.C1620q;
import m5.InterfaceC1615l;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class l0 extends AbstractC0453a {

    /* renamed from: B, reason: collision with root package name */
    public final h0 f8093B;

    /* renamed from: C, reason: collision with root package name */
    public final C1558a0 f8094C;

    /* renamed from: D, reason: collision with root package name */
    public m5.T f8095D;

    /* renamed from: v, reason: collision with root package name */
    public final C1619p f8096v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC1615l f8097w;

    /* renamed from: x, reason: collision with root package name */
    public final m4.L f8098x;

    /* renamed from: z, reason: collision with root package name */
    public final Y5.B f8100z;

    /* renamed from: y, reason: collision with root package name */
    public final long f8099y = -9223372036854775807L;

    /* renamed from: A, reason: collision with root package name */
    public final boolean f8092A = true;

    /* JADX WARN: Type inference failed for: r7v5, types: [m4.Q, m4.S] */
    public l0(m4.Z z8, InterfaceC1615l interfaceC1615l, Y5.B b2) {
        m4.V v10;
        this.f8097w = interfaceC1615l;
        this.f8100z = b2;
        boolean z10 = true;
        m4.P p10 = new m4.P();
        S2.b bVar = new S2.b();
        List emptyList = Collections.emptyList();
        t0 t0Var = t0.f7341e;
        m4.W w10 = m4.W.f20184c;
        Uri uri = Uri.EMPTY;
        String uri2 = z8.f20205a.toString();
        uri2.getClass();
        N6.H F10 = N6.H.F(N6.H.K(z8));
        if (((Uri) bVar.f8987e) != null && ((UUID) bVar.f8986d) == null) {
            z10 = false;
        }
        AbstractC1705a.m(z10);
        if (uri != null) {
            v10 = new m4.V(uri, null, ((UUID) bVar.f8986d) != null ? new m4.T(bVar) : null, null, emptyList, null, F10);
        } else {
            v10 = null;
        }
        C1558a0 c1558a0 = new C1558a0(uri2, new m4.Q(p10), v10, new m4.U(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), C1562c0.f20268W, w10);
        this.f8094C = c1558a0;
        m4.K k = new m4.K();
        k.k = (String) E6.b.k(z8.f20206b, "text/x-unknown");
        k.f19978c = z8.f20207c;
        k.f19979d = z8.f20208d;
        k.f19980e = z8.f20209e;
        k.f19977b = z8.f20210f;
        String str = z8.f20211u;
        k.f19976a = str != null ? str : null;
        this.f8098x = new m4.L(k);
        Map emptyMap = Collections.emptyMap();
        Uri uri3 = z8.f20205a;
        AbstractC1705a.o(uri3, "The uri must be set.");
        this.f8096v = new C1619p(uri3, 1, null, emptyMap, 0L, -1L, null, 1);
        this.f8093B = new h0(-9223372036854775807L, true, false, c1558a0);
    }

    @Override // P4.AbstractC0453a
    public final InterfaceC0476y b(B b2, C1620q c1620q, long j) {
        m5.T t5 = this.f8095D;
        A4.s a9 = a(b2);
        return new k0(this.f8096v, this.f8097w, t5, this.f8098x, this.f8099y, this.f8100z, a9, this.f8092A);
    }

    @Override // P4.AbstractC0453a
    public final C1558a0 i() {
        return this.f8094C;
    }

    @Override // P4.AbstractC0453a
    public final void k() {
    }

    @Override // P4.AbstractC0453a
    public final void n(m5.T t5) {
        this.f8095D = t5;
        o(this.f8093B);
    }

    @Override // P4.AbstractC0453a
    public final void p(InterfaceC0476y interfaceC0476y) {
        ((k0) interfaceC0476y).f8085w.e(null);
    }

    @Override // P4.AbstractC0453a
    public final void r() {
    }
}
