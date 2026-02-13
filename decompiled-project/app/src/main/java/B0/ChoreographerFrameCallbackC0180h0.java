package B0;

import android.view.Choreographer;
import java.util.ArrayList;

/* renamed from: B0.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0180h0 implements Choreographer.FrameCallback, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0182i0 f1908a;

    public ChoreographerFrameCallbackC0180h0(C0182i0 c0182i0) {
        this.f1908a = c0182i0;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f1908a.f1912d.removeCallbacks(this);
        C0182i0.X(this.f1908a);
        C0182i0 c0182i0 = this.f1908a;
        synchronized (c0182i0.f1913e) {
            if (c0182i0.f1918x) {
                c0182i0.f1918x = false;
                ArrayList arrayList = c0182i0.f1915u;
                c0182i0.f1915u = c0182i0.f1916v;
                c0182i0.f1916v = arrayList;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((Choreographer.FrameCallback) arrayList.get(i7)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0182i0.X(this.f1908a);
        C0182i0 c0182i0 = this.f1908a;
        synchronized (c0182i0.f1913e) {
            if (c0182i0.f1915u.isEmpty()) {
                c0182i0.f1911c.removeFrameCallback(this);
                c0182i0.f1918x = false;
            }
        }
    }
}
