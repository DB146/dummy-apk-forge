package o5;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import n5.D;

/* loaded from: classes.dex */
public final class r implements q, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f22021a;

    /* renamed from: b, reason: collision with root package name */
    public Q9.a f22022b;

    public r(DisplayManager displayManager) {
        this.f22021a = displayManager;
    }

    @Override // o5.q
    public final void b(Q9.a aVar) {
        this.f22022b = aVar;
        Handler m10 = D.m(null);
        DisplayManager displayManager = this.f22021a;
        displayManager.registerDisplayListener(this, m10);
        aVar.f(displayManager.getDisplay(0));
    }

    @Override // o5.q
    public final void c() {
        this.f22021a.unregisterDisplayListener(this);
        this.f22022b = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i7) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i7) {
        Q9.a aVar = this.f22022b;
        if (aVar == null || i7 != 0) {
            return;
        }
        aVar.f(this.f22021a.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i7) {
    }
}
