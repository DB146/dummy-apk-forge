package l5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: A, reason: collision with root package name */
    public int f19369A;

    /* renamed from: B, reason: collision with root package name */
    public int f19370B;

    /* renamed from: C, reason: collision with root package name */
    public int f19371C;

    /* renamed from: D, reason: collision with root package name */
    public int f19372D;

    /* renamed from: E, reason: collision with root package name */
    public StaticLayout f19373E;

    /* renamed from: F, reason: collision with root package name */
    public StaticLayout f19374F;

    /* renamed from: G, reason: collision with root package name */
    public int f19375G;

    /* renamed from: H, reason: collision with root package name */
    public int f19376H;

    /* renamed from: I, reason: collision with root package name */
    public int f19377I;

    /* renamed from: J, reason: collision with root package name */
    public Rect f19378J;

    /* renamed from: a, reason: collision with root package name */
    public final float f19379a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19380b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19381c;

    /* renamed from: d, reason: collision with root package name */
    public final float f19382d;

    /* renamed from: e, reason: collision with root package name */
    public final float f19383e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f19384f;
    public final Paint g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f19385h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f19386i;
    public Layout.Alignment j;
    public Bitmap k;

    /* renamed from: l, reason: collision with root package name */
    public float f19387l;

    /* renamed from: m, reason: collision with root package name */
    public int f19388m;

    /* renamed from: n, reason: collision with root package name */
    public int f19389n;

    /* renamed from: o, reason: collision with root package name */
    public float f19390o;

    /* renamed from: p, reason: collision with root package name */
    public int f19391p;

    /* renamed from: q, reason: collision with root package name */
    public float f19392q;

    /* renamed from: r, reason: collision with root package name */
    public float f19393r;

    /* renamed from: s, reason: collision with root package name */
    public int f19394s;

    /* renamed from: t, reason: collision with root package name */
    public int f19395t;

    /* renamed from: u, reason: collision with root package name */
    public int f19396u;

    /* renamed from: v, reason: collision with root package name */
    public int f19397v;

    /* renamed from: w, reason: collision with root package name */
    public int f19398w;

    /* renamed from: x, reason: collision with root package name */
    public float f19399x;

    /* renamed from: y, reason: collision with root package name */
    public float f19400y;

    /* renamed from: z, reason: collision with root package name */
    public float f19401z;

    public K(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f19383e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f19382d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f19379a = round;
        this.f19380b = round;
        this.f19381c = round;
        TextPaint textPaint = new TextPaint();
        this.f19384f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f19385h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z8) {
        if (!z8) {
            this.f19378J.getClass();
            this.k.getClass();
            canvas.drawBitmap(this.k, (Rect) null, this.f19378J, this.f19385h);
            return;
        }
        StaticLayout staticLayout = this.f19373E;
        StaticLayout staticLayout2 = this.f19374F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f19375G, this.f19376H);
        if (Color.alpha(this.f19396u) > 0) {
            Paint paint = this.g;
            paint.setColor(this.f19396u);
            canvas.drawRect(-this.f19377I, 0.0f, staticLayout.getWidth() + this.f19377I, staticLayout.getHeight(), paint);
        }
        int i7 = this.f19398w;
        TextPaint textPaint = this.f19384f;
        if (i7 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f19379a);
            textPaint.setColor(this.f19397v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f4 = this.f19380b;
            if (i7 == 2) {
                float f10 = this.f19381c;
                textPaint.setShadowLayer(f4, f10, f10, this.f19397v);
            } else if (i7 == 3 || i7 == 4) {
                boolean z10 = i7 == 3;
                int i10 = z10 ? -1 : this.f19397v;
                int i11 = z10 ? this.f19397v : -1;
                float f11 = f4 / 2.0f;
                textPaint.setColor(this.f19394s);
                textPaint.setStyle(Paint.Style.FILL);
                float f12 = -f11;
                textPaint.setShadowLayer(f4, f12, f12, i10);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f4, f11, f11, i11);
            }
        }
        textPaint.setColor(this.f19394s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }
}
