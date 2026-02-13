package e1;

import Y5.C0656w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static int f16693f;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f16694a;

    /* renamed from: b, reason: collision with root package name */
    public int f16695b;

    /* renamed from: c, reason: collision with root package name */
    public int f16696c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f16697d;

    /* renamed from: e, reason: collision with root package name */
    public int f16698e;

    public final void a(ArrayList arrayList) {
        int size = this.f16694a.size();
        if (this.f16698e != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                n nVar = (n) arrayList.get(i7);
                if (this.f16698e == nVar.f16695b) {
                    c(this.f16696c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(b1.c cVar, int i7) {
        int n6;
        int n8;
        ArrayList arrayList = this.f16694a;
        if (arrayList.size() == 0) {
            return 0;
        }
        d1.e eVar = (d1.e) ((d1.d) arrayList.get(0)).f16358T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((d1.d) arrayList.get(i10)).b(cVar, false);
        }
        if (i7 == 0 && eVar.f16424z0 > 0) {
            d1.j.a(eVar, cVar, arrayList, 0);
        }
        if (i7 == 1 && eVar.f16404A0 > 0) {
            d1.j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e2) {
            System.err.println(e2.toString() + "\n" + Arrays.toString(e2.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f16697d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            d1.d dVar = (d1.d) arrayList.get(i11);
            C0656w c0656w = new C0656w(10);
            new WeakReference(dVar);
            b1.c.n(dVar.f16348I);
            b1.c.n(dVar.f16349J);
            b1.c.n(dVar.f16350K);
            b1.c.n(dVar.L);
            b1.c.n(dVar.f16351M);
            this.f16697d.add(c0656w);
        }
        if (i7 == 0) {
            n6 = b1.c.n(eVar.f16348I);
            n8 = b1.c.n(eVar.f16350K);
            cVar.t();
        } else {
            n6 = b1.c.n(eVar.f16349J);
            n8 = b1.c.n(eVar.L);
            cVar.t();
        }
        return n8 - n6;
    }

    public final void c(int i7, n nVar) {
        Iterator it = this.f16694a.iterator();
        while (it.hasNext()) {
            d1.d dVar = (d1.d) it.next();
            ArrayList arrayList = nVar.f16694a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i10 = nVar.f16695b;
            if (i7 == 0) {
                dVar.f16389n0 = i10;
            } else {
                dVar.f16391o0 = i10;
            }
        }
        this.f16698e = nVar.f16695b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i7 = this.f16696c;
        sb2.append(i7 == 0 ? "Horizontal" : i7 == 1 ? "Vertical" : i7 == 2 ? "Both" : "Unknown");
        sb2.append(" [");
        String k = A3.c.k(sb2, this.f16695b, "] <");
        Iterator it = this.f16694a.iterator();
        while (it.hasNext()) {
            d1.d dVar = (d1.d) it.next();
            StringBuilder n6 = A3.c.n(k, " ");
            n6.append(dVar.f16379h0);
            k = n6.toString();
        }
        return X.c.h(k, " >");
    }
}
