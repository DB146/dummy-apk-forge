package m6;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: m6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f20690a;

    public C1627c(Chip chip) {
        this.f20690a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1630f c1630f = this.f20690a.f15277e;
        if (c1630f != null) {
            c1630f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
