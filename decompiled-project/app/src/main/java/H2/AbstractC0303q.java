package H2;

import android.view.View;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: H2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0303q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0297k f4783a = new C0297k(0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, H2.p] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, H2.o] */
    /* JADX WARN: Type inference failed for: r8v28, types: [java.lang.Object, H2.p] */
    public static C0299m c(AbstractC0303q abstractC0303q) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C0301o c0301o;
        C0302p c0302p;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i7;
        C0301o c0301o2;
        C0301o c0301o3;
        int i10;
        int i11;
        C0302p c0302p2;
        C0302p c0302p3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = abstractC0303q.i();
        int h10 = abstractC0303q.h();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ?? obj = new Object();
        int i19 = 0;
        obj.f4760a = 0;
        obj.f4761b = i18;
        obj.f4762c = 0;
        obj.f4763d = h10;
        arrayList6.add(obj);
        int i20 = i18 + h10;
        int i21 = 1;
        int i22 = (((i20 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i22];
        int i23 = i22 / 2;
        int[] iArr2 = new int[i22];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            C0301o c0301o4 = (C0301o) arrayList6.remove(arrayList6.size() - i21);
            if (c0301o4.b() >= i21 && c0301o4.a() >= i21) {
                int a9 = ((c0301o4.a() + c0301o4.b()) + i21) / 2;
                int i24 = i21 + i23;
                iArr[i24] = c0301o4.f4760a;
                iArr2[i24] = c0301o4.f4761b;
                int i25 = i19;
                while (i25 < a9) {
                    int i26 = Math.abs(c0301o4.b() - c0301o4.a()) % 2 == i21 ? i21 : i19;
                    int b2 = c0301o4.b() - c0301o4.a();
                    int i27 = -i25;
                    int i28 = i27;
                    while (true) {
                        if (i28 > i25) {
                            arrayList = arrayList6;
                            i10 = i19;
                            arrayList2 = arrayList7;
                            i11 = a9;
                            c0302p2 = null;
                            break;
                        }
                        if (i28 == i27 || (i28 != i25 && iArr[i28 + 1 + i23] > iArr[(i28 - 1) + i23])) {
                            i15 = iArr[i28 + 1 + i23];
                            i16 = i15;
                        } else {
                            i15 = iArr[(i28 - 1) + i23];
                            i16 = i15 + 1;
                        }
                        i11 = a9;
                        arrayList = arrayList6;
                        int i29 = ((i16 - c0301o4.f4760a) + c0301o4.f4762c) - i28;
                        int i30 = (i25 == 0 || i16 != i15) ? i29 : i29 - 1;
                        arrayList2 = arrayList7;
                        while (i16 < c0301o4.f4761b && i29 < c0301o4.f4763d && abstractC0303q.b(i16, i29)) {
                            i16++;
                            i29++;
                        }
                        iArr[i28 + i23] = i16;
                        if (i26 != 0) {
                            int i31 = b2 - i28;
                            i17 = i26;
                            if (i31 >= i27 + 1 && i31 <= i25 - 1 && iArr2[i31 + i23] <= i16) {
                                ?? obj2 = new Object();
                                obj2.f4768a = i15;
                                obj2.f4769b = i30;
                                obj2.f4770c = i16;
                                obj2.f4771d = i29;
                                i10 = 0;
                                obj2.f4772e = false;
                                c0302p2 = obj2;
                                break;
                            }
                        } else {
                            i17 = i26;
                        }
                        i28 += 2;
                        i19 = 0;
                        a9 = i11;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i26 = i17;
                    }
                    if (c0302p2 != null) {
                        c0302p = c0302p2;
                        c0301o = c0301o4;
                        break;
                    }
                    int i32 = (c0301o4.b() - c0301o4.a()) % 2 == 0 ? 1 : i10;
                    int b10 = c0301o4.b() - c0301o4.a();
                    int i33 = i27;
                    while (true) {
                        if (i33 > i25) {
                            c0301o = c0301o4;
                            c0302p3 = null;
                            break;
                        }
                        if (i33 == i27 || (i33 != i25 && iArr2[i33 + 1 + i23] < iArr2[(i33 - 1) + i23])) {
                            i12 = iArr2[i33 + 1 + i23];
                            i13 = i12;
                        } else {
                            i12 = iArr2[(i33 - 1) + i23];
                            i13 = i12 - 1;
                        }
                        int i34 = c0301o4.f4763d - ((c0301o4.f4761b - i13) - i33);
                        int i35 = (i25 == 0 || i13 != i12) ? i34 : i34 + 1;
                        while (i13 > c0301o4.f4760a && i34 > c0301o4.f4762c) {
                            c0301o = c0301o4;
                            if (!abstractC0303q.b(i13 - 1, i34 - 1)) {
                                break;
                            }
                            i13--;
                            i34--;
                            c0301o4 = c0301o;
                        }
                        c0301o = c0301o4;
                        iArr2[i33 + i23] = i13;
                        if (i32 != 0 && (i14 = b10 - i33) >= i27 && i14 <= i25 && iArr[i14 + i23] >= i13) {
                            ?? obj3 = new Object();
                            obj3.f4768a = i13;
                            obj3.f4769b = i34;
                            obj3.f4770c = i12;
                            obj3.f4771d = i35;
                            obj3.f4772e = true;
                            c0302p3 = obj3;
                            break;
                        }
                        i33 += 2;
                        c0301o4 = c0301o;
                    }
                    if (c0302p3 != null) {
                        c0302p = c0302p3;
                        break;
                    }
                    i25++;
                    a9 = i11;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    c0301o4 = c0301o;
                    i21 = 1;
                    i19 = 0;
                }
            }
            arrayList = arrayList6;
            arrayList2 = arrayList7;
            c0301o = c0301o4;
            c0302p = null;
            if (c0302p != null) {
                if (c0302p.a() > 0) {
                    int i36 = c0302p.f4771d;
                    int i37 = c0302p.f4769b;
                    int i38 = i36 - i37;
                    int i39 = c0302p.f4770c;
                    int i40 = c0302p.f4768a;
                    int i41 = i39 - i40;
                    arrayList5.add(i38 != i41 ? c0302p.f4772e ? new C0298l(i40, i37, c0302p.a()) : i38 > i41 ? new C0298l(i40, i37 + 1, c0302p.a()) : new C0298l(i40 + 1, i37, c0302p.a()) : new C0298l(i40, i37, i41));
                }
                if (arrayList2.isEmpty()) {
                    arrayList4 = arrayList2;
                    c0301o2 = c0301o;
                    i7 = 1;
                    c0301o3 = new Object();
                } else {
                    i7 = 1;
                    arrayList4 = arrayList2;
                    c0301o2 = c0301o;
                    c0301o3 = (C0301o) arrayList4.remove(arrayList2.size() - 1);
                }
                c0301o3.f4760a = c0301o2.f4760a;
                c0301o3.f4762c = c0301o2.f4762c;
                c0301o3.f4761b = c0302p.f4768a;
                c0301o3.f4763d = c0302p.f4769b;
                arrayList3 = arrayList;
                arrayList3.add(c0301o3);
                c0301o2.f4761b = c0301o2.f4761b;
                c0301o2.f4763d = c0301o2.f4763d;
                c0301o2.f4760a = c0302p.f4770c;
                c0301o2.f4762c = c0302p.f4771d;
                arrayList3.add(c0301o2);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i7 = 1;
                arrayList4.add(c0301o);
            }
            i21 = i7;
            arrayList6 = arrayList3;
            arrayList7 = arrayList4;
            i19 = 0;
        }
        Collections.sort(arrayList5, f4783a);
        return new C0299m(abstractC0303q, arrayList5, iArr, iArr2);
    }

    public static int d(e0 e0Var, E e2, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z8) {
        if (aVar.y() == 0 || e0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1;
        }
        return Math.min(e2.n(), e2.d(view2) - e2.g(view));
    }

    public static int e(e0 e0Var, E e2, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z8, boolean z10) {
        if (aVar.y() == 0 || e0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z10 ? Math.max(0, (e0Var.b() - Math.max(androidx.recyclerview.widget.a.O(view), androidx.recyclerview.widget.a.O(view2))) - 1) : Math.max(0, Math.min(androidx.recyclerview.widget.a.O(view), androidx.recyclerview.widget.a.O(view2)));
        if (z8) {
            return Math.round((max * (Math.abs(e2.d(view2) - e2.g(view)) / (Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1))) + (e2.m() - e2.g(view)));
        }
        return max;
    }

    public static int f(e0 e0Var, E e2, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z8) {
        if (aVar.y() == 0 || e0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return e0Var.b();
        }
        return (int) (((e2.d(view2) - e2.g(view)) / (Math.abs(androidx.recyclerview.widget.a.O(view) - androidx.recyclerview.widget.a.O(view2)) + 1)) * e0Var.b());
    }

    public abstract boolean a(int i7, int i10);

    public abstract boolean b(int i7, int i10);

    public abstract void g(int i7, int i10);

    public abstract int h();

    public abstract int i();
}
