package c3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: c3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0897n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f14321a;

    public C0897n(Drawable.ConstantState constantState) {
        this.f14321a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f14321a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f14321a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0898o c0898o = new C0898o();
        c0898o.f14279a = (VectorDrawable) this.f14321a.newDrawable();
        return c0898o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C0898o c0898o = new C0898o();
        c0898o.f14279a = (VectorDrawable) this.f14321a.newDrawable(resources);
        return c0898o;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C0898o c0898o = new C0898o();
        c0898o.f14279a = (VectorDrawable) this.f14321a.newDrawable(resources, theme);
        return c0898o;
    }
}
