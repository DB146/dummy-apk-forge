package M0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f6551b;

    public k(boolean z8, boolean z10) {
        this.f6550a = z8;
        this.f6551b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f6550a);
        textPaint.setStrikeThruText(this.f6551b);
    }
}
