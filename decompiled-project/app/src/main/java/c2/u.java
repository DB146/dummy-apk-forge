package c2;

import B0.C;
import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f14234b;

    /* renamed from: c, reason: collision with root package name */
    public ProgressBar f14235c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14238f;

    /* renamed from: a, reason: collision with root package name */
    public long f14233a = 1000;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f14236d = new Handler();

    /* renamed from: e, reason: collision with root package name */
    public boolean f14237e = true;
    public final C g = new C(this, 25);

    public final void a() {
        this.f14238f = false;
        ProgressBar progressBar = this.f14235c;
        if (progressBar != null) {
            this.f14234b.removeView(progressBar);
            this.f14235c = null;
        }
        this.f14236d.removeCallbacks(this.g);
    }

    public final void b() {
        if (this.f14237e) {
            this.f14238f = true;
            this.f14236d.postDelayed(this.g, this.f14233a);
        }
    }
}
