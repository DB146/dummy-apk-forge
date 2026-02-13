package pb;

import Y5.C0662z;
import ib.C1360b;
import java.util.concurrent.atomic.AtomicInteger;
import y7.u0;

/* loaded from: classes2.dex */
public final class k extends AtomicInteger implements gb.e {

    /* renamed from: a, reason: collision with root package name */
    public final gb.e f23298a;

    /* renamed from: b, reason: collision with root package name */
    public final wb.b f23299b;

    /* renamed from: c, reason: collision with root package name */
    public final Ac.a f23300c;

    /* renamed from: d, reason: collision with root package name */
    public final C0662z f23301d;

    /* renamed from: e, reason: collision with root package name */
    public long f23302e;

    /* renamed from: f, reason: collision with root package name */
    public long f23303f;

    public k(gb.e eVar, long j, C0662z c0662z, wb.b bVar, Ac.a aVar) {
        this.f23298a = eVar;
        this.f23299b = bVar;
        this.f23300c = aVar;
        this.f23301d = c0662z;
        this.f23302e = j;
    }

    @Override // gb.e, gb.l
    public final void a() {
        this.f23298a.a();
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            int i7 = 1;
            while (!this.f23299b.f25855f) {
                long j = this.f23303f;
                if (j != 0) {
                    this.f23303f = 0L;
                    this.f23299b.c(j);
                }
                ((gb.d) this.f23300c).a(this);
                i7 = addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
        }
    }

    @Override // gb.e, gb.l
    public final void e(Object obj) {
        this.f23303f++;
        this.f23298a.e(obj);
    }

    @Override // gb.e
    public final void f(Ac.b bVar) {
        this.f23299b.e(bVar);
    }

    @Override // gb.e, gb.l
    public final void onError(Throwable th) {
        long j = this.f23302e;
        if (j != Long.MAX_VALUE) {
            this.f23302e = j - 1;
        }
        gb.e eVar = this.f23298a;
        if (j == 0) {
            eVar.onError(th);
            return;
        }
        try {
            this.f23301d.getClass();
            b();
        } catch (Throwable th2) {
            u0.L(th2);
            eVar.onError(new C1360b(th, th2));
        }
    }
}
