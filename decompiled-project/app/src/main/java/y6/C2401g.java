package y6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import ia.C1358d;
import java.util.BitSet;
import java.util.Objects;
import m4.C1584n0;
import p6.AbstractC1855a;
import p6.AbstractC1856b;
import q1.AbstractC1875a;
import q6.C1896a;
import x6.C2268a;

/* renamed from: y6.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2401g extends Drawable implements t {

    /* renamed from: K, reason: collision with root package name */
    public static final Paint f27024K;

    /* renamed from: A, reason: collision with root package name */
    public C2404j f27025A;

    /* renamed from: B, reason: collision with root package name */
    public final Paint f27026B;

    /* renamed from: C, reason: collision with root package name */
    public final Paint f27027C;

    /* renamed from: D, reason: collision with root package name */
    public final C2268a f27028D;

    /* renamed from: E, reason: collision with root package name */
    public final C1358d f27029E;

    /* renamed from: F, reason: collision with root package name */
    public final C1584n0 f27030F;

    /* renamed from: G, reason: collision with root package name */
    public PorterDuffColorFilter f27031G;

    /* renamed from: H, reason: collision with root package name */
    public PorterDuffColorFilter f27032H;

    /* renamed from: I, reason: collision with root package name */
    public final RectF f27033I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f27034J;

    /* renamed from: a, reason: collision with root package name */
    public C2400f f27035a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f27036b;

    /* renamed from: c, reason: collision with root package name */
    public final r[] f27037c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f27038d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f27039e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f27040f;

    /* renamed from: u, reason: collision with root package name */
    public final Path f27041u;

    /* renamed from: v, reason: collision with root package name */
    public final Path f27042v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f27043w;

    /* renamed from: x, reason: collision with root package name */
    public final RectF f27044x;

    /* renamed from: y, reason: collision with root package name */
    public final Region f27045y;

    /* renamed from: z, reason: collision with root package name */
    public final Region f27046z;

    static {
        Paint paint = new Paint(1);
        f27024K = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C2401g() {
        this(new C2404j());
    }

    public C2401g(Context context, AttributeSet attributeSet, int i7, int i10) {
        this(C2404j.b(context, attributeSet, i7, i10).c());
    }

    public C2401g(C2400f c2400f) {
        this.f27036b = new r[4];
        this.f27037c = new r[4];
        this.f27038d = new BitSet(8);
        this.f27040f = new Matrix();
        this.f27041u = new Path();
        this.f27042v = new Path();
        this.f27043w = new RectF();
        this.f27044x = new RectF();
        this.f27045y = new Region();
        this.f27046z = new Region();
        Paint paint = new Paint(1);
        this.f27026B = paint;
        Paint paint2 = new Paint(1);
        this.f27027C = paint2;
        this.f27028D = new C2268a();
        this.f27030F = Looper.getMainLooper().getThread() == Thread.currentThread() ? AbstractC2405k.f27057a : new C1584n0();
        this.f27033I = new RectF();
        this.f27034J = true;
        this.f27035a = c2400f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.f27029E = new C1358d(this, 25);
    }

    public C2401g(C2404j c2404j) {
        this(new C2400f(c2404j));
    }

    public final void b(RectF rectF, Path path) {
        C2400f c2400f = this.f27035a;
        this.f27030F.b(c2400f.f27011a, c2400f.f27018i, rectF, this.f27029E, path);
        if (this.f27035a.f27017h != 1.0f) {
            Matrix matrix = this.f27040f;
            matrix.reset();
            float f4 = this.f27035a.f27017h;
            matrix.setScale(f4, f4, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f27033I, true);
    }

    public final int c(int i7) {
        int i10;
        C2400f c2400f = this.f27035a;
        float f4 = c2400f.f27020m + 0.0f + c2400f.f27019l;
        C1896a c1896a = c2400f.f27012b;
        if (c1896a == null || !c1896a.f23509a || AbstractC1875a.h(i7, 255) != c1896a.f23512d) {
            return i7;
        }
        float min = (c1896a.f23513e <= 0.0f || f4 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f4 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i7);
        int u3 = q3.f.u(min, AbstractC1875a.h(i7, 255), c1896a.f23510b);
        if (min > 0.0f && (i10 = c1896a.f23511c) != 0) {
            u3 = AbstractC1875a.f(AbstractC1875a.h(i10, C1896a.f23508f), u3);
        }
        return AbstractC1875a.h(u3, alpha);
    }

    public final void d(Canvas canvas) {
        if (this.f27038d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i7 = this.f27035a.f27022o;
        Path path = this.f27041u;
        C2268a c2268a = this.f27028D;
        if (i7 != 0) {
            canvas.drawPath(path, c2268a.f26228a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            r rVar = this.f27036b[i10];
            int i11 = this.f27035a.f27021n;
            Matrix matrix = r.f27073b;
            rVar.a(matrix, c2268a, i11, canvas);
            this.f27037c[i10].a(matrix, c2268a, this.f27035a.f27021n, canvas);
        }
        if (this.f27034J) {
            double d10 = 0;
            int sin = (int) (Math.sin(Math.toRadians(d10)) * this.f27035a.f27022o);
            int cos = (int) (Math.cos(Math.toRadians(d10)) * this.f27035a.f27022o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f27024K);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f27026B;
        paint.setColorFilter(this.f27031G);
        int alpha = paint.getAlpha();
        int i7 = this.f27035a.k;
        paint.setAlpha(((i7 + (i7 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f27027C;
        paint2.setColorFilter(this.f27032H);
        paint2.setStrokeWidth(this.f27035a.j);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f27035a.k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z8 = this.f27039e;
        Path path = this.f27041u;
        if (z8) {
            float f4 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C2404j c2404j = this.f27035a.f27011a;
            L7.j e2 = c2404j.e();
            InterfaceC2397c interfaceC2397c = c2404j.f27052e;
            if (!(interfaceC2397c instanceof C2402h)) {
                interfaceC2397c = new C2396b(f4, interfaceC2397c);
            }
            e2.f6360f = interfaceC2397c;
            InterfaceC2397c interfaceC2397c2 = c2404j.f27053f;
            if (!(interfaceC2397c2 instanceof C2402h)) {
                interfaceC2397c2 = new C2396b(f4, interfaceC2397c2);
            }
            e2.g = interfaceC2397c2;
            InterfaceC2397c interfaceC2397c3 = c2404j.f27054h;
            if (!(interfaceC2397c3 instanceof C2402h)) {
                interfaceC2397c3 = new C2396b(f4, interfaceC2397c3);
            }
            e2.f6362i = interfaceC2397c3;
            InterfaceC2397c interfaceC2397c4 = c2404j.g;
            if (!(interfaceC2397c4 instanceof C2402h)) {
                interfaceC2397c4 = new C2396b(f4, interfaceC2397c4);
            }
            e2.f6361h = interfaceC2397c4;
            C2404j c10 = e2.c();
            this.f27025A = c10;
            float f10 = this.f27035a.f27018i;
            RectF rectF = this.f27044x;
            rectF.set(g());
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f27030F.b(c10, f10, rectF, null, this.f27042v);
            b(g(), path);
            this.f27039e = false;
        }
        C2400f c2400f = this.f27035a;
        c2400f.getClass();
        if (c2400f.f27021n > 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (!this.f27035a.f27011a.d(g()) && !path.isConvex() && i11 < 29) {
                canvas.save();
                double d10 = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d10)) * this.f27035a.f27022o), (int) (Math.cos(Math.toRadians(d10)) * this.f27035a.f27022o));
                if (this.f27034J) {
                    RectF rectF2 = this.f27033I;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f27035a.f27021n * 2) + ((int) rectF2.width()) + width, (this.f27035a.f27021n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f11 = (getBounds().left - this.f27035a.f27021n) - width;
                    float f12 = (getBounds().top - this.f27035a.f27021n) - height;
                    canvas2.translate(-f11, -f12);
                    d(canvas2);
                    canvas.drawBitmap(createBitmap, f11, f12, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        C2400f c2400f2 = this.f27035a;
        Paint.Style style = c2400f2.f27023p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, c2400f2.f27011a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, C2404j c2404j, RectF rectF) {
        if (!c2404j.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a9 = c2404j.f27053f.a(rectF) * this.f27035a.f27018i;
            canvas.drawRoundRect(rectF, a9, a9, paint);
        }
    }

    public void f(Canvas canvas) {
        Paint paint = this.f27027C;
        Path path = this.f27042v;
        C2404j c2404j = this.f27025A;
        RectF rectF = this.f27044x;
        rectF.set(g());
        float strokeWidth = h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, path, c2404j, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f27043w;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f27035a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f27035a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f27035a.getClass();
        if (this.f27035a.f27011a.d(g())) {
            outline.setRoundRect(getBounds(), this.f27035a.f27011a.f27052e.a(g()) * this.f27035a.f27018i);
            return;
        }
        RectF g = g();
        Path path = this.f27041u;
        b(g, path);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            AbstractC1856b.a(outline, path);
            return;
        }
        if (i7 >= 29) {
            try {
                AbstractC1855a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1855a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f27035a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f27045y;
        region.set(bounds);
        RectF g = g();
        Path path = this.f27041u;
        b(g, path);
        Region region2 = this.f27046z;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f27035a.f27023p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f27027C.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f27035a.f27012b = new C1896a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f27039e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f27035a.f27015e) == null || !colorStateList.isStateful())) {
            this.f27035a.getClass();
            ColorStateList colorStateList3 = this.f27035a.f27014d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f27035a.f27013c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(float f4) {
        C2400f c2400f = this.f27035a;
        if (c2400f.f27020m != f4) {
            c2400f.f27020m = f4;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        C2400f c2400f = this.f27035a;
        if (c2400f.f27013c != colorStateList) {
            c2400f.f27013c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z8;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f27035a.f27013c == null || color2 == (colorForState2 = this.f27035a.f27013c.getColorForState(iArr, (color2 = (paint2 = this.f27026B).getColor())))) {
            z8 = false;
        } else {
            paint2.setColor(colorForState2);
            z8 = true;
        }
        if (this.f27035a.f27014d == null || color == (colorForState = this.f27035a.f27014d.getColorForState(iArr, (color = (paint = this.f27027C).getColor())))) {
            return z8;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f27031G;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f27032H;
        C2400f c2400f = this.f27035a;
        ColorStateList colorStateList = c2400f.f27015e;
        PorterDuff.Mode mode = c2400f.f27016f;
        Paint paint = this.f27026B;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int c10 = c(color);
            porterDuffColorFilter = c10 != color ? new PorterDuffColorFilter(c10, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f27031G = porterDuffColorFilter;
        this.f27035a.getClass();
        this.f27032H = null;
        this.f27035a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f27031G) && Objects.equals(porterDuffColorFilter3, this.f27032H)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f27035a = new C2400f(this.f27035a);
        return this;
    }

    public final void n() {
        C2400f c2400f = this.f27035a;
        float f4 = c2400f.f27020m + 0.0f;
        c2400f.f27021n = (int) Math.ceil(0.75f * f4);
        this.f27035a.f27022o = (int) Math.ceil(f4 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f27039e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, s6.l
    public boolean onStateChange(int[] iArr) {
        boolean z8 = l(iArr) || m();
        if (z8) {
            invalidateSelf();
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        C2400f c2400f = this.f27035a;
        if (c2400f.k != i7) {
            c2400f.k = i7;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f27035a.getClass();
        super.invalidateSelf();
    }

    @Override // y6.t
    public final void setShapeAppearanceModel(C2404j c2404j) {
        this.f27035a.f27011a = c2404j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        setTintList(ColorStateList.valueOf(i7));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f27035a.f27015e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C2400f c2400f = this.f27035a;
        if (c2400f.f27016f != mode) {
            c2400f.f27016f = mode;
            m();
            super.invalidateSelf();
        }
    }
}
