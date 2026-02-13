package cn.pedant.SweetAlert;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public class SuccessTickView extends View {
    private final float CONST_LEFT_RECT_W;
    private final float CONST_RADIUS;
    private final float CONST_RECT_WEIGHT;
    private final float CONST_RIGHT_RECT_W;
    private final float MAX_RIGHT_RECT_W;
    private final float MIN_LEFT_RECT_W;
    private float mDensity;
    private boolean mLeftRectGrowMode;
    private float mLeftRectWidth;
    private float mMaxLeftRectWidth;
    private Paint mPaint;
    private float mRightRectWidth;

    public SuccessTickView(Context context) {
        super(context);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float dip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = dip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = dip2px(6.7f) + dip2px;
        init();
    }

    public SuccessTickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float dip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = dip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = dip2px(6.7f) + dip2px;
        init();
    }

    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(getResources().getColor(R.color.success_stroke_color));
        this.mLeftRectWidth = this.CONST_LEFT_RECT_W;
        this.mRightRectWidth = this.CONST_RIGHT_RECT_W;
        this.mLeftRectGrowMode = false;
    }

    public float dip2px(float f4) {
        if (this.mDensity == -1.0f) {
            this.mDensity = getResources().getDisplayMetrics().density;
        }
        return (f4 * this.mDensity) + 0.5f;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        canvas.rotate(45.0f, width / 2, height / 2);
        int i7 = (int) (height / 1.4d);
        float f4 = (int) (width / 1.2d);
        this.mMaxLeftRectWidth = (((this.CONST_LEFT_RECT_W + f4) / 2.0f) + this.CONST_RECT_WEIGHT) - 1.0f;
        RectF rectF = new RectF();
        if (this.mLeftRectGrowMode) {
            rectF.left = 0.0f;
            rectF.right = 0.0f + this.mLeftRectWidth;
            float f10 = (i7 + this.CONST_RIGHT_RECT_W) / 2.0f;
            rectF.top = f10;
            rectF.bottom = f10 + this.CONST_RECT_WEIGHT;
        } else {
            float f11 = (this.CONST_LEFT_RECT_W + f4) / 2.0f;
            float f12 = this.CONST_RECT_WEIGHT;
            float f13 = (f11 + f12) - 1.0f;
            rectF.right = f13;
            rectF.left = f13 - this.mLeftRectWidth;
            float f14 = (i7 + this.CONST_RIGHT_RECT_W) / 2.0f;
            rectF.top = f14;
            rectF.bottom = f14 + f12;
        }
        float f15 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF, f15, f15, this.mPaint);
        RectF rectF2 = new RectF();
        float f16 = (i7 + this.CONST_RIGHT_RECT_W) / 2.0f;
        float f17 = this.CONST_RECT_WEIGHT;
        float f18 = (f16 + f17) - 1.0f;
        rectF2.bottom = f18;
        float f19 = (f4 + this.CONST_LEFT_RECT_W) / 2.0f;
        rectF2.left = f19;
        rectF2.right = f19 + f17;
        rectF2.top = f18 - this.mRightRectWidth;
        float f20 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF2, f20, f20, this.mPaint);
    }

    public void startTickAnim() {
        this.mLeftRectWidth = 0.0f;
        this.mRightRectWidth = 0.0f;
        invalidate();
        Animation animation = new Animation() { // from class: cn.pedant.SweetAlert.SuccessTickView.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f4, Transformation transformation) {
                super.applyTransformation(f4, transformation);
                double d10 = f4;
                if (0.54d < d10 && 0.7d >= d10) {
                    SuccessTickView.this.mLeftRectGrowMode = true;
                    SuccessTickView successTickView = SuccessTickView.this;
                    successTickView.mLeftRectWidth = ((f4 - 0.54f) / 0.16f) * successTickView.mMaxLeftRectWidth;
                    if (0.65d < d10) {
                        SuccessTickView successTickView2 = SuccessTickView.this;
                        successTickView2.mRightRectWidth = ((f4 - 0.65f) / 0.19f) * successTickView2.MAX_RIGHT_RECT_W;
                    }
                    SuccessTickView.this.invalidate();
                    return;
                }
                if (0.7d < d10 && 0.84d >= d10) {
                    SuccessTickView.this.mLeftRectGrowMode = false;
                    SuccessTickView successTickView3 = SuccessTickView.this;
                    successTickView3.mLeftRectWidth = (1.0f - ((f4 - 0.7f) / 0.14f)) * successTickView3.mMaxLeftRectWidth;
                    SuccessTickView successTickView4 = SuccessTickView.this;
                    successTickView4.mLeftRectWidth = successTickView4.mLeftRectWidth < SuccessTickView.this.MIN_LEFT_RECT_W ? SuccessTickView.this.MIN_LEFT_RECT_W : SuccessTickView.this.mLeftRectWidth;
                    SuccessTickView successTickView5 = SuccessTickView.this;
                    successTickView5.mRightRectWidth = ((f4 - 0.65f) / 0.19f) * successTickView5.MAX_RIGHT_RECT_W;
                    SuccessTickView.this.invalidate();
                    return;
                }
                if (0.84d >= d10 || 1.0f < f4) {
                    return;
                }
                SuccessTickView.this.mLeftRectGrowMode = false;
                SuccessTickView successTickView6 = SuccessTickView.this;
                float f10 = (f4 - 0.84f) / 0.16f;
                successTickView6.mLeftRectWidth = ((SuccessTickView.this.CONST_LEFT_RECT_W - SuccessTickView.this.MIN_LEFT_RECT_W) * f10) + successTickView6.MIN_LEFT_RECT_W;
                SuccessTickView successTickView7 = SuccessTickView.this;
                successTickView7.mRightRectWidth = ((1.0f - f10) * (SuccessTickView.this.MAX_RIGHT_RECT_W - SuccessTickView.this.CONST_RIGHT_RECT_W)) + successTickView7.CONST_RIGHT_RECT_W;
                SuccessTickView.this.invalidate();
            }
        };
        animation.setDuration(750L);
        animation.setStartOffset(100L);
        startAnimation(animation);
    }
}
