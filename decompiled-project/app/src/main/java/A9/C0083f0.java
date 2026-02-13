package A9;

import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.f0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0083f0 extends AbstractC0117n2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0079e0 f1135a;

    /* renamed from: b, reason: collision with root package name */
    public final C0079e0 f1136b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0113m2[] f1137c;

    public C0083f0() {
        C0079e0 c0079e0 = new C0079e0(R.layout.lb_control_button_primary);
        this.f1135a = c0079e0;
        this.f1136b = new C0079e0(R.layout.lb_control_button_secondary);
        this.f1137c = new AbstractC0113m2[]{c0079e0};
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2 a(Object obj) {
        return this.f1135a;
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2[] b() {
        return this.f1137c;
    }
}
