package H0;

import A0.AbstractC0017g;
import A0.InterfaceC0024m;
import A0.L;
import A0.n0;
import Eb.v;
import java.util.ArrayList;
import java.util.List;
import u.C2046I;
import y0.AbstractC2328M;
import y7.u0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    public final c0.l f4502a;

    /* renamed from: b */
    public final boolean f4503b;

    /* renamed from: c */
    public final L f4504c;

    /* renamed from: d */
    public final i f4505d;

    /* renamed from: e */
    public boolean f4506e;

    /* renamed from: f */
    public n f4507f;
    public final int g;

    public n(c0.l lVar, boolean z8, L l10, i iVar) {
        this.f4502a = lVar;
        this.f4503b = z8;
        this.f4504c = l10;
        this.f4505d = iVar;
        this.g = l10.f70b;
    }

    public static /* synthetic */ List h(int i7, n nVar) {
        return nVar.g((i7 & 1) != 0 ? !nVar.f4503b : false, (i7 & 2) == 0);
    }

    public final n a(f fVar, Rb.c cVar) {
        i iVar = new i();
        iVar.f4496c = false;
        iVar.f4497d = false;
        cVar.invoke(iVar);
        n nVar = new n(new m(cVar), false, new L(this.g + (fVar != null ? 1000000000 : 2000000000), true), iVar);
        nVar.f4506e = true;
        nVar.f4507f = this;
        return nVar;
    }

    public final void b(L l10, ArrayList arrayList) {
        S.e w10 = l10.w();
        Object[] objArr = w10.f8959a;
        int i7 = w10.f8961c;
        for (int i10 = 0; i10 < i7; i10++) {
            L l11 = (L) objArr[i10];
            if (l11.F() && !l11.f73c0) {
                if (l11.f60S.d(8)) {
                    arrayList.add(u0.e(l11, this.f4503b));
                } else {
                    b(l11, arrayList);
                }
            }
        }
    }

    public final n0 c() {
        if (this.f4506e) {
            n j = j();
            if (j != null) {
                return j.c();
            }
            return null;
        }
        InterfaceC0024m t5 = u0.t(this.f4504c);
        if (t5 == null) {
            t5 = this.f4502a;
        }
        return AbstractC0017g.r(t5, 8);
    }

    public final void d(ArrayList arrayList, ArrayList arrayList2) {
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (nVar.l()) {
                arrayList2.add(nVar);
            } else if (!nVar.f4505d.f4497d) {
                nVar.d(arrayList, arrayList2);
            }
        }
    }

    public final i0.c e() {
        n0 c10 = c();
        if (c10 != null) {
            if (!c10.t0().f14112B) {
                c10 = null;
            }
            if (c10 != null) {
                return AbstractC2328M.g(c10).x(c10, true);
            }
        }
        return i0.c.f18173e;
    }

    public final i0.c f() {
        n0 c10 = c();
        if (c10 != null) {
            if (!c10.t0().f14112B) {
                c10 = null;
            }
            if (c10 != null) {
                return AbstractC2328M.e(c10);
            }
        }
        return i0.c.f18173e;
    }

    public final List g(boolean z8, boolean z10) {
        if (!z8 && this.f4505d.f4497d) {
            return v.f3891a;
        }
        ArrayList arrayList = new ArrayList();
        if (!l()) {
            return o(arrayList, z10);
        }
        ArrayList arrayList2 = new ArrayList();
        d(arrayList, arrayList2);
        return arrayList2;
    }

    public final i i() {
        boolean l10 = l();
        i iVar = this.f4505d;
        if (!l10) {
            return iVar;
        }
        i o10 = iVar.o();
        n(new ArrayList(), o10);
        return o10;
    }

    public final n j() {
        L l10;
        n nVar = this.f4507f;
        if (nVar != null) {
            return nVar;
        }
        L l11 = this.f4504c;
        boolean z8 = this.f4503b;
        if (z8) {
            l10 = l11.t();
            while (l10 != null) {
                i v10 = l10.v();
                if (v10 != null && v10.f4496c) {
                    break;
                }
                l10 = l10.t();
            }
        }
        l10 = null;
        if (l10 == null) {
            L t5 = l11.t();
            while (true) {
                if (t5 == null) {
                    l10 = null;
                    break;
                }
                if (t5.f60S.d(8)) {
                    l10 = t5;
                    break;
                }
                t5 = t5.t();
            }
        }
        if (l10 == null) {
            return null;
        }
        return u0.e(l10, z8);
    }

    public final i k() {
        return this.f4505d;
    }

    public final boolean l() {
        return this.f4503b && this.f4505d.f4496c;
    }

    public final boolean m() {
        if (!this.f4506e && h(4, this).isEmpty()) {
            L t5 = this.f4504c.t();
            while (true) {
                if (t5 == null) {
                    t5 = null;
                    break;
                }
                i v10 = t5.v();
                if (v10 != null && v10.f4496c) {
                    break;
                }
                t5 = t5.t();
            }
            if (t5 == null) {
                return true;
            }
        }
        return false;
    }

    public final void n(ArrayList arrayList, i iVar) {
        if (this.f4505d.f4497d) {
            return;
        }
        o(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (!nVar.l()) {
                iVar.y(nVar.f4505d);
                nVar.n(arrayList, iVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [Rb.c, kotlin.jvm.internal.m] */
    public final List o(ArrayList arrayList, boolean z8) {
        if (this.f4506e) {
            return v.f3891a;
        }
        b(this.f4504c, arrayList);
        if (z8) {
            t tVar = q.f4557v;
            i iVar = this.f4505d;
            C2046I c2046i = iVar.f4494a;
            Object g = c2046i.g(tVar);
            if (g == null) {
                g = null;
            }
            f fVar = (f) g;
            if (fVar != null && iVar.f4496c && !arrayList.isEmpty()) {
                arrayList.add(a(fVar, new kotlin.jvm.internal.m(1)));
            }
            t tVar2 = q.f4539a;
            if (c2046i.c(tVar2) && !arrayList.isEmpty() && iVar.f4496c) {
                Object g2 = c2046i.g(tVar2);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) Eb.o.Z(list) : null;
                if (str != null) {
                    arrayList.add(0, a(null, new l(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
