package Y5;

import java.util.Objects;
import sb.InterfaceC2006E;

/* renamed from: Y5.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0652u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11951a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final long f11952b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11953c;

    public RunnableC0652u(long j, Ac.b bVar) {
        this.f11953c = bVar;
        this.f11952b = j;
    }

    public RunnableC0652u(long j, InterfaceC2006E interfaceC2006E) {
        this.f11952b = j;
        this.f11953c = interfaceC2006E;
    }

    public RunnableC0652u(C0605c1 c0605c1, long j) {
        this.f11952b = j;
        Objects.requireNonNull(c0605c1);
        this.f11953c = c0605c1;
    }

    public RunnableC0652u(C0654v c0654v, long j) {
        this.f11952b = j;
        Objects.requireNonNull(c0654v);
        this.f11953c = c0654v;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [sb.E, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11951a) {
            case 0:
                ((C0654v) this.f11953c).P(this.f11952b);
                return;
            case 1:
                C0605c1 c0605c1 = (C0605c1) this.f11953c;
                C0654v c0654v = ((C0646q0) c0605c1.f3094a).f11891B;
                C0646q0.i(c0654v);
                c0654v.M(this.f11952b);
                c0605c1.f11688e = null;
                return;
            case 2:
                ((Ac.b) this.f11953c).d(this.f11952b);
                return;
            default:
                this.f11953c.d(this.f11952b);
                return;
        }
    }
}
