package sb;

import Y5.RunnableC0652u;
import hb.InterfaceC1269b;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kb.C1436a;
import kb.EnumC1437b;
import xb.AbstractC2275c;
import xb.C2274b;

/* renamed from: sb.D, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2005D extends AtomicLong implements gb.l, InterfaceC1269b, InterfaceC2006E {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24242a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24243b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeUnit f24244c;

    /* renamed from: d, reason: collision with root package name */
    public final gb.n f24245d;

    /* renamed from: e, reason: collision with root package name */
    public final C1436a f24246e = new C1436a();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f24247f = new AtomicReference();

    public C2005D(gb.l lVar, long j, TimeUnit timeUnit, gb.n nVar) {
        this.f24242a = lVar;
        this.f24243b = j;
        this.f24244c = timeUnit;
        this.f24245d = nVar;
    }

    @Override // gb.l
    public final void a() {
        if (getAndSet(Long.MAX_VALUE) != Long.MAX_VALUE) {
            C1436a c1436a = this.f24246e;
            c1436a.getClass();
            EnumC1437b.a(c1436a);
            this.f24242a.a();
            this.f24245d.b();
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        EnumC1437b.a(this.f24247f);
        this.f24245d.b();
    }

    @Override // gb.l
    public final void c(InterfaceC1269b interfaceC1269b) {
        EnumC1437b.j(this.f24247f, interfaceC1269b);
    }

    @Override // sb.InterfaceC2006E
    public final void d(long j) {
        if (compareAndSet(j, Long.MAX_VALUE)) {
            EnumC1437b.a(this.f24247f);
            C2274b c2274b = AbstractC2275c.f26321a;
            this.f24242a.onError(new TimeoutException("The source did not signal an event for " + this.f24243b + " " + this.f24244c.toString().toLowerCase() + " and has been terminated."));
            this.f24245d.b();
        }
    }

    @Override // gb.l
    public final void e(Object obj) {
        long j = get();
        if (j != Long.MAX_VALUE) {
            long j10 = 1 + j;
            if (compareAndSet(j, j10)) {
                C1436a c1436a = this.f24246e;
                ((InterfaceC1269b) c1436a.get()).b();
                this.f24242a.e(obj);
                InterfaceC1269b c10 = this.f24245d.c(new RunnableC0652u(j10, this), this.f24243b, this.f24244c);
                c1436a.getClass();
                EnumC1437b.f(c1436a, c10);
            }
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return EnumC1437b.d((InterfaceC1269b) this.f24247f.get());
    }

    @Override // gb.l
    public final void onError(Throwable th) {
        if (getAndSet(Long.MAX_VALUE) == Long.MAX_VALUE) {
            com.bumptech.glide.d.t(th);
            return;
        }
        C1436a c1436a = this.f24246e;
        c1436a.getClass();
        EnumC1437b.a(c1436a);
        this.f24242a.onError(th);
        this.f24245d.b();
    }
}
