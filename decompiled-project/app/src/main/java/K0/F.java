package K0;

import l0.AbstractC1444c;
import y.S;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final F f5854d = new F(0, 0, null, 0, 0, 16777215);

    /* renamed from: a, reason: collision with root package name */
    public final x f5855a;

    /* renamed from: b, reason: collision with root package name */
    public final p f5856b;

    /* renamed from: c, reason: collision with root package name */
    public final s f5857c;

    public F(long j, long j10, N0.k kVar, long j11, long j12, int i7) {
        this(new x((i7 & 1) != 0 ? j0.n.g : j, (i7 & 2) != 0 ? V0.n.f9987c : j10, (i7 & 4) != 0 ? null : kVar, null, null, (i7 & 32) != 0 ? null : N0.q.f7146a, null, (i7 & 128) != 0 ? V0.n.f9987c : j11, null, null, null, j0.n.g, null, null), new p(Integer.MIN_VALUE, Integer.MIN_VALUE, (i7 & 131072) != 0 ? V0.n.f9987c : j12, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public F(x xVar, p pVar) {
        this(xVar, pVar, r0 == null ? null : new s(r0));
        xVar.getClass();
        r rVar = pVar.f5929e;
    }

    public F(x xVar, p pVar, s sVar) {
        this.f5855a = xVar;
        this.f5856b = pVar;
        this.f5857c = sVar;
    }

    public static F a(F f4, long j, N0.k kVar, N0.q qVar, long j10, long j11, U0.i iVar, int i7) {
        long j12;
        long j13;
        U0.p cVar;
        s sVar = O.a.f7407a;
        long b2 = f4.f5855a.f5986a.b();
        long j14 = (i7 & 2) != 0 ? f4.f5855a.f5987b : j;
        N0.k kVar2 = (i7 & 4) != 0 ? f4.f5855a.f5988c : kVar;
        x xVar = f4.f5855a;
        N0.i iVar2 = xVar.f5989d;
        N0.j jVar = xVar.f5990e;
        N0.q qVar2 = (i7 & 32) != 0 ? xVar.f5991f : qVar;
        String str = xVar.g;
        long j15 = (i7 & 128) != 0 ? xVar.f5992h : j10;
        U0.a aVar = xVar.f5993i;
        U0.q qVar3 = xVar.j;
        Q0.b bVar = xVar.k;
        N0.q qVar4 = qVar2;
        long j16 = xVar.f5994l;
        U0.l lVar = xVar.f5995m;
        j0.C c10 = xVar.f5996n;
        AbstractC1444c abstractC1444c = xVar.f5997o;
        p pVar = f4.f5856b;
        int i10 = pVar.f5925a;
        int i11 = pVar.f5926b;
        if ((i7 & 131072) != 0) {
            j12 = j16;
            j13 = pVar.f5927c;
        } else {
            j12 = j16;
            j13 = j11;
        }
        U0.r rVar = pVar.f5928d;
        s sVar2 = (524288 & i7) != 0 ? f4.f5857c : sVar;
        U0.i iVar3 = (i7 & 1048576) != 0 ? pVar.f5930f : iVar;
        int i12 = pVar.g;
        int i13 = pVar.f5931h;
        U0.t tVar = pVar.f5932i;
        if (j0.n.c(b2, xVar.f5986a.b())) {
            cVar = xVar.f5986a;
        } else {
            cVar = b2 != 16 ? new U0.c(b2) : U0.n.f9436a;
        }
        return new F(new x(cVar, j14, kVar2, iVar2, jVar, qVar4, str, j15, aVar, qVar3, bVar, j12, lVar, c10, abstractC1444c), new p(i10, i11, j13, rVar, sVar2 != null ? sVar2.f5936a : null, iVar3, i12, i13, tVar), sVar2);
    }

    public static F c(F f4, long j, long j10, long j11, int i7, long j12, int i10) {
        long j13 = (i10 & 2) != 0 ? V0.n.f9987c : j10;
        long j14 = (i10 & 128) != 0 ? V0.n.f9987c : j11;
        long j15 = j0.n.g;
        int i11 = (32768 & i10) != 0 ? Integer.MIN_VALUE : i7;
        long j16 = (i10 & 131072) != 0 ? V0.n.f9987c : j12;
        x a9 = z.a(f4.f5855a, j, null, Float.NaN, j13, null, null, null, null, null, j14, null, null, null, j15, null, null, null);
        p a10 = q.a(f4.f5856b, i11, Integer.MIN_VALUE, j16, null, null, null, 0, Integer.MIN_VALUE, null);
        return (f4.f5855a == a9 && f4.f5856b == a10) ? f4 : new F(a9, a10);
    }

    public final long b() {
        return this.f5855a.f5986a.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f4 = (F) obj;
        return kotlin.jvm.internal.l.a(this.f5855a, f4.f5855a) && kotlin.jvm.internal.l.a(this.f5856b, f4.f5856b) && kotlin.jvm.internal.l.a(this.f5857c, f4.f5857c);
    }

    public final int hashCode() {
        int hashCode = (this.f5856b.hashCode() + (this.f5855a.hashCode() * 31)) * 31;
        s sVar = this.f5857c;
        return hashCode + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) j0.n.i(b()));
        sb2.append(", brush=");
        x xVar = this.f5855a;
        sb2.append(xVar.f5986a.c());
        sb2.append(", alpha=");
        sb2.append(xVar.f5986a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) V0.n.d(xVar.f5987b));
        sb2.append(", fontWeight=");
        sb2.append(xVar.f5988c);
        sb2.append(", fontStyle=");
        sb2.append(xVar.f5989d);
        sb2.append(", fontSynthesis=");
        sb2.append(xVar.f5990e);
        sb2.append(", fontFamily=");
        sb2.append(xVar.f5991f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(xVar.g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) V0.n.d(xVar.f5992h));
        sb2.append(", baselineShift=");
        sb2.append(xVar.f5993i);
        sb2.append(", textGeometricTransform=");
        sb2.append(xVar.j);
        sb2.append(", localeList=");
        sb2.append(xVar.k);
        sb2.append(", background=");
        S.d(xVar.f5994l, ", textDecoration=", sb2);
        sb2.append(xVar.f5995m);
        sb2.append(", shadow=");
        sb2.append(xVar.f5996n);
        sb2.append(", drawStyle=");
        sb2.append(xVar.f5997o);
        sb2.append(", textAlign=");
        p pVar = this.f5856b;
        sb2.append((Object) U0.k.b(pVar.f5925a));
        sb2.append(", textDirection=");
        sb2.append((Object) U0.m.b(pVar.f5926b));
        sb2.append(", lineHeight=");
        sb2.append((Object) V0.n.d(pVar.f5927c));
        sb2.append(", textIndent=");
        sb2.append(pVar.f5928d);
        sb2.append(", platformStyle=");
        sb2.append(this.f5857c);
        sb2.append(", lineHeightStyle=");
        sb2.append(pVar.f5930f);
        sb2.append(", lineBreak=");
        sb2.append((Object) U0.e.a(pVar.g));
        sb2.append(", hyphens=");
        sb2.append((Object) U0.d.b(pVar.f5931h));
        sb2.append(", textMotion=");
        sb2.append(pVar.f5932i);
        sb2.append(')');
        return sb2.toString();
    }
}
