package A9;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class M implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f865a;

    /* renamed from: b, reason: collision with root package name */
    public final J f866b;

    /* renamed from: c, reason: collision with root package name */
    public int f867c;

    /* renamed from: d, reason: collision with root package name */
    public final Q f868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f869e;

    public M(W w10, J j, Q q10, View view) {
        this.f869e = w10;
        this.f865a = view;
        this.f866b = j;
        this.f868d = q10;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        W w10 = this.f869e;
        View view = w10.f10277U;
        View view2 = this.f865a;
        if (view == null || w10.C() == null) {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        int i7 = this.f867c;
        if (i7 == 0) {
            this.f868d.g(true);
            view2.invalidate();
            this.f867c = 1;
            return false;
        }
        if (i7 != 1) {
            return false;
        }
        this.f866b.run();
        view2.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f867c = 2;
        return false;
    }
}
