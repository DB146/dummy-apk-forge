package E;

import java.util.List;
import y0.AbstractC2322G;
import y0.AbstractC2323H;
import y0.AbstractC2325J;
import y0.C2324I;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f3483a;

    /* renamed from: b, reason: collision with root package name */
    public final List f3484b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final c0.c f3486d;

    /* renamed from: e, reason: collision with root package name */
    public final c0.d f3487e;

    /* renamed from: f, reason: collision with root package name */
    public final V0.l f3488f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3489h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f3490i;
    public final Object j;
    public final androidx.compose.foundation.lazy.layout.b k;

    /* renamed from: l, reason: collision with root package name */
    public int f3491l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3492m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3493n;

    /* renamed from: o, reason: collision with root package name */
    public final int f3494o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3495p;

    /* renamed from: q, reason: collision with root package name */
    public int f3496q = Integer.MIN_VALUE;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f3497r;

    public t(int i7, List list, boolean z8, c0.c cVar, c0.d dVar, V0.l lVar, int i10, int i11, int i12, long j, Object obj, Object obj2, androidx.compose.foundation.lazy.layout.b bVar, long j10) {
        this.f3483a = i7;
        this.f3484b = list;
        this.f3485c = z8;
        this.f3486d = cVar;
        this.f3487e = dVar;
        this.f3488f = lVar;
        this.g = i12;
        this.f3489h = j;
        this.f3490i = obj;
        this.j = obj2;
        this.k = bVar;
        int size = list.size();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            AbstractC2323H abstractC2323H = (AbstractC2323H) list.get(i15);
            boolean z10 = this.f3485c;
            i13 += z10 ? abstractC2323H.f26555b : abstractC2323H.f26554a;
            i14 = Math.max(i14, !z10 ? abstractC2323H.f26555b : abstractC2323H.f26554a);
        }
        this.f3492m = i13;
        int i16 = i13 + this.g;
        this.f3493n = i16 >= 0 ? i16 : 0;
        this.f3494o = i14;
        this.f3497r = new int[this.f3484b.size() * 2];
    }

    public final long a(int i7) {
        int i10 = i7 * 2;
        int[] iArr = this.f3497r;
        return (iArr[i10] << 32) | (iArr[i10 + 1] & 4294967295L);
    }

    public final void b(AbstractC2322G abstractC2322G) {
        if (this.f3496q == Integer.MIN_VALUE) {
            B.a.a("position() should be called first");
        }
        List list = this.f3484b;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC2323H abstractC2323H = (AbstractC2323H) list.get(i7);
            boolean z8 = this.f3485c;
            if (z8) {
                int i10 = abstractC2323H.f26555b;
            } else {
                int i11 = abstractC2323H.f26554a;
            }
            long a9 = a(i7);
            A3.c.p(this.k.f13165a.g(this.f3490i));
            long c10 = V0.i.c(a9, this.f3489h);
            C2324I c2324i = C2324I.f26559b;
            if (z8) {
                int i12 = AbstractC2325J.f26563b;
                abstractC2322G.getClass();
                AbstractC2322G.a(abstractC2322G, abstractC2323H);
                abstractC2323H.M(V0.i.c(c10, abstractC2323H.f26558e), 0.0f, c2324i);
            } else {
                int i13 = AbstractC2325J.f26563b;
                if (abstractC2322G.b() == V0.l.f9982a || abstractC2322G.c() == 0) {
                    AbstractC2322G.a(abstractC2322G, abstractC2323H);
                    abstractC2323H.M(V0.i.c(c10, abstractC2323H.f26558e), 0.0f, c2324i);
                } else {
                    AbstractC2322G.a(abstractC2322G, abstractC2323H);
                    abstractC2323H.M(V0.i.c((((int) (c10 & 4294967295L)) & 4294967295L) | (((abstractC2322G.c() - abstractC2323H.f26554a) - ((int) (c10 >> 32))) << 32), abstractC2323H.f26558e), 0.0f, c2324i);
                }
            }
        }
    }

    public final void c(int i7, int i10, int i11) {
        int i12;
        this.f3491l = i7;
        boolean z8 = this.f3485c;
        this.f3496q = z8 ? i11 : i10;
        List list = this.f3484b;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            AbstractC2323H abstractC2323H = (AbstractC2323H) list.get(i13);
            int i14 = i13 * 2;
            int[] iArr = this.f3497r;
            if (z8) {
                c0.c cVar = this.f3486d;
                if (cVar == null) {
                    B.a.b("null horizontalAlignment when isVertical == true");
                    throw new Db.d(0);
                }
                int i15 = abstractC2323H.f26554a;
                V0.l lVar = this.f3488f;
                cVar.getClass();
                float f4 = (i10 - i15) / 2.0f;
                V0.l lVar2 = V0.l.f9982a;
                float f10 = cVar.f14101a;
                if (lVar != lVar2) {
                    f10 *= -1;
                }
                iArr[i14] = Math.round((1 + f10) * f4);
                iArr[i14 + 1] = i7;
                i12 = abstractC2323H.f26555b;
            } else {
                iArr[i14] = i7;
                int i16 = i14 + 1;
                c0.d dVar = this.f3487e;
                if (dVar == null) {
                    B.a.b("null verticalAlignment when isVertical == false");
                    throw new Db.d(0);
                }
                iArr[i16] = Math.round((1 + dVar.f14102a) * ((i11 - abstractC2323H.f26555b) / 2.0f));
                i12 = abstractC2323H.f26554a;
            }
            i7 += i12;
        }
    }
}
