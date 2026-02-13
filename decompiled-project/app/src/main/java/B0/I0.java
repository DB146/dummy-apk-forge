package B0;

import android.graphics.Matrix;
import j0.AbstractC1362A;
import java.util.List;
import u.C2038A;
import u.C2042E;
import u0.C2073c;
import u0.C2074d;
import y0.InterfaceC2345m;

/* loaded from: classes.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1693a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1694b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1695c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1696d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1697e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1698f;
    public final Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f1699h;

    /* JADX WARN: Multi-variable type inference failed */
    public I0(Rb.e eVar) {
        this.f1697e = (kotlin.jvm.internal.m) eVar;
        this.g = AbstractC1362A.g();
        this.f1699h = AbstractC1362A.g();
        this.f1695c = true;
        this.f1696d = true;
    }

    public I0(InterfaceC2345m interfaceC2345m) {
        this.f1697e = interfaceC2345m;
        this.f1698f = new C2042E();
        this.g = new C2074d();
        this.f1699h = new C2038A(10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    public void a(long j, List list, boolean z8) {
        long[] jArr;
        long[] jArr2;
        int i7;
        C2073c c2073c;
        C2073c c2073c2;
        C2074d c2074d = (C2074d) this.g;
        C2038A c2038a = (C2038A) this.f1699h;
        c2038a.a();
        int size = list.size();
        C2074d c2074d2 = c2074d;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            c0.l lVar = (c0.l) list.get(i10);
            if (lVar.f14112B) {
                lVar.f14111A = new A0.K(15, this, lVar);
                if (z10) {
                    S.e eVar = c2074d2.f24752a;
                    ?? r14 = eVar.f8959a;
                    int i11 = eVar.f8961c;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            c2073c2 = 0;
                            break;
                        }
                        c2073c2 = r14[i12];
                        if (kotlin.jvm.internal.l.a(((C2073c) c2073c2).f24746c, lVar)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    c2073c = c2073c2;
                    if (c2073c != null) {
                        c2073c.f24751i = true;
                        c2073c.f24747d.a(j);
                        Object d10 = c2038a.d(j);
                        if (d10 == null) {
                            d10 = new C2042E();
                            c2038a.f(d10, j);
                        }
                        ((C2042E) d10).a(c2073c);
                        c2074d2 = c2073c;
                    } else {
                        z10 = false;
                    }
                }
                c2073c = new C2073c(lVar);
                c2073c.f24747d.a(j);
                Object d11 = c2038a.d(j);
                if (d11 == null) {
                    d11 = new C2042E();
                    c2038a.f(d11, j);
                }
                ((C2042E) d11).a(c2073c);
                c2074d2.f24752a.b(c2073c);
                c2074d2 = c2073c;
            }
        }
        if (!z8) {
            return;
        }
        long[] jArr3 = c2038a.f24562b;
        Object[] objArr = c2038a.f24563c;
        long[] jArr4 = c2038a.f24561a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j10 = jArr4[i13];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8;
                int i15 = 8 - ((~(i13 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((255 & j10) < 128) {
                        int i17 = (i13 << 3) + i16;
                        long j11 = jArr3[i17];
                        C2042E c2042e = (C2042E) objArr[i17];
                        S.e eVar2 = c2074d.f24752a;
                        Object[] objArr2 = eVar2.f8959a;
                        int i18 = eVar2.f8961c;
                        int i19 = 0;
                        while (i19 < i18) {
                            ((C2073c) objArr2[i19]).f(j11, c2042e);
                            i19++;
                            jArr3 = jArr3;
                        }
                        jArr2 = jArr3;
                        i7 = 8;
                    } else {
                        jArr2 = jArr3;
                        i7 = i14;
                    }
                    j10 >>= i7;
                    i16++;
                    jArr3 = jArr2;
                    i14 = i7;
                }
                jArr = jArr3;
                if (i15 != i14) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i13 == length) {
                return;
            }
            i13++;
            jArr3 = jArr;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Rb.e, kotlin.jvm.internal.m] */
    public float[] b(Object obj) {
        boolean z8 = this.f1693a;
        float[] fArr = (float[]) this.g;
        if (!z8) {
            return fArr;
        }
        Matrix matrix = (Matrix) this.f1698f;
        if (matrix == null) {
            matrix = new Matrix();
            this.f1698f = matrix;
        }
        ((kotlin.jvm.internal.m) this.f1697e).invoke(obj, matrix);
        AbstractC1362A.v(fArr, matrix);
        this.f1693a = false;
        this.f1696d = AbstractC1362A.q(fArr);
        return fArr;
    }

    public boolean c(P3.p pVar, boolean z8) {
        C2074d c2074d = (C2074d) this.g;
        if (!c2074d.a((u.r) pVar.f7842c, (InterfaceC2345m) this.f1697e, pVar, z8)) {
            return false;
        }
        boolean z10 = true;
        this.f1693a = true;
        S.e eVar = c2074d.f24752a;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        boolean z11 = false;
        for (int i10 = 0; i10 < i7; i10++) {
            z11 = ((C2073c) objArr[i10]).e(pVar, z8) || z11;
        }
        Object[] objArr2 = eVar.f8959a;
        int i11 = eVar.f8961c;
        boolean z12 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            z12 = ((C2073c) objArr2[i12]).d(pVar) || z12;
        }
        c2074d.b(pVar);
        if (!z12 && !z11) {
            z10 = false;
        }
        this.f1693a = false;
        if (this.f1696d) {
            this.f1696d = false;
            C2042E c2042e = (C2042E) this.f1698f;
            int i13 = c2042e.f24585b;
            for (int i14 = 0; i14 < i13; i14++) {
                f((c0.l) c2042e.e(i14));
            }
            c2042e.c();
        }
        if (this.f1694b) {
            this.f1694b = false;
            e();
        }
        if (this.f1695c) {
            this.f1695c = false;
            c2074d.f24752a.g();
        }
        return z10;
    }

    public void d() {
        this.f1693a = true;
        this.f1694b = true;
    }

    public void e() {
        if (this.f1693a) {
            this.f1694b = true;
            return;
        }
        C2074d c2074d = (C2074d) this.g;
        S.e eVar = c2074d.f24752a;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            ((C2073c) objArr[i10]).c();
        }
        if (this.f1695c) {
            this.f1695c = true;
        } else {
            c2074d.f24752a.g();
        }
    }

    public void f(c0.l lVar) {
        if (this.f1693a) {
            this.f1696d = true;
            ((C2042E) this.f1698f).a(lVar);
            return;
        }
        C2074d c2074d = (C2074d) this.g;
        C2042E c2042e = c2074d.f24753b;
        c2042e.c();
        c2042e.a(c2074d);
        while (c2042e.h()) {
            C2074d c2074d2 = (C2074d) c2042e.i(c2042e.f24585b - 1);
            int i7 = 0;
            while (true) {
                S.e eVar = c2074d2.f24752a;
                if (i7 < eVar.f8961c) {
                    C2073c c2073c = (C2073c) eVar.f8959a[i7];
                    if (kotlin.jvm.internal.l.a(c2073c.f24746c, lVar)) {
                        c2074d2.f24752a.k(c2073c);
                        c2073c.c();
                    } else {
                        c2042e.a(c2073c);
                        i7++;
                    }
                }
            }
        }
    }
}
