package pb;

import ib.C1360b;
import java.util.concurrent.atomic.AtomicInteger;
import jb.InterfaceC1392c;
import y7.u0;

/* loaded from: classes2.dex */
public final class j extends AtomicInteger implements gb.e {

    /* renamed from: a, reason: collision with root package name */
    public final gb.e f23292a;

    /* renamed from: b, reason: collision with root package name */
    public final wb.b f23293b;

    /* renamed from: c, reason: collision with root package name */
    public final Ac.a f23294c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1392c f23295d;

    /* renamed from: e, reason: collision with root package name */
    public int f23296e;

    /* renamed from: f, reason: collision with root package name */
    public long f23297f;

    public j(gb.e eVar, InterfaceC1392c interfaceC1392c, wb.b bVar, Ac.a aVar) {
        this.f23292a = eVar;
        this.f23293b = bVar;
        this.f23294c = aVar;
        this.f23295d = interfaceC1392c;
    }

    @Override // gb.e, gb.l
    public final void a() {
        this.f23292a.a();
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            int i7 = 1;
            while (!this.f23293b.f25855f) {
                long j = this.f23297f;
                if (j != 0) {
                    this.f23297f = 0L;
                    this.f23293b.c(j);
                }
                ((gb.d) this.f23294c).a(this);
                i7 = addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        this.f23297f++;
        this.f23292a.e(obj);
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        this.f23293b.e(bVar);
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        gb.e eVar = this.f23292a;
        try {
            InterfaceC1392c interfaceC1392c = this.f23295d;
            int i7 = this.f23296e + 1;
            this.f23296e = i7;
            if (interfaceC1392c.w(Integer.valueOf(i7), th)) {
                b();
            } else {
                eVar.onError(th);
            }
        } catch (Throwable th2) {
            u0.L(th2);
            eVar.onError(new C1360b(th, th2));
        }
    }
}
