package x;

import ea.C1111f;
import i1.C1290a;
import w.AbstractC2175b;

/* renamed from: x.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2246p implements InterfaceC2233c {

    /* renamed from: a, reason: collision with root package name */
    public final q3.n f26134a;

    /* renamed from: b, reason: collision with root package name */
    public final C1111f f26135b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f26136c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC2243m f26137d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC2243m f26138e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC2243m f26139f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final long f26140h;

    public C2246p(C2247q c2247q, C1111f c1111f, Object obj, AbstractC2243m abstractC2243m) {
        AbstractC2243m abstractC2243m2 = abstractC2243m;
        q3.n nVar = new q3.n(c2247q.f26149a);
        this.f26134a = nVar;
        this.f26135b = c1111f;
        this.f26136c = obj;
        AbstractC2243m abstractC2243m3 = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(obj);
        this.f26137d = abstractC2243m3;
        this.f26138e = AbstractC2232b.f(abstractC2243m);
        if (((AbstractC2243m) nVar.f23399e) == null) {
            nVar.f23399e = abstractC2243m3.c();
        }
        AbstractC2243m abstractC2243m4 = (AbstractC2243m) nVar.f23399e;
        String str = "targetVector";
        if (abstractC2243m4 == null) {
            kotlin.jvm.internal.l.j("targetVector");
            throw null;
        }
        int b2 = abstractC2243m4.b();
        int i7 = 0;
        while (i7 < b2) {
            AbstractC2243m abstractC2243m5 = (AbstractC2243m) nVar.f23399e;
            if (abstractC2243m5 == null) {
                kotlin.jvm.internal.l.j(str);
                throw null;
            }
            float a9 = abstractC2243m3.a(i7);
            float a10 = abstractC2243m2.a(i7);
            R1.d dVar = (R1.d) ((C1290a) nVar.f23396b).f18187b;
            double b10 = dVar.b(a10);
            double d10 = w.L.f25518a;
            float f4 = dVar.f8814a * dVar.f8815b;
            abstractC2243m5.e(i7, (Math.signum(a10) * ((float) (Math.exp((d10 / (d10 - 1.0d)) * b10) * f4))) + a9);
            i7++;
            abstractC2243m2 = abstractC2243m;
            abstractC2243m3 = abstractC2243m3;
            str = str;
        }
        String str2 = str;
        AbstractC2243m abstractC2243m6 = (AbstractC2243m) nVar.f23399e;
        if (abstractC2243m6 == null) {
            kotlin.jvm.internal.l.j(str2);
            throw null;
        }
        this.g = ((Rb.c) c1111f.f16838c).invoke(abstractC2243m6);
        q3.n nVar2 = this.f26134a;
        AbstractC2243m abstractC2243m7 = this.f26137d;
        if (((AbstractC2243m) nVar2.f23398d) == null) {
            nVar2.f23398d = abstractC2243m7.c();
        }
        AbstractC2243m abstractC2243m8 = (AbstractC2243m) nVar2.f23398d;
        if (abstractC2243m8 == null) {
            kotlin.jvm.internal.l.j("velocityVector");
            throw null;
        }
        int b11 = abstractC2243m8.b();
        long j = 0;
        for (int i10 = 0; i10 < b11; i10++) {
            abstractC2243m7.getClass();
            j = Math.max(j, ((long) (Math.exp(((R1.d) ((C1290a) nVar2.f23396b).f18187b).b(abstractC2243m.a(i10)) / (w.L.f25518a - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f26140h = j;
        AbstractC2243m f10 = AbstractC2232b.f(this.f26134a.k(j, this.f26137d, abstractC2243m));
        this.f26139f = f10;
        int b12 = f10.b();
        for (int i11 = 0; i11 < b12; i11++) {
            AbstractC2243m abstractC2243m9 = this.f26139f;
            float a11 = abstractC2243m9.a(i11);
            this.f26134a.getClass();
            this.f26134a.getClass();
            abstractC2243m9.e(i11, h3.H.j(a11, -0.0f, 0.0f));
        }
    }

    @Override // x.InterfaceC2233c
    public final boolean b() {
        return false;
    }

    @Override // x.InterfaceC2233c
    public final Object c(long j) {
        if (h(j)) {
            return this.g;
        }
        Rb.c cVar = (Rb.c) this.f26135b.f16838c;
        q3.n nVar = this.f26134a;
        AbstractC2243m abstractC2243m = (AbstractC2243m) nVar.f23397c;
        AbstractC2243m abstractC2243m2 = this.f26137d;
        if (abstractC2243m == null) {
            nVar.f23397c = abstractC2243m2.c();
        }
        AbstractC2243m abstractC2243m3 = (AbstractC2243m) nVar.f23397c;
        String str = "valueVector";
        if (abstractC2243m3 == null) {
            kotlin.jvm.internal.l.j("valueVector");
            throw null;
        }
        int b2 = abstractC2243m3.b();
        int i7 = 0;
        while (i7 < b2) {
            AbstractC2243m abstractC2243m4 = (AbstractC2243m) nVar.f23397c;
            if (abstractC2243m4 == null) {
                kotlin.jvm.internal.l.j(str);
                throw null;
            }
            float a9 = abstractC2243m2.a(i7);
            long j10 = j / 1000000;
            w.K a10 = ((R1.d) ((C1290a) nVar.f23396b).f18187b).a(this.f26138e.a(i7));
            String str2 = str;
            long j11 = a10.f25517c;
            abstractC2243m4.e(i7, (Math.signum(a10.f25515a) * a10.f25516b * AbstractC2175b.a(j11 > 0 ? ((float) j10) / ((float) j11) : 1.0f).f25545a) + a9);
            i7++;
            str = str2;
        }
        String str3 = str;
        AbstractC2243m abstractC2243m5 = (AbstractC2243m) nVar.f23397c;
        if (abstractC2243m5 != null) {
            return cVar.invoke(abstractC2243m5);
        }
        kotlin.jvm.internal.l.j(str3);
        throw null;
    }

    @Override // x.InterfaceC2233c
    public final long d() {
        return this.f26140h;
    }

    @Override // x.InterfaceC2233c
    public final C1111f e() {
        return this.f26135b;
    }

    @Override // x.InterfaceC2233c
    public final Object f() {
        return this.g;
    }

    @Override // x.InterfaceC2233c
    public final AbstractC2243m g(long j) {
        if (h(j)) {
            return this.f26139f;
        }
        return this.f26134a.k(j, this.f26137d, this.f26138e);
    }
}
