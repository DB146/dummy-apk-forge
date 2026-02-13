package y1;

import a3.C0737n;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f26657a;

    public S(View view) {
        this.f26657a = new WeakReference(view);
    }

    public final void a(float f4) {
        View view = (View) this.f26657a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
    }

    public final void b() {
        View view = (View) this.f26657a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f26657a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(T t5) {
        View view = (View) this.f26657a.get();
        if (view != null) {
            if (t5 != null) {
                view.animate().setListener(new C0737n(t5, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f4) {
        View view = (View) this.f26657a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
    }
}
