package A9;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: A9.q2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0129q2 extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public int f1351a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f1351a);
        outline.setAlpha(1.0f);
    }
}
