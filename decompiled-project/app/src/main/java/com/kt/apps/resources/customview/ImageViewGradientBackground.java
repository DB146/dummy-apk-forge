package com.kt.apps.resources.customview;

import Db.o;
import I9.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.support.v4.media.session.b;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.kt.apps.media.xemtv.beta.R;
import kotlin.jvm.internal.l;
import l1.AbstractC1449a;
import z2.d;
import z2.e;
import z2.f;
import z2.g;

/* loaded from: classes2.dex */
public final class ImageViewGradientBackground extends AppCompatImageView {

    /* renamed from: v, reason: collision with root package name */
    public static Float f16237v;

    /* renamed from: w, reason: collision with root package name */
    public static final o f16238w = b.z(new a(6));

    /* renamed from: x, reason: collision with root package name */
    public static final o f16239x = b.z(new a(7));

    /* renamed from: y, reason: collision with root package name */
    public static final o f16240y = b.z(new a(8));

    /* renamed from: d, reason: collision with root package name */
    public final int f16241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16242e;

    /* renamed from: f, reason: collision with root package name */
    public final GradientDrawable.Orientation f16243f;

    /* renamed from: u, reason: collision with root package name */
    public final float[] f16244u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r1 == 2) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImageViewGradientBackground(Context _context, AttributeSet _attrs) {
        super(_context, _attrs, 0);
        l.e(_context, "_context");
        l.e(_attrs, "_attrs");
        if (f16237v == null) {
            f16237v = Float.valueOf(getContext().getResources().getDisplayMetrics().scaledDensity * 9);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(_attrs, Ja.a.f5766a);
        l.d(obtainStyledAttributes, "obtainStyledAttributes(...)");
        Ka.a aVar = Ka.a.f6216d;
        int i7 = obtainStyledAttributes.getInt(3, 3);
        Ka.a aVar2 = Ka.a.f6214b;
        if (i7 != 1) {
            aVar2 = Ka.a.f6213a;
            if (i7 != 0) {
                aVar2 = Ka.a.f6215c;
            }
        }
        aVar = aVar2;
        this.f16241d = obtainStyledAttributes.getDimensionPixelSize(2, R.dimen.def_image_width);
        this.f16242e = obtainStyledAttributes.getDimensionPixelSize(2, R.dimen.def_image_height);
        obtainStyledAttributes.recycle();
        int ordinal = aVar.ordinal();
        this.f16243f = ordinal != 0 ? ordinal != 1 ? GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT;
        int ordinal2 = aVar.ordinal();
        this.f16244u = ordinal2 != 0 ? ordinal2 != 1 ? ordinal2 != 2 ? new float[0] : (float[]) f16240y.getValue() : (float[]) f16239x.getValue() : (float[]) f16238w.getValue();
    }

    public final GradientDrawable a(Color color) {
        float component;
        float component2;
        float component3;
        int argb;
        float component4;
        float component5;
        float component6;
        long pack;
        if (Build.VERSION.SDK_INT >= 26) {
            component4 = color.getComponent(0);
            component5 = color.getComponent(1);
            component6 = color.getComponent(2);
            pack = Color.pack(component4, component5, component6, 0.4f);
            argb = Color.toArgb(pack);
        } else {
            float f4 = 256;
            component = color.getComponent(0);
            component2 = color.getComponent(1);
            component3 = color.getComponent(2);
            argb = Color.argb((int) (0.4f * f4), (int) (component * f4), (int) (component2 * f4), (int) (component3 * f4));
        }
        GradientDrawable gradientDrawable = new GradientDrawable(this.f16243f, new int[]{argb, 0, 0});
        gradientDrawable.setCornerRadii(this.f16244u);
        return gradientDrawable;
    }

    public final GradientDrawable d(int i7) {
        GradientDrawable gradientDrawable = new GradientDrawable(this.f16243f, new int[]{Color.argb((i7 >> 24) & 255, (i7 >> 16) & 255, (i7 >> 8) & 255, i7 & 255), 0, 0});
        gradientDrawable.setCornerRadii(this.f16244u);
        return gradientDrawable;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        int measuredWidth = (getMeasuredWidth() - this.f16241d) / 2;
        int measuredHeight = (getMeasuredHeight() - this.f16242e) / 2;
        setPadding(measuredWidth, measuredHeight, measuredWidth, measuredHeight);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Color valueOf;
        super.setImageBitmap(bitmap);
        if (bitmap == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            f a9 = new d(bitmap).a();
            int color = AbstractC1449a.getColor(getContext(), R.color.black);
            e eVar = (e) a9.f28207b.get(g.f28212f);
            if (eVar != null) {
                color = eVar.f28200d;
            }
            setBackground(d(color));
            return;
        }
        f a10 = new d(bitmap).a();
        int color2 = AbstractC1449a.getColor(getContext(), R.color.black);
        e eVar2 = (e) a10.f28207b.get(g.f28212f);
        if (eVar2 != null) {
            color2 = eVar2.f28200d;
        }
        valueOf = Color.valueOf(color2);
        setBackground(a(valueOf));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        GradientDrawable d10;
        Color valueOf;
        super.setImageDrawable(drawable);
        int color = AbstractC1449a.getColor(getContext(), R.color.color_text_highlight);
        if (Build.VERSION.SDK_INT >= 26) {
            valueOf = Color.valueOf(color);
            l.d(valueOf, "valueOf(...)");
            d10 = a(valueOf);
        } else {
            d10 = d(color);
        }
        setBackground(d10);
    }
}
