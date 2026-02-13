package a0;

/* renamed from: a0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0692s {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f12416a = new Object();

    public static final void a(int i7, int i10) {
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException("index (" + i7 + ") is out of bound of [0, " + i10 + ')');
        }
    }

    public static final int b(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i7 = 0;
        while (i7 <= length) {
            int i10 = (i7 + length) >>> 1;
            long j10 = jArr[i10];
            if (j > j10) {
                i7 = i10 + 1;
            } else {
                if (j >= j10) {
                    return i10;
                }
                length = i10 - 1;
            }
        }
        return -(i7 + 1);
    }

    public static AbstractC0682i c() {
        return (AbstractC0682i) AbstractC0688o.f12404a.w();
    }

    public static AbstractC0682i d(AbstractC0682i abstractC0682i) {
        if (abstractC0682i instanceof C0699z) {
            C0699z c0699z = (C0699z) abstractC0682i;
            if (c0699z.f12446t == Y.f.b()) {
                c0699z.f12444r = null;
                return abstractC0682i;
            }
        }
        if (abstractC0682i instanceof C0673A) {
            C0673A c0673a = (C0673A) abstractC0682i;
            if (c0673a.f12364h == Y.f.b()) {
                c0673a.g = null;
                return abstractC0682i;
            }
        }
        AbstractC0682i h10 = AbstractC0688o.h(abstractC0682i, null, false);
        h10.j();
        return h10;
    }

    public static Object e(Rb.a aVar, Rb.c cVar) {
        AbstractC0682i c0699z;
        if (cVar == null) {
            return aVar.invoke();
        }
        AbstractC0682i abstractC0682i = (AbstractC0682i) AbstractC0688o.f12404a.w();
        if (abstractC0682i instanceof C0699z) {
            C0699z c0699z2 = (C0699z) abstractC0682i;
            if (c0699z2.f12446t == Y.f.b()) {
                Rb.c cVar2 = c0699z2.f12444r;
                Rb.c cVar3 = c0699z2.f12445s;
                try {
                    ((C0699z) abstractC0682i).f12444r = AbstractC0688o.l(cVar, cVar2, true);
                    ((C0699z) abstractC0682i).f12445s = AbstractC0688o.b(null, cVar3);
                    return aVar.invoke();
                } finally {
                    c0699z2.f12444r = cVar2;
                    c0699z2.f12445s = cVar3;
                }
            }
        }
        if (abstractC0682i == null || (abstractC0682i instanceof C0678e)) {
            c0699z = new C0699z(abstractC0682i instanceof C0678e ? (C0678e) abstractC0682i : null, cVar, null, true, false);
        } else {
            if (cVar == null) {
                return aVar.invoke();
            }
            c0699z = abstractC0682i.u(cVar);
        }
        try {
            AbstractC0682i j = c0699z.j();
            try {
                return aVar.invoke();
            } finally {
                AbstractC0682i.q(j);
            }
        } finally {
            c0699z.c();
        }
    }

    public static void f(AbstractC0682i abstractC0682i, AbstractC0682i abstractC0682i2, Rb.c cVar) {
        if (abstractC0682i != abstractC0682i2) {
            abstractC0682i2.getClass();
            AbstractC0682i.q(abstractC0682i);
            abstractC0682i2.c();
        } else if (abstractC0682i instanceof C0699z) {
            ((C0699z) abstractC0682i).f12444r = cVar;
        } else if (abstractC0682i instanceof C0673A) {
            ((C0673A) abstractC0682i).g = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0682i).toString());
        }
    }

    public static final void g() {
        throw new UnsupportedOperationException();
    }
}
