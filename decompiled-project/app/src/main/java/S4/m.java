package S4;

import A9.O;
import N6.H;
import P4.C0454b;
import Y5.B;
import android.os.SystemClock;
import i2.C1312U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import k5.s;
import m4.E0;
import m4.L;
import m5.C1599C;
import m5.InterfaceC1616m;
import m5.K;
import n5.D;
import s4.C1978f;
import s4.InterfaceC1982j;

/* loaded from: classes.dex */
public final class m implements R4.h {

    /* renamed from: a, reason: collision with root package name */
    public final K f9137a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.i f9138b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f9139c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9140d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1616m f9141e;

    /* renamed from: f, reason: collision with root package name */
    public final long f9142f;
    public final p g;

    /* renamed from: h, reason: collision with root package name */
    public final k[] f9143h;

    /* renamed from: i, reason: collision with root package name */
    public s f9144i;
    public T4.c j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public C0454b f9145l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9146m;

    public m(K k, T4.c cVar, q3.i iVar, int i7, int[] iArr, s sVar, int i10, InterfaceC1616m interfaceC1616m, long j, boolean z8, ArrayList arrayList, p pVar) {
        InterfaceC1982j nVar;
        L l10;
        R4.d dVar;
        this.f9137a = k;
        this.j = cVar;
        this.f9138b = iVar;
        this.f9139c = iArr;
        this.f9144i = sVar;
        this.f9140d = i10;
        this.f9141e = interfaceC1616m;
        this.k = i7;
        this.f9142f = j;
        this.g = pVar;
        long d10 = cVar.d(i7);
        ArrayList h10 = h();
        this.f9143h = new k[sVar.length()];
        int i11 = 0;
        int i12 = 0;
        while (i12 < this.f9143h.length) {
            T4.m mVar = (T4.m) h10.get(sVar.f(i12));
            T4.b K10 = iVar.K(mVar.f9293b);
            k[] kVarArr = this.f9143h;
            T4.b bVar = K10 == null ? (T4.b) mVar.f9293b.get(i11) : K10;
            L l11 = mVar.f9292a;
            String str = l11.f20095y;
            if (n5.o.k(str)) {
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    l10 = l11;
                    nVar = new y4.d(1);
                } else {
                    l10 = l11;
                    nVar = new A4.n(z8 ? 4 : 0, null, null, arrayList, pVar);
                }
                dVar = new R4.d(nVar, i10, l10);
            }
            int i13 = i12;
            kVarArr[i13] = new k(d10, mVar, bVar, dVar, 0L, mVar.d());
            i12 = i13 + 1;
            i11 = 0;
        }
    }

    @Override // R4.h
    public final void a() {
        C0454b c0454b = this.f9145l;
        if (c0454b != null) {
            throw c0454b;
        }
        this.f9137a.a();
    }

    @Override // R4.h
    public final void b(R4.e eVar) {
        if (eVar instanceof R4.j) {
            int s3 = this.f9144i.s(((R4.j) eVar).f8872d);
            k[] kVarArr = this.f9143h;
            k kVar = kVarArr[s3];
            if (((i) kVar.g) == null) {
                R4.d dVar = (R4.d) kVar.f9132d;
                s4.s sVar = dVar.f8867v;
                C1978f c1978f = sVar instanceof C1978f ? (C1978f) sVar : null;
                if (c1978f != null) {
                    T4.m mVar = (T4.m) kVar.f9133e;
                    kVarArr[s3] = new k(kVar.f9130b, mVar, (T4.b) kVar.f9134f, dVar, kVar.f9131c, new A4.f(c1978f, 2, mVar.f9294c));
                }
            }
        }
        p pVar = this.g;
        if (pVar != null) {
            long j = pVar.f9160d;
            if (j == -9223372036854775807L || eVar.f8876v > j) {
                pVar.f9160d = eVar.f8876v;
            }
            pVar.f9161e.f9168u = true;
        }
    }

    @Override // R4.h
    public final long c(long j, E0 e02) {
        for (k kVar : this.f9143h) {
            i iVar = (i) kVar.g;
            if (iVar != null) {
                long j10 = kVar.f9130b;
                long y10 = iVar.y(j10);
                if (y10 != 0) {
                    i iVar2 = (i) kVar.g;
                    long c10 = iVar2.c(j, j10);
                    long j11 = kVar.f9131c;
                    long j12 = c10 + j11;
                    long d10 = kVar.d(j12);
                    return e02.a(j, d10, (d10 >= j || (y10 != -1 && j12 >= ((iVar2.v() + j11) + y10) - 1)) ? d10 : kVar.d(j12 + 1));
                }
            }
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0250  */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.IOException, P4.b] */
    @Override // R4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j, long j10, List list, O o10) {
        int i7;
        R4.k kVar;
        k[] kVarArr;
        long j11;
        long j12;
        i iVar;
        R4.d dVar;
        long j13;
        long j14;
        long j15;
        long j16;
        Object iVar2;
        O o11;
        T4.j a9;
        T4.b bVar;
        int i10;
        int i11;
        boolean z8;
        if (this.f9145l != null) {
            return;
        }
        long j17 = j10 - j;
        long M3 = D.M(this.j.b(this.k).f9277b) + D.M(this.j.f9247a) + j10;
        p pVar = this.g;
        if (pVar != null) {
            q qVar = pVar.f9161e;
            T4.c cVar = qVar.f9167f;
            if (!cVar.f9250d) {
                z8 = false;
            } else if (qVar.f9169v) {
                z8 = true;
            } else {
                Map.Entry ceilingEntry = qVar.f9166e.ceilingEntry(Long.valueOf(cVar.f9253h));
                f fVar = qVar.f9163b;
                if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= M3) {
                    z8 = false;
                } else {
                    long longValue = ((Long) ceilingEntry.getKey()).longValue();
                    h hVar = fVar.f9092a;
                    long j18 = hVar.f9121c0;
                    if (j18 == -9223372036854775807L || j18 < longValue) {
                        hVar.f9121c0 = longValue;
                    }
                    z8 = true;
                }
                if (z8 && qVar.f9168u) {
                    qVar.f9169v = true;
                    qVar.f9168u = false;
                    h hVar2 = fVar.f9092a;
                    hVar2.f9111S.removeCallbacks(hVar2.L);
                    hVar2.z();
                }
            }
            if (z8) {
                return;
            }
        }
        long M10 = D.M(D.x(this.f9142f));
        T4.c cVar2 = this.j;
        long j19 = cVar2.f9247a;
        long M11 = j19 == -9223372036854775807L ? -9223372036854775807L : M10 - D.M(j19 + cVar2.b(this.k).f9277b);
        if (list.isEmpty()) {
            kVar = null;
            i7 = 1;
        } else {
            i7 = 1;
            kVar = (R4.k) list.get(list.size() - 1);
        }
        int length = this.f9144i.length();
        R4.l[] lVarArr = new R4.l[length];
        int i12 = 0;
        while (true) {
            kVarArr = this.f9143h;
            if (i12 >= length) {
                break;
            }
            k kVar2 = kVarArr[i12];
            i iVar3 = (i) kVar2.g;
            U9.i iVar4 = R4.l.j;
            if (iVar3 == null) {
                lVarArr[i12] = iVar4;
                i11 = length;
            } else {
                i11 = length;
                long j20 = kVar2.f9130b;
                long l10 = iVar3.l(j20, M10);
                long j21 = kVar2.f9131c;
                long j22 = l10 + j21;
                long b2 = kVar2.b(M10);
                long a10 = kVar != null ? kVar.a() : D.j(((i) kVar2.g).c(j10, j20) + j21, j22, b2);
                if (a10 < j22) {
                    lVarArr[i12] = iVar4;
                } else {
                    lVarArr[i12] = new l(i(i12), a10, b2);
                }
            }
            i12++;
            length = i11;
        }
        long j23 = 0;
        if (this.j.f9250d) {
            k kVar3 = kVarArr[0];
            if (((i) kVar3.g).y(kVar3.f9130b) != 0) {
                long c10 = kVarArr[0].c(kVarArr[0].b(M10));
                T4.c cVar3 = this.j;
                long j24 = cVar3.f9247a;
                long M12 = j24 == -9223372036854775807L ? -9223372036854775807L : M10 - D.M(j24 + cVar3.b(this.k).f9277b);
                j23 = 0;
                j11 = Math.max(0L, Math.min(M12, c10) - j);
                j12 = j23;
                int i13 = i7;
                this.f9144i.b(j, j17, j11, list, lVarArr);
                k i14 = i(this.f9144i.n());
                iVar = (i) i14.g;
                T4.b bVar2 = (T4.b) i14.f9134f;
                dVar = (R4.d) i14.f9132d;
                T4.m mVar = (T4.m) i14.f9133e;
                if (dVar != null) {
                    T4.j jVar = dVar.f8868w == null ? mVar.f9296e : null;
                    T4.j e2 = iVar == null ? mVar.e() : null;
                    if (jVar != null || e2 != null) {
                        L l11 = this.f9144i.l();
                        int m10 = this.f9144i.m();
                        Object q10 = this.f9144i.q();
                        if (jVar != null) {
                            T4.j a11 = jVar.a(e2, bVar2.f9243a);
                            if (a11 != null) {
                                jVar = a11;
                            }
                        } else {
                            jVar = e2;
                        }
                        o10.f921b = new R4.j(this.f9141e, Y6.b.f(mVar, bVar2.f9243a, jVar, 0), l11, m10, q10, (R4.d) i14.f9132d);
                        return;
                    }
                }
                T4.c cVar4 = this.j;
                int i15 = (cVar4.f9250d || this.k != cVar4.f9256m.size() - i13) ? 0 : i13;
                j13 = i14.f9130b;
                boolean z10 = (i15 == 0 && j13 == -9223372036854775807L) ? 0 : i13;
                if (iVar.y(j13) != j12) {
                    o10.f920a = z10;
                    return;
                }
                long l12 = iVar.l(j13, M10);
                long j25 = i14.f9131c;
                long j26 = l12 + j25;
                long b10 = i14.b(M10);
                boolean z11 = z10;
                if (i15 != 0) {
                    long c11 = i14.c(b10);
                    z11 = (z10 ? 1 : 0) & ((c11 - i14.d(b10)) + c11 >= j13 ? (char) 1 : (char) 0);
                }
                if (kVar != null) {
                    j15 = kVar.a();
                    j14 = j13;
                } else {
                    j14 = j13;
                    j15 = D.j(iVar.c(j10, j14) + j25, j26, b10);
                }
                if (j15 < j26) {
                    this.f9145l = new IOException();
                    return;
                }
                if (j15 > b10 || (this.f9146m && j15 >= b10)) {
                    o10.f920a = z11;
                    return;
                }
                if (z11 && i14.d(j15) >= j14) {
                    o10.f920a = true;
                    return;
                }
                int min = (int) Math.min(1, (b10 - j15) + 1);
                if (j14 != -9223372036854775807L) {
                    while (min > 1 && i14.d((min + j15) - 1) >= j14) {
                        min--;
                    }
                }
                long j27 = list.isEmpty() ? j10 : -9223372036854775807L;
                L l13 = this.f9144i.l();
                int m11 = this.f9144i.m();
                Object q11 = this.f9144i.q();
                long d10 = i14.d(j15);
                T4.j p10 = iVar.p(j15 - j25);
                InterfaceC1616m interfaceC1616m = this.f9141e;
                if (dVar == null) {
                    long c12 = i14.c(j15);
                    if (iVar.s() || M11 == -9223372036854775807L || i14.c(j15) <= M11) {
                        bVar = bVar2;
                        i10 = 0;
                    } else {
                        bVar = bVar2;
                        i10 = 8;
                    }
                    iVar2 = new R4.m(interfaceC1616m, Y6.b.f(mVar, bVar.f9243a, p10, i10), l13, m11, q11, d10, c12, j15, this.f9140d, l13);
                    o11 = o10;
                } else {
                    T4.j jVar2 = p10;
                    int i16 = 1;
                    int i17 = 1;
                    while (true) {
                        j16 = j14;
                        if (i17 >= min || (a9 = jVar2.a(iVar.p((i17 + j15) - j25), bVar2.f9243a)) == null) {
                            break;
                        }
                        i16++;
                        i17++;
                        jVar2 = a9;
                        j14 = j16;
                    }
                    long j28 = (i16 + j15) - 1;
                    long c13 = i14.c(j28);
                    iVar2 = new R4.i(interfaceC1616m, Y6.b.f(mVar, bVar2.f9243a, jVar2, iVar.s() || (M11 > (-9223372036854775807L) ? 1 : (M11 == (-9223372036854775807L) ? 0 : -1)) == 0 || (i14.c(j28) > M11 ? 1 : (i14.c(j28) == M11 ? 0 : -1)) <= 0 ? 0 : 8), l13, m11, q11, d10, c13, j27, (j14 == -9223372036854775807L || j16 > c13) ? -9223372036854775807L : j16, j15, i16, -mVar.f9294c, (R4.d) i14.f9132d);
                    o11 = o10;
                }
                o11.f921b = iVar2;
                return;
            }
        }
        j11 = -9223372036854775807L;
        j12 = j23;
        int i132 = i7;
        this.f9144i.b(j, j17, j11, list, lVarArr);
        k i142 = i(this.f9144i.n());
        iVar = (i) i142.g;
        T4.b bVar22 = (T4.b) i142.f9134f;
        dVar = (R4.d) i142.f9132d;
        T4.m mVar2 = (T4.m) i142.f9133e;
        if (dVar != null) {
        }
        T4.c cVar42 = this.j;
        if (cVar42.f9250d) {
        }
        j13 = i142.f9130b;
        if (i15 == 0) {
        }
        if (iVar.y(j13) != j12) {
        }
    }

    @Override // R4.h
    public final boolean e(R4.e eVar, boolean z8, A7.a aVar, B b2) {
        long j;
        if (!z8) {
            return false;
        }
        p pVar = this.g;
        if (pVar != null) {
            long j10 = pVar.f9160d;
            boolean z10 = j10 != -9223372036854775807L && j10 < eVar.f8875u;
            q qVar = pVar.f9161e;
            if (qVar.f9167f.f9250d) {
                if (!qVar.f9169v) {
                    if (z10) {
                        if (qVar.f9168u) {
                            qVar.f9169v = true;
                            qVar.f9168u = false;
                            h hVar = qVar.f9163b.f9092a;
                            hVar.f9111S.removeCallbacks(hVar.L);
                            hVar.z();
                        }
                    }
                }
                return true;
            }
        }
        boolean z11 = this.j.f9250d;
        k[] kVarArr = this.f9143h;
        if (!z11 && (eVar instanceof R4.k)) {
            IOException iOException = (IOException) aVar.f532b;
            if ((iOException instanceof C1599C) && ((C1599C) iOException).f20535d == 404) {
                k kVar = kVarArr[this.f9144i.s(eVar.f8872d)];
                long y10 = ((i) kVar.g).y(kVar.f9130b);
                if (y10 != -1 && y10 != 0) {
                    if (((R4.k) eVar).a() > ((((i) kVar.g).v() + kVar.f9131c) + y10) - 1) {
                        this.f9146m = true;
                        return true;
                    }
                }
            }
        }
        k kVar2 = kVarArr[this.f9144i.s(eVar.f8872d)];
        H h10 = ((T4.m) kVar2.f9133e).f9293b;
        q3.i iVar = this.f9138b;
        T4.b K10 = iVar.K(h10);
        T4.b bVar = (T4.b) kVar2.f9134f;
        if (K10 != null && !bVar.equals(K10)) {
            return true;
        }
        s sVar = this.f9144i;
        H h11 = ((T4.m) kVar2.f9133e).f9293b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = sVar.length();
        int i7 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (sVar.c(i10, elapsedRealtime)) {
                i7++;
            }
        }
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < h11.size(); i11++) {
            hashSet.add(Integer.valueOf(((T4.b) h11.get(i11)).f9245c));
        }
        int size = hashSet.size();
        HashSet hashSet2 = new HashSet();
        ArrayList j11 = iVar.j(h11);
        for (int i12 = 0; i12 < j11.size(); i12++) {
            hashSet2.add(Integer.valueOf(((T4.b) j11.get(i12)).f9245c));
        }
        C1312U c1312u = new C1312U(size, size - hashSet2.size(), length, i7);
        if (!c1312u.b(2) && !c1312u.b(1)) {
            return false;
        }
        b2.getClass();
        D4.e c10 = B.c(c1312u, aVar);
        if (c10 != null) {
            int i13 = c10.f3224a;
            if (c1312u.b(i13)) {
                long j12 = c10.f3225b;
                if (i13 == 2) {
                    s sVar2 = this.f9144i;
                    return sVar2.o(sVar2.s(eVar.f8872d), j12);
                }
                if (i13 != 1) {
                    return false;
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j12;
                String str = bVar.f9244b;
                HashMap hashMap = (HashMap) iVar.f23382a;
                if (hashMap.containsKey(str)) {
                    Long l10 = (Long) hashMap.get(str);
                    int i14 = D.f21141a;
                    j = Math.max(elapsedRealtime2, l10.longValue());
                } else {
                    j = elapsedRealtime2;
                }
                hashMap.put(str, Long.valueOf(j));
                int i15 = bVar.f9245c;
                if (i15 == Integer.MIN_VALUE) {
                    return true;
                }
                Integer valueOf = Integer.valueOf(i15);
                HashMap hashMap2 = (HashMap) iVar.f23383b;
                if (hashMap2.containsKey(valueOf)) {
                    Long l11 = (Long) hashMap2.get(valueOf);
                    int i16 = D.f21141a;
                    elapsedRealtime2 = Math.max(elapsedRealtime2, l11.longValue());
                }
                hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                return true;
            }
        }
        return false;
    }

    @Override // R4.h
    public final int f(long j, List list) {
        return (this.f9145l != null || this.f9144i.length() < 2) ? list.size() : this.f9144i.g(j, list);
    }

    @Override // R4.h
    public final boolean g(long j, R4.e eVar, List list) {
        if (this.f9145l != null) {
            return false;
        }
        return this.f9144i.h(j, eVar, list);
    }

    public final ArrayList h() {
        List list = this.j.b(this.k).f9278c;
        ArrayList arrayList = new ArrayList();
        for (int i7 : this.f9139c) {
            arrayList.addAll(((T4.a) list.get(i7)).f9239c);
        }
        return arrayList;
    }

    public final k i(int i7) {
        k[] kVarArr = this.f9143h;
        k kVar = kVarArr[i7];
        T4.b K10 = this.f9138b.K(((T4.m) kVar.f9133e).f9293b);
        if (K10 == null || K10.equals((T4.b) kVar.f9134f)) {
            return kVar;
        }
        k kVar2 = new k(kVar.f9130b, (T4.m) kVar.f9133e, K10, (R4.d) kVar.f9132d, kVar.f9131c, (i) kVar.g);
        kVarArr[i7] = kVar2;
        return kVar2;
    }

    @Override // R4.h
    public final void release() {
        for (k kVar : this.f9143h) {
            R4.d dVar = (R4.d) kVar.f9132d;
            if (dVar != null) {
                dVar.f8860a.release();
            }
        }
    }
}
