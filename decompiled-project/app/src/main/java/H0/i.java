package H0;

import B0.X;
import java.util.Iterator;
import u.C2046I;
import u.C2056i;
import u.C2067u;
import u.Q;

/* loaded from: classes.dex */
public final class i implements Iterable, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final C2046I f4494a;

    /* renamed from: b, reason: collision with root package name */
    public C2067u f4495b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4496c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4497d;

    public i() {
        long[] jArr = Q.f24633a;
        this.f4494a = new C2046I();
    }

    public final boolean b(t tVar) {
        return this.f4494a.c(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.l.a(this.f4494a, iVar.f4494a) && this.f4496c == iVar.f4496c && this.f4497d == iVar.f4497d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4497d) + h3.o.g(this.f4496c, this.f4494a.hashCode() * 31, 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2067u c2067u = this.f4495b;
        if (c2067u == null) {
            C2046I c2046i = this.f4494a;
            c2046i.getClass();
            C2067u c2067u2 = new C2067u(c2046i);
            this.f4495b = c2067u2;
            c2067u = c2067u2;
        }
        return ((C2056i) c2067u.entrySet()).iterator();
    }

    public final i o() {
        i iVar = new i();
        iVar.f4496c = this.f4496c;
        iVar.f4497d = this.f4497d;
        C2046I c2046i = iVar.f4494a;
        c2046i.getClass();
        C2046I from = this.f4494a;
        kotlin.jvm.internal.l.e(from, "from");
        Object[] objArr = from.f24604b;
        Object[] objArr2 = from.f24605c;
        long[] jArr = from.f24603a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i7 << 3) + i11;
                            c2046i.l(objArr[i12], objArr2[i12]);
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return iVar;
    }

    public final Object t(t tVar) {
        Object g = this.f4494a.g(tVar);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("Key not present: " + tVar + " - consider getOrElse or getOrNull");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f4496c) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f4497d) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        C2046I c2046i = this.f4494a;
        Object[] objArr = c2046i.f24604b;
        Object[] objArr2 = c2046i.f24605c;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            int i12 = (i7 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            sb2.append(str);
                            sb2.append(((t) obj).f4564a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                }
                i7++;
            }
        }
        return X.p(this) + "{ " + ((Object) sb2) + " }";
    }

    public final void y(i iVar) {
        C2046I c2046i = iVar.f4494a;
        Object[] objArr = c2046i.f24604b;
        Object[] objArr2 = c2046i.f24605c;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i7 = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        t tVar = (t) obj;
                        C2046I c2046i2 = this.f4494a;
                        Object g = c2046i2.g(tVar);
                        kotlin.jvm.internal.l.c(tVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object invoke = tVar.f4565b.invoke(g, obj2);
                        if (invoke != null) {
                            c2046i2.l(tVar, invoke);
                        }
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i7 == length) {
                return;
            } else {
                i7++;
            }
        }
    }

    public final void z(t tVar, Object obj) {
        boolean z8 = obj instanceof a;
        C2046I c2046i = this.f4494a;
        if (!z8 || !c2046i.c(tVar)) {
            c2046i.l(tVar, obj);
            return;
        }
        Object g = c2046i.g(tVar);
        kotlin.jvm.internal.l.c(g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) g;
        a aVar2 = (a) obj;
        String str = aVar2.f4460a;
        if (str == null) {
            str = aVar.f4460a;
        }
        Db.c cVar = aVar2.f4461b;
        if (cVar == null) {
            cVar = aVar.f4461b;
        }
        c2046i.l(tVar, new a(str, cVar));
    }
}
