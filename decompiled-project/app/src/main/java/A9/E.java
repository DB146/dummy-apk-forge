package A9;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.core.base.leanback.TitleView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class E extends W1.C {

    /* renamed from: m0, reason: collision with root package name */
    public boolean f799m0 = true;

    /* renamed from: n0, reason: collision with root package name */
    public String f800n0;

    /* renamed from: o0, reason: collision with root package name */
    public View f801o0;

    /* renamed from: p0, reason: collision with root package name */
    public r3 f802p0;

    /* renamed from: q0, reason: collision with root package name */
    public o3 f803q0;

    @Override // W1.C
    public void V() {
        this.f10275S = true;
        this.f803q0 = null;
    }

    @Override // W1.C
    public void Y() {
        r3 r3Var = this.f802p0;
        if (r3Var != null) {
            r3Var.a(false);
        }
        this.f10275S = true;
    }

    @Override // W1.C
    public void Z() {
        this.f10275S = true;
        r3 r3Var = this.f802p0;
        if (r3Var != null) {
            r3Var.a(true);
        }
    }

    @Override // W1.C
    public void a0(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f799m0);
    }

    @Override // W1.C
    public void b0() {
        this.f10275S = true;
        if (this.f802p0 != null) {
            r0(this.f799m0);
            this.f802p0.a(true);
        }
    }

    @Override // W1.C
    public void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f799m0 = bundle.getBoolean("titleShow");
        }
        View view2 = this.f801o0;
        if (view2 == null || !(view instanceof ViewGroup)) {
            return;
        }
        o3 o3Var = new o3((ViewGroup) view, view2);
        this.f803q0 = o3Var;
        if (this.f799m0) {
            TransitionManager.go(o3Var.f1337d, o3Var.f1336c);
        } else {
            TransitionManager.go(o3Var.f1338e, o3Var.f1335b);
        }
    }

    public View o0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        return layoutInflater.inflate(viewGroup.getContext().getTheme().resolveAttribute(R.attr.browseTitleViewLayout, typedValue, true) ? typedValue.resourceId : R.layout.lb_browse_title, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p0(View view) {
        this.f801o0 = view;
        if (view == 0) {
            this.f802p0 = null;
            this.f803q0 = null;
            return;
        }
        r3 titleViewAdapter = ((q3) view).getTitleViewAdapter();
        this.f802p0 = titleViewAdapter;
        ((p3) titleViewAdapter).f1345a.setTitle(this.f800n0);
        ((p3) this.f802p0).f1345a.setBadgeDrawable(null);
        View view2 = this.f10277U;
        if (view2 instanceof ViewGroup) {
            this.f803q0 = new o3((ViewGroup) view2, this.f801o0);
        }
    }

    public final void q0(int i7) {
        r3 r3Var = this.f802p0;
        if (r3Var != null) {
            TitleView titleView = ((p3) r3Var).f1345a;
            titleView.f16111d = i7;
            if ((i7 & 2) == 2) {
                titleView.a();
            } else {
                titleView.f16108a.setVisibility(8);
                titleView.f16109b.setVisibility(8);
            }
            int i10 = 4;
            if (titleView.f16112e && (titleView.f16111d & 4) == 4) {
                i10 = 0;
            }
            titleView.f16110c.setVisibility(i10);
        }
        r0(true);
    }

    public final void r0(boolean z8) {
        if (z8 == this.f799m0) {
            return;
        }
        this.f799m0 = z8;
        o3 o3Var = this.f803q0;
        if (o3Var != null) {
            if (z8) {
                TransitionManager.go(o3Var.f1337d, o3Var.f1336c);
            } else {
                TransitionManager.go(o3Var.f1338e, o3Var.f1335b);
            }
        }
    }
}
