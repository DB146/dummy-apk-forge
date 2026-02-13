package c3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import u.C2052e;

/* renamed from: c3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0898o extends AbstractC0889f {

    /* renamed from: x, reason: collision with root package name */
    public static final PorterDuff.Mode f14322x = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public C0896m f14323b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f14324c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f14325d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14326e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14327f;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f14328u;

    /* renamed from: v, reason: collision with root package name */
    public final Matrix f14329v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f14330w;

    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, c3.m] */
    public C0898o() {
        this.f14327f = true;
        this.f14328u = new float[9];
        this.f14329v = new Matrix();
        this.f14330w = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f14314c = null;
        constantState.f14315d = f14322x;
        constantState.f14313b = new C0895l();
        this.f14323b = constantState;
    }

    public C0898o(C0896m c0896m) {
        this.f14327f = true;
        this.f14328u = new float[9];
        this.f14329v = new Matrix();
        this.f14330w = new Rect();
        this.f14323b = c0896m;
        this.f14324c = a(c0896m.f14314c, c0896m.f14315d);
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14279a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f14330w;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f14325d;
        if (colorFilter == null) {
            colorFilter = this.f14324c;
        }
        Matrix matrix = this.f14329v;
        canvas.getMatrix(matrix);
        float[] fArr = this.f14328u;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0896m c0896m = this.f14323b;
        Bitmap bitmap = c0896m.f14317f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c0896m.f14317f.getHeight()) {
            c0896m.f14317f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c0896m.k = true;
        }
        if (this.f14327f) {
            C0896m c0896m2 = this.f14323b;
            if (c0896m2.k || c0896m2.g != c0896m2.f14314c || c0896m2.f14318h != c0896m2.f14315d || c0896m2.j != c0896m2.f14316e || c0896m2.f14319i != c0896m2.f14313b.getRootAlpha()) {
                C0896m c0896m3 = this.f14323b;
                c0896m3.f14317f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0896m3.f14317f);
                C0895l c0895l = c0896m3.f14313b;
                c0895l.a(c0895l.g, C0895l.f14299p, canvas2, min, min2);
                C0896m c0896m4 = this.f14323b;
                c0896m4.g = c0896m4.f14314c;
                c0896m4.f14318h = c0896m4.f14315d;
                c0896m4.f14319i = c0896m4.f14313b.getRootAlpha();
                c0896m4.j = c0896m4.f14316e;
                c0896m4.k = false;
            }
        } else {
            C0896m c0896m5 = this.f14323b;
            c0896m5.f14317f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0896m5.f14317f);
            C0895l c0895l2 = c0896m5.f14313b;
            c0895l2.a(c0895l2.g, C0895l.f14299p, canvas3, min, min2);
        }
        C0896m c0896m6 = this.f14323b;
        if (c0896m6.f14313b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0896m6.f14320l == null) {
                Paint paint2 = new Paint();
                c0896m6.f14320l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0896m6.f14320l.setAlpha(c0896m6.f14313b.getRootAlpha());
            c0896m6.f14320l.setColorFilter(colorFilter);
            paint = c0896m6.f14320l;
        }
        canvas.drawBitmap(c0896m6.f14317f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getAlpha() : this.f14323b.f14313b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f14323b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getColorFilter() : this.f14325d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f14279a != null) {
            return new C0897n(this.f14279a.getConstantState());
        }
        this.f14323b.f14312a = getChangingConfigurations();
        return this.f14323b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f14323b.f14313b.f14307i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f14323b.f14313b.f14306h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14, types: [c3.k, c3.h, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0895l c0895l;
        int i7;
        boolean z8;
        char c10;
        int i10;
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0896m c0896m = this.f14323b;
        c0896m.f14313b = new C0895l();
        TypedArray h10 = n1.b.h(resources, theme, attributeSet, AbstractC0884a.f14261a);
        C0896m c0896m2 = this.f14323b;
        C0895l c0895l2 = c0896m2.f14313b;
        int i11 = !n1.b.e(xmlPullParser, "tintMode") ? -1 : h10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0896m2.f14315d = mode;
        int i13 = 1;
        ColorStateList colorStateList = null;
        boolean z10 = false;
        if (n1.b.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            h10.getValue(1, typedValue);
            int i14 = typedValue.type;
            if (i14 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i14 < 28 || i14 > 31) {
                Resources resources2 = h10.getResources();
                int resourceId = h10.getResourceId(1, 0);
                ThreadLocal threadLocal = n1.c.f21029a;
                try {
                    colorStateList = n1.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c0896m2.f14314c = colorStateList2;
        }
        boolean z11 = c0896m2.f14316e;
        if (n1.b.e(xmlPullParser, "autoMirrored")) {
            z11 = h10.getBoolean(5, z11);
        }
        c0896m2.f14316e = z11;
        float f4 = c0895l2.j;
        if (n1.b.e(xmlPullParser, "viewportWidth")) {
            f4 = h10.getFloat(7, f4);
        }
        c0895l2.j = f4;
        float f10 = c0895l2.k;
        if (n1.b.e(xmlPullParser, "viewportHeight")) {
            f10 = h10.getFloat(8, f10);
        }
        c0895l2.k = f10;
        if (c0895l2.j <= 0.0f) {
            throw new XmlPullParserException(h10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(h10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0895l2.f14306h = h10.getDimension(3, c0895l2.f14306h);
        float dimension = h10.getDimension(2, c0895l2.f14307i);
        c0895l2.f14307i = dimension;
        if (c0895l2.f14306h <= 0.0f) {
            throw new XmlPullParserException(h10.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(h10.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = c0895l2.getAlpha();
        if (n1.b.e(xmlPullParser, "alpha")) {
            alpha = h10.getFloat(4, alpha);
        }
        c0895l2.setAlpha(alpha);
        String string = h10.getString(0);
        if (string != null) {
            c0895l2.f14309m = string;
            c0895l2.f14311o.put(string, c0895l2);
        }
        h10.recycle();
        c0896m.f14312a = getChangingConfigurations();
        c0896m.k = true;
        C0896m c0896m3 = this.f14323b;
        C0895l c0895l3 = c0896m3.f14313b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0895l3.g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z12 = true;
        while (eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != i12)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0892i c0892i = (C0892i) arrayDeque.peek();
                boolean equals = "path".equals(name);
                C2052e c2052e = c0895l3.f14311o;
                c0895l = c0895l3;
                if (equals) {
                    ?? abstractC0894k = new AbstractC0894k();
                    abstractC0894k.f14281e = 0.0f;
                    abstractC0894k.g = 1.0f;
                    abstractC0894k.f14283h = 1.0f;
                    abstractC0894k.f14284i = 0.0f;
                    abstractC0894k.j = 1.0f;
                    abstractC0894k.k = 0.0f;
                    Paint.Cap cap = Paint.Cap.BUTT;
                    abstractC0894k.f14285l = cap;
                    Paint.Join join = Paint.Join.MITER;
                    abstractC0894k.f14286m = join;
                    i7 = depth;
                    abstractC0894k.f14287n = 4.0f;
                    TypedArray h11 = n1.b.h(resources, theme, attributeSet, AbstractC0884a.f14263c);
                    if (n1.b.e(xmlPullParser, "pathData")) {
                        String string2 = h11.getString(0);
                        if (string2 != null) {
                            abstractC0894k.f14297b = string2;
                        }
                        String string3 = h11.getString(2);
                        if (string3 != null) {
                            abstractC0894k.f14296a = tc.b.q(string3);
                        }
                        abstractC0894k.f14282f = n1.b.c(h11, xmlPullParser, theme, "fillColor", 1);
                        float f11 = abstractC0894k.f14283h;
                        if (n1.b.e(xmlPullParser, "fillAlpha")) {
                            f11 = h11.getFloat(12, f11);
                        }
                        abstractC0894k.f14283h = f11;
                        int i15 = !n1.b.e(xmlPullParser, "strokeLineCap") ? -1 : h11.getInt(8, -1);
                        abstractC0894k.f14285l = i15 != 0 ? i15 != 1 ? i15 != 2 ? abstractC0894k.f14285l : Paint.Cap.SQUARE : Paint.Cap.ROUND : cap;
                        int i16 = !n1.b.e(xmlPullParser, "strokeLineJoin") ? -1 : h11.getInt(9, -1);
                        Paint.Join join2 = abstractC0894k.f14286m;
                        if (i16 != 0) {
                            join = i16 != 1 ? i16 != 2 ? join2 : Paint.Join.BEVEL : Paint.Join.ROUND;
                        }
                        abstractC0894k.f14286m = join;
                        float f12 = abstractC0894k.f14287n;
                        if (n1.b.e(xmlPullParser, "strokeMiterLimit")) {
                            f12 = h11.getFloat(10, f12);
                        }
                        abstractC0894k.f14287n = f12;
                        abstractC0894k.f14280d = n1.b.c(h11, xmlPullParser, theme, "strokeColor", 3);
                        float f13 = abstractC0894k.g;
                        if (n1.b.e(xmlPullParser, "strokeAlpha")) {
                            f13 = h11.getFloat(11, f13);
                        }
                        abstractC0894k.g = f13;
                        float f14 = abstractC0894k.f14281e;
                        if (n1.b.e(xmlPullParser, "strokeWidth")) {
                            f14 = h11.getFloat(4, f14);
                        }
                        abstractC0894k.f14281e = f14;
                        float f15 = abstractC0894k.j;
                        if (n1.b.e(xmlPullParser, "trimPathEnd")) {
                            f15 = h11.getFloat(6, f15);
                        }
                        abstractC0894k.j = f15;
                        float f16 = abstractC0894k.k;
                        if (n1.b.e(xmlPullParser, "trimPathOffset")) {
                            f16 = h11.getFloat(7, f16);
                        }
                        abstractC0894k.k = f16;
                        float f17 = abstractC0894k.f14284i;
                        if (n1.b.e(xmlPullParser, "trimPathStart")) {
                            f17 = h11.getFloat(5, f17);
                        }
                        abstractC0894k.f14284i = f17;
                        int i17 = abstractC0894k.f14298c;
                        if (n1.b.e(xmlPullParser, "fillType")) {
                            i17 = h11.getInt(13, i17);
                        }
                        abstractC0894k.f14298c = i17;
                    }
                    h11.recycle();
                    c0892i.f14289b.add(abstractC0894k);
                    if (abstractC0894k.getPathName() != null) {
                        c2052e.put(abstractC0894k.getPathName(), abstractC0894k);
                    }
                    c0896m3.f14312a = c0896m3.f14312a;
                    z8 = false;
                    c10 = '\b';
                    z12 = false;
                } else {
                    i7 = depth;
                    c10 = '\b';
                    if ("clip-path".equals(name)) {
                        AbstractC0894k abstractC0894k2 = new AbstractC0894k();
                        if (n1.b.e(xmlPullParser, "pathData")) {
                            TypedArray h12 = n1.b.h(resources, theme, attributeSet, AbstractC0884a.f14264d);
                            String string4 = h12.getString(0);
                            if (string4 != null) {
                                abstractC0894k2.f14297b = string4;
                            }
                            String string5 = h12.getString(1);
                            if (string5 != null) {
                                abstractC0894k2.f14296a = tc.b.q(string5);
                            }
                            abstractC0894k2.f14298c = !n1.b.e(xmlPullParser, "fillType") ? 0 : h12.getInt(2, 0);
                            h12.recycle();
                        }
                        c0892i.f14289b.add(abstractC0894k2);
                        if (abstractC0894k2.getPathName() != null) {
                            c2052e.put(abstractC0894k2.getPathName(), abstractC0894k2);
                        }
                        c0896m3.f14312a = c0896m3.f14312a;
                    } else if ("group".equals(name)) {
                        C0892i c0892i2 = new C0892i();
                        TypedArray h13 = n1.b.h(resources, theme, attributeSet, AbstractC0884a.f14262b);
                        float f18 = c0892i2.f14290c;
                        if (n1.b.e(xmlPullParser, "rotation")) {
                            f18 = h13.getFloat(5, f18);
                        }
                        c0892i2.f14290c = f18;
                        c0892i2.f14291d = h13.getFloat(1, c0892i2.f14291d);
                        c0892i2.f14292e = h13.getFloat(2, c0892i2.f14292e);
                        float f19 = c0892i2.f14293f;
                        if (n1.b.e(xmlPullParser, "scaleX")) {
                            f19 = h13.getFloat(3, f19);
                        }
                        c0892i2.f14293f = f19;
                        float f20 = c0892i2.g;
                        if (n1.b.e(xmlPullParser, "scaleY")) {
                            f20 = h13.getFloat(4, f20);
                        }
                        c0892i2.g = f20;
                        float f21 = c0892i2.f14294h;
                        if (n1.b.e(xmlPullParser, "translateX")) {
                            f21 = h13.getFloat(6, f21);
                        }
                        c0892i2.f14294h = f21;
                        float f22 = c0892i2.f14295i;
                        if (n1.b.e(xmlPullParser, "translateY")) {
                            f22 = h13.getFloat(7, f22);
                        }
                        c0892i2.f14295i = f22;
                        z8 = false;
                        String string6 = h13.getString(0);
                        if (string6 != null) {
                            c0892i2.k = string6;
                        }
                        c0892i2.c();
                        h13.recycle();
                        c0892i.f14289b.add(c0892i2);
                        arrayDeque.push(c0892i2);
                        if (c0892i2.getGroupName() != null) {
                            c2052e.put(c0892i2.getGroupName(), c0892i2);
                        }
                        c0896m3.f14312a = c0896m3.f14312a;
                    }
                    z8 = false;
                }
                i12 = 3;
                i10 = 1;
            } else {
                c0895l = c0895l3;
                i7 = depth;
                z8 = z10;
                c10 = '\b';
                i10 = i13;
                i12 = 3;
                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i13 = i10;
            c0895l3 = c0895l;
            z10 = z8;
            depth = i7;
        }
        if (z12) {
            throw new XmlPullParserException("no path defined");
        }
        this.f14324c = a(c0896m.f14314c, c0896m.f14315d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.isAutoMirrored() : this.f14323b.f14316e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C0896m c0896m = this.f14323b;
            if (c0896m != null) {
                C0895l c0895l = c0896m.f14313b;
                if (c0895l.f14310n == null) {
                    c0895l.f14310n = Boolean.valueOf(c0895l.g.a());
                }
                if (c0895l.f14310n.booleanValue() || ((colorStateList = this.f14323b.f14314c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, c3.m] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14326e && super.mutate() == this) {
            C0896m c0896m = this.f14323b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f14314c = null;
            constantState.f14315d = f14322x;
            if (c0896m != null) {
                constantState.f14312a = c0896m.f14312a;
                C0895l c0895l = new C0895l(c0896m.f14313b);
                constantState.f14313b = c0895l;
                if (c0896m.f14313b.f14304e != null) {
                    c0895l.f14304e = new Paint(c0896m.f14313b.f14304e);
                }
                if (c0896m.f14313b.f14303d != null) {
                    constantState.f14313b.f14303d = new Paint(c0896m.f14313b.f14303d);
                }
                constantState.f14314c = c0896m.f14314c;
                constantState.f14315d = c0896m.f14315d;
                constantState.f14316e = c0896m.f14316e;
            }
            this.f14323b = constantState;
            this.f14326e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z8;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0896m c0896m = this.f14323b;
        ColorStateList colorStateList = c0896m.f14314c;
        if (colorStateList == null || (mode = c0896m.f14315d) == null) {
            z8 = false;
        } else {
            this.f14324c = a(colorStateList, mode);
            invalidateSelf();
            z8 = true;
        }
        C0895l c0895l = c0896m.f14313b;
        if (c0895l.f14310n == null) {
            c0895l.f14310n = Boolean.valueOf(c0895l.g.a());
        }
        if (c0895l.f14310n.booleanValue()) {
            boolean b2 = c0896m.f14313b.g.b(iArr);
            c0896m.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z8;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f14323b.f14313b.getRootAlpha() != i7) {
            this.f14323b.f14313b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f14323b.f14316e = z8;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14325d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            Tb.a.L(i7, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C0896m c0896m = this.f14323b;
        if (c0896m.f14314c != colorStateList) {
            c0896m.f14314c = colorStateList;
            this.f14324c = a(colorStateList, c0896m.f14315d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C0896m c0896m = this.f14323b;
        if (c0896m.f14315d != mode) {
            c0896m.f14315d = mode;
            this.f14324c = a(c0896m.f14314c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z10) {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.setVisible(z8, z10) : super.setVisible(z8, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
