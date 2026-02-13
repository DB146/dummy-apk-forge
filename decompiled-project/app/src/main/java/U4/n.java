package U4;

import P4.d0;
import h3.H;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import m4.L;
import n5.AbstractC1705a;
import n5.D;
import y.S;

/* loaded from: classes.dex */
public final class n implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9610a;

    /* renamed from: b, reason: collision with root package name */
    public final r f9611b;

    /* renamed from: c, reason: collision with root package name */
    public int f9612c = -1;

    public n(r rVar, int i7) {
        this.f9611b = rVar;
        this.f9610a = i7;
    }

    @Override // P4.d0
    public final void a() {
        int i7 = this.f9612c;
        r rVar = this.f9611b;
        if (i7 == -2) {
            rVar.a();
            throw new IOException(S.b("Unable to bind a sample queue to TrackGroup with MIME type ", rVar.f9645W.a(this.f9610a).f8109d[0].f20096z, "."));
        }
        if (i7 == -1) {
            rVar.E();
        } else if (i7 != -3) {
            rVar.E();
            rVar.f9633J[i7].v();
        }
    }

    @Override // P4.d0
    public final boolean b() {
        if (this.f9612c != -3) {
            if (d()) {
                int i7 = this.f9612c;
                r rVar = this.f9611b;
                if (rVar.C() || !rVar.f9633J[i7].t(rVar.f9662h0)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void c() {
        AbstractC1705a.h(this.f9612c == -1);
        r rVar = this.f9611b;
        rVar.a();
        rVar.f9647Y.getClass();
        int[] iArr = rVar.f9647Y;
        int i7 = this.f9610a;
        int i10 = iArr[i7];
        if (i10 == -1) {
            if (rVar.f9646X.contains(rVar.f9645W.a(i7))) {
                i10 = -3;
            }
            i10 = -2;
        } else {
            boolean[] zArr = rVar.f9652b0;
            if (!zArr[i10]) {
                zArr[i10] = true;
            }
            i10 = -2;
        }
        this.f9612c = i10;
    }

    public final boolean d() {
        int i7 = this.f9612c;
        return (i7 == -1 || i7 == -3 || i7 == -2) ? false : true;
    }

    @Override // P4.d0
    public final int f(ha.g gVar, q4.g gVar2, int i7) {
        L l10;
        L l11;
        int i10 = -3;
        if (this.f9612c == -3) {
            gVar2.a(4);
            return -4;
        }
        if (d()) {
            int i11 = this.f9612c;
            r rVar = this.f9611b;
            if (!rVar.C()) {
                ArrayList arrayList = rVar.f9625B;
                int i12 = 0;
                if (!arrayList.isEmpty()) {
                    int i13 = 0;
                    loop0: while (i13 < arrayList.size() - 1) {
                        int i14 = ((k) arrayList.get(i13)).f9572y;
                        int length = rVar.f9633J.length;
                        for (int i15 = 0; i15 < length; i15++) {
                            if (rVar.f9652b0[i15] && rVar.f9633J[i15].x() == i14) {
                                break loop0;
                            }
                        }
                        i13++;
                    }
                    D.R(arrayList, 0, i13);
                    k kVar = (k) arrayList.get(0);
                    L l12 = kVar.f8872d;
                    if (l12.equals(rVar.f9643U)) {
                        l11 = l12;
                    } else {
                        A4.s sVar = rVar.f9671y;
                        Object obj = kVar.f8874f;
                        long j = kVar.f8875u;
                        int i16 = rVar.f9651b;
                        int i17 = kVar.f8873e;
                        l11 = l12;
                        sVar.i(i16, l12, i17, obj, j);
                    }
                    rVar.f9643U = l11;
                }
                if ((arrayList.isEmpty() || ((k) arrayList.get(0)).f9571Y) && (i10 = rVar.f9633J[i11].y(gVar, gVar2, i7, rVar.f9662h0)) == -5) {
                    L l13 = (L) gVar.f17916c;
                    l13.getClass();
                    if (i11 == rVar.f9638P) {
                        int f4 = H.f(rVar.f9633J[i11].x());
                        while (i12 < arrayList.size() && ((k) arrayList.get(i12)).f9572y != f4) {
                            i12++;
                        }
                        if (i12 < arrayList.size()) {
                            l10 = ((k) arrayList.get(i12)).f8872d;
                        } else {
                            l10 = rVar.f9642T;
                            l10.getClass();
                        }
                        l13 = l13.d(l10);
                    }
                    gVar.f17916c = l13;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
    
        if (r6.hasNext() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        r2 = r6.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r6.hasNext() != false) goto L25;
     */
    @Override // P4.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(long j) {
        if (!d()) {
            return 0;
        }
        int i7 = this.f9612c;
        r rVar = this.f9611b;
        if (rVar.C()) {
            return 0;
        }
        q qVar = rVar.f9633J[i7];
        int q10 = qVar.q(j, rVar.f9662h0);
        ArrayList arrayList = rVar.f9625B;
        Object obj = null;
        if (arrayList == null) {
            Iterator it = arrayList.iterator();
        } else if (!arrayList.isEmpty()) {
            obj = h3.o.k(1, arrayList);
        }
        k kVar = (k) obj;
        if (kVar != null && !kVar.f9571Y) {
            q10 = Math.min(q10, kVar.g(i7) - qVar.o());
        }
        qVar.C(q10);
        return q10;
    }
}
