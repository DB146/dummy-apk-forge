package F;

import Q.v0;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0258b implements T, v0, Runnable, Choreographer.FrameCallback {

    /* renamed from: u, reason: collision with root package name */
    public static long f3958u;

    /* renamed from: a, reason: collision with root package name */
    public final View f3959a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3961c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3963e;

    /* renamed from: f, reason: collision with root package name */
    public long f3964f;

    /* renamed from: b, reason: collision with root package name */
    public final S.e f3960b = new S.e(new S[16]);

    /* renamed from: d, reason: collision with root package name */
    public final Choreographer f3962d = Choreographer.getInstance();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r5 >= 30.0f) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RunnableC0258b(View view) {
        float f4;
        this.f3959a = view;
        if (f3958u == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f4 = display.getRefreshRate();
            }
            f4 = 60.0f;
            f3958u = 1000000000 / f4;
        }
    }

    @Override // F.T
    public final void a(S s3) {
        this.f3960b.b(s3);
        if (this.f3961c) {
            return;
        }
        this.f3961c = true;
        this.f3959a.post(this);
    }

    @Override // Q.v0
    public final void b() {
        this.f3963e = true;
    }

    @Override // Q.v0
    public final void c() {
    }

    @Override // Q.v0
    public final void d() {
        this.f3963e = false;
        this.f3959a.removeCallbacks(this);
        this.f3962d.removeFrameCallback(this);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.f3963e) {
            this.f3964f = j;
            this.f3959a.post(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [F.a, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        S.e eVar = this.f3960b;
        if (eVar.f8961c == 0 || !this.f3961c || !this.f3963e || this.f3959a.getWindowVisibility() != 0) {
            this.f3961c = false;
            return;
        }
        long j = this.f3964f + f3958u;
        ?? obj = new Object();
        obj.f3957a = j;
        boolean z8 = false;
        while (eVar.f8961c != 0 && !z8) {
            if (Math.max(0L, obj.f3957a - System.nanoTime()) <= 0 || ((S) eVar.f8959a[0]).a(obj)) {
                z8 = true;
            } else {
                eVar.l(0);
            }
        }
        if (z8) {
            this.f3962d.postFrameCallback(this);
        } else {
            this.f3961c = false;
        }
    }
}
