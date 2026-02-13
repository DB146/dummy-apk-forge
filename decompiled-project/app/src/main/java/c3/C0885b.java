package c3;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import l6.C1506a;
import l6.C1508c;

/* renamed from: c3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0885b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1506a f14267a;

    public C0885b(C1506a c1506a) {
        this.f14267a = c1506a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f14267a.f19560b.f19568C;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C1508c c1508c = this.f14267a.f19560b;
        ColorStateList colorStateList = c1508c.f19568C;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(c1508c.f19572G, colorStateList.getDefaultColor()));
        }
    }
}
