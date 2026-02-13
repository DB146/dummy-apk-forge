package androidx.compose.foundation.lazy.layout;

import A0.AbstractC0012d0;
import A4.s;
import E.o;
import E.t;
import Eb.r;
import F.C0271o;
import F.C0272p;
import c0.l;
import c0.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import u.C2046I;
import u.C2047J;
import u.Q;
import u.S;
import y0.AbstractC2323H;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final C2046I f13165a;

    /* renamed from: b, reason: collision with root package name */
    public s f13166b;

    /* renamed from: c, reason: collision with root package name */
    public final C2047J f13167c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13168d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f13169e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f13170f;
    public final ArrayList g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13171h;

    /* renamed from: i, reason: collision with root package name */
    public final m f13172i;

    public b() {
        long[] jArr = Q.f24633a;
        this.f13165a = new C2046I();
        int i7 = S.f24634a;
        this.f13167c = new C2047J();
        this.f13168d = new ArrayList();
        this.f13169e = new ArrayList();
        this.f13170f = new ArrayList();
        this.g = new ArrayList();
        this.f13171h = new ArrayList();
        this.f13172i = new AbstractC0012d0(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: a, reason: collision with root package name */
            public final b f13159a;

            {
                this.f13159a = this;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c0.l, F.o] */
            @Override // A0.AbstractC0012d0
            public final l d() {
                ?? lVar = new l();
                lVar.f3988C = this.f13159a;
                return lVar;
            }

            @Override // A0.AbstractC0012d0
            public final void e(l lVar) {
                C0271o c0271o = (C0271o) lVar;
                b bVar = c0271o.f3988C;
                b bVar2 = this.f13159a;
                if (kotlin.jvm.internal.l.a(bVar, bVar2) || !c0271o.f14113a.f14112B) {
                    return;
                }
                b bVar3 = c0271o.f3988C;
                bVar3.c();
                bVar3.f13166b = null;
                bVar2.getClass();
                c0271o.f3988C = bVar2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && kotlin.jvm.internal.l.a(this.f13159a, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f13159a);
            }

            public final int hashCode() {
                return this.f13159a.hashCode();
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f13159a + ')';
            }
        };
    }

    public static int e(int[] iArr, t tVar) {
        tVar.getClass();
        int i7 = iArr[0] + tVar.f3493n;
        iArr[0] = i7;
        return Math.max(0, i7);
    }

    public final long a() {
        ArrayList arrayList = this.f13171h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        A3.c.p(arrayList.get(0));
        throw null;
    }

    public final void b(int i7, int i10, ArrayList arrayList, s sVar, o oVar, boolean z8, boolean z10, int i11, int i12) {
        C2047J c2047j;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        s sVar2 = this.f13166b;
        this.f13166b = sVar;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            t tVar = (t) arrayList.get(i19);
            int size2 = tVar.f3484b.size();
            for (int i20 = 0; i20 < size2; i20++) {
                ((AbstractC2323H) tVar.f3484b.get(i20)).d();
            }
        }
        C2046I c2046i = this.f13165a;
        if (c2046i.i()) {
            c();
            return;
        }
        boolean z11 = z8 || !z10;
        Object[] objArr = c2046i.f24604b;
        long[] jArr = c2046i.f24603a;
        int length = jArr.length - 2;
        long j = 255;
        C2047J c2047j2 = this.f13167c;
        boolean z12 = z11;
        if (length >= 0) {
            int i21 = 0;
            while (true) {
                long j10 = jArr[i21];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i22 = 8 - ((~(i21 - length)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j10 & 255) < 128) {
                            c2047j2.a(objArr[(i21 << 3) + i23]);
                        }
                        j10 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i24 = 0; i24 < size3; i24++) {
            t tVar2 = (t) arrayList.get(i24);
            c2047j2.l(tVar2.f3490i);
            int size4 = tVar2.f3484b.size();
            for (int i25 = 0; i25 < size4; i25++) {
                ((AbstractC2323H) tVar2.f3484b.get(i25)).d();
            }
            A3.c.p(this.f13165a.j(tVar2.f3490i));
        }
        int[] iArr = new int[1];
        ArrayList arrayList3 = this.f13169e;
        ArrayList arrayList4 = this.f13168d;
        if (z12 && sVar2 != null) {
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    r.T(arrayList4, new C0272p(sVar2, 2));
                }
                if (arrayList4.size() > 0) {
                    t tVar3 = (t) arrayList4.get(0);
                    e(iArr, tVar3);
                    Object g = c2046i.g(tVar3.f3490i);
                    kotlin.jvm.internal.l.b(g);
                    A3.c.p(g);
                    tVar3.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    r.T(arrayList3, new C0272p(sVar2, 0));
                }
                if (arrayList3.size() > 0) {
                    t tVar4 = (t) arrayList3.get(0);
                    e(iArr, tVar4);
                    Object g2 = c2046i.g(tVar4.f3490i);
                    kotlin.jvm.internal.l.b(g2);
                    A3.c.p(g2);
                    tVar4.a(0);
                    throw null;
                }
                Arrays.fill(iArr, 0, 1, 0);
            }
        }
        Object[] objArr2 = c2047j2.f24610b;
        long[] jArr2 = c2047j2.f24609a;
        int length2 = jArr2.length - 2;
        ArrayList arrayList5 = this.g;
        ArrayList arrayList6 = this.f13170f;
        if (length2 >= 0) {
            int i26 = length2;
            int i27 = 0;
            while (true) {
                long j11 = jArr2[i27];
                c2047j = c2047j2;
                arrayList2 = arrayList3;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - i26)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j11 & j) < 128) {
                            A3.c.p(c2046i.g(objArr2[(i27 << 3) + i29]));
                        }
                        j11 >>= 8;
                        i29++;
                        j = 255;
                    }
                    if (i28 != 8) {
                        break;
                    }
                }
                int i30 = i26;
                if (i27 == i30) {
                    break;
                }
                i27++;
                i26 = i30;
                c2047j2 = c2047j;
                arrayList3 = arrayList2;
                j = 255;
            }
        } else {
            c2047j = c2047j2;
            arrayList2 = arrayList3;
        }
        long j12 = 4294967295L;
        if (arrayList6.isEmpty()) {
            i13 = i7;
            i14 = i10;
            i15 = 1;
        } else {
            if (arrayList6.size() > 1) {
                r.T(arrayList6, new C0272p(sVar, 3));
            }
            int size5 = arrayList6.size();
            int i31 = 0;
            while (i31 < size5) {
                t tVar5 = (t) arrayList6.get(i31);
                Object g10 = c2046i.g(tVar5.f3490i);
                kotlin.jvm.internal.l.b(g10);
                A3.c.p(g10);
                int e2 = e(iArr, tVar5);
                if (z8) {
                    t tVar6 = (t) Eb.o.Y(arrayList);
                    long a9 = tVar6.a(0);
                    if (tVar6.f3485c) {
                        i17 = size5;
                        i18 = (int) (a9 & j12);
                    } else {
                        i17 = size5;
                        i18 = (int) (a9 >> 32);
                    }
                } else {
                    i17 = size5;
                    i18 = 0;
                }
                tVar5.c(i18 - e2, i7, i10);
                if (z12) {
                    d(tVar5, true);
                    throw null;
                }
                i31++;
                size5 = i17;
                j12 = 4294967295L;
            }
            i13 = i7;
            i14 = i10;
            i15 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > i15) {
                r.T(arrayList5, new C0272p(sVar, 1));
            }
            int size6 = arrayList5.size();
            for (int i32 = 0; i32 < size6; i32++) {
                t tVar7 = (t) arrayList5.get(i32);
                Object g11 = c2046i.g(tVar7.f3490i);
                kotlin.jvm.internal.l.b(g11);
                A3.c.p(g11);
                int e10 = e(iArr, tVar7);
                if (z8) {
                    t tVar8 = (t) Eb.o.e0(arrayList);
                    long a10 = tVar8.a(0);
                    i16 = tVar8.f3493n + (tVar8.f3485c ? (int) (a10 & 4294967295L) : (int) (a10 >> 32));
                } else {
                    i16 = 0;
                }
                tVar7.c((i16 - tVar7.f3493n) + e10, i13, i14);
                if (z12) {
                    d(tVar7, true);
                    throw null;
                }
            }
        }
        Collections.reverse(arrayList6);
        arrayList.addAll(0, arrayList6);
        arrayList.addAll(arrayList5);
        arrayList4.clear();
        arrayList2.clear();
        arrayList6.clear();
        arrayList5.clear();
        c2047j.b();
    }

    public final void c() {
        C2046I c2046i = this.f13165a;
        if (c2046i.f24607e != 0) {
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
                                A3.c.p(objArr[(i7 << 3) + i11]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            c2046i.a();
        }
    }

    public final void d(t tVar, boolean z8) {
        Object g = this.f13165a.g(tVar.f3490i);
        kotlin.jvm.internal.l.b(g);
        A3.c.p(g);
        throw null;
    }
}
