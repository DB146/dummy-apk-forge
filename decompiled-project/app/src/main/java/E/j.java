package E;

import F.C0263g;
import F.C0265i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final A f3414a;

    /* renamed from: b, reason: collision with root package name */
    public final h f3415b;

    /* renamed from: c, reason: collision with root package name */
    public final C0248c f3416c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.s f3417d;

    public j(A a9, h hVar, C0248c c0248c, A4.s sVar) {
        this.f3414a = a9;
        this.f3415b = hVar;
        this.f3416c = c0248c;
        this.f3417d = sVar;
    }

    public final Object a(int i7) {
        h hVar = this.f3415b;
        hVar.getClass();
        C0265i k = hVar.f3411a.k(i7);
        return ((Rb.c) k.f3977c.f28c).invoke(Integer.valueOf(i7 - k.f3975a));
    }

    public final int b() {
        h hVar = this.f3415b;
        hVar.getClass();
        return hVar.f3411a.f470a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i7) {
        Object obj;
        Object invoke;
        A4.s sVar = this.f3417d;
        int i10 = i7 - sVar.f470a;
        if (i10 >= 0) {
            Object[] objArr = (Object[]) sVar.f472c;
            kotlin.jvm.internal.l.e(objArr, "<this>");
            if (i10 <= objArr.length - 1) {
                obj = objArr[i10];
                if (obj == null) {
                    return obj;
                }
                h hVar = this.f3415b;
                hVar.getClass();
                C0265i k = hVar.f3411a.k(i7);
                int i11 = i7 - k.f3975a;
                Rb.c cVar = (Rb.c) k.f3977c.f27b;
                return (cVar == null || (invoke = cVar.invoke(Integer.valueOf(i11))) == null) ? new C0263g(i7) : invoke;
            }
        }
        obj = null;
        if (obj == null) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.f3415b, ((j) obj).f3415b);
    }

    public final int hashCode() {
        return this.f3415b.hashCode();
    }
}
