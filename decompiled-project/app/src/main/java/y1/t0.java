package y1;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class t0 extends q3.f {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsetsController f26736a;

    /* renamed from: b, reason: collision with root package name */
    public final Window f26737b;

    public t0(Window window, Y5.B b2) {
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f26736a = insetsController;
        this.f26737b = window;
    }

    @Override // q3.f
    public final void A(boolean z8) {
        Window window = this.f26737b;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f26736a.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f26736a.setSystemBarsAppearance(0, 16);
    }

    @Override // q3.f
    public final void B(boolean z8) {
        Window window = this.f26737b;
        if (z8) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f26736a.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f26736a.setSystemBarsAppearance(0, 8);
    }

    @Override // q3.f
    public boolean r() {
        int systemBarsAppearance;
        this.f26736a.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.f26736a.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }
}
