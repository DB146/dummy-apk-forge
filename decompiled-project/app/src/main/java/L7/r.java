package L7;

import I2.H;
import Y5.B0;
import Y5.BinderC0657w0;
import Y5.C0;
import Y5.C0621i;
import Y5.C0633m;
import Y5.I1;
import Y5.O1;
import android.database.Cursor;
import com.google.android.gms.common.internal.G;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class r implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6385b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6386c;

    public /* synthetic */ r(int i7, Object obj, Object obj2) {
        this.f6384a = i7;
        this.f6385b = obj;
        this.f6386c = obj2;
    }

    public r(I1 i12, O1 o12) {
        this.f6384a = 5;
        this.f6386c = o12;
        Objects.requireNonNull(i12);
        this.f6385b = i12;
    }

    public r(BinderC0657w0 binderC0657w0, O1 o12) {
        this.f6384a = 4;
        this.f6386c = o12;
        Objects.requireNonNull(binderC0657w0);
        this.f6385b = binderC0657w0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Q7.a d10;
        T7.s c10;
        switch (this.f6384a) {
            case 0:
                x xVar = (x) this.f6386c;
                Q7.f fVar = xVar.f6410b;
                C0385e c0385e = fVar.f8685a;
                z zVar = (z) this.f6385b;
                O7.g gVar = zVar.f6411a;
                C0385e c0385e2 = c0385e;
                T7.s sVar = null;
                boolean z8 = false;
                while (!gVar.isEmpty()) {
                    n nVar = (n) gVar.f7495a;
                    if (nVar != null) {
                        if (sVar == null) {
                            sVar = nVar.c(c0385e2);
                        }
                        z8 = z8 || nVar.f();
                    }
                    gVar = gVar.t(c0385e2.isEmpty() ? T7.c.b("") : c0385e2.C());
                    c0385e2 = c0385e2.F();
                }
                n nVar2 = (n) zVar.f6411a.o(c0385e);
                N7.a aVar = zVar.g;
                if (nVar2 == null) {
                    nVar2 = new n(aVar);
                    zVar.f6411a = zVar.f6411a.z(c0385e, nVar2);
                } else {
                    if (!z8) {
                        nVar2.f();
                    }
                    if (sVar == null) {
                        sVar = nVar2.c(C0385e.f6337d);
                    }
                }
                aVar.e();
                Q7.e eVar = fVar.f8686b;
                if (sVar != null) {
                    d10 = new Q7.a(new T7.m(sVar, eVar.f8684e), true, false);
                } else {
                    d10 = aVar.d(fVar);
                    if (!d10.f8669a) {
                        T7.s sVar2 = T7.k.f9348e;
                        for (Map.Entry entry : zVar.f6411a.D(c0385e).f7496b) {
                            n nVar3 = (n) ((O7.g) entry.getValue()).f7495a;
                            if (nVar3 != null && (c10 = nVar3.c(C0385e.f6337d)) != null) {
                                sVar2 = sVar2.w((T7.c) entry.getKey(), c10);
                            }
                        }
                        for (T7.q qVar : ((T7.m) d10.f8671c).f9350a) {
                            if (!sVar2.n(qVar.f9359a)) {
                                sVar2 = sVar2.w(qVar.f9359a, qVar.f9360b);
                            }
                        }
                        d10 = new Q7.a(new T7.m(sVar2, eVar.f8684e), false, false);
                    }
                }
                if (!(nVar2.g(fVar) != null) && !eVar.d()) {
                    HashMap hashMap = zVar.f6414d;
                    O7.k.b("View does not exist but we have a tag", !hashMap.containsKey(fVar));
                    long j = zVar.f6418i;
                    zVar.f6418i = 1 + j;
                    A a9 = new A(j);
                    hashMap.put(fVar, a9);
                    zVar.f6413c.put(a9, fVar);
                }
                E e2 = zVar.f6412b;
                e2.getClass();
                q3.s sVar3 = new q3.s(14, c0385e, e2, false);
                Q7.f fVar2 = xVar.f6410b;
                Q7.g e10 = nVar2.e(fVar2, sVar3, d10);
                Q7.e eVar2 = fVar2.f8686b;
                if (!eVar2.d()) {
                    HashSet hashSet = new HashSet();
                    Iterator it = ((T7.m) ((Q7.a) e10.f8689c.f23391b).f8671c).f9350a.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((T7.q) it.next()).f9359a);
                    }
                    nVar2.f6373b.e();
                }
                HashMap hashMap2 = nVar2.f6372a;
                if (!hashMap2.containsKey(eVar2)) {
                    hashMap2.put(eVar2, e10);
                }
                hashMap2.put(eVar2, e10);
                e10.f8690d.add(xVar);
                Q7.a aVar2 = (Q7.a) e10.f8689c.f23391b;
                ArrayList arrayList = new ArrayList();
                T7.m mVar = (T7.m) aVar2.f8671c;
                for (T7.q qVar2 : mVar.f9350a) {
                    arrayList.add(new Q7.c(2, new T7.m(qVar2.f9360b, T7.t.f9361a), qVar2.f9359a, null));
                }
                if (aVar2.f8669a) {
                    arrayList.add(new Q7.c(5, mVar, null, null));
                }
                return e10.a(arrayList, mVar, xVar);
            case 1:
                z zVar2 = (z) this.f6385b;
                N7.a aVar3 = zVar2.g;
                C0385e c0385e3 = (C0385e) this.f6386c;
                Q7.f.a(c0385e3);
                aVar3.e();
                return z.a(zVar2, new M7.b(M7.d.f6827e, c0385e3));
            case 2:
                z zVar3 = (z) this.f6385b;
                Q7.f fVar3 = (Q7.f) zVar3.f6413c.get((A) this.f6386c);
                if (fVar3 == null) {
                    return Collections.emptyList();
                }
                zVar3.g.e();
                return z.b(zVar3, fVar3, new M7.b(new M7.d(2, fVar3.f8686b, true), C0385e.f6337d));
            case 3:
                BinderC0657w0 binderC0657w0 = (BinderC0657w0) this.f6385b;
                binderC0657w0.f11980a.A();
                C0633m c0633m = binderC0657w0.f11980a.f11405c;
                I1.S(c0633m);
                return c0633m.G0((String) this.f6386c);
            case 4:
                BinderC0657w0 binderC0657w02 = (BinderC0657w0) this.f6385b;
                binderC0657w02.f11980a.A();
                return new C0621i(binderC0657w02.f11980a.o0(((O1) this.f6386c).f11506a));
            case 5:
                O1 o12 = (O1) this.f6386c;
                String str = o12.f11506a;
                G.g(str);
                I1 i12 = (I1) this.f6385b;
                C0 a10 = i12.a(str);
                B0 b02 = B0.ANALYTICS_STORAGE;
                if (a10.i(b02) && C0.c(100, o12.f11494G).i(b02)) {
                    return i12.a0(o12).E();
                }
                i12.b().f11573B.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                Cursor n6 = P2.j.n(((q3.q) this.f6385b).f23424a, (H) this.f6386c);
                try {
                    Boolean valueOf = n6.moveToFirst() ? Boolean.valueOf(n6.getInt(0) != 0) : Boolean.FALSE;
                    n6.close();
                    return valueOf;
                } catch (Throwable th) {
                    n6.close();
                    throw th;
                }
        }
    }

    public void finalize() {
        switch (this.f6384a) {
            case 6:
                ((H) this.f6386c).F();
                return;
            default:
                super.finalize();
                return;
        }
    }
}
