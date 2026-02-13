package W4;

import android.os.Handler;
import m5.InterfaceC1603G;
import s4.C1979g;
import s4.InterfaceC1984l;

/* renamed from: W4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0588f implements InterfaceC1603G {

    /* renamed from: a, reason: collision with root package name */
    public final int f10680a;

    /* renamed from: b, reason: collision with root package name */
    public final v f10681b;

    /* renamed from: c, reason: collision with root package name */
    public final Q9.a f10682c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1984l f10683d;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0586d f10685f;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0587e f10686u;

    /* renamed from: v, reason: collision with root package name */
    public C0589g f10687v;

    /* renamed from: w, reason: collision with root package name */
    public C1979g f10688w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f10689x;

    /* renamed from: z, reason: collision with root package name */
    public volatile long f10691z;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f10684e = n5.D.m(null);

    /* renamed from: y, reason: collision with root package name */
    public volatile long f10690y = -9223372036854775807L;

    public C0588f(int i7, v vVar, Q9.a aVar, InterfaceC1984l interfaceC1984l, InterfaceC0586d interfaceC0586d) {
        this.f10680a = i7;
        this.f10681b = vVar;
        this.f10682c = aVar;
        this.f10683d = interfaceC1984l;
        this.f10685f = interfaceC0586d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [F.a, java.lang.Object] */
    @Override // m5.InterfaceC1603G
    public final void b() {
        if (this.f10689x) {
            this.f10689x = false;
        }
        try {
            if (this.f10686u == null) {
                InterfaceC0587e e2 = this.f10685f.e(this.f10680a);
                this.f10686u = e2;
                this.f10684e.post(new P4.G(this, e2.e(), this.f10686u, 3));
                InterfaceC0587e interfaceC0587e = this.f10686u;
                interfaceC0587e.getClass();
                this.f10688w = new C1979g(interfaceC0587e, 0L, -1L);
                C0589g c0589g = new C0589g(this.f10681b.f10790a, this.f10680a);
                this.f10687v = c0589g;
                c0589g.f(this.f10683d);
            }
            while (!this.f10689x) {
                if (this.f10690y != -9223372036854775807L) {
                    C0589g c0589g2 = this.f10687v;
                    c0589g2.getClass();
                    c0589g2.a(this.f10691z, this.f10690y);
                    this.f10690y = -9223372036854775807L;
                }
                C0589g c0589g3 = this.f10687v;
                c0589g3.getClass();
                C1979g c1979g = this.f10688w;
                c1979g.getClass();
                if (c0589g3.e(c1979g, new Object()) == -1) {
                    break;
                }
            }
            this.f10689x = false;
            InterfaceC0587e interfaceC0587e2 = this.f10686u;
            interfaceC0587e2.getClass();
            if (interfaceC0587e2.t()) {
                c2.i.f(this.f10686u);
                this.f10686u = null;
            }
        } catch (Throwable th) {
            InterfaceC0587e interfaceC0587e3 = this.f10686u;
            interfaceC0587e3.getClass();
            if (interfaceC0587e3.t()) {
                c2.i.f(this.f10686u);
                this.f10686u = null;
            }
            throw th;
        }
    }

    @Override // m5.InterfaceC1603G
    public final void d() {
        this.f10689x = true;
    }
}
