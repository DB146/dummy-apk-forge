package H2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: H2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0299m {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4744a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4745b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f4746c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0303q f4747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4748e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4749f;
    public final boolean g;

    public C0299m(AbstractC0303q abstractC0303q, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int[] iArr3;
        int[] iArr4;
        AbstractC0303q abstractC0303q2;
        int i7;
        C0298l c0298l;
        int i10;
        this.f4744a = arrayList;
        this.f4745b = iArr;
        this.f4746c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f4747d = abstractC0303q;
        int i11 = abstractC0303q.i();
        this.f4748e = i11;
        int h10 = abstractC0303q.h();
        this.f4749f = h10;
        this.g = true;
        C0298l c0298l2 = arrayList.isEmpty() ? null : (C0298l) arrayList.get(0);
        if (c0298l2 == null || c0298l2.f4739a != 0 || c0298l2.f4740b != 0) {
            arrayList.add(0, new C0298l(0, 0, 0));
        }
        arrayList.add(new C0298l(i11, h10, 0));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            iArr3 = this.f4746c;
            iArr4 = this.f4745b;
            abstractC0303q2 = this.f4747d;
            if (!hasNext) {
                break;
            }
            C0298l c0298l3 = (C0298l) it.next();
            for (int i12 = 0; i12 < c0298l3.f4741c; i12++) {
                int i13 = c0298l3.f4739a + i12;
                int i14 = c0298l3.f4740b + i12;
                int i15 = abstractC0303q2.a(i13, i14) ? 1 : 2;
                iArr4[i13] = (i14 << 4) | i15;
                iArr3[i14] = (i13 << 4) | i15;
            }
        }
        if (this.g) {
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                C0298l c0298l4 = (C0298l) it2.next();
                while (true) {
                    i7 = c0298l4.f4739a;
                    if (i16 < i7) {
                        if (iArr4[i16] == 0) {
                            int size = arrayList.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 < size) {
                                    c0298l = (C0298l) arrayList.get(i17);
                                    while (true) {
                                        i10 = c0298l.f4740b;
                                        if (i18 < i10) {
                                            if (iArr3[i18] == 0 && abstractC0303q2.b(i16, i18)) {
                                                int i19 = abstractC0303q2.a(i16, i18) ? 8 : 4;
                                                iArr4[i16] = (i18 << 4) | i19;
                                                iArr3[i18] = i19 | (i16 << 4);
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                i18 = c0298l.f4741c + i10;
                                i17++;
                            }
                        }
                        i16++;
                    }
                }
                i16 = c0298l4.f4741c + i7;
            }
        }
    }

    public static C0300n b(ArrayDeque arrayDeque, int i7, boolean z8) {
        C0300n c0300n;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                c0300n = null;
                break;
            }
            c0300n = (C0300n) it.next();
            if (c0300n.f4756a == i7 && c0300n.f4758c == z8) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            C0300n c0300n2 = (C0300n) it.next();
            if (z8) {
                c0300n2.f4757b--;
            } else {
                c0300n2.f4757b++;
            }
        }
        return c0300n;
    }

    public final void a(C c10) {
        int[] iArr;
        AbstractC0303q abstractC0303q;
        int i7;
        int i10;
        ArrayList arrayList;
        int i11;
        C0299m c0299m = this;
        C0289c c0289c = c10 instanceof C0289c ? (C0289c) c10 : new C0289c(c10);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = c0299m.f4744a;
        int size = arrayList2.size() - 1;
        int i12 = c0299m.f4748e;
        int i13 = c0299m.f4749f;
        int i14 = i12;
        while (size >= 0) {
            C0298l c0298l = (C0298l) arrayList2.get(size);
            int i15 = c0298l.f4739a;
            int i16 = c0298l.f4741c;
            int i17 = i15 + i16;
            int i18 = c0298l.f4740b;
            int i19 = i18 + i16;
            while (true) {
                iArr = c0299m.f4745b;
                abstractC0303q = c0299m.f4747d;
                i7 = 0;
                if (i14 <= i17) {
                    break;
                }
                i14--;
                int i20 = iArr[i14];
                if ((i20 & 12) != 0) {
                    arrayList = arrayList2;
                    int i21 = i20 >> 4;
                    C0300n b2 = b(arrayDeque, i21, false);
                    if (b2 != null) {
                        i11 = i13;
                        int i22 = (i12 - b2.f4757b) - 1;
                        c0289c.e(i14, i22);
                        if ((i20 & 4) != 0) {
                            abstractC0303q.g(i14, i21);
                            c0289c.c(null, i22, 1);
                        }
                    } else {
                        i11 = i13;
                        arrayDeque.add(new C0300n(true, i14, (i12 - i14) - 1));
                    }
                } else {
                    arrayList = arrayList2;
                    i11 = i13;
                    c0289c.d(i14, 1);
                    i12--;
                }
                arrayList2 = arrayList;
                i13 = i11;
            }
            ArrayList arrayList3 = arrayList2;
            while (i13 > i19) {
                i13--;
                int i23 = c0299m.f4746c[i13];
                if ((i23 & 12) != 0) {
                    int i24 = i23 >> 4;
                    C0300n b10 = b(arrayDeque, i24, true);
                    if (b10 == null) {
                        arrayDeque.add(new C0300n(false, i13, i12 - i14));
                        i10 = 0;
                    } else {
                        i10 = 0;
                        c0289c.e((i12 - b10.f4757b) - 1, i14);
                        if ((i23 & 4) != 0) {
                            abstractC0303q.g(i24, i13);
                            c0289c.c(null, i14, 1);
                        }
                    }
                } else {
                    i10 = i7;
                    c0289c.k(i14, 1);
                    i12++;
                }
                c0299m = this;
                i7 = i10;
            }
            i14 = c0298l.f4739a;
            int i25 = i14;
            int i26 = i18;
            while (i7 < i16) {
                if ((iArr[i25] & 15) == 2) {
                    abstractC0303q.g(i25, i26);
                    c0289c.c(null, i25, 1);
                }
                i25++;
                i26++;
                i7++;
            }
            size--;
            c0299m = this;
            i13 = i18;
            arrayList2 = arrayList3;
        }
        c0289c.a();
    }
}
