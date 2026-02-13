package K0;

import j0.AbstractC1362A;
import l0.AbstractC1444c;
import y.S;

/* loaded from: classes.dex */
public final class x implements InterfaceC0372b {

    /* renamed from: a, reason: collision with root package name */
    public final U0.p f5986a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5987b;

    /* renamed from: c, reason: collision with root package name */
    public final N0.k f5988c;

    /* renamed from: d, reason: collision with root package name */
    public final N0.i f5989d;

    /* renamed from: e, reason: collision with root package name */
    public final N0.j f5990e;

    /* renamed from: f, reason: collision with root package name */
    public final N0.q f5991f;
    public final String g;

    /* renamed from: h, reason: collision with root package name */
    public final long f5992h;

    /* renamed from: i, reason: collision with root package name */
    public final U0.a f5993i;
    public final U0.q j;
    public final Q0.b k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5994l;

    /* renamed from: m, reason: collision with root package name */
    public final U0.l f5995m;

    /* renamed from: n, reason: collision with root package name */
    public final j0.C f5996n;

    /* renamed from: o, reason: collision with root package name */
    public final AbstractC1444c f5997o;

    public x(long j, long j10, N0.k kVar, N0.i iVar, N0.j jVar, N0.q qVar, String str, long j11, U0.a aVar, U0.q qVar2, Q0.b bVar, long j12, U0.l lVar, j0.C c10) {
        this(j != 16 ? new U0.c(j) : U0.n.f9436a, j10, kVar, iVar, jVar, qVar, str, j11, aVar, qVar2, bVar, j12, lVar, c10, (AbstractC1444c) null);
    }

    public x(long j, long j10, N0.k kVar, N0.i iVar, N0.j jVar, N0.q qVar, String str, long j11, U0.a aVar, U0.q qVar2, Q0.b bVar, long j12, U0.l lVar, j0.C c10, int i7) {
        this((i7 & 1) != 0 ? j0.n.g : j, (i7 & 2) != 0 ? V0.n.f9987c : j10, (i7 & 4) != 0 ? null : kVar, (i7 & 8) != 0 ? null : iVar, (i7 & 16) != 0 ? null : jVar, (i7 & 32) != 0 ? null : qVar, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? V0.n.f9987c : j11, (i7 & 256) != 0 ? null : aVar, (i7 & 512) != 0 ? null : qVar2, (i7 & 1024) != 0 ? null : bVar, (i7 & 2048) != 0 ? j0.n.g : j12, (i7 & 4096) != 0 ? null : lVar, (i7 & 8192) != 0 ? null : c10);
    }

    public x(U0.p pVar, long j, N0.k kVar, N0.i iVar, N0.j jVar, N0.q qVar, String str, long j10, U0.a aVar, U0.q qVar2, Q0.b bVar, long j11, U0.l lVar, j0.C c10, AbstractC1444c abstractC1444c) {
        this.f5986a = pVar;
        this.f5987b = j;
        this.f5988c = kVar;
        this.f5989d = iVar;
        this.f5990e = jVar;
        this.f5991f = qVar;
        this.g = str;
        this.f5992h = j10;
        this.f5993i = aVar;
        this.j = qVar2;
        this.k = bVar;
        this.f5994l = j11;
        this.f5995m = lVar;
        this.f5996n = c10;
        this.f5997o = abstractC1444c;
    }

    public final boolean a(x xVar) {
        if (this == xVar) {
            return true;
        }
        return V0.n.a(this.f5987b, xVar.f5987b) && kotlin.jvm.internal.l.a(this.f5988c, xVar.f5988c) && kotlin.jvm.internal.l.a(this.f5989d, xVar.f5989d) && kotlin.jvm.internal.l.a(this.f5990e, xVar.f5990e) && kotlin.jvm.internal.l.a(this.f5991f, xVar.f5991f) && kotlin.jvm.internal.l.a(this.g, xVar.g) && V0.n.a(this.f5992h, xVar.f5992h) && kotlin.jvm.internal.l.a(this.f5993i, xVar.f5993i) && kotlin.jvm.internal.l.a(this.j, xVar.j) && kotlin.jvm.internal.l.a(this.k, xVar.k) && j0.n.c(this.f5994l, xVar.f5994l) && kotlin.jvm.internal.l.a(null, null);
    }

