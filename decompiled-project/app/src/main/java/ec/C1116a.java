package ec;

import cc.C0944m;
import cc.F;
import cc.N0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: ec.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1116a implements N0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f16852a = f.f16884p;

    /* renamed from: b, reason: collision with root package name */
    public C0944m f16853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f16854c;

    public C1116a(d dVar) {
        this.f16854c = dVar;
    }

    @Override // cc.N0
    public final void a(hc.u uVar, int i7) {
        C0944m c0944m = this.f16853b;
        if (c0944m != null) {
            c0944m.a(uVar, i7);
        }
    }

    public final Object b(Jb.c cVar) {
        Boolean bool;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f16866u;
        d dVar = this.f16854c;
        l lVar = (l) atomicReferenceFieldUpdater.get(dVar);
        while (!dVar.v()) {
            long andIncrement = d.f16862c.getAndIncrement(dVar);
            long j = f.f16873b;
            long j10 = andIncrement / j;
            int i7 = (int) (andIncrement % j);
            if (lVar.f17971c != j10) {
                l o10 = dVar.o(j10, lVar);
                if (o10 == null) {
                    continue;
                } else {
                    lVar = o10;
                }
            }
            Object G9 = dVar.G(lVar, i7, andIncrement, null);
            R7.a aVar = f.f16881m;
            if (G9 == aVar) {
                throw new IllegalStateException("unreachable");
            }
            R7.a aVar2 = f.f16883o;
            if (G9 != aVar2) {
                if (G9 != f.f16882n) {
                    lVar.a();
                    this.f16852a = G9;
                    return Boolean.TRUE;
                }
                d dVar2 = this.f16854c;
                C0944m s3 = F.s(com.bumptech.glide.c.F(cVar));
                try {
                    this.f16853b = s3;
                    Object G10 = dVar2.G(lVar, i7, andIncrement, this);
                    if (G10 == aVar) {
                        a(lVar, i7);
                    } else {
                        if (G10 == aVar2) {
                            if (andIncrement < dVar2.s()) {
                                lVar.a();
                            }
                            l lVar2 = (l) d.f16866u.get(dVar2);
                            while (true) {
                                if (dVar2.v()) {
                                    C0944m c0944m = this.f16853b;
                                    kotlin.jvm.internal.l.b(c0944m);
                                    this.f16853b = null;
                                    this.f16852a = f.f16880l;
                                    Throwable p10 = dVar.p();
                                    if (p10 == null) {
                                        c0944m.resumeWith(Boolean.FALSE);
                                    } else {
                                        c0944m.resumeWith(com.bumptech.glide.c.n(p10));
                                    }
                                } else {
                                    long andIncrement2 = d.f16862c.getAndIncrement(dVar2);
                                    long j11 = f.f16873b;
                                    long j12 = andIncrement2 / j11;
                                    int i10 = (int) (andIncrement2 % j11);
                                    if (lVar2.f17971c != j12) {
                                        l o11 = dVar2.o(j12, lVar2);
                                        if (o11 != null) {
                                            lVar2 = o11;
                                        }
                                    }
                                    Object G11 = dVar2.G(lVar2, i10, andIncrement2, this);
                                    if (G11 == f.f16881m) {
                                        a(lVar2, i10);
                                        break;
                                    }
                                    if (G11 == f.f16883o) {
                                        if (andIncrement2 < dVar2.s()) {
                                            lVar2.a();
                                        }
                                    } else {
                                        if (G11 == f.f16882n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        lVar2.a();
                                        this.f16852a = G11;
                                        this.f16853b = null;
                                        bool = Boolean.TRUE;
                                    }
                                }
                            }
                        } else {
                            lVar.a();
                            this.f16852a = G10;
                            this.f16853b = null;
                            bool = Boolean.TRUE;
                        }
                        s3.b(bool, null);
                    }
                    Object r10 = s3.r();
                    Ib.a aVar3 = Ib.a.f5345a;
                    return r10;
                } catch (Throwable th) {
                    s3.z();
                    throw th;
                }
            }
            if (andIncrement < dVar.s()) {
                lVar.a();
            }
        }
        this.f16852a = f.f16880l;
        Throwable p11 = dVar.p();
        if (p11 == null) {
            return Boolean.FALSE;
        }
        int i11 = hc.v.f17972a;
        throw p11;
    }

    public final Object c() {
        Object obj = this.f16852a;
        R7.a aVar = f.f16884p;
        if (obj == aVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f16852a = aVar;
        if (obj != f.f16880l) {
            return obj;
        }
        Throwable q10 = this.f16854c.q();
        int i7 = hc.v.f17972a;
        throw q10;
    }
}
