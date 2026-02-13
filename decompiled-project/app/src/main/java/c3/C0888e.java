package c3;

import A9.C0076d1;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import u.T;

/* renamed from: c3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0888e extends AbstractC0889f implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final Context f14275c;

    /* renamed from: d, reason: collision with root package name */
    public C0076d1 f14276d = null;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f14277e = null;

    /* renamed from: f, reason: collision with root package name */
    public final C0886c f14278f = new C0886c(this, 0);

    /* renamed from: b, reason: collision with root package name */
    public final C0887d f14274b = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.Drawable$ConstantState, c3.d] */
    public C0888e(Context context) {
        this.f14275c = context;
    }

    @Override // c3.AbstractC0889f, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0887d c0887d = this.f14274b;
        c0887d.f14270a.draw(canvas);
        if (c0887d.f14271b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getAlpha() : this.f14274b.f14270a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f14274b.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getColorFilter() : this.f14274b.f14270a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f14279a != null) {
            return new N3.b(this.f14279a.getConstantState(), 1);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f14274b.f14270a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f14274b.f14270a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.getOpacity() : this.f14274b.f14270a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    /* JADX WARN: Type inference failed for: r7v8, types: [u.T, u.e] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C0887d c0887d;
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c0887d = this.f14274b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray h10 = n1.b.h(resources, theme, attributeSet, AbstractC0884a.f14265e);
                    int resourceId = h10.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0898o c0898o = new C0898o();
                        ThreadLocal threadLocal = n1.k.f21047a;
                        c0898o.f14279a = resources.getDrawable(resourceId, theme);
                        new C0897n(c0898o.f14279a.getConstantState());
                        c0898o.f14327f = false;
                        c0898o.setCallback(this.f14278f);
                        C0898o c0898o2 = c0887d.f14270a;
                        if (c0898o2 != null) {
                            c0898o2.setCallback(null);
                        }
                        c0887d.f14270a = c0898o;
                    }
                    h10.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0884a.f14266f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f14275c;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c0887d.f14270a.f14323b.f14313b.f14311o.get(string));
                        if (c0887d.f14272c == null) {
                            c0887d.f14272c = new ArrayList();
                            c0887d.f14273d = new T(0);
                        }
                        c0887d.f14272c.add(loadAnimator);
                        c0887d.f14273d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c0887d.f14271b == null) {
            c0887d.f14271b = new AnimatorSet();
        }
        c0887d.f14271b.playTogether(c0887d.f14272c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.isAutoMirrored() : this.f14274b.f14270a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f14279a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f14274b.f14271b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.isStateful() : this.f14274b.f14270a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14274b.f14270a.setBounds(rect);
        }
    }

    @Override // c3.AbstractC0889f, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i7) {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.setLevel(i7) : this.f14274b.f14270a.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14279a;
        return drawable != null ? drawable.setState(iArr) : this.f14274b.f14270a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f14274b.f14270a.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f14274b.f14270a.setAutoMirrored(z8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14274b.f14270a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i7) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            Tb.a.L(i7, drawable);
        } else {
            this.f14274b.f14270a.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f14274b.f14270a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f14274b.f14270a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z10) {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            return drawable.setVisible(z8, z10);
        }
        this.f14274b.f14270a.setVisible(z8, z10);
        return super.setVisible(z8, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0887d c0887d = this.f14274b;
        if (c0887d.f14271b.isStarted()) {
            return;
        }
        c0887d.f14271b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f14279a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14274b.f14271b.end();
        }
    }
}
