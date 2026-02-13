package o0;

import E5.o;
import V0.l;
import ia.C1358d;
import j0.i;
import l0.InterfaceC1445d;

/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1775c {

    /* renamed from: a, reason: collision with root package name */
    public o f21658a;

    /* renamed from: b, reason: collision with root package name */
    public i f21659b;

    /* renamed from: c, reason: collision with root package name */
    public float f21660c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public l f21661d = l.f9982a;

    public abstract void a(float f4);

    public abstract void b(i iVar);

    public void c(l lVar) {
    }

    public final void d(InterfaceC1445d interfaceC1445d, long j, float f4, i iVar) {
        if (this.f21660c != f4) {
            a(f4);
            this.f21660c = f4;
        }
        if (!kotlin.jvm.internal.l.a(this.f21659b, iVar)) {
            b(iVar);
            this.f21659b = iVar;
        }
        l layoutDirection = interfaceC1445d.getLayoutDirection();
        if (this.f21661d != layoutDirection) {
            c(layoutDirection);
            this.f21661d = layoutDirection;
        }
        int i7 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1445d.v() >> 32)) - Float.intBitsToFloat(i7);
        int i10 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1445d.v() & 4294967295L)) - Float.intBitsToFloat(i10);
        ((C1358d) interfaceC1445d.u().f8695b).o(0.0f, 0.0f, intBitsToFloat, intBitsToFloat2);
        if (f4 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i7) > 0.0f && Float.intBitsToFloat(i10) > 0.0f) {
                    f(interfaceC1445d);
                }
            } finally {
                ((C1358d) interfaceC1445d.u().f8695b).o(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
            }
        }
    }

    public abstract long e();

    public abstract void f(InterfaceC1445d interfaceC1445d);
}
