package y9;

import J1.k;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: y9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2464g<T extends J1.k> extends W1.C {

    /* renamed from: m0, reason: collision with root package name */
    public J1.k f27500m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Db.o f27501n0 = android.support.v4.media.session.b.z(new wa.f(12));

    /* renamed from: o0, reason: collision with root package name */
    public View f27502o0;

    @Override // W1.C
    public void R(Context context) {
        kotlin.jvm.internal.l.e(context, "context");
        super.R(context);
    }

    @Override // W1.C
    public final View T(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.l.e(inflater, "inflater");
        int p02 = p0();
        DataBinderMapperImpl dataBinderMapperImpl = J1.e.f5416a;
        J1.k b2 = J1.e.f5416a.b(inflater.inflate(p02, viewGroup, false), p02);
        kotlin.jvm.internal.l.e(b2, "<set-?>");
        this.f27500m0 = b2;
        s0();
        View view = o0().f5434e;
        this.f27502o0 = view;
        return view;
    }

    @Override // W1.C
    public final void U() {
        this.f10275S = true;
    }

    @Override // W1.C
    public void V() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void W() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Y() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void Z() {
        this.f10275S = true;
    }

    @Override // W1.C
    public void a0(Bundle bundle) {
    }

    @Override // W1.C
    public void b0() {
        this.f10275S = true;
        if (q0().length() > 0) {
            ((FirebaseAnalytics) this.f27501n0.getValue()).a("ViewScreen", com.bumptech.glide.c.f(new Db.j("name", q0())));
        }
    }

    @Override // W1.C
    public final void c0() {
        this.f10275S = true;
    }

    @Override // W1.C
    public final void d0(View view, Bundle bundle) {
        kotlin.jvm.internal.l.e(view, "view");
        r0(bundle);
    }

    @Override // W1.C
    public final void e0(Bundle bundle) {
        this.f10275S = true;
    }

    public final J1.k o0() {
        J1.k kVar = this.f27500m0;
        if (kVar != null) {
            return kVar;
        }
        kotlin.jvm.internal.l.j("binding");
        throw null;
    }

    @Override // W1.C, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.l.e(newConfig, "newConfig");
        this.f10275S = true;
    }

    public abstract int p0();

    public abstract String q0();

    public abstract void r0(Bundle bundle);

    public abstract void s0();
}
