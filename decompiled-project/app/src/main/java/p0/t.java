package p0;

import j0.AbstractC1362A;
import j0.F;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23032a;

    /* renamed from: b, reason: collision with root package name */
    public final F f23033b;

    public t(ArrayList arrayList, F f4) {
        this.f23032a = arrayList;
        this.f23033b = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f23033b.equals(tVar.f23033b) && kotlin.jvm.internal.l.a(null, null) && AbstractC1362A.m(0, 0) && AbstractC1362A.n(2, 2) && kotlin.jvm.internal.l.a(this.f23032a, tVar.f23032a);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + h3.o.e(0.0f, h3.o.e(1.0f, h3.o.e(0.0f, h3.o.e(1.0f, A3.c.c(2, A3.c.c(0, h3.o.e(1.0f, h3.o.e(1.0f, h3.o.e(1.0f, (this.f23033b.hashCode() + (this.f23032a.hashCode() * 31)) * 31, 961), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
