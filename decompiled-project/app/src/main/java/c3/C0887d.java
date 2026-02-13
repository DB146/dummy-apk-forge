package c3;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import u.C2052e;

/* renamed from: c3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887d extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public C0898o f14270a;

    /* renamed from: b, reason: collision with root package name */
    public AnimatorSet f14271b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f14272c;

    /* renamed from: d, reason: collision with root package name */
    public C2052e f14273d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
