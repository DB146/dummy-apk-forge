package K0;

/* loaded from: classes.dex */
public final class p implements InterfaceC0372b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5925a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5926b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5927c;

    /* renamed from: d, reason: collision with root package name */
    public final U0.r f5928d;

    /* renamed from: e, reason: collision with root package name */
    public final r f5929e;

    /* renamed from: f, reason: collision with root package name */
    public final U0.i f5930f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5931h;

    /* renamed from: i, reason: collision with root package name */
    public final U0.t f5932i;

    public p(int i7, int i10, long j, U0.r rVar, r rVar2, U0.i iVar, int i11, int i12, U0.t tVar) {
        this.f5925a = i7;
        this.f5926b = i10;
        this.f5927c = j;
        this.f5928d = rVar;
        this.f5929e = rVar2;
        this.f5930f = iVar;
        this.g = i11;
        this.f5931h = i12;
        this.f5932i = tVar;
        if (V0.n.a(j, V0.n.f9987c) || V0.n.c(j) >= 0.0f) {
            return;
        }
        P0.a.b("lineHeight can't be negative (" + V0.n.c(j) + ')');
    }

    public final p a(p pVar) {
        if (pVar == null) {
            return this;
        }
        return q.a(this, pVar.f5925a, pVar.f5926b, pVar.f5927c, pVar.f5928d, pVar.f5929e, pVar.f5930f, pVar.g, pVar.f5931h, pVar.f5932i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return U0.k.a(this.f5925a, pVar.f5925a) && U0.m.a(this.f5926b, pVar.f5926b) && V0.n.a(this.f5927c, pVar.f5927c) && kotlin.jvm.internal.l.a(this.f5928d, pVar.f5928d) && kotlin.jvm.internal.l.a(this.f5929e, pVar.f5929e) && kotlin.jvm.internal.l.a(this.f5930f, pVar.f5930f) && this.g == pVar.g && U0.d.a(this.f5931h, pVar.f5931h) && kotlin.jvm.internal.l.a(this.f5932i, pVar.f5932i);
    }

    public final int hashCode() {
        int c10 = A3.c.c(this.f5926b, Integer.hashCode(this.f5925a) * 31, 31);
        V0.o[] oVarArr = V0.n.f9986b;
        int f4 = h3.o.f(c10, 31, this.f5927c);
        U0.r rVar = this.f5928d;
        int hashCode = (f4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
        r rVar2 = this.f5929e;
        int hashCode2 = (hashCode + (rVar2 != null ? rVar2.hashCode() : 0)) * 31;
        U0.i iVar = this.f5930f;
        int c11 = A3.c.c(this.f5931h, A3.c.c(this.g, (hashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        U0.t tVar = this.f5932i;
        return c11 + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) U0.k.b(this.f5925a)) + ", textDirection=" + ((Object) U0.m.b(this.f5926b)) + ", lineHeight=" + ((Object) V0.n.d(this.f5927c)) + ", textIndent=" + this.f5928d + ", platformStyle=" + this.f5929e + ", lineHeightStyle=" + this.f5930f + ", lineBreak=" + ((Object) U0.e.a(this.g)) + ", hyphens=" + ((Object) U0.d.b(this.f5931h)) + ", textMotion=" + this.f5932i + ')';
    }
}
