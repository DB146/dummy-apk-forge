package A9;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0078e extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1111b;

    private final void j(C0109l2 c0109l2) {
    }

    @Override // A9.AbstractC0113m2
    public void c(C0109l2 c0109l2, Object obj) {
        switch (this.f1111b) {
            case 0:
                C0082f c0082f = (C0082f) c0109l2;
                c0082f.getClass();
                Drawable drawable = ((AbstractC0074d) obj).f1100b;
                View view = c0082f.f1271a;
                if (drawable != null) {
                    view.setPaddingRelative(view.getResources().getDimensionPixelSize(R.dimen.lb_action_with_icon_padding_start), 0, view.getResources().getDimensionPixelSize(R.dimen.lb_action_with_icon_padding_end), 0);
                } else {
                    int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lb_action_padding_horizontal);
                    view.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
                int i7 = c0082f.f1134c;
                Button button = c0082f.f1133b;
                if (i7 == 1) {
                    button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                    return;
                } else {
                    button.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
                    return;
                }
            default:
                KeyEvent.Callback callback = c0109l2 != null ? c0109l2.f1271a : null;
                ViewGroup viewGroup = callback instanceof ViewGroup ? (ViewGroup) callback : null;
                if (viewGroup != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = viewGroup.getChildAt(i10);
                        kotlin.jvm.internal.l.e(childAt, "<this>");
                        Drawable background = childAt.getBackground();
                        kotlin.jvm.internal.l.c(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                        AnimationDrawable animationDrawable = (AnimationDrawable) background;
                        animationDrawable.setEnterFadeDuration(700);
                        animationDrawable.setExitFadeDuration(500);
                        animationDrawable.setOneShot(false);
                        animationDrawable.start();
                        childAt.setFocusable(false);
                    }
                    return;
                }
                return;
        }
    }

    @Override // A9.AbstractC0113m2
    public C0109l2 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup != null ? viewGroup.getContext() : null).inflate(i(), viewGroup, false);
        kotlin.jvm.internal.l.b(inflate);
        return new C0109l2(inflate);
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        switch (this.f1111b) {
            case 0:
                C0082f c0082f = (C0082f) c0109l2;
                c0082f.f1133b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                c0082f.f1271a.setPadding(0, 0, 0, 0);
                return;
            default:
                return;
        }
    }

    public abstract int i();
}
