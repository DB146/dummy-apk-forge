package B0;

import Q.C0518u0;
import W1.C0573p;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class n1 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1937a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1939c;

    public n1(W1.I i7, W1.a0 a0Var) {
        this.f1939c = i7;
        this.f1938b = a0Var;
    }

    public n1(View view, C0518u0 c0518u0) {
        this.f1938b = view;
        this.f1939c = c0518u0;
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1937a) {
            case 0:
                return;
            default:
                W1.a0 a0Var = (W1.a0) this.f1938b;
                a0Var.k();
                C0573p.j((ViewGroup) a0Var.f10427c.f10277U.getParent(), ((W1.I) this.f1939c).f10324a).i();
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1937a) {
            case 0:
                ((View) this.f1938b).removeOnAttachStateChangeListener(this);
                ((C0518u0) this.f1939c).t();
                return;
            default:
                return;
        }
    }
}
