package C;

import android.os.Build;
import android.view.View;
import androidx.datastore.preferences.protobuf.AbstractC0807j;
import ea.C1108c;
import java.util.List;
import y1.InterfaceC2366n;
import y1.a0;
import y1.m0;
import y1.p0;

/* loaded from: classes.dex */
public final class A extends AbstractC0807j implements Runnable, InterfaceC2366n, View.OnAttachStateChangeListener {

    /* renamed from: c, reason: collision with root package name */
    public final P f2329c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2331e;

    /* renamed from: f, reason: collision with root package name */
    public p0 f2332f;

    public A(P p10) {
        super(!p10.f2384r ? 1 : 0);
        this.f2329c = p10;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void d(a0 a0Var) {
        this.f2330d = false;
        this.f2331e = false;
        p0 p0Var = this.f2332f;
        if (a0Var.f26678a.a() != 0 && p0Var != null) {
            P p10 = this.f2329c;
            p10.getClass();
            m0 m0Var = p0Var.f26731a;
            p10.f2383q.f(q3.f.D(m0Var.g(8)));
            p10.f2382p.f(q3.f.D(m0Var.g(8)));
            P.a(p10, p0Var);
        }
        this.f2332f = null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final void e() {
        this.f2330d = true;
        this.f2331e = true;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final p0 f(p0 p0Var, List list) {
        P p10 = this.f2329c;
        P.a(p10, p0Var);
        return p10.f2384r ? p0.f26730b : p0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0807j
    public final C1108c g(C1108c c1108c) {
        this.f2330d = false;
        return c1108c;
    }

    @Override // y1.InterfaceC2366n
    public final p0 l(View view, p0 p0Var) {
        this.f2332f = p0Var;
        P p10 = this.f2329c;
        p10.getClass();
        m0 m0Var = p0Var.f26731a;
        p10.f2382p.f(q3.f.D(m0Var.g(8)));
        if (this.f2330d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f2331e) {
            p10.f2383q.f(q3.f.D(m0Var.g(8)));
            P.a(p10, p0Var);
        }
        return p10.f2384r ? p0.f26730b : p0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2330d) {
            this.f2330d = false;
            this.f2331e = false;
            p0 p0Var = this.f2332f;
            if (p0Var != null) {
                P p10 = this.f2329c;
                p10.getClass();
                p10.f2383q.f(q3.f.D(p0Var.f26731a.g(8)));
                P.a(p10, p0Var);
                this.f2332f = null;
            }
        }
    }
}
