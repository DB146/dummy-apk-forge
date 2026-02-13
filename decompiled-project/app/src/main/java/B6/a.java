package B6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.leanback.tab.LeanbackTabLayout;
import d6.AbstractC1053a;

/* loaded from: classes.dex */
public final class a extends U9.i {

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ int f2112C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i7) {
        super(2);
        this.f2112C = i7;
    }

    @Override // U9.i
    public final void l(LeanbackTabLayout leanbackTabLayout, View view, View view2, float f4, Drawable drawable) {
        float cos;
        float f10;
        switch (this.f2112C) {
            case 0:
                RectF g = U9.i.g(leanbackTabLayout, view);
                RectF g2 = U9.i.g(leanbackTabLayout, view2);
                if (g.left < g2.left) {
                    double d10 = (f4 * 3.141592653589793d) / 2.0d;
                    f10 = (float) (1.0d - Math.cos(d10));
                    cos = (float) Math.sin(d10);
                } else {
                    double d11 = (f4 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d11);
                    cos = (float) (1.0d - Math.cos(d11));
                    f10 = sin;
                }
                drawable.setBounds(AbstractC1053a.c(f10, (int) g.left, (int) g2.left), drawable.getBounds().top, AbstractC1053a.c(cos, (int) g.right, (int) g2.right), drawable.getBounds().bottom);
                return;
            default:
                if (f4 >= 0.5f) {
                    view = view2;
                }
                RectF g10 = U9.i.g(leanbackTabLayout, view);
                float b2 = f4 < 0.5f ? AbstractC1053a.b(1.0f, 0.0f, 0.0f, 0.5f, f4) : AbstractC1053a.b(0.0f, 1.0f, 0.5f, 1.0f, f4);
                drawable.setBounds((int) g10.left, drawable.getBounds().top, (int) g10.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (b2 * 255.0f));
                return;
        }
    }
}
