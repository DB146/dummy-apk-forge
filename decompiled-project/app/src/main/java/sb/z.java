package sb;

import Y5.C0662z;
import hb.InterfaceC1269b;
import ib.C1360b;
import java.util.concurrent.atomic.AtomicInteger;
import kb.C1436a;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class z extends AtomicInteger implements gb.l {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24350a;

    /* renamed from: b, reason: collision with root package name */
    public final C1436a f24351b;

    /* renamed from: c, reason: collision with root package name */
    public final gb.k f24352c;

    /* renamed from: d, reason: collision with root package name */
    public final C0662z f24353d;

    /* renamed from: e, reason: collision with root package name */
    public long f24354e;

    public z(gb.l lVar, long j, C1436a c1436a, gb.k kVar) {
        C0662z c0662z = lb.b.f19617f;
        this.f24350a = lVar;
        this.f24351b = c1436a;
        this.f24352c = kVar;
        this.f24353d = c0662z;
        this.f24354e = j;
    }

    @Override // gb.l
    public final void a() {
        this.f24350a.a();
    }

    public final void b() {
        if (getAndIncrement() == 0) {
            int i7 = 1;
            while (!this.f24351b.g()) {
                this.f24352c.b(this);
                i7 = addAndGet(-i7);
                if (i7 == 0) {
                    return;
                }
            }
        }
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        C1436a c1436a = this.f24351b;
        c1436a.getClass();
        EnumC1437b.f(c1436a, interfaceC1269b);
    }

    @Override // gb.l
    public final void e(Object obj) {
        this.f24350a.e(obj);
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        long j = this.f24354e;
        if (j != Long.MAX_VALUE) {
            this.f24354e = j - 1;
        }
        gb.l lVar = this.f24350a;
        if (j == 0) {
            lVar.onError(th);
            return;
        }
        try {
            this.f24353d.getClass();
            b();
        } catch (Throwable th2) {
            u0.L(th2);
            lVar.onError(new C1360b(th, th2));
        }
    }
}
