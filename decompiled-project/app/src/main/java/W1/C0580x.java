package W1;

import android.view.View;

/* renamed from: W1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580x extends tc.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C f10570a;

    public C0580x(C c10) {
        this.f10570a = c10;
    }

    @Override // tc.b
    public final View B(int i7) {
        C c10 = this.f10570a;
        View view = c10.f10277U;
        if (view != null) {
            return view.findViewById(i7);
        }
        throw new IllegalStateException("Fragment " + c10 + " does not have a view");
    }

    @Override // tc.b
    public final boolean C() {
        return this.f10570a.f10277U != null;
    }
}
