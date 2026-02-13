package y1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class q0 extends q3.f {

    /* renamed from: a, reason: collision with root package name */
    public final Window f26733a;

    public q0(Window window, Y5.B b2) {
        this.f26733a = window;
    }

    @Override // q3.f
    public final void B(boolean z8) {
        if (!z8) {
            F(8192);
            return;
        }
        Window window = this.f26733a;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void F(int i7) {
        View decorView = this.f26733a.getDecorView();
        decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
    }

    @Override // q3.f
    public final boolean r() {
        return (this.f26733a.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}
