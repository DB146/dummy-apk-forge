package u6;

import android.R;
import android.content.res.ColorStateList;
import o.C1769y;
import q3.f;

/* renamed from: u6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2114a extends C1769y {

    /* renamed from: u, reason: collision with root package name */
    public static final int[][] f24877u = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f24878e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24879f;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f24878e == null) {
            int p10 = f.p(this, com.kt.apps.media.xemtv.beta.R.attr.colorControlActivated);
            int p11 = f.p(this, com.kt.apps.media.xemtv.beta.R.attr.colorOnSurface);
            int p12 = f.p(this, com.kt.apps.media.xemtv.beta.R.attr.colorSurface);
            this.f24878e = new ColorStateList(f24877u, new int[]{f.u(1.0f, p12, p10), f.u(0.54f, p12, p11), f.u(0.38f, p12, p11), f.u(0.38f, p12, p11)});
        }
        return this.f24878e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f24879f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f24879f = z8;
        if (z8) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}
