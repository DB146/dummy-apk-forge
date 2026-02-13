package A9;

import android.os.Handler;
import android.view.ViewGroup;
import android.widget.ProgressBar;

/* renamed from: A9.o2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0121o2 {

    /* renamed from: b, reason: collision with root package name */
    public y9.p f1328b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f1329c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f1330d;
    public boolean g;

    /* renamed from: a, reason: collision with root package name */
    public long f1327a = 1000;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f1331e = new Handler();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1332f = true;

    /* renamed from: h, reason: collision with root package name */
    public final RunnableC0102k f1333h = new RunnableC0102k(this, 6);

    public final void a() {
        this.g = false;
        ProgressBar progressBar = this.f1330d;
        if (progressBar != null) {
            this.f1329c.removeView(progressBar);
            this.f1330d = null;
        }
        this.f1331e.removeCallbacks(this.f1333h);
        y9.p pVar = this.f1328b;
        if (pVar != null) {
            pVar.a(false);
        }
    }

    public final void b() {
        if (this.f1332f) {
            this.g = true;
            this.f1331e.postDelayed(this.f1333h, this.f1327a);
            y9.p pVar = this.f1328b;
            if (pVar != null) {
                pVar.a(true);
            }
        }
    }
}
