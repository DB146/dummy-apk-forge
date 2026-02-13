package A8;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public abstract /* synthetic */ class g0 {
    public static /* synthetic */ LineBreakConfig.Builder g() {
        return new LineBreakConfig.Builder();
    }

    public static /* synthetic */ BoringLayout k(CharSequence charSequence, TextPaint textPaint, int i7, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z8, TextUtils.TruncateAt truncateAt, int i10) {
        return new BoringLayout(charSequence, textPaint, i7, alignment, 1.0f, 0.0f, metrics, z8, truncateAt, i10, true);
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher q(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }
}
