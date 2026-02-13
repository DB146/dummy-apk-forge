package H2;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public int f4650a;

    /* renamed from: b, reason: collision with root package name */
    public int f4651b;

    /* renamed from: c, reason: collision with root package name */
    public int f4652c;

    /* renamed from: d, reason: collision with root package name */
    public int f4653d;

    /* renamed from: e, reason: collision with root package name */
    public BaseInterpolator f4654e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4655f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i7 = this.f4653d;
        if (i7 >= 0) {
            this.f4653d = -1;
            recyclerView.R(i7);
            this.f4655f = false;
            return;
        }
        if (!this.f4655f) {
            this.g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f4654e;
        if (baseInterpolator != null && this.f4652c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f4652c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f13671s0.c(this.f4650a, this.f4651b, i10, baseInterpolator);
        int i11 = this.g + 1;
        this.g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f4655f = false;
    }

    public final void b(int i7, int i10, int i11, BaseInterpolator baseInterpolator) {
        this.f4650a = i7;
        this.f4651b = i10;
        this.f4652c = i11;
        this.f4654e = baseInterpolator;
        this.f4655f = true;
    }
}
