package Y4;

import A4.n;
import A4.v;
import A4.w;
import A9.O;
import N6.y0;
import P4.C0454b;
import R4.d;
import R4.e;
import R4.h;
import R4.i;
import R4.k;
import R4.l;
import Y5.B;
import Z9.x;
import android.net.Uri;
import i2.C1312U;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k5.s;
import m4.E0;
import m4.L;
import m5.C1619p;
import m5.InterfaceC1616m;
import m5.K;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final K f11153a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11154b;

    /* renamed from: c, reason: collision with root package name */
    public final d[] f11155c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1616m f11156d;

    /* renamed from: e, reason: collision with root package name */
    public s f11157e;

    /* renamed from: f, reason: collision with root package name */
    public Z4.c f11158f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public C0454b f11159h;

    public a(K k, Z4.c cVar, int i7, s sVar, InterfaceC1616m interfaceC1616m) {
        w[] wVarArr;
        this.f11153a = k;
        this.f11158f = cVar;
        this.f11154b = i7;
        this.f11157e = sVar;
        this.f11156d = interfaceC1616m;
        Z4.b bVar = cVar.f12170f[i7];
        this.f11155c = new d[sVar.length()];
        for (int i10 = 0; i10 < this.f11155c.length; i10++) {
            int f4 = sVar.f(i10);
            L l10 = bVar.j[f4];
            if (l10.f20066C != null) {
                Z4.a aVar = cVar.f12169e;
                aVar.getClass();
                wVarArr = aVar.f12151c;
            } else {
                wVarArr = null;
            }
            w[] wVarArr2 = wVarArr;
            int i11 = bVar.f12152a;
            this.f11155c[i10] = new d(new n(3, null, new v(f4, i11, bVar.f12154c, -9223372036854775807L, cVar.g, l10, 0, wVarArr2, i11 == 2 ? 4 : 0, null, null), Collections.emptyList(), null), bVar.f12152a, l10);
        }
    }

    @Override // R4.h
    public final void a() {
        C0454b c0454b = this.f11159h;
        if (c0454b != null) {
            throw c0454b;
        }
        this.f11153a.a();
    }

    @Override // R4.h
    public final void b(e eVar) {
    }

    @Override // R4.h
    public final long c(long j, E0 e02) {
        Z4.b bVar = this.f11158f.f12170f[this.f11154b];
        int e2 = D.e(bVar.f12163o, j, true);
        long[] jArr = bVar.f12163o;
        long j10 = jArr[e2];
        return e02.a(j, j10, (j10 >= j || e2 >= bVar.k - 1) ? j10 : jArr[e2 + 1]);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.IOException, P4.b] */
    @Override // R4.h
    public final void d(long j, long j10, List list, O o10) {
        int a9;
        long b2;
        if (this.f11159h != null) {
            return;
        }
        Z4.b[] bVarArr = this.f11158f.f12170f;
        int i7 = this.f11154b;
        Z4.b bVar = bVarArr[i7];
        if (bVar.k == 0) {
            o10.f920a = !r4.f12168d;
            return;
        }
        boolean isEmpty = list.isEmpty();
        long[] jArr = bVar.f12163o;
        if (isEmpty) {
            a9 = D.e(jArr, j10, true);
        } else {
            a9 = (int) (((k) list.get(list.size() - 1)).a() - this.g);
            if (a9 < 0) {
                this.f11159h = new IOException();
                return;
            }
        }
        if (a9 >= bVar.k) {
            o10.f920a = !this.f11158f.f12168d;
            return;
        }
        long j11 = j10 - j;
        Z4.c cVar = this.f11158f;
        if (cVar.f12168d) {
            Z4.b bVar2 = cVar.f12170f[i7];
            int i10 = bVar2.k - 1;
            b2 = (bVar2.b(i10) + bVar2.f12163o[i10]) - j;
        } else {
            b2 = -9223372036854775807L;
        }
        int length = this.f11157e.length();
        l[] lVarArr = new l[length];
        for (int i11 = 0; i11 < length; i11++) {
            this.f11157e.f(i11);
            lVarArr[i11] = new S4.l(bVar, a9);
        }
        this.f11157e.b(j, j11, b2, list, lVarArr);
        long j12 = jArr[a9];
        long b10 = bVar.b(a9) + j12;
        long j13 = list.isEmpty() ? j10 : -9223372036854775807L;
        int i12 = this.g + a9;
        int n6 = this.f11157e.n();
        d dVar = this.f11155c[n6];
        int f4 = this.f11157e.f(n6);
        L[] lArr = bVar.j;
        AbstractC1705a.m(lArr != null);
        ArrayList arrayList = bVar.f12162n;
        AbstractC1705a.m(arrayList != null);
        AbstractC1705a.m(a9 < arrayList.size());
        String num = Integer.toString(lArr[f4].f20092v);
        String l10 = ((Long) arrayList.get(a9)).toString();
        Uri O10 = AbstractC1705a.O(bVar.f12160l, bVar.f12161m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l10).replace("{start_time}", l10));
        L l11 = this.f11157e.l();
        int m10 = this.f11157e.m();
        Object q10 = this.f11157e.q();
        y0 y0Var = y0.f7368u;
        Collections.emptyMap();
        AbstractC1705a.o(O10, "The uri must be set.");
        o10.f921b = new i(this.f11156d, new C1619p(O10, 1, null, y0Var, 0L, -1L, null, 0), l11, m10, q10, j12, b10, j13, -9223372036854775807L, i12, 1, j12, dVar);
    }

    @Override // R4.h
    public final boolean e(e eVar, boolean z8, A7.a aVar, B b2) {
        C1312U i7 = x.i(this.f11157e);
        b2.getClass();
        D4.e c10 = B.c(i7, aVar);
        if (z8 && c10 != null && c10.f3224a == 2) {
            s sVar = this.f11157e;
            if (sVar.o(sVar.s(eVar.f8872d), c10.f3225b)) {
                return true;
            }
        }
        return false;
    }

    @Override // R4.h
    public final int f(long j, List list) {
        return (this.f11159h != null || this.f11157e.length() < 2) ? list.size() : this.f11157e.g(j, list);
    }

    @Override // R4.h
    public final boolean g(long j, e eVar, List list) {
        if (this.f11159h != null) {
            return false;
        }
        return this.f11157e.h(j, eVar, list);
    }

    @Override // R4.h
    public final void release() {
        for (d dVar : this.f11155c) {
            dVar.f8860a.release();
        }
    }
}
