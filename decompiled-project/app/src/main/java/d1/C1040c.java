package d1;

import e1.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: d1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1040c {

    /* renamed from: b, reason: collision with root package name */
    public int f16333b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16334c;

    /* renamed from: d, reason: collision with root package name */
    public final d f16335d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16336e;

    /* renamed from: f, reason: collision with root package name */
    public C1040c f16337f;

    /* renamed from: i, reason: collision with root package name */
    public b1.f f16339i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f16332a = null;
    public int g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f16338h = Integer.MIN_VALUE;

    public C1040c(d dVar, int i7) {
        this.f16335d = dVar;
        this.f16336e = i7;
    }

    public final void a(C1040c c1040c, int i7) {
        b(c1040c, i7, Integer.MIN_VALUE, false);
    }

    public final boolean b(C1040c c1040c, int i7, int i10, boolean z8) {
        if (c1040c == null) {
            j();
            return true;
        }
        if (!z8 && !i(c1040c)) {
            return false;
        }
        this.f16337f = c1040c;
        if (c1040c.f16332a == null) {
            c1040c.f16332a = new HashSet();
        }
        HashSet hashSet = this.f16337f.f16332a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i7;
        this.f16338h = i10;
        return true;
    }

    public final void c(int i7, n nVar, ArrayList arrayList) {
        HashSet hashSet = this.f16332a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                e1.h.b(((C1040c) it.next()).f16335d, i7, arrayList, nVar);
            }
        }
    }

    public final int d() {
        if (this.f16334c) {
            return this.f16333b;
        }
        return 0;
    }

    public final int e() {
        C1040c c1040c;
        if (this.f16335d.f16377g0 == 8) {
            return 0;
        }
        int i7 = this.f16338h;
        return (i7 == Integer.MIN_VALUE || (c1040c = this.f16337f) == null || c1040c.f16335d.f16377g0 != 8) ? this.g : i7;
    }

    public final C1040c f() {
        int i7 = this.f16336e;
        int b2 = P.c.b(i7);
        d dVar = this.f16335d;
        switch (b2) {
            case 0:
            case 5:
            case 6:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return null;
            case 1:
                return dVar.f16350K;
            case 2:
                return dVar.L;
            case 3:
                return dVar.f16348I;
            case 4:
                return dVar.f16349J;
            default:
                throw new AssertionError(X.c.z(i7));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f16332a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C1040c) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f16337f != null;
    }

    public final boolean i(C1040c c1040c) {
        if (c1040c == null) {
            return false;
        }
        int i7 = this.f16336e;
        d dVar = c1040c.f16335d;
        int i10 = c1040c.f16336e;
        if (i10 == i7) {
            return i7 != 6 || (dVar.f16344E && this.f16335d.f16344E);
        }
        switch (P.c.b(i7)) {
            case 0:
            case 7:
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                return false;
            case 1:
            case 3:
                boolean z8 = i10 == 2 || i10 == 4;
                if (dVar instanceof h) {
                    return z8 || i10 == 8;
                }
                return z8;
            case 2:
            case 4:
                boolean z10 = i10 == 3 || i10 == 5;
                if (dVar instanceof h) {
                    return z10 || i10 == 9;
                }
                return z10;
            case 5:
                return (i10 == 2 || i10 == 4) ? false : true;
            case 6:
                return (i10 == 6 || i10 == 8 || i10 == 9) ? false : true;
            default:
                throw new AssertionError(X.c.z(i7));
        }
    }

    public final void j() {
        HashSet hashSet;
        C1040c c1040c = this.f16337f;
        if (c1040c != null && (hashSet = c1040c.f16332a) != null) {
            hashSet.remove(this);
            if (this.f16337f.f16332a.size() == 0) {
                this.f16337f.f16332a = null;
            }
        }
        this.f16332a = null;
        this.f16337f = null;
        this.g = 0;
        this.f16338h = Integer.MIN_VALUE;
        this.f16334c = false;
        this.f16333b = 0;
    }

    public final void k() {
        b1.f fVar = this.f16339i;
        if (fVar == null) {
            this.f16339i = new b1.f(1);
        } else {
            fVar.d();
        }
    }

    public final void l(int i7) {
        this.f16333b = i7;
        this.f16334c = true;
    }

    public final String toString() {
        return this.f16335d.f16379h0 + ":" + X.c.z(this.f16336e);
    }
}
