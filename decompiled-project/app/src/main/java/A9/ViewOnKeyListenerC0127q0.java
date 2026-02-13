package A9;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: A9.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnKeyListenerC0127q0 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1347b;

    public /* synthetic */ ViewOnKeyListenerC0127q0(Object obj, int i7) {
        this.f1346a = i7;
        this.f1347b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i7, KeyEvent keyEvent) {
        View view2;
        switch (this.f1346a) {
            case 0:
                C0142u0 c0142u0 = (C0142u0) this.f1347b;
                W1.C c10 = c0142u0.f1396Z0;
                if (c10 == null || (view2 = c10.f10277U) == null || !view2.hasFocus() || (!(i7 == 4 || i7 == 111) || c0142u0.z0().getChildCount() <= 0)) {
                    return false;
                }
                c0142u0.z0().requestFocus();
                return true;
            default:
                C0101j2 c0101j2 = (C0101j2) this.f1347b;
                if (i7 != 4) {
                    if (i7 != 66) {
                        if (i7 != 69) {
                            if (i7 != 81) {
                                if (i7 != 111) {
                                    if (i7 != 89) {
                                        if (i7 != 90) {
                                            switch (i7) {
                                                case 19:
                                                case 20:
                                                    return c0101j2.f1246I;
                                            }
                                            return false;
                                        }
                                    }
                                }
                            }
                            if (keyEvent.getAction() != 0 || !c0101j2.f()) {
                                return true;
                            }
                            c0101j2.h(true);
                            return true;
                        }
                        if (keyEvent.getAction() != 0 || !c0101j2.f()) {
                            return true;
                        }
                        c0101j2.h(false);
                        return true;
                    }
                    if (c0101j2.f1246I) {
                        if (keyEvent.getAction() != 1) {
                            return true;
                        }
                        c0101j2.g(false);
                        return true;
                    }
                    return false;
                }
                if (c0101j2.f1246I) {
                    if (keyEvent.getAction() != 1) {
                        return true;
                    }
                    c0101j2.g(!c0101j2.f1256v.isAccessibilityFocused());
                    return true;
                }
                return false;
        }
    }
}
