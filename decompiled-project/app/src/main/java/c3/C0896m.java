package c3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: c3.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0896m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f14312a;

    /* renamed from: b, reason: collision with root package name */
    public C0895l f14313b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f14314c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f14315d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14316e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f14317f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14318h;

    /* renamed from: i, reason: collision with root package name */
    public int f14319i;
    public boolean j;
    public boolean k;

    /* renamed from: l, reason: collision with root package name */
    public Paint f14320l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f14312a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C0898o(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C0898o(this);
    }
}
