package E;

import cc.E;
import java.util.List;
import java.util.Map;
import y0.InterfaceC2317B;
import z.V;

/* loaded from: classes.dex */
public final class s implements InterfaceC2317B {

    /* renamed from: a, reason: collision with root package name */
    public final t f3469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3470b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3471c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3472d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2317B f3473e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3474f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final E f3475h;

    /* renamed from: i, reason: collision with root package name */
    public final V0.c f3476i;
    public final long j;
    public final Object k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3477l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3478m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3479n;

    /* renamed from: o, reason: collision with root package name */
    public final V f3480o;

    /* renamed from: p, reason: collision with root package name */
    public final int f3481p;

    /* renamed from: q, reason: collision with root package name */
    public final int f3482q;

    public s(t tVar, int i7, boolean z8, float f4, InterfaceC2317B interfaceC2317B, float f10, boolean z10, E e2, V0.c cVar, long j, List list, int i10, int i11, int i12, V v10, int i13, int i14) {
        this.f3469a = tVar;
        this.f3470b = i7;
        this.f3471c = z8;
        this.f3472d = f4;
        this.f3473e = interfaceC2317B;
        this.f3474f = f10;
        this.g = z10;
        this.f3475h = e2;
        this.f3476i = cVar;
        this.j = j;
        this.k = list;
        this.f3477l = i10;
        this.f3478m = i11;
        this.f3479n = i12;
        this.f3480o = v10;
        this.f3481p = i13;
        this.f3482q = i14;
    }

    @Override // y0.InterfaceC2317B
    public final Map a() {
        return this.f3473e.a();
    }

    @Override // y0.InterfaceC2317B
    public final void b() {
        this.f3473e.b();
    }

    @Override // y0.InterfaceC2317B
    public final Rb.c c() {
        return this.f3473e.c();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final s d(int i7, boolean z8) {
        t tVar;
        int i10;
        s sVar = null;
        if (!this.g) {
            ?? r22 = this.k;
            if (!r22.isEmpty() && (tVar = this.f3469a) != null && (i10 = this.f3470b - i7) >= 0 && i10 < tVar.f3493n) {
                t tVar2 = (t) Eb.o.Y(r22);
                t tVar3 = (t) Eb.o.e0(r22);
                if (!tVar2.f3495p && !tVar3.f3495p) {
                    int i11 = this.f3478m;
                    int i12 = this.f3477l;
                    if (i7 >= 0 ? Math.min(i12 - tVar2.f3491l, i11 - tVar3.f3491l) > i7 : Math.min((tVar2.f3491l + tVar2.f3493n) - i12, (tVar3.f3491l + tVar3.f3493n) - i11) > (-i7)) {
                        int size = r22.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            t tVar4 = (t) r22.get(i13);
                            if (!tVar4.f3495p) {
                                tVar4.f3491l += i7;
                                int[] iArr = tVar4.f3497r;
                                int length = iArr.length;
                                for (int i14 = 0; i14 < length; i14++) {
                                    int i15 = i14 & 1;
                                    boolean z10 = tVar4.f3485c;
                                    if ((z10 && i15 != 0) || (!z10 && i15 == 0)) {
                                        iArr[i14] = iArr[i14] + i7;
                                    }
                                }
                                if (z8) {
                                    int size2 = tVar4.f3484b.size();
                                    for (int i16 = 0; i16 < size2; i16++) {
                                        A3.c.p(tVar4.k.f13165a.g(tVar4.f3490i));
                                    }
                                }
                            }
                        }
                        sVar = new s(this.f3469a, i10, this.f3471c || i7 > 0, i7, this.f3473e, this.f3474f, this.g, this.f3475h, this.f3476i, this.j, r22, this.f3477l, this.f3478m, this.f3479n, this.f3480o, this.f3481p, this.f3482q);
                    }
                }
            }
        }
        return sVar;
    }

    public final long e() {
        InterfaceC2317B interfaceC2317B = this.f3473e;
        return (interfaceC2317B.getWidth() << 32) | (interfaceC2317B.getHeight() & 4294967295L);
    }

    @Override // y0.InterfaceC2317B
    public final int getHeight() {
        return this.f3473e.getHeight();
    }

    @Override // y0.InterfaceC2317B
    public final int getWidth() {
        return this.f3473e.getWidth();
    }
}
