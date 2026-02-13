package Q;

import java.util.ArrayList;
import u.C2047J;

/* renamed from: Q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0508p {

    /* renamed from: a, reason: collision with root package name */
    public static final Y f8481a = new Y("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final Y f8482b = new Y("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final Y f8483c = new Y("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final Y f8484d = new Y("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final Y f8485e = new Y("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final A0.B f8486f = new A0.B(5);

    public static final void a(ArrayList arrayList, int i7, int i10) {
        int f4 = f(i7, arrayList);
        if (f4 < 0) {
            f4 = -(f4 + 1);
        }
        while (f4 < arrayList.size() && ((L) arrayList.get(f4)).f8325b < i10) {
            arrayList.remove(f4);
        }
    }

    public static final void b(y0 y0Var, ArrayList arrayList, int i7) {
        if (y0Var.i(i7)) {
            arrayList.add(y0Var.k(i7));
            return;
        }
        int[] iArr = y0Var.f8574b;
        int i10 = iArr[(i7 * 5) + 3] + i7;
        for (int i11 = i7 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            b(y0Var, arrayList, i11);
        }
    }

    public static final void c(String str) {
        throw new C0496j(y.S.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new C0496j(y.S.b("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(C0 c02, Y.k kVar) {
        int i7;
        int[] iArr = c02.f8278b;
        int i10 = c02.f8293t;
        int f4 = c02.f(iArr, c02.q(c02.s(i10) + i10));
        for (int f10 = c02.f(c02.f8278b, c02.q(c02.f8293t)); f10 < f4; f10++) {
            Object obj = c02.f8279c[c02.g(f10)];
            int i11 = -1;
            if (obj instanceof InterfaceC0494i) {
                kVar.i((InterfaceC0494i) obj, c02.o() - f10, -1, -1);
            } else if (obj instanceof w0) {
                w0 w0Var = (w0) obj;
                if (!(w0Var.f8565a instanceof C0500l)) {
                    h(c02, f10, obj);
                    int o10 = c02.o() - f10;
                    C0478a c0478a = w0Var.f8566b;
                    if (c0478a == null || !c0478a.a()) {
                        i7 = -1;
                    } else {
                        i11 = c02.c(c0478a);
                        i7 = c02.o() - c02.M(i11);
                    }
                    kVar.i(w0Var, o10, i11, i7);
                }
            } else if (obj instanceof C0505n0) {
                h(c02, f10, obj);
                ((C0505n0) obj).d();
            }
        }
    }

    public static final int f(int i7, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int f4 = kotlin.jvm.internal.l.f(((L) arrayList.get(i11)).f8325b, i7);
            if (f4 < 0) {
                i10 = i11 + 1;
            } else {
                if (f4 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final void g(C0 c02, Y.k kVar) {
        int i7;
        int[] iArr = c02.f8278b;
        int i10 = c02.f8293t;
        int f4 = c02.f(iArr, c02.q(c02.s(i10) + i10));
        for (int f10 = c02.f(c02.f8278b, c02.q(c02.f8293t)); f10 < f4; f10++) {
            Object obj = c02.f8279c[c02.g(f10)];
            int i11 = -1;
            if (obj instanceof InterfaceC0494i) {
                int o10 = c02.o() - f10;
                Object obj2 = (InterfaceC0494i) obj;
                C2047J c2047j = (C2047J) kVar.f11059f;
                if (c2047j == null) {
                    int i12 = u.S.f24634a;
                    c2047j = new C2047J();
                    kVar.f11059f = c2047j;
                }
                c2047j.j(obj2);
                kVar.i(obj2, o10, -1, -1);
            }
            if (obj instanceof w0) {
                int o11 = c02.o() - f10;
                w0 w0Var = (w0) obj;
                C0478a c0478a = w0Var.f8566b;
                if (c0478a == null || !c0478a.a()) {
                    i7 = -1;
                } else {
                    i11 = c02.c(c0478a);
                    i7 = c02.o() - c02.M(i11);
                }
                kVar.i(w0Var, o11, i11, i7);
            }
            if (obj instanceof C0505n0) {
                ((C0505n0) obj).d();
            }
        }
        c02.F();
    }

    public static final void h(C0 c02, int i7, Object obj) {
        int g = c02.g(i7);
        Object[] objArr = c02.f8279c;
        Object obj2 = objArr[g];
        objArr[g] = C0498k.f8409a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
