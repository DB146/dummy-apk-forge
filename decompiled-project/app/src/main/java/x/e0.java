package x;

import Q.C0479a0;
import Q.C0480b;
import Q.C0483c0;
import Q.C0487e0;
import Q.F0;
import Q.R0;
import a0.AbstractC0688o;
import a0.C0691r;
import ea.C1111f;

/* loaded from: classes.dex */
public final class e0 implements R0 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f26063A;

    /* renamed from: B, reason: collision with root package name */
    public final Q f26064B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ i0 f26065C;

    /* renamed from: a, reason: collision with root package name */
    public final C1111f f26066a;

    /* renamed from: b, reason: collision with root package name */
    public final C0487e0 f26067b;

    /* renamed from: c, reason: collision with root package name */
    public final C0487e0 f26068c;

    /* renamed from: d, reason: collision with root package name */
    public final C0487e0 f26069d;

    /* renamed from: e, reason: collision with root package name */
    public D f26070e;

    /* renamed from: f, reason: collision with root package name */
    public Z f26071f;

    /* renamed from: u, reason: collision with root package name */
    public final C0487e0 f26072u;

    /* renamed from: v, reason: collision with root package name */
    public final C0479a0 f26073v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f26074w;

    /* renamed from: x, reason: collision with root package name */
    public final C0487e0 f26075x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractC2243m f26076y;

    /* renamed from: z, reason: collision with root package name */
    public final C0483c0 f26077z;

    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Map, java.lang.Object] */
    public e0(i0 i0Var, Object obj, AbstractC2243m abstractC2243m, C1111f c1111f) {
        this.f26065C = i0Var;
        this.f26066a = c1111f;
        C0487e0 o10 = C0480b.o(obj);
        this.f26067b = o10;
        Object obj2 = null;
        C0487e0 o11 = C0480b.o(AbstractC2232b.j(7, null));
        this.f26068c = o11;
        this.f26069d = C0480b.o(new Z((InterfaceC2249t) o11.getValue(), c1111f, obj, o10.getValue(), abstractC2243m));
        this.f26072u = C0480b.o(Boolean.TRUE);
        this.f26073v = new C0479a0(-1.0f);
        this.f26075x = C0480b.o(obj);
        this.f26076y = abstractC2243m;
        this.f26077z = new C0483c0(b().d());
        Float f4 = (Float) t0.f26153a.get(c1111f);
        if (f4 != null) {
            float floatValue = f4.floatValue();
            AbstractC2243m abstractC2243m2 = (AbstractC2243m) ((Rb.c) c1111f.f16837b).invoke(obj);
            int b2 = abstractC2243m2.b();
            for (int i7 = 0; i7 < b2; i7++) {
                abstractC2243m2.e(i7, floatValue);
            }
            obj2 = ((Rb.c) this.f26066a.f16838c).invoke(abstractC2243m2);
        }
        this.f26064B = AbstractC2232b.j(3, obj2);
    }

    public final Z b() {
        return (Z) this.f26069d.getValue();
    }

    public final void c(long j) {
        if (this.f26073v.e() == -1.0f) {
            this.f26063A = true;
            if (kotlin.jvm.internal.l.a(b().f26027c, b().f26028d)) {
                d(b().f26027c);
            } else {
                d(b().c(j));
                this.f26076y = b().g(j);
            }
        }
    }

    public final void d(Object obj) {
        this.f26075x.setValue(obj);
    }

    public final void e(Object obj, boolean z8) {
        Z z10 = this.f26071f;
        Object obj2 = z10 != null ? z10.f26027c : null;
        C0487e0 c0487e0 = this.f26067b;
        boolean a9 = kotlin.jvm.internal.l.a(obj2, c0487e0.getValue());
        C0483c0 c0483c0 = this.f26077z;
        C0487e0 c0487e02 = this.f26069d;
        InterfaceC2249t interfaceC2249t = this.f26064B;
        if (a9) {
            c0487e02.setValue(new Z(interfaceC2249t, this.f26066a, obj, obj, this.f26076y.c()));
            this.f26074w = true;
            c0483c0.e(b().d());
            return;
        }
        C0487e0 c0487e03 = this.f26068c;
        if (!z8 || this.f26063A) {
            interfaceC2249t = (InterfaceC2249t) c0487e03.getValue();
        } else if (((InterfaceC2249t) c0487e03.getValue()) instanceof Q) {
            interfaceC2249t = (InterfaceC2249t) c0487e03.getValue();
        }
        i0 i0Var = this.f26065C;
        c0487e02.setValue(new Z(i0Var.e() <= 0 ? interfaceC2249t : new S(interfaceC2249t, i0Var.e()), this.f26066a, obj, c0487e0.getValue(), this.f26076y));
        c0483c0.e(b().d());
        this.f26074w = false;
        Boolean bool = Boolean.TRUE;
        C0487e0 c0487e04 = i0Var.f26105h;
        c0487e04.setValue(bool);
        if (i0Var.g()) {
            C0691r c0691r = i0Var.f26106i;
            int size = c0691r.size();
            long j = 0;
            for (int i7 = 0; i7 < size; i7++) {
                e0 e0Var = (e0) c0691r.get(i7);
                C0483c0 c0483c02 = e0Var.f26077z;
                j = Math.max(j, ((F0) AbstractC0688o.t(c0483c02.f8378b, c0483c02)).f8302c);
                e0Var.c(0L);
            }
            c0487e04.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, InterfaceC2249t interfaceC2249t) {
        this.f26067b.setValue(obj2);
        this.f26068c.setValue(interfaceC2249t);
        if (kotlin.jvm.internal.l.a(b().f26028d, obj) && kotlin.jvm.internal.l.a(b().f26027c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // Q.R0
    public final Object getValue() {
        return this.f26075x.getValue();
    }

    public final String toString() {
        return "current value: " + this.f26075x.getValue() + ", target: " + this.f26067b.getValue() + ", spec: " + ((InterfaceC2249t) this.f26068c.getValue());
    }
}
