package t0;

import A0.AbstractC0017g;
import A0.J;
import V0.p;
import cc.E;
import kotlin.jvm.internal.m;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public g f24416a;

    /* renamed from: b, reason: collision with root package name */
    public g f24417b;

    /* renamed from: c, reason: collision with root package name */
    public m f24418c = new J(this, 20);

    /* renamed from: d, reason: collision with root package name */
    public E f24419d;

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j10, Jb.c cVar) {
        C2016b c2016b;
        int i7;
        long j11;
        if (cVar instanceof C2016b) {
            c2016b = (C2016b) cVar;
            int i10 = c2016b.f24412c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c2016b.f24412c = i10 - Integer.MIN_VALUE;
                C2016b c2016b2 = c2016b;
                Object obj = c2016b2.f24410a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = c2016b2.f24412c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    g gVar = this.f24416a;
                    g gVar2 = null;
                    j11 = 0;
                    if (((gVar == null || !gVar.f14112B) ? null : (g) AbstractC0017g.i(gVar)) == null) {
                        g gVar3 = this.f24417b;
                        if (gVar3 != null) {
                            c2016b2.f24412c = 1;
                            obj = gVar3.b0(j, j10, c2016b2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            j11 = ((p) obj).f9990a;
                        }
                    } else {
                        g gVar4 = this.f24416a;
                        if (gVar4 != null && gVar4.f14112B) {
                            gVar2 = (g) AbstractC0017g.i(gVar4);
                        }
                        if (gVar2 != null) {
                            c2016b2.f24412c = 2;
                            obj = gVar2.b0(j, j10, c2016b2);
                            if (obj == aVar) {
                                return aVar;
                            }
                            j11 = ((p) obj).f9990a;
                        }
                    }
                } else if (i7 == 1) {
                    com.bumptech.glide.c.c0(obj);
                    j11 = ((p) obj).f9990a;
                } else {
                    if (i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                    j11 = ((p) obj).f9990a;
                }
                return new p(j11);
            }
        }
        c2016b = new C2016b(this, cVar);
        C2016b c2016b22 = c2016b;
        Object obj2 = c2016b22.f24410a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c2016b22.f24412c;
        if (i7 != 0) {
        }
        return new p(j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, Jb.c cVar) {
        c cVar2;
        int i7;
        long j10;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f24415c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f24415c = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f24413a;
                Ib.a aVar = Ib.a.f5345a;
                i7 = cVar2.f24415c;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    g gVar = this.f24416a;
                    g gVar2 = null;
                    if (gVar != null && gVar.f14112B) {
                        gVar2 = (g) AbstractC0017g.i(gVar);
                    }
                    if (gVar2 == null) {
                        j10 = 0;
                        return new p(j10);
                    }
                    cVar2.f24415c = 1;
                    obj = gVar2.b(j, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.c.c0(obj);
                }
                j10 = ((p) obj).f9990a;
                return new p(j10);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f24413a;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = cVar2.f24415c;
        if (i7 != 0) {
        }
        j10 = ((p) obj2).f9990a;
        return new p(j10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Rb.a, kotlin.jvm.internal.m] */
    public final E c() {
        E e2 = (E) this.f24418c.invoke();
        if (e2 != null) {
            return e2;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
