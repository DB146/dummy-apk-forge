package Y0;

import A0.AbstractC0017g;
import B0.D;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import h0.AbstractC1217d;
import h0.C1214a;
import h0.InterfaceC1220g;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f11133b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, int i7) {
        super(1);
        this.f11132a = i7;
        this.f11133b = oVar;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f11132a) {
            case 0:
                C1214a c1214a = (C1214a) obj;
                o oVar = this.f11133b;
                View c10 = k.c(oVar);
                if (!c10.isFocused() && !c10.hasFocus()) {
                    if (!AbstractC1217d.z(c10, AbstractC1217d.D(c1214a.f17589a), k.b(((D) AbstractC0017g.u(oVar)).getFocusOwner(), AbstractC0017g.v(oVar), c10))) {
                        c1214a.f17590b = true;
                    }
                }
                return Db.q.f3365a;
            default:
                C1214a c1214a2 = (C1214a) obj;
                o oVar2 = this.f11133b;
                View c11 = k.c(oVar2);
                if (c11.hasFocus()) {
                    InterfaceC1220g focusOwner = ((D) AbstractC0017g.u(oVar2)).getFocusOwner();
                    View v10 = AbstractC0017g.v(oVar2);
                    if (c11 instanceof ViewGroup) {
                        Rect b2 = k.b(focusOwner, v10, c11);
                        Integer D10 = AbstractC1217d.D(c1214a2.f17589a);
                        int intValue = D10 != null ? D10.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = oVar2.f11134C;
                        View findNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) v10, view, intValue) : focusFinder.findNextFocusFromRect((ViewGroup) v10, b2, intValue);
                        if (findNextFocus != null && k.a(c11, findNextFocus)) {
                            findNextFocus.requestFocus(intValue, b2);
                            c1214a2.f17590b = true;
                        } else if (!v10.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!v10.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return Db.q.f3365a;
        }
    }
}
