package L7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class v implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f6401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O7.a f6403c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f6404d;

    public v(z zVar, long j, boolean z8, O7.a aVar) {
        this.f6404d = zVar;
        this.f6401a = j;
        this.f6402b = z8;
        this.f6403c = aVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        D d10;
        D d11;
        C0385e c0385e;
        O7.g gVar;
        boolean z8;
        z zVar = this.f6404d;
        zVar.g.e();
        Iterator it = ((ArrayList) zVar.f6412b.f6318b).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.f6401a;
            d10 = null;
            if (!hasNext) {
                d11 = null;
                break;
            }
            d11 = (D) it.next();
            if (d11.f6312a == j) {
                break;
            }
        }
        E e2 = zVar.f6412b;
        ArrayList arrayList = (ArrayList) e2.f6318b;
        Iterator it2 = arrayList.iterator();
        boolean z10 = false;
        int i7 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            D d12 = (D) it2.next();
            if (d12.f6312a == j) {
                d10 = d12;
                break;
            }
            i7++;
        }
        O7.k.b("removeWrite called with nonexistent writeId", d10 != null);
        arrayList.remove(d10);
        d10.getClass();
        int size = arrayList.size() - 1;
        boolean z11 = true;
        boolean z12 = false;
        while (true) {
            c0385e = d10.f6313b;
            if (!z11 || size < 0) {
                break;
            }
            D d13 = (D) arrayList.get(size);
            d13.getClass();
            C0385e c0385e2 = d13.f6313b;
            if (size >= i7) {
                if (!d13.c()) {
                    Iterator it3 = d13.a().f6321a.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z8 = false;
                            break;
                        }
                        if (c0385e2.i((C0385e) ((Map.Entry) it3.next()).getKey()).y(c0385e)) {
                            z8 = true;
                            break;
                        }
                    }
                } else {
                    z8 = c0385e2.y(c0385e);
                }
                if (z8) {
                    z11 = false;
                    size--;
                }
            }
            if (c0385e.y(c0385e2)) {
                z12 = true;
            }
            size--;
        }
        if (z11) {
            if (z12) {
                e2.f6317a = E.b(arrayList, E.f6316d, C0385e.f6337d);
                if (arrayList.size() > 0) {
                    e2.f6319c = Long.valueOf(((D) h3.o.k(1, arrayList)).f6312a);
                } else {
                    e2.f6319c = -1L;
                }
            } else if (d10.c()) {
                C0381a c0381a = (C0381a) e2.f6317a;
                c0381a.getClass();
                e2.f6317a = c0385e.isEmpty() ? C0381a.f6320b : new C0381a(c0381a.f6321a.C(c0385e, O7.g.f7494d));
            } else {
                Iterator it4 = d10.a().f6321a.iterator();
                while (it4.hasNext()) {
                    C0385e c0385e3 = (C0385e) ((Map.Entry) it4.next()).getKey();
                    C0381a c0381a2 = (C0381a) e2.f6317a;
                    C0385e i10 = c0385e.i(c0385e3);
                    c0381a2.getClass();
                    e2.f6317a = i10.isEmpty() ? C0381a.f6320b : new C0381a(c0381a2.f6321a.C(i10, O7.g.f7494d));
                }
            }
            z10 = true;
        }
        d11.getClass();
        C0385e c0385e4 = d11.f6313b;
        boolean z13 = this.f6402b;
        if (!z13) {
            HashMap B10 = com.bumptech.glide.c.B(this.f6403c);
            boolean c10 = d11.c();
            N7.a aVar = zVar.g;
            if (c10) {
                com.bumptech.glide.c.Z(d11.b(), new q3.e(14, zVar, c0385e4), B10);
                aVar.e();
            } else {
                com.bumptech.glide.c.Y(d11.a(), zVar, c0385e4, B10);
                aVar.e();
            }
        }
        if (!z10) {
            return Collections.emptyList();
        }
        O7.g gVar2 = O7.g.f7494d;
        if (d11.c()) {
            gVar = gVar2.z(C0385e.f6337d, Boolean.TRUE);
        } else {
            Iterator it5 = d11.a().f6321a.iterator();
            while (it5.hasNext()) {
                gVar2 = gVar2.z((C0385e) ((Map.Entry) it5.next()).getKey(), Boolean.TRUE);
            }
            gVar = gVar2;
        }
        return z.a(zVar, new M7.a(c0385e4, gVar, z13));
    }
}
