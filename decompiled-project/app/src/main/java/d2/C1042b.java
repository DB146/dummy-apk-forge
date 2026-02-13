package d2;

import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1042b {

    /* renamed from: a, reason: collision with root package name */
    public final float f16486a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16487b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f16488c;

    public C1042b(int i7, float f4, float f10) {
        f4 = f4 > 1.0f ? 1.0f : f4;
        f4 = f4 < 0.0f ? 0.0f : f4;
        f10 = f10 > 1.0f ? 1.0f : f10;
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        Paint paint = new Paint();
        this.f16488c = paint;
        paint.setColor(Color.rgb(Color.red(i7), Color.green(i7), Color.blue(i7)));
        this.f16486a = f4;
        this.f16487b = f11;
        b(1.0f);
    }

    public static C1042b a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0708a.f12484b);
        int color = obtainStyledAttributes.getColor(36, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = obtainStyledAttributes.getFraction(34, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = obtainStyledAttributes.getFraction(35, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        obtainStyledAttributes.recycle();
        return new C1042b(color, fraction, fraction2);
    }

    public final void b(float f4) {
        float f10 = this.f16486a;
        float f11 = this.f16487b;
        this.f16488c.setAlpha((int) ((((f10 - f11) * f4) + f11) * 255.0f));
    }
}
