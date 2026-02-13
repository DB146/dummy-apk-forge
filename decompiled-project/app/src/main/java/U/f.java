package U;

import Eb.C0252c;
import Eb.n;
import Q.AbstractC0495i0;
import h3.H;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class f extends Eb.h implements Collection, Sb.b {

    /* renamed from: a, reason: collision with root package name */
    public c f9395a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f9396b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9397c;

    /* renamed from: d, reason: collision with root package name */
    public int f9398d;

    /* renamed from: e, reason: collision with root package name */
    public X.b f9399e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f9400f;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f9401u;

    /* renamed from: v, reason: collision with root package name */
    public int f9402v;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, X.b] */
    public f(c cVar, Object[] objArr, Object[] objArr2, int i7) {
        this.f9395a = cVar;
        this.f9396b = objArr;
        this.f9397c = objArr2;
        this.f9398d = i7;
        this.f9400f = objArr;
        this.f9401u = objArr2;
        this.f9402v = cVar.b();
    }

    public static void y(Object[] objArr, int i7, Iterator it) {
        while (i7 < 32 && it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    public final void C(Collection collection, int i7, int i10, Object[][] objArr, int i11, Object[] objArr2) {
        if (this.f9400f == null) {
            throw new IllegalStateException("root is null");
        }
        int i12 = i7 >> 5;
        a G9 = G(Y() >> 5);
        int i13 = i11;
        Object[] objArr3 = objArr2;
        while (G9.f9385a - 1 != i12) {
            Object[] objArr4 = (Object[]) G9.previous();
            n.P(objArr4, 0, objArr3, 32 - i10, 32);
            objArr3 = I(i10, objArr4);
            i13--;
            objArr[i13] = objArr3;
        }
        Object[] objArr5 = (Object[]) G9.previous();
        int Y2 = i11 - (((Y() >> 5) - 1) - i12);
        if (Y2 < i11) {
            objArr2 = objArr[Y2];
            l.b(objArr2);
        }
        a0(collection, i7, objArr5, 32, objArr, Y2, objArr2);
    }

    public final Object[] D(Object[] objArr, int i7, int i10, Object obj, D0.a aVar) {
        Object obj2;
        int y10 = H.y(i10, i7);
        if (i7 == 0) {
            aVar.f3146a = objArr[31];
            Object[] H10 = H(objArr);
            n.P(objArr, y10 + 1, H10, y10, 31);
            H10[y10] = obj;
            return H10;
        }
        Object[] H11 = H(objArr);
        int i11 = i7 - 5;
        Object obj3 = H11[y10];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        H11[y10] = D((Object[]) obj3, i11, i10, obj, aVar);
        while (true) {
            y10++;
            if (y10 >= 32 || (obj2 = H11[y10]) == null) {
                break;
            }
            H11[y10] = D((Object[]) obj2, i11, 0, aVar.f3146a, aVar);
        }
        return H11;
    }

    public final void E(Object obj, Object[] objArr, int i7) {
        int b02 = b0();
        Object[] H10 = H(this.f9401u);
        if (b02 < 32) {
            n.P(this.f9401u, i7 + 1, H10, i7, b02);
            H10[i7] = obj;
            this.f9400f = objArr;
            this.f9401u = H10;
            this.f9402v++;
            return;
        }
        Object[] objArr2 = this.f9401u;
        Object obj2 = objArr2[31];
        n.P(objArr2, i7 + 1, H10, i7, 31);
        H10[i7] = obj;
        Q(objArr, H10, K(obj2));
    }

    public final boolean F(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f9399e;
    }

    public final a G(int i7) {
        Object[] objArr = this.f9400f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int Y2 = Y() >> 5;
        Tb.a.e(i7, Y2);
        int i10 = this.f9398d;
        return i10 == 0 ? new d(objArr, i7) : new j(objArr, i7, Y2, i10 / 5);
    }

    public final Object[] H(Object[] objArr) {
        if (objArr == null) {
            return J();
        }
        if (F(objArr)) {
            return objArr;
        }
        Object[] J10 = J();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        n.R(objArr, 0, J10, length, 6);
        return J10;
    }

    public final Object[] I(int i7, Object[] objArr) {
        if (F(objArr)) {
            n.P(objArr, i7, objArr, 0, 32 - i7);
            return objArr;
        }
        Object[] J10 = J();
        n.P(objArr, i7, J10, 0, 32 - i7);
        return J10;
    }

    public final Object[] J() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f9399e;
        return objArr;
    }

    public final Object[] K(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f9399e;
        return objArr;
    }

    public final Object[] L(Object[] objArr, int i7, int i10) {
        if (i10 < 0) {
            AbstractC0495i0.a("shift should be positive");
        }
        if (i10 == 0) {
            return objArr;
        }
        int y10 = H.y(i7, i10);
        Object obj = objArr[y10];
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object L = L((Object[]) obj, i7, i10 - 5);
        if (y10 < 31) {
            int i11 = y10 + 1;
            if (objArr[i11] != null) {
                if (F(objArr)) {
                    Arrays.fill(objArr, i11, 32, (Object) null);
                }
                Object[] J10 = J();
                n.P(objArr, 0, J10, 0, i11);
                objArr = J10;
            }
        }
        if (L == objArr[y10]) {
            return objArr;
        }
        Object[] H10 = H(objArr);
        H10[y10] = L;
        return H10;
    }

    public final Object[] M(Object[] objArr, int i7, int i10, D0.a aVar) {
        Object[] M3;
        int y10 = H.y(i10 - 1, i7);
        if (i7 == 5) {
            aVar.f3146a = objArr[y10];
            M3 = null;
        } else {
            Object obj = objArr[y10];
            l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            M3 = M((Object[]) obj, i7 - 5, i10, aVar);
        }
        if (M3 == null && y10 == 0) {
            return null;
        }
        Object[] H10 = H(objArr);
        H10[y10] = M3;
        return H10;
    }

    public final void N(Object[] objArr, int i7, int i10) {
        if (i10 == 0) {
            this.f9400f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f9401u = objArr;
            this.f9402v = i7;
            this.f9398d = i10;
            return;
        }
        D0.a aVar = new D0.a(null);
        l.b(objArr);
        Object[] M3 = M(objArr, i10, i7, aVar);
        l.b(M3);
        Object obj = aVar.f3146a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f9401u = (Object[]) obj;
        this.f9402v = i7;
        if (M3[1] == null) {
            this.f9400f = (Object[]) M3[0];
            this.f9398d = i10 - 5;
        } else {
            this.f9400f = M3;
            this.f9398d = i10;
        }
    }

    public final Object[] O(Object[] objArr, int i7, int i10, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0495i0.a("invalid buffersIterator");
        }
        if (!(i10 >= 0)) {
            AbstractC0495i0.a("negative shift");
        }
        if (i10 == 0) {
            return (Object[]) it.next();
        }
        Object[] H10 = H(objArr);
        int y10 = H.y(i7, i10);
        int i11 = i10 - 5;
        H10[y10] = O((Object[]) H10[y10], i7, i11, it);
        while (true) {
            y10++;
            if (y10 >= 32 || !it.hasNext()) {
                break;
            }
            H10[y10] = O((Object[]) H10[y10], 0, i11, it);
        }
        return H10;
    }

    public final Object[] P(Object[] objArr, int i7, Object[][] objArr2) {
        C0252c h10 = l.h(objArr2);
        int i10 = i7 >> 5;
        int i11 = this.f9398d;
        Object[] O10 = i10 < (1 << i11) ? O(objArr, i7, i11, h10) : H(objArr);
        while (h10.hasNext()) {
            this.f9398d += 5;
            O10 = K(O10);
            int i12 = this.f9398d;
            O(O10, 1 << i12, i12, h10);
        }
        return O10;
    }

    public final void Q(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i7 = this.f9402v;
        int i10 = i7 >> 5;
        int i11 = this.f9398d;
        if (i10 > (1 << i11)) {
            this.f9400f = R(this.f9398d + 5, K(objArr), objArr2);
            this.f9401u = objArr3;
            this.f9398d += 5;
            this.f9402v++;
            return;
        }
        if (objArr == null) {
            this.f9400f = objArr2;
            this.f9401u = objArr3;
            this.f9402v = i7 + 1;
        } else {
            this.f9400f = R(i11, objArr, objArr2);
            this.f9401u = objArr3;
            this.f9402v++;
        }
    }

    public final Object[] R(int i7, Object[] objArr, Object[] objArr2) {
        int y10 = H.y(b() - 1, i7);
        Object[] H10 = H(objArr);
        if (i7 == 5) {
            H10[y10] = objArr2;
        } else {
            H10[y10] = R(i7 - 5, (Object[]) H10[y10], objArr2);
        }
        return H10;
    }

    public final int S(Rb.c cVar, Object[] objArr, int i7, int i10, D0.a aVar, ArrayList arrayList, ArrayList arrayList2) {
        if (F(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = aVar.f3146a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj2 = objArr[i11];
            if (!((Boolean) cVar.invoke(obj2)).booleanValue()) {
                if (i10 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : J();
                    i10 = 0;
                }
                objArr3[i10] = obj2;
                i10++;
            }
        }
        aVar.f3146a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i10;
    }

    public final int T(Rb.c cVar, Object[] objArr, int i7, D0.a aVar) {
        Object[] objArr2 = objArr;
        int i10 = i7;
        boolean z8 = false;
        for (int i11 = 0; i11 < i7; i11++) {
            Object obj = objArr[i11];
            if (((Boolean) cVar.invoke(obj)).booleanValue()) {
                if (!z8) {
                    objArr2 = H(objArr);
                    z8 = true;
                    i10 = i11;
                }
            } else if (z8) {
                objArr2[i10] = obj;
                i10++;
            }
        }
        aVar.f3146a = objArr2;
        return i10;
    }

    public final int U(Rb.c cVar, int i7, D0.a aVar) {
        int T10 = T(cVar, this.f9401u, i7, aVar);
        if (T10 == i7) {
            return i7;
        }
        Object obj = aVar.f3146a;
        l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, T10, i7, (Object) null);
        this.f9401u = objArr;
        this.f9402v -= i7 - T10;
        return T10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (U(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(Rb.c cVar) {
        Object[] O10;
        int i7;
        int b02 = b0();
        Object[] objArr = null;
        D0.a aVar = new D0.a(null);
        boolean z8 = false;
        if (this.f9400f != null) {
            a G9 = G(0);
            int i10 = 32;
            int i11 = 32;
            while (i11 == 32 && G9.hasNext()) {
                i11 = T(cVar, (Object[]) G9.next(), 32, aVar);
            }
            if (i11 == 32) {
                int U8 = U(cVar, b02, aVar);
                if (U8 == 0) {
                    N(this.f9400f, this.f9402v, this.f9398d);
                }
            } else {
                int i12 = (G9.f9385a - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int i13 = i11;
                while (G9.hasNext()) {
                    i13 = S(cVar, (Object[]) G9.next(), 32, i13, aVar, arrayList2, arrayList);
                    i12 = i12;
                    i10 = i10;
                }
                int i14 = i12;
                int S7 = S(cVar, this.f9401u, b02, i13, aVar, arrayList2, arrayList);
                Object obj = aVar.f3146a;
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr2 = (Object[]) obj;
                Arrays.fill(objArr2, S7, i10, (Object) null);
                if (arrayList.isEmpty()) {
                    O10 = this.f9400f;
                    l.b(O10);
                } else {
                    O10 = O(this.f9400f, i14, this.f9398d, arrayList.iterator());
                }
                int size = i14 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0495i0.a("invalid size");
                }
                if (size == 0) {
                    this.f9398d = 0;
                } else {
                    int i15 = size - 1;
                    while (true) {
                        i7 = this.f9398d;
                        if ((i15 >> i7) != 0) {
                            break;
                        }
                        this.f9398d = i7 - 5;
                        Object[] objArr3 = O10[0];
                        l.c(objArr3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        O10 = objArr3;
                    }
                    objArr = L(O10, i15, i7);
                }
                this.f9400f = objArr;
                this.f9401u = objArr2;
                this.f9402v = size + S7;
                z8 = true;
            }
        }
        if (z8) {
            ((AbstractList) this).modCount++;
        }
        return z8;
    }

    public final Object[] W(Object[] objArr, int i7, int i10, D0.a aVar) {
        int y10 = H.y(i10, i7);
        if (i7 == 0) {
            Object obj = objArr[y10];
            Object[] H10 = H(objArr);
            n.P(objArr, y10, H10, y10 + 1, 32);
            H10[31] = aVar.f3146a;
            aVar.f3146a = obj;
            return H10;
        }
        int y11 = objArr[31] == null ? H.y(Y() - 1, i7) : 31;
        Object[] H11 = H(objArr);
        int i11 = i7 - 5;
        int i12 = y10 + 1;
        if (i12 <= y11) {
            while (true) {
                Object obj2 = H11[y11];
                l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                H11[y11] = W((Object[]) obj2, i11, 0, aVar);
                if (y11 == i12) {
                    break;
                }
                y11--;
            }
        }
        Object obj3 = H11[y10];
        l.c(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        H11[y10] = W((Object[]) obj3, i11, i10, aVar);
        return H11;
    }

    public final Object X(Object[] objArr, int i7, int i10, int i11) {
        int i12 = this.f9402v - i7;
        if (i12 == 1) {
            Object obj = this.f9401u[0];
            N(objArr, i7, i10);
            return obj;
        }
        Object[] objArr2 = this.f9401u;
        Object obj2 = objArr2[i11];
        Object[] H10 = H(objArr2);
        n.P(objArr2, i11, H10, i11 + 1, i12);
        H10[i12 - 1] = null;
        this.f9400f = objArr;
        this.f9401u = H10;
        this.f9402v = (i7 + i12) - 1;
        this.f9398d = i10;
        return obj2;
    }

    public final int Y() {
        int i7 = this.f9402v;
        if (i7 <= 32) {
            return 0;
        }
        return (i7 - 1) & (-32);
    }

    public final Object[] Z(Object[] objArr, int i7, int i10, Object obj, D0.a aVar) {
        int y10 = H.y(i10, i7);
        Object[] H10 = H(objArr);
        if (i7 != 0) {
            Object obj2 = H10[y10];
            l.c(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            H10[y10] = Z((Object[]) obj2, i7 - 5, i10, obj, aVar);
            return H10;
        }
        if (H10 != objArr) {
            ((AbstractList) this).modCount++;
        }
        aVar.f3146a = H10[y10];
        H10[y10] = obj;
        return H10;
    }

    public final void a0(Collection collection, int i7, Object[] objArr, int i10, Object[][] objArr2, int i11, Object[] objArr3) {
        Object[] J10;
        if (i11 < 1) {
            AbstractC0495i0.a("requires at least one nullBuffer");
        }
        Object[] H10 = H(objArr);
        objArr2[0] = H10;
        int i12 = i7 & 31;
        int size = ((collection.size() + i7) - 1) & 31;
        int i13 = (i10 - i12) + size;
        if (i13 < 32) {
            n.P(H10, size + 1, objArr3, i12, i10);
        } else {
            int i14 = i13 - 31;
            if (i11 == 1) {
                J10 = H10;
            } else {
                J10 = J();
                i11--;
                objArr2[i11] = J10;
            }
            int i15 = i10 - i14;
            n.P(H10, 0, objArr3, i15, i10);
            n.P(H10, size + 1, J10, i12, i15);
            objArr3 = J10;
        }
        Iterator it = collection.iterator();
        y(H10, i12, it);
        for (int i16 = 1; i16 < i11; i16++) {
            Object[] J11 = J();
            y(J11, 0, it);
            objArr2[i16] = J11;
        }
        y(objArr3, 0, it);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        Tb.a.e(i7, b());
        if (i7 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int Y2 = Y();
        if (i7 >= Y2) {
            E(obj, this.f9400f, i7 - Y2);
            return;
        }
        D0.a aVar = new D0.a(null);
        Object[] objArr = this.f9400f;
        l.b(objArr);
        E(aVar.f3146a, D(objArr, this.f9398d, i7, obj, aVar), 0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int b02 = b0();
        if (b02 < 32) {
            Object[] H10 = H(this.f9401u);
            H10[b02] = obj;
            this.f9401u = H10;
            this.f9402v = b() + 1;
        } else {
            Q(this.f9400f, this.f9401u, K(obj));
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        Object[] J10;
        Tb.a.e(i7, this.f9402v);
        if (i7 == this.f9402v) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i10 = (i7 >> 5) << 5;
        int size = ((collection.size() + (this.f9402v - i10)) - 1) / 32;
        if (size == 0) {
            int i11 = i7 & 31;
            int size2 = ((collection.size() + i7) - 1) & 31;
            Object[] objArr = this.f9401u;
            Object[] H10 = H(objArr);
            n.P(objArr, size2 + 1, H10, i11, b0());
            y(H10, i11, collection.iterator());
            this.f9401u = H10;
            this.f9402v = collection.size() + this.f9402v;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int b02 = b0();
        int size3 = collection.size() + this.f9402v;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i7 >= Y()) {
            J10 = J();
            a0(collection, i7, this.f9401u, b02, objArr2, size, J10);
        } else if (size3 > b02) {
            int i12 = size3 - b02;
            J10 = I(i12, this.f9401u);
            C(collection, i7, i12, objArr2, size, J10);
        } else {
            Object[] objArr3 = this.f9401u;
            J10 = J();
            int i13 = b02 - size3;
            n.P(objArr3, 0, J10, i13, b02);
            int i14 = 32 - i13;
            Object[] I6 = I(i14, this.f9401u);
            int i15 = size - 1;
            objArr2[i15] = I6;
            C(collection, i7, i14, objArr2, i15, I6);
        }
        this.f9400f = P(this.f9400f, i10, objArr2);
        this.f9401u = J10;
        this.f9402v = collection.size() + this.f9402v;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int b02 = b0();
        Iterator it = collection.iterator();
        if (32 - b02 >= collection.size()) {
            Object[] H10 = H(this.f9401u);
            y(H10, b02, it);
            this.f9401u = H10;
            this.f9402v = collection.size() + this.f9402v;
        } else {
            int size = ((collection.size() + b02) - 1) / 32;
            Object[][] objArr = new Object[size];
            Object[] H11 = H(this.f9401u);
            y(H11, b02, it);
            objArr[0] = H11;
            for (int i7 = 1; i7 < size; i7++) {
                Object[] J10 = J();
                y(J10, 0, it);
                objArr[i7] = J10;
            }
            this.f9400f = P(this.f9400f, Y(), objArr);
            Object[] J11 = J();
            y(J11, 0, it);
            this.f9401u = J11;
            this.f9402v = collection.size() + this.f9402v;
        }
        return true;
    }

    @Override // Eb.h
    public final int b() {
        return this.f9402v;
    }

    public final int b0() {
        int i7 = this.f9402v;
        return i7 <= 32 ? i7 : i7 - ((i7 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        Object[] objArr;
        Tb.a.d(i7, b());
        if (Y() <= i7) {
            objArr = this.f9401u;
        } else {
            objArr = this.f9400f;
            l.b(objArr);
            for (int i10 = this.f9398d; i10 > 0; i10 -= 5) {
                Object obj = objArr[H.y(i7, i10)];
                l.c(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i7 & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i7) {
        Tb.a.e(i7, this.f9402v);
        return new h(this, i7);
    }

    @Override // Eb.h
    public final Object o(int i7) {
        Tb.a.d(i7, b());
        ((AbstractList) this).modCount++;
        int Y2 = Y();
        if (i7 >= Y2) {
            return X(this.f9400f, Y2, this.f9398d, i7 - Y2);
        }
        D0.a aVar = new D0.a(this.f9401u[0]);
        Object[] objArr = this.f9400f;
        l.b(objArr);
        X(W(objArr, this.f9398d, i7, aVar), Y2, this.f9398d, 0);
        return aVar.f3146a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return V(new b(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        Tb.a.d(i7, b());
        if (Y() > i7) {
            D0.a aVar = new D0.a(null);
            Object[] objArr = this.f9400f;
            l.b(objArr);
            this.f9400f = Z(objArr, this.f9398d, i7, obj, aVar);
            return aVar.f3146a;
        }
        Object[] H10 = H(this.f9401u);
        if (H10 != this.f9401u) {
            ((AbstractList) this).modCount++;
        }
        int i10 = i7 & 31;
        Object obj2 = H10[i10];
        H10[i10] = obj;
        this.f9401u = H10;
        return obj2;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.b] */
    public final c t() {
        c eVar;
        Object[] objArr = this.f9400f;
        if (objArr == this.f9396b && this.f9401u == this.f9397c) {
            eVar = this.f9395a;
        } else {
            this.f9399e = new Object();
            this.f9396b = objArr;
            Object[] objArr2 = this.f9401u;
            this.f9397c = objArr2;
            if (objArr != null) {
                eVar = new e(objArr, objArr2, this.f9402v, this.f9398d);
            } else if (objArr2.length == 0) {
                eVar = i.f9409b;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f9401u, this.f9402v);
                l.d(copyOf, "copyOf(...)");
                eVar = new i(copyOf);
            }
        }
        this.f9395a = eVar;
        return eVar;
    }

    public final int z() {
        return ((AbstractList) this).modCount;
    }
}
