package W1;

import A9.N2;
import A9.S2;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;
import l2.C1481z;
import l2.InterfaceC1470n;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC1470n, Q2.e, l2.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final C f10502a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.d0 f10503b;

    /* renamed from: c, reason: collision with root package name */
    public final S2 f10504c;

    /* renamed from: d, reason: collision with root package name */
    public l2.a0 f10505d;

    /* renamed from: e, reason: collision with root package name */
    public C1481z f10506e = null;

    /* renamed from: f, reason: collision with root package name */
    public q3.c f10507f = null;

    public l0(C c10, l2.d0 d0Var, S2 s22) {
        this.f10502a = c10;
        this.f10503b = d0Var;
        this.f10504c = s22;
    }

    @Override // Q2.e
    public final q3.s b() {
        d();
        return (q3.s) this.f10507f.f23372c;
    }

    public final void c(l2.r rVar) {
        this.f10506e.d(rVar);
    }

    public final void d() {
        if (this.f10506e == null) {
            this.f10506e = new C1481z(this);
            q3.c cVar = new q3.c(new S2.b(this, new N2(this, 15)));
            this.f10507f = cVar;
            cVar.v();
            this.f10504c.run();
        }
    }

    @Override // l2.InterfaceC1470n
    public final l2.a0 n() {
        Application application;
        C c10 = this.f10502a;
        l2.a0 n6 = c10.n();
        if (!n6.equals(c10.f10294f0)) {
            this.f10505d = n6;
            return n6;
        }
        if (this.f10505d == null) {
            Context applicationContext = c10.i0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f10505d = new l2.U(application, c10, c10.f10300u);
        }
        return this.f10505d;
    }

    @Override // l2.InterfaceC1470n
    public final o2.d o() {
        Application application;
        C c10 = this.f10502a;
        Context applicationContext = c10.i0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        o2.d dVar = new o2.d(0);
        LinkedHashMap linkedHashMap = dVar.f21663a;
        if (application != null) {
            linkedHashMap.put(l2.Z.f19198d, application);
        }
        linkedHashMap.put(l2.Q.f19174a, c10);
        linkedHashMap.put(l2.Q.f19175b, this);
        Bundle bundle = c10.f10300u;
        if (bundle != null) {
            linkedHashMap.put(l2.Q.f19176c, bundle);
        }
        return dVar;
    }

    @Override // l2.e0
    public final l2.d0 s() {
        d();
        return this.f10503b;
    }

    @Override // l2.InterfaceC1479x
    public final C1481z w() {
        d();
        return this.f10506e;
    }
}
