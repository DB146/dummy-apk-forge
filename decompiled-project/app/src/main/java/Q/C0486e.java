package Q;

import B0.C0170c0;
import cc.C0944m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: Q.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0486e implements T {

    /* renamed from: a, reason: collision with root package name */
    public final A0.J f8381a;

    /* renamed from: c, reason: collision with root package name */
    public Throwable f8383c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8382b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8384d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f8385e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final Y.a f8386f = new AtomicInteger(0);

    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.concurrent.atomic.AtomicInteger, Y.a] */
    public C0486e(A0.J j) {
        this.f8381a = j;
    }

    public final void a(long j) {
        Object n6;
        synchronized (this.f8382b) {
            try {
                ArrayList arrayList = this.f8384d;
                this.f8384d = this.f8385e;
                this.f8385e = arrayList;
                this.f8386f.set(0);
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    C0484d c0484d = (C0484d) arrayList.get(i7);
                    c0484d.getClass();
                    try {
                        n6 = c0484d.f8379a.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        n6 = com.bumptech.glide.c.n(th);
                    }
                    c0484d.f8380b.resumeWith(n6);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Hb.i
    public final Object fold(Object obj, Rb.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // Hb.i
    public final Hb.g get(Hb.h hVar) {
        return E6.b.l(this, hVar);
    }

    @Override // Hb.i
    public final Hb.i minusKey(Hb.h hVar) {
        return E6.b.v(this, hVar);
    }

    @Override // Q.T
    public final Object n(Rb.c cVar, Jb.c cVar2) {
        C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(cVar2));
        c0944m.s();
        C0484d c0484d = new C0484d(cVar, c0944m);
        synchronized (this.f8382b) {
            Throwable th = this.f8383c;
            if (th != null) {
                c0944m.resumeWith(com.bumptech.glide.c.n(th));
            } else {
                boolean isEmpty = this.f8384d.isEmpty();
                this.f8384d.add(c0484d);
                if (isEmpty) {
                    this.f8386f.set(1);
                }
                c0944m.u(new C0170c0(14, this, c0484d));
                if (isEmpty) {
                    try {
                        this.f8381a.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.f8382b) {
                            try {
                                if (this.f8383c == null) {
                                    this.f8383c = th2;
                                    ArrayList arrayList = this.f8384d;
                                    int size = arrayList.size();
                                    for (int i7 = 0; i7 < size; i7++) {
                                        ((C0484d) arrayList.get(i7)).f8380b.resumeWith(com.bumptech.glide.c.n(th2));
                                    }
                                    this.f8384d.clear();
                                    this.f8386f.set(0);
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                }
            }
        }
        Object r10 = c0944m.r();
        Ib.a aVar = Ib.a.f5345a;
        return r10;
    }

    @Override // Hb.i
    public final Hb.i plus(Hb.i iVar) {
        return E6.b.w(this, iVar);
    }
}
