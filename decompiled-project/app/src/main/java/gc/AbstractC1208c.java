package gc;

import hc.AbstractC1273a;

/* renamed from: gc.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1208c {

    /* renamed from: a, reason: collision with root package name */
    public static final Hb.d[] f17505a = new Hb.d[0];

    /* renamed from: b, reason: collision with root package name */
    public static final R7.a f17506b;

    /* renamed from: c, reason: collision with root package name */
    public static final R7.a f17507c;

    static {
        int i7 = 28;
        f17506b = new R7.a("NULL", i7);
        f17507c = new R7.a("UNINITIALIZED", i7);
    }

    public static final Object a(Hb.i iVar, Object obj, Object obj2, Rb.e eVar, Hb.d frame) {
        Object m10 = AbstractC1273a.m(iVar, obj2);
        try {
            E e2 = new E(frame, iVar);
            kotlin.jvm.internal.y.b(2, eVar);
            Object invoke = eVar.invoke(obj, e2);
            AbstractC1273a.g(iVar, m10);
            if (invoke == Ib.a.f5345a) {
                kotlin.jvm.internal.l.e(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            AbstractC1273a.g(iVar, m10);
            throw th;
        }
    }
}
