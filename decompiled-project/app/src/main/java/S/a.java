package S;

import Eb.n;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;
import u.C2042E;
import u.C2046I;
import u.O;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2046I f8952a;

    public /* synthetic */ a(C2046I c2046i) {
        this.f8952a = c2046i;
    }

    public static final Object a(C2046I c2046i) {
        Object g = c2046i.g(null);
        if (g == null) {
            return null;
        }
        if (!(g instanceof C2042E)) {
            c2046i.j(null);
            return g;
        }
        C2042E c2042e = (C2042E) g;
        if (c2042e.g()) {
            throw new NoSuchElementException("List is empty.");
        }
        int i7 = c2042e.f24585b - 1;
        Object e2 = c2042e.e(i7);
        c2042e.i(i7);
        l.c(e2, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
        if (c2042e.g()) {
            c2046i.j(null);
        }
        if (c2042e.f24585b == 1) {
            c2046i.l(null, c2042e.d());
        }
        return e2;
    }

    public static final C2042E b(C2046I c2046i) {
        if (c2046i.i()) {
            C2042E c2042e = O.f24631b;
            l.c(c2042e, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
            return c2042e;
        }
        C2042E c2042e2 = new C2042E();
        Object[] objArr = c2046i.f24605c;
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
                            Object obj = objArr[(i7 << 3) + i11];
                            if (obj instanceof C2042E) {
                                l.c(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.collection.MultiValueMap>");
                                C2042E elements = (C2042E) obj;
                                l.e(elements, "elements");
                                if (!elements.g()) {
                                    int i12 = c2042e2.f24585b + elements.f24585b;
                                    Object[] objArr2 = c2042e2.f24584a;
                                    if (objArr2.length < i12) {
                                        c2042e2.k(i12, objArr2);
                                    }
                                    n.P(elements.f24584a, c2042e2.f24585b, c2042e2.f24584a, 0, elements.f24585b);
                                    c2042e2.f24585b += elements.f24585b;
                                }
                            } else {
                                l.c(obj, "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
                                c2042e2.a(obj);
                            }
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
        return c2042e2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return l.a(this.f8952a, ((a) obj).f8952a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8952a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f8952a + ')';
    }
}
