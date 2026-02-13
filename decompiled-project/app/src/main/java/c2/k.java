package c2;

import A9.o3;
import W1.C;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import i2.RunnableC1311T;

/* loaded from: classes.dex */
public class k extends C {

    /* renamed from: m0, reason: collision with root package name */
    public boolean f14162m0 = true;

    /* renamed from: n0, reason: collision with root package name */
    public View f14163n0;

    /* renamed from: o0, reason: collision with root package name */
    public o3 f14164o0;

    @Override // W1.C
    public void V() {
        this.f10275S = true;
        this.f14164o0 = null;
        this.f14163n0 = null;
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
    public final void a0(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f14162m0);
    }

    @Override // W1.C
    public void b0() {
        this.f10275S = true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [A9.o3, java.lang.Object] */
    @Override // W1.C
    public void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f14162m0 = bundle.getBoolean("titleShow");
        }
        View view2 = this.f14163n0;
        if (view2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        ?? obj = new Object();
        if (viewGroup == null) {
            throw new IllegalArgumentException("Views may not be null");
        }
        obj.f1334a = view2;
        obj.f1335b = E6.b.u(viewGroup.getContext(), R.transition.lb_title_out);
        obj.f1336c = E6.b.u(viewGroup.getContext(), R.transition.lb_title_in);
        obj.f1337d = E6.b.g(viewGroup, new RunnableC1311T(obj, 0));
        Scene g = E6.b.g(viewGroup, new RunnableC1311T(obj, 1));
        obj.f1338e = g;
        this.f14164o0 = obj;
        if (this.f14162m0) {
            TransitionManager.go(obj.f1337d, obj.f1336c);
        } else {
            TransitionManager.go(g, obj.f1335b);
        }
    }
}
