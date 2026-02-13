package p0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends r implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f23025a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f23026b;

    public p(List list, ArrayList arrayList) {
        this.f23025a = list;
        this.f23026b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return kotlin.jvm.internal.l.a(this.f23025a, pVar.f23025a) && this.f23026b.equals(pVar.f23026b);
    }

    public final int hashCode() {
        return this.f23026b.hashCode() + ((this.f23025a.hashCode() + h3.o.e(0.0f, h3.o.e(0.0f, h3.o.e(1.0f, h3.o.e(1.0f, h3.o.e(0.0f, h3.o.e(0.0f, Float.hashCode(0.0f) * 31, 31), 31), 31), 31), 31), 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new V.g(this);
    }
}
