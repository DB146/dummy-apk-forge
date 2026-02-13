package M0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f6546a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6547b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6548c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6549d;

    public j(float f4, float f10, float f11, int i7) {
        this.f6546a = i7;
        this.f6547b = f4;
        this.f6548c = f10;
        this.f6549d = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f6549d, this.f6547b, this.f6548c, this.f6546a);
    }
}
