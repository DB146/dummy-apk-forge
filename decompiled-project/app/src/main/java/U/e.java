package U;

import Eb.n;
import Q.AbstractC0495i0;
import h3.H;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e extends c {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f9391a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f9392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9394d;

    public e(Object[] objArr, Object[] objArr2, int i7, int i10) {
        this.f9391a = objArr;
        this.f9392b = objArr2;
        this.f9393c = i7;
        this.f9394d = i10;
        if (!(b() > 32)) {
            AbstractC0495i0.a("Trie-based persistent vector should have at least 33 elements, got " + b());
        }
        int length = objArr2.length;
    }

    public static Object[] F(Object[] objArr, int i7, int i10, Object obj, D0.a aVar) {
        Object[] copyOf;
        int y10 = H.y(i10, i7);
        if (i7 == 0) {
            if (y10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l.d(copyOf, "copyOf(...)");
            }
            n.P(objArr, y10 + 1, copyOf, y10, 31);
            aVar.f3146a = objArr[31];
            copyOf[y10] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l.d(copyOf2, "copyOf(...)");
        int i11 = i7 - 5;
        Object obj2 = objArr[y10];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[y10] = F((Object[]) obj2, i11, i10, obj, aVar);
        while (true) {
            y10++;
            if (y10 >= 32 || copyOf2[y10] == null) {
                break;
            }
            Object obj3 = objArr[y10];
            l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[y10] = F((Object[]) obj3, i11, 0, aVar.f3146a, aVar);
        }
        return copyOf2;
    }

    public static Object[] H(Object[] objArr, int i7, int i10, D0.a aVar) {
        Object[] H10;
        int y10 = H.y(i10, i7);
        if (i7 == 5) {
            aVar.f3146a = objArr[y10];
            H10 = null;
        } else {
            Object obj = objArr[y10];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            H10 = H((Object[]) obj, i7 - 5, i10, aVar);
        }
        if (H10 == null && y10 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l.d(copyOf, "copyOf(...)");
        copyOf[y10] = H10;
        return copyOf;
    }

    public static Object[] N(Object[] objArr, int i7, int i10, Object obj) {
        int y10 = H.y(i10, i7);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        l.d(copyOf, "copyOf(...)");
        if (i7 == 0) {
            copyOf[y10] = obj;
        } else {
            Object obj2 = copyOf[y10];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[y10] = N((Object[]) obj2, i7 - 5, i10, obj);
        }
        return copyOf;
    }

    @Override // U.c
    public final c C(b bVar) {
        f fVar = new f(this, this.f9391a, this.f9392b, this.f9394d);
        fVar.V(bVar);
        return fVar.t();
    }

    @Override // U.c
    public final c D(int i7) {
        Tb.a.d(i7, this.f9393c);
        int M3 = M();
        Object[] objArr = this.f9391a;
        int i10 = this.f9394d;
        return i7 >= M3 ? L(objArr, M3, i10, i7 - M3) : L(K(objArr, i10, i7, new D0.a(this.f9392b[0])), M3, i10, 0);
    }

    @Override // U.c
    public final c E(int i7, Object obj) {
        int i10 = this.f9393c;
        Tb.a.d(i7, i10);
        int M3 = M();
        Object[] objArr = this.f9391a;
        Object[] objArr2 = this.f9392b;
        int i11 = this.f9394d;
        if (M3 > i7) {
            return new e(N(objArr, i11, i7, obj), objArr2, i10, i11);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.d(copyOf, "copyOf(...)");
        copyOf[i7 & 31] = obj;
        return new e(objArr, copyOf, i10, i11);
    }

    public final e G(Object obj, Object[] objArr, int i7) {
        int M3 = M();
        int i10 = this.f9393c;
        int i11 = i10 - M3;
        Object[] objArr2 = this.f9392b;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.d(copyOf, "copyOf(...)");
        if (i11 < 32) {
            n.P(objArr2, i7 + 1, copyOf, i7, i11);
            copyOf[i7] = obj;
            return new e(objArr, copyOf, i10 + 1, this.f9394d);
        }
        Object obj2 = objArr2[31];
        n.P(objArr2, i7 + 1, copyOf, i7, i11 - 1);
        copyOf[i7] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return I(objArr, copyOf, objArr3);
    }

    public final e I(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f9393c;
        int i10 = i7 >> 5;
        int i11 = this.f9394d;
        if (i10 <= (1 << i11)) {
            return new e(J(i11, objArr, objArr2), objArr3, i7 + 1, i11);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i12 = i11 + 5;
        return new e(J(i12, objArr4, objArr2), objArr3, i7 + 1, i12);
    }

    public final Object[] J(int i7, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int y10 = H.y(b() - 1, i7);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            l.d(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i7 == 5) {
            objArr3[y10] = objArr2;
        } else {
            objArr3[y10] = J(i7 - 5, (Object[]) objArr3[y10], objArr2);
        }
        return objArr3;
    }

    public final Object[] K(Object[] objArr, int i7, int i10, D0.a aVar) {
        Object[] copyOf;
        int y10 = H.y(i10, i7);
        if (i7 == 0) {
            if (y10 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                l.d(copyOf, "copyOf(...)");
            }
            n.P(objArr, y10, copyOf, y10 + 1, 32);
            copyOf[31] = aVar.f3146a;
            aVar.f3146a = objArr[y10];
            return copyOf;
        }
        int y11 = objArr[31] == null ? H.y(M() - 1, i7) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        l.d(copyOf2, "copyOf(...)");
        int i11 = i7 - 5;
        int i12 = y10 + 1;
        if (i12 <= y11) {
            while (true) {
                Object obj = copyOf2[y11];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[y11] = K((Object[]) obj, i11, 0, aVar);
                if (y11 == i12) {
                    break;
                }
                y11--;
            }
        }
        Object obj2 = copyOf2[y10];
        l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[y10] = K((Object[]) obj2, i11, i10, aVar);
        return copyOf2;
    }

    public final c L(Object[] objArr, int i7, int i10, int i11) {
        e eVar;
        int i12 = this.f9393c - i7;
        if (i12 != 1) {
            Object[] objArr2 = this.f9392b;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            l.d(copyOf, "copyOf(...)");
            int i13 = i12 - 1;
            if (i11 < i13) {
                n.P(objArr2, i11, copyOf, i11 + 1, i12);
            }
            copyOf[i13] = null;
            return new e(objArr, copyOf, (i7 + i12) - 1, i10);
        }
        if (i10 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                l.d(objArr, "copyOf(...)");
            }
            return new i(objArr);
        }
        D0.a aVar = new D0.a(null);
        Object[] H10 = H(objArr, i10, i7 - 1, aVar);
        l.b(H10);
        Object obj = aVar.f3146a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (H10[1] == null) {
            Object obj2 = H10[0];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            eVar = new e((Object[]) obj2, objArr3, i7, i10 - 5);
        } else {
            eVar = new e(H10, objArr3, i7, i10);
        }
        return eVar;
    }

    public final int M() {
        return (this.f9393c - 1) & (-32);
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f9393c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        Tb.a.d(i7, b());
        if (M() <= i7) {
            objArr = this.f9392b;
        } else {
            objArr = this.f9391a;
            for (int i10 = this.f9394d; i10 > 0; i10 -= 5) {
                Object obj = objArr[H.y(i7, i10)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final ListIterator listIterator(int i7) {
        Tb.a.e(i7, this.f9393c);
        return new g(this.f9391a, i7, this.f9392b, this.f9393c, (this.f9394d / 5) + 1);
    }

    @Override // U.c
    public final c o(int i7, Object obj) {
        int i10 = this.f9393c;
        Tb.a.e(i7, i10);
        if (i7 == i10) {
            return t(obj);
        }
        int M3 = M();
        Object[] objArr = this.f9391a;
        if (i7 >= M3) {
            return G(obj, objArr, i7 - M3);
        }
        D0.a aVar = new D0.a(null);
        return G(aVar.f3146a, F(objArr, this.f9394d, i7, obj, aVar), 0);
    }

    @Override // U.c
    public final c t(Object obj) {
        int M3 = M();
        int i7 = this.f9393c;
        int i10 = i7 - M3;
        Object[] objArr = this.f9391a;
        Object[] objArr2 = this.f9392b;
        if (i10 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return I(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        l.d(copyOf, "copyOf(...)");
        copyOf[i10] = obj;
        return new e(objArr, copyOf, i7 + 1, this.f9394d);
    }

    @Override // U.c
    public final f z() {
        return new f(this, this.f9391a, this.f9392b, this.f9394d);
    }
}
