package y1;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class r0 extends q0 {
    @Override // q3.f
    public final void A(boolean z8) {
        if (!z8) {
            F(16);
            return;
        }
        Window window = this.f26733a;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }
}
