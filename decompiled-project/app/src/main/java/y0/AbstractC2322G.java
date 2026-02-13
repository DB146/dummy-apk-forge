package y0;

import A0.InterfaceC0014e0;

/* renamed from: y0.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2322G {

    /* renamed from: a, reason: collision with root package name */
    public boolean f26553a;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H) {
        abstractC2322G.getClass();
        if (abstractC2323H instanceof InterfaceC0014e0) {
            ((InterfaceC0014e0) abstractC2323H).h(abstractC2322G.f26553a);
        }
    }

    public static void f(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H, long j) {
        abstractC2322G.getClass();
        a(abstractC2322G, abstractC2323H);
        abstractC2323H.M(V0.i.c(j, abstractC2323H.f26558e), 0.0f, null);
    }

    public static void g(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H, int i7, int i10) {
        long j = (i7 << 32) | (i10 & 4294967295L);
        if (abstractC2322G.b() == V0.l.f9982a || abstractC2322G.c() == 0) {
            a(abstractC2322G, abstractC2323H);
            abstractC2323H.M(V0.i.c(j, abstractC2323H.f26558e), 0.0f, null);
        } else {
            int c10 = (abstractC2322G.c() - abstractC2323H.f26554a) - ((int) (j >> 32));
            a(abstractC2322G, abstractC2323H);
            abstractC2323H.M(V0.i.c((c10 << 32) | (((int) (j & 4294967295L)) & 4294967295L), abstractC2323H.f26558e), 0.0f, null);
        }
    }

    public static void h(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H) {
        int i7 = AbstractC2325J.f26563b;
        C2324I c2324i = C2324I.f26559b;
        long j = 0;
        long j10 = (j & 4294967295L) | (j << 32);
        if (abstractC2322G.b() == V0.l.f9982a || abstractC2322G.c() == 0) {
            a(abstractC2322G, abstractC2323H);
            abstractC2323H.M(V0.i.c(j10, abstractC2323H.f26558e), 0.0f, c2324i);
        } else {
            int c10 = (abstractC2322G.c() - abstractC2323H.f26554a) - ((int) (j10 >> 32));
            a(abstractC2322G, abstractC2323H);
            abstractC2323H.M(V0.i.c((c10 << 32) | (((int) (j10 & 4294967295L)) & 4294967295L), abstractC2323H.f26558e), 0.0f, c2324i);
        }
    }

    public static void i(AbstractC2322G abstractC2322G, AbstractC2323H abstractC2323H, Rb.c cVar) {
        abstractC2322G.getClass();
        long j = 0;
        a(abstractC2322G, abstractC2323H);
        abstractC2323H.M(V0.i.c((j & 4294967295L) | (j << 32), abstractC2323H.f26558e), 0.0f, cVar);
    }

    public abstract V0.l b();

    public abstract int c();

    public final void d(AbstractC2323H abstractC2323H, int i7, int i10, float f4) {
        a(this, abstractC2323H);
        abstractC2323H.M(V0.i.c((i10 & 4294967295L) | (i7 << 32), abstractC2323H.f26558e), f4, null);
    }
}
