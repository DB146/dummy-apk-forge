package B0;

import Q.C0480b;
import Q.C0512r0;
import Q.C0516t0;
import Q.C0518u0;
import android.view.View;
import cc.InterfaceC0937i0;
import l2.InterfaceC1479x;

/* loaded from: classes.dex */
public final class q1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f1953a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f1955c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f1956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1479x f1957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f1958f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ View f1959u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(kotlin.jvm.internal.v vVar, C0518u0 c0518u0, InterfaceC1479x interfaceC1479x, r1 r1Var, View view, Hb.d dVar) {
        super(2, dVar);
        this.f1955c = vVar;
        this.f1956d = c0518u0;
        this.f1957e = interfaceC1479x;
        this.f1958f = r1Var;
        this.f1959u = view;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        q1 q1Var = new q1(this.f1955c, this.f1956d, this.f1957e, this.f1958f, this.f1959u, dVar);
        q1Var.f1954b = obj;
        return q1Var;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC0937i0 interfaceC0937i0;
        cc.D0 d02;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f1953a;
        InterfaceC1479x interfaceC1479x = this.f1957e;
        Db.q qVar = Db.q.f3365a;
        r1 r1Var = this.f1958f;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            cc.E e2 = (cc.E) this.f1954b;
            try {
                K0 k02 = (K0) this.f1955c.f19134a;
                if (k02 != null) {
                    fc.Z a9 = u1.a(this.f1959u.getContext().getApplicationContext());
                    k02.f1712a.f(((Number) a9.getValue()).floatValue());
                    d02 = cc.F.B(e2, null, 0, new p1(a9, k02, null), 3);
                } else {
                    d02 = null;
                }
                try {
                    C0518u0 c0518u0 = this.f1956d;
                    this.f1954b = d02;
                    this.f1953a = 1;
                    Object K10 = cc.F.K(c0518u0.f8542a, new C0512r0(c0518u0, new C0516t0(c0518u0, null), C0480b.m(getContext()), null), this);
                    if (K10 != aVar) {
                        K10 = qVar;
                    }
                    if (K10 != aVar) {
                        K10 = qVar;
                    }
                    if (K10 == aVar) {
                        return aVar;
                    }
                    interfaceC0937i0 = d02;
                } catch (Throwable th) {
                    interfaceC0937i0 = d02;
                    th = th;
                    if (interfaceC0937i0 != null) {
                    }
                    interfaceC1479x.w().f(r1Var);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                interfaceC0937i0 = null;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC0937i0 = (InterfaceC0937i0) this.f1954b;
            try {
                com.bumptech.glide.c.c0(obj);
            } catch (Throwable th3) {
                th = th3;
                if (interfaceC0937i0 != null) {
                    interfaceC0937i0.cancel(null);
                }
                interfaceC1479x.w().f(r1Var);
                throw th;
            }
        }
        if (interfaceC0937i0 != null) {
            interfaceC0937i0.cancel(null);
        }
        interfaceC1479x.w().f(r1Var);
        return qVar;
    }
}
