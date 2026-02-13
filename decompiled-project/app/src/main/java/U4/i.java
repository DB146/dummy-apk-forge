package U4;

import N6.F;
import N6.t0;
import N6.y0;
import P4.C0454b;
import P4.m0;
import android.net.Uri;
import android.util.Pair;
import h3.H;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k5.AbstractC1424c;
import m4.L;
import m5.C1619p;
import m5.InterfaceC1615l;
import m5.InterfaceC1616m;
import m5.T;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final c f9530a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1616m f9531b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1616m f9532c;

    /* renamed from: d, reason: collision with root package name */
    public final R7.a f9533d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri[] f9534e;

    /* renamed from: f, reason: collision with root package name */
    public final L[] f9535f;
    public final V4.c g;

    /* renamed from: h, reason: collision with root package name */
    public final m0 f9536h;

    /* renamed from: i, reason: collision with root package name */
    public final List f9537i;
    public final n4.l k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9538l;

    /* renamed from: n, reason: collision with root package name */
    public C0454b f9540n;

    /* renamed from: o, reason: collision with root package name */
    public Uri f9541o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9542p;

    /* renamed from: q, reason: collision with root package name */
    public k5.s f9543q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9545s;
    public final R7.b j = new R7.b(5);

    /* renamed from: m, reason: collision with root package name */
    public byte[] f9539m = D.f21146f;

    /* renamed from: r, reason: collision with root package name */
    public long f9544r = -9223372036854775807L;

    /* JADX WARN: Type inference failed for: r3v1, types: [k5.c, k5.s, U4.g] */
    public i(c cVar, V4.c cVar2, Uri[] uriArr, L[] lArr, R7.a aVar, T t5, R7.a aVar2, List list, n4.l lVar) {
        this.f9530a = cVar;
        this.g = cVar2;
        this.f9534e = uriArr;
        this.f9535f = lArr;
        this.f9533d = aVar2;
        this.f9537i = list;
        this.k = lVar;
        InterfaceC1616m e2 = ((InterfaceC1615l) aVar.f8927b).e();
        this.f9531b = e2;
        if (t5 != null) {
            e2.a(t5);
        }
        this.f9532c = ((InterfaceC1615l) aVar.f8927b).e();
        this.f9536h = new m0("", lArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < uriArr.length; i7++) {
            if ((lArr[i7].f20089e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        m0 m0Var = this.f9536h;
        int[] G9 = H.G(arrayList);
        ?? abstractC1424c = new AbstractC1424c(m0Var, G9);
        abstractC1424c.g = abstractC1424c.s(m0Var.f8109d[G9[0]]);
        this.f9543q = abstractC1424c;
    }

    public final R4.l[] a(k kVar, long j) {
        int i7;
        List list;
        int a9 = kVar == null ? -1 : this.f9536h.a(kVar.f8872d);
        int length = this.f9543q.length();
        R4.l[] lVarArr = new R4.l[length];
        boolean z8 = false;
        int i10 = 0;
        while (i10 < length) {
            int f4 = this.f9543q.f(i10);
            Uri uri = this.f9534e[f4];
            V4.c cVar = this.g;
            if (cVar.c(uri)) {
                V4.i a10 = cVar.a(z8, uri);
                a10.getClass();
                long j10 = a10.f10085h - cVar.f10046B;
                i7 = i10;
                Pair c10 = c(kVar, f4 != a9 ? true : z8, a10, j10, j);
                long longValue = ((Long) c10.first).longValue();
                int intValue = ((Integer) c10.second).intValue();
                int i11 = (int) (longValue - a10.k);
                if (i11 >= 0) {
                    N6.H h10 = a10.f10093r;
                    if (h10.size() >= i11) {
                        ArrayList arrayList = new ArrayList();
                        if (i11 < h10.size()) {
                            if (intValue != -1) {
                                V4.f fVar = (V4.f) h10.get(i11);
                                if (intValue == 0) {
                                    arrayList.add(fVar);
                                } else if (intValue < fVar.f10064A.size()) {
                                    N6.H h11 = fVar.f10064A;
                                    arrayList.addAll(h11.subList(intValue, h11.size()));
                                }
                                i11++;
                            }
                            arrayList.addAll(h10.subList(i11, h10.size()));
                            intValue = 0;
                        }
                        if (a10.f10089n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            N6.H h12 = a10.f10094s;
                            if (intValue < h12.size()) {
                                arrayList.addAll(h12.subList(intValue, h12.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        lVarArr[i7] = new f(j10, list);
                    }
                }
                F f10 = N6.H.f7232b;
                list = t0.f7341e;
                lVarArr[i7] = new f(j10, list);
            } else {
                lVarArr[i10] = R4.l.j;
                i7 = i10;
            }
            i10 = i7 + 1;
            z8 = false;
        }
        return lVarArr;
    }

    public final int b(k kVar) {
        if (kVar.f9550C == -1) {
            return 1;
        }
        V4.i a9 = this.g.a(false, this.f9534e[this.f9536h.a(kVar.f8872d)]);
        a9.getClass();
        int i7 = (int) (kVar.f8916x - a9.k);
        if (i7 < 0) {
            return 1;
        }
        N6.H h10 = a9.f10093r;
        N6.H h11 = i7 < h10.size() ? ((V4.f) h10.get(i7)).f10064A : a9.f10094s;
        int size = h11.size();
        int i10 = kVar.f9550C;
        if (i10 >= size) {
            return 2;
        }
        V4.d dVar = (V4.d) h11.get(i10);
        if (dVar.f10059A) {
            return 0;
        }
        return D.a(Uri.parse(AbstractC1705a.N(a9.f10115a, dVar.f10066a)), kVar.f8870b.f20628a) ? 1 : 2;
    }

    public final Pair c(k kVar, boolean z8, V4.i iVar, long j, long j10) {
        boolean z10 = true;
        if (kVar != null && !z8) {
            boolean z11 = kVar.f9568V;
            long j11 = kVar.f8916x;
            int i7 = kVar.f9550C;
            if (!z11) {
                return new Pair(Long.valueOf(j11), Integer.valueOf(i7));
            }
            if (i7 == -1) {
                j11 = kVar.a();
            }
            return new Pair(Long.valueOf(j11), Integer.valueOf(i7 != -1 ? i7 + 1 : -1));
        }
        long j12 = iVar.f10096u + j;
        if (kVar != null && !this.f9542p) {
            j10 = kVar.f8875u;
        }
        boolean z12 = iVar.f10090o;
        long j13 = iVar.k;
        N6.H h10 = iVar.f10093r;
        if (!z12 && j10 >= j12) {
            return new Pair(Long.valueOf(j13 + h10.size()), -1);
        }
        long j14 = j10 - j;
        Long valueOf = Long.valueOf(j14);
        int i10 = 0;
        if (this.g.f10045A && kVar != null) {
            z10 = false;
        }
        int c10 = D.c(h10, valueOf, z10);
        long j15 = c10 + j13;
        if (c10 >= 0) {
            V4.f fVar = (V4.f) h10.get(c10);
            long j16 = fVar.f10070e + fVar.f10068c;
            N6.H h11 = iVar.f10094s;
            N6.H h12 = j14 < j16 ? fVar.f10064A : h11;
            while (true) {
                if (i10 >= h12.size()) {
                    break;
                }
                V4.d dVar = (V4.d) h12.get(i10);
                if (j14 >= dVar.f10070e + dVar.f10068c) {
                    i10++;
                } else if (dVar.f10060z) {
                    j15 += h12 == h11 ? 1L : 0L;
                    r1 = i10;
                }
            }
        }
        return new Pair(Long.valueOf(j15), Integer.valueOf(r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [U4.e, R4.e] */
    public final e d(Uri uri, int i7, boolean z8) {
        if (uri == null) {
            return null;
        }
        R7.b bVar = this.j;
        byte[] bArr = (byte[]) ((d) bVar.f8929b).remove(uri);
        if (bArr != null) {
            return null;
        }
        y0 y0Var = y0.f7368u;
        Collections.emptyMap();
        C1619p c1619p = new C1619p(uri, 1, null, y0Var, 0L, -1L, null, 1);
        L l10 = this.f9535f[i7];
        int m10 = this.f9543q.m();
        Object q10 = this.f9543q.q();
        byte[] bArr2 = this.f9539m;
        ?? eVar = new R4.e(this.f9532c, c1619p, 3, l10, m10, q10, -9223372036854775807L, -9223372036854775807L);
        if (bArr2 == null) {
            bArr2 = D.f21146f;
        }
        eVar.f9521x = bArr2;
        return eVar;
    }
}
