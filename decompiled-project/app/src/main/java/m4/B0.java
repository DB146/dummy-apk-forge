package m4;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class B0 extends L0 {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f19807y = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f19808b;

    /* renamed from: c, reason: collision with root package name */
    public final P4.g0 f19809c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19810d;

    /* renamed from: e, reason: collision with root package name */
    public final int f19811e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f19812f;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f19813u;

    /* renamed from: v, reason: collision with root package name */
    public final L0[] f19814v;

    /* renamed from: w, reason: collision with root package name */
    public final Object[] f19815w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f19816x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public B0(ArrayList arrayList, P4.g0 g0Var) {
        this(r0, r1, g0Var);
        L0[] l0Arr = new L0[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        int i10 = 0;
        while (it.hasNext()) {
            l0Arr[i10] = ((InterfaceC1570g0) it.next()).b();
            i10++;
        }
        Object[] objArr = new Object[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            objArr[i7] = ((InterfaceC1570g0) it2.next()).a();
            i7++;
        }
    }

    public B0(L0[] l0Arr, Object[] objArr, P4.g0 g0Var) {
        this.f19809c = g0Var;
        this.f19808b = g0Var.f8043b.length;
        int length = l0Arr.length;
        this.f19814v = l0Arr;
        this.f19812f = new int[length];
        this.f19813u = new int[length];
        this.f19815w = objArr;
        this.f19816x = new HashMap();
        int length2 = l0Arr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i7 < length2) {
            L0 l02 = l0Arr[i7];
            this.f19814v[i12] = l02;
            this.f19813u[i12] = i10;
            this.f19812f[i12] = i11;
            i10 += l02.o();
            i11 += this.f19814v[i12].h();
            this.f19816x.put(objArr[i12], Integer.valueOf(i12));
            i7++;
            i12++;
        }
        this.f19810d = i10;
        this.f19811e = i11;
    }

    @Override // m4.L0
    public final int a(boolean z8) {
        if (this.f19808b == 0) {
            return -1;
        }
        int i7 = 0;
        if (z8) {
            int[] iArr = this.f19809c.f8043b;
            i7 = iArr.length > 0 ? iArr[0] : -1;
        }
        do {
            L0[] l0Arr = this.f19814v;
            if (!l0Arr[i7].p()) {
                return l0Arr[i7].a(z8) + this.f19813u[i7];
            }
            i7 = q(i7, z8);
        } while (i7 != -1);
        return -1;
    }

    @Override // m4.L0
    public final int b(Object obj) {
        int b2;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19816x.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        if (intValue == -1 || (b2 = this.f19814v[intValue].b(obj3)) == -1) {
            return -1;
        }
        return this.f19812f[intValue] + b2;
    }

    @Override // m4.L0
    public final int c(boolean z8) {
        int i7;
        int i10 = this.f19808b;
        if (i10 == 0) {
            return -1;
        }
        if (z8) {
            int[] iArr = this.f19809c.f8043b;
            i7 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i7 = i10 - 1;
        }
        do {
            L0[] l0Arr = this.f19814v;
            if (!l0Arr[i7].p()) {
                return l0Arr[i7].c(z8) + this.f19813u[i7];
            }
            i7 = r(i7, z8);
        } while (i7 != -1);
        return -1;
    }

    @Override // m4.L0
    public final int e(boolean z8, int i7, int i10) {
        int[] iArr = this.f19813u;
        int d10 = n5.D.d(iArr, i7 + 1, false, false);
        int i11 = iArr[d10];
        L0[] l0Arr = this.f19814v;
        int e2 = l0Arr[d10].e(z8, i7 - i11, i10 != 2 ? i10 : 0);
        if (e2 != -1) {
            return i11 + e2;
        }
        int q10 = q(d10, z8);
        while (q10 != -1 && l0Arr[q10].p()) {
            q10 = q(q10, z8);
        }
        if (q10 != -1) {
            return l0Arr[q10].a(z8) + iArr[q10];
        }
        if (i10 == 2) {
            return a(z8);
        }
        return -1;
    }

    @Override // m4.L0
    public final J0 f(int i7, J0 j02, boolean z8) {
        int[] iArr = this.f19812f;
        int d10 = n5.D.d(iArr, i7 + 1, false, false);
        int i10 = this.f19813u[d10];
        this.f19814v[d10].f(i7 - iArr[d10], j02, z8);
        j02.f19965c += i10;
        if (z8) {
            Object obj = this.f19815w[d10];
            Object obj2 = j02.f19964b;
            obj2.getClass();
            j02.f19964b = Pair.create(obj, obj2);
        }
        return j02;
    }

    @Override // m4.L0
    public final J0 g(Object obj, J0 j02) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        Integer num = (Integer) this.f19816x.get(obj2);
        int intValue = num == null ? -1 : num.intValue();
        int i7 = this.f19813u[intValue];
        this.f19814v[intValue].g(obj3, j02);
        j02.f19965c += i7;
        j02.f19964b = obj;
        return j02;
    }

    @Override // m4.L0
    public final int h() {
        return this.f19811e;
    }

    @Override // m4.L0
    public final int k(boolean z8, int i7, int i10) {
        int[] iArr = this.f19813u;
        int d10 = n5.D.d(iArr, i7 + 1, false, false);
        int i11 = iArr[d10];
        L0[] l0Arr = this.f19814v;
        int k = l0Arr[d10].k(z8, i7 - i11, i10 != 2 ? i10 : 0);
        if (k != -1) {
            return i11 + k;
        }
        int r10 = r(d10, z8);
        while (r10 != -1 && l0Arr[r10].p()) {
            r10 = r(r10, z8);
        }
        if (r10 != -1) {
            return l0Arr[r10].c(z8) + iArr[r10];
        }
        if (i10 == 2) {
            return c(z8);
        }
        return -1;
    }

    @Override // m4.L0
    public final Object l(int i7) {
        int[] iArr = this.f19812f;
        int d10 = n5.D.d(iArr, i7 + 1, false, false);
        return Pair.create(this.f19815w[d10], this.f19814v[d10].l(i7 - iArr[d10]));
    }

    @Override // m4.L0
    public final K0 m(int i7, K0 k02, long j) {
        int[] iArr = this.f19813u;
        int d10 = n5.D.d(iArr, i7 + 1, false, false);
        int i10 = iArr[d10];
        int i11 = this.f19812f[d10];
        this.f19814v[d10].m(i7 - i10, k02, j);
        Object obj = this.f19815w[d10];
        if (!K0.f19999F.equals(k02.f20019a)) {
            obj = Pair.create(obj, k02.f20019a);
        }
        k02.f20019a = obj;
        k02.f20016C += i11;
        k02.f20017D += i11;
        return k02;
    }

    @Override // m4.L0
    public final int o() {
        return this.f19810d;
    }

    public final int q(int i7, boolean z8) {
        if (!z8) {
            if (i7 < this.f19808b - 1) {
                return i7 + 1;
            }
            return -1;
        }
        P4.g0 g0Var = this.f19809c;
        int i10 = g0Var.f8044c[i7] + 1;
        int[] iArr = g0Var.f8043b;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public final int r(int i7, boolean z8) {
        if (!z8) {
            if (i7 > 0) {
                return i7 - 1;
            }
            return -1;
        }
        P4.g0 g0Var = this.f19809c;
        int i10 = g0Var.f8044c[i7] - 1;
        if (i10 >= 0) {
            return g0Var.f8043b[i10];
        }
        return -1;
    }
}
