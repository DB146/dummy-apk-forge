package B0;

import Q.C0480b;
import Q.C0487e0;
import Q.C0506o;
import com.kt.apps.media.xemtv.ui_mobile.MobileMainActivity;

/* renamed from: B0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0205u0 extends AbstractC0167b {

    /* renamed from: w, reason: collision with root package name */
    public final C0487e0 f1983w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1984x;

    public C0205u0(MobileMainActivity mobileMainActivity) {
        super(mobileMainActivity);
        this.f1983w = C0480b.o(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // B0.AbstractC0167b
    public final void a(C0506o c0506o) {
        c0506o.S(420213850);
        Rb.e eVar = (Rb.e) this.f1983w.getValue();
        if (eVar == null) {
            c0506o.S(358356153);
        } else {
            c0506o.S(150107208);
            eVar.invoke(c0506o, 0);
        }
        c0506o.p(false);
        c0506o.p(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0205u0.class.getName();
    }

    @Override // B0.AbstractC0167b
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f1984x;
    }

    public final void setContent(Rb.e eVar) {
        this.f1984x = true;
        this.f1983w.setValue(eVar);
        if (isAttachedToWindow()) {
            if (this.f1852d == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            d();
        }
    }
}
