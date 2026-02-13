package B0;

import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: B0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0182i0 extends cc.A {

    /* renamed from: A, reason: collision with root package name */
    public static final Db.o f1909A = android.support.v4.media.session.b.z(Y.f1834v);

    /* renamed from: B, reason: collision with root package name */
    public static final C0178g0 f1910B = new C0178g0(0);

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f1911c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1912d;

    /* renamed from: w, reason: collision with root package name */
    public boolean f1917w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1918x;

    /* renamed from: z, reason: collision with root package name */
    public final C0186k0 f1920z;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1913e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Eb.l f1914f = new Eb.l();

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f1915u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f1916v = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public final ChoreographerFrameCallbackC0180h0 f1919y = new ChoreographerFrameCallbackC0180h0(this);

    public C0182i0(Choreographer choreographer, Handler handler) {
        this.f1911c = choreographer;
        this.f1912d = handler;
        this.f1920z = new C0186k0(choreographer, this);
    }

    public static final void X(C0182i0 c0182i0) {
        Runnable runnable;
        boolean z8;
        do {
            synchronized (c0182i0.f1913e) {
                Eb.l lVar = c0182i0.f1914f;
                runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (c0182i0.f1913e) {
                    Eb.l lVar2 = c0182i0.f1914f;
                    runnable = (Runnable) (lVar2.isEmpty() ? null : lVar2.removeFirst());
                }
            }
            synchronized (c0182i0.f1913e) {
                if (c0182i0.f1914f.isEmpty()) {
                    z8 = false;
                    c0182i0.f1917w = false;
                } else {
                    z8 = true;
                }
            }
        } while (z8);
    }

    @Override // cc.A
    public final void T(Hb.i iVar, Runnable runnable) {
        synchronized (this.f1913e) {
            this.f1914f.addLast(runnable);
            if (!this.f1917w) {
                this.f1917w = true;
                this.f1912d.post(this.f1919y);
                if (!this.f1918x) {
                    this.f1918x = true;
                    this.f1911c.postFrameCallback(this.f1919y);
                }
            }
        }
    }
}
