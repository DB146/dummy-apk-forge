package T8;

import F6.j;
import Y5.C0610e0;
import android.app.Activity;
import android.os.Handler;
import m4.C1555I;
import m4.s0;
import n5.n;
import n5.x;

/* loaded from: classes2.dex */
public final class g implements n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9374a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9375b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9376c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9377d;

    /* renamed from: e, reason: collision with root package name */
    public Object f9378e;

    /* renamed from: f, reason: collision with root package name */
    public Object f9379f;

    public g(Activity activity, p9.f fVar) {
        this.f9374a = false;
        this.f9376c = activity;
        this.f9379f = fVar;
        this.f9377d = new j(this, 1);
        this.f9378e = new Handler();
    }

    public g(C1555I c1555i, x xVar) {
        this.f9377d = c1555i;
        this.f9376c = new C0610e0(xVar);
        this.f9374a = true;
    }

    @Override // n5.n
    public s0 a() {
        n nVar = (n) this.f9379f;
        return nVar != null ? nVar.a() : (s0) ((C0610e0) this.f9376c).f11726e;
    }

    @Override // n5.n
    public void b(s0 s0Var) {
        n nVar = (n) this.f9379f;
        if (nVar != null) {
            nVar.b(s0Var);
            s0Var = ((n) this.f9379f).a();
        }
        ((C0610e0) this.f9376c).b(s0Var);
    }

    public void c() {
        ((Handler) this.f9378e).removeCallbacksAndMessages(null);
        if (this.f9374a) {
            ((Activity) this.f9376c).unregisterReceiver((j) this.f9377d);
            this.f9374a = false;
        }
    }

    @Override // n5.n
    public long d() {
        if (this.f9374a) {
            return ((C0610e0) this.f9376c).d();
        }
        n nVar = (n) this.f9379f;
        nVar.getClass();
        return nVar.d();
    }
}
