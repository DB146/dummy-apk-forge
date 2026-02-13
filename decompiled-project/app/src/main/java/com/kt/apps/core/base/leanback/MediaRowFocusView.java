package com.kt.apps.core.base.leanback;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public class MediaRowFocusView extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f15955a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f15956b;

    /* renamed from: c, reason: collision with root package name */
    public int f15957c;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15956b = new RectF();
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(R.color.lb_playback_media_row_highlight_color));
        this.f15955a = paint;
    }

    public int getRoundRectRadius() {
        return this.f15957c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f15957c = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        RectF rectF = this.f15956b;
        rectF.set(0.0f, -height2, getWidth(), getHeight() + height2);
        int i7 = this.f15957c;
        canvas.drawRoundRect(rectF, i7, i7, this.f15955a);
    }
}