    public final boolean b(x xVar) {
        return kotlin.jvm.internal.l.a(this.f5986a, xVar.f5986a) && kotlin.jvm.internal.l.a(this.f5995m, xVar.f5995m) && kotlin.jvm.internal.l.a(this.f5996n, xVar.f5996n) && kotlin.jvm.internal.l.a(this.f5997o, xVar.f5997o);
    }

    public final x c(x xVar) {
        if (xVar == null) {
            return this;
        }
        U0.p pVar = xVar.f5986a;
        return z.a(this, pVar.b(), pVar.c(), pVar.a(), xVar.f5987b, xVar.f5988c, xVar.f5989d, xVar.f5990e, xVar.f5991f, xVar.g, xVar.f5992h, xVar.f5993i, xVar.j, xVar.k, xVar.f5994l, xVar.f5995m, xVar.f5996n, xVar.f5997o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return a(xVar) && b(xVar);
    }

    public final int hashCode() {
        U0.p pVar = this.f5986a;
        long b2 = pVar.b();
        int i7 = j0.n.f18553h;
        int hashCode = Long.hashCode(b2) * 31;
        AbstractC1362A c10 = pVar.c();
        int hashCode2 = (Float.hashCode(pVar.a()) + ((hashCode + (c10 != null ? c10.hashCode() : 0)) * 31)) * 31;
        V0.o[] oVarArr = V0.n.f9986b;
        int f4 = h3.o.f(hashCode2, 31, this.f5987b);
        N0.k kVar = this.f5988c;
        int i10 = (f4 + (kVar != null ? kVar.f7143a : 0)) * 31;
        N0.i iVar = this.f5989d;
        int hashCode3 = (i10 + (iVar != null ? Integer.hashCode(iVar.f7137a) : 0)) * 31;
        N0.j jVar = this.f5990e;
        int hashCode4 = (hashCode3 + (jVar != null ? Integer.hashCode(jVar.f7138a) : 0)) * 31;
        N0.q qVar = this.f5991f;
        int hashCode5 = (hashCode4 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        String str = this.g;
        int f10 = h3.o.f((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f5992h);
        U0.a aVar = this.f5993i;
        int hashCode6 = (f10 + (aVar != null ? Float.hashCode(aVar.f9414a) : 0)) * 31;
        U0.q qVar2 = this.j;
        int hashCode7 = (hashCode6 + (qVar2 != null ? qVar2.hashCode() : 0)) * 31;
        Q0.b bVar = this.k;
        int f11 = h3.o.f((hashCode7 + (bVar != null ? bVar.f8599a.hashCode() : 0)) * 31, 31, this.f5994l);
        U0.l lVar = this.f5995m;
        int i11 = (f11 + (lVar != null ? lVar.f9434a : 0)) * 31;
        j0.C c11 = this.f5996n;
        int hashCode8 = (i11 + (c11 != null ? c11.hashCode() : 0)) * 961;
        AbstractC1444c abstractC1444c = this.f5997o;
        return hashCode8 + (abstractC1444c != null ? abstractC1444c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        U0.p pVar = this.f5986a;
        sb2.append((Object) j0.n.i(pVar.b()));
        sb2.append(", brush=");
        sb2.append(pVar.c());
        sb2.append(", alpha=");
        sb2.append(pVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) V0.n.d(this.f5987b));
        sb2.append(", fontWeight=");
        sb2.append(this.f5988c);
        sb2.append(", fontStyle=");
        sb2.append(this.f5989d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f5990e);
        sb2.append(", fontFamily=");
        sb2.append(this.f5991f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) V0.n.d(this.f5992h));
        sb2.append(", baselineShift=");
        sb2.append(this.f5993i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.j);
        sb2.append(", localeList=");
        sb2.append(this.k);
        sb2.append(", background=");
        S.d(this.f5994l, ", textDecoration=", sb2);
        sb2.append(this.f5995m);
        sb2.append(", shadow=");
        sb2.append(this.f5996n);
        sb2.append(", platformStyle=null, drawStyle=");
        sb2.append(this.f5997o);
        sb2.append(')');
        return sb2.toString();
    }
}
