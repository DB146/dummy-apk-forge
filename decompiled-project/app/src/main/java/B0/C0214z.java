package B0;

import A9.S2;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h0.AbstractC1217d;
import h0.C1216c;
import h0.C1221h;
import j0.AbstractC1362A;
import s0.AbstractC1969a;

/* renamed from: B0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214z extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f2027b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0214z(D d10, int i7) {
        super(1);
        this.f2026a = i7;
        this.f2027b = d10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        C1216c c1216c;
        switch (this.f2026a) {
            case 0:
                KeyEvent keyEvent = ((s0.b) obj).f24020a;
                D d10 = this.f2027b;
                d10.getClass();
                long a9 = c2.q.a(keyEvent.getKeyCode());
                if (AbstractC1969a.a(a9, AbstractC1969a.g)) {
                    c1216c = new C1216c(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (AbstractC1969a.a(a9, AbstractC1969a.f24013e)) {
                    c1216c = new C1216c(4);
                } else if (AbstractC1969a.a(a9, AbstractC1969a.f24012d)) {
                    c1216c = new C1216c(3);
                } else {
                    c1216c = AbstractC1969a.a(a9, AbstractC1969a.f24010b) ? true : AbstractC1969a.a(a9, AbstractC1969a.k) ? new C1216c(5) : AbstractC1969a.a(a9, AbstractC1969a.f24011c) ? true : AbstractC1969a.a(a9, AbstractC1969a.f24017l) ? new C1216c(6) : AbstractC1969a.a(a9, AbstractC1969a.f24014f) ? true : AbstractC1969a.a(a9, AbstractC1969a.f24016i) ? true : AbstractC1969a.a(a9, AbstractC1969a.f24018m) ? new C1216c(7) : AbstractC1969a.a(a9, AbstractC1969a.f24009a) ? true : AbstractC1969a.a(a9, AbstractC1969a.j) ? new C1216c(8) : null;
                }
                if (c1216c == null || !com.bumptech.glide.d.l(h3.H.w(keyEvent), 2)) {
                    return Boolean.FALSE;
                }
                int i7 = c1216c.f17595a;
                Integer D10 = AbstractC1217d.D(i7);
                i0.c x2 = d10.x();
                Boolean d11 = ((C1221h) d10.getFocusOwner()).d(i7, x2, new C0212y(c1216c, 1));
                if (d11 != null ? d11.booleanValue() : true) {
                    return Boolean.TRUE;
                }
                if (!(C1216c.a(i7, 1) ? true : C1216c.a(i7, 2))) {
                    return Boolean.FALSE;
                }
                if (D10 != null) {
                    int intValue = D10.intValue();
                    FocusFinder focusFinder = FocusFinder.getInstance();
                    View view = d10;
                    while (true) {
                        if (view != null) {
                            View rootView = d10.getRootView();
                            kotlin.jvm.internal.l.c(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                            view = focusFinder.findNextFocus((ViewGroup) rootView, view, intValue);
                            if (view != null) {
                                if (!view.equals(d10)) {
                                    for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                                        if (parent == d10) {
                                            break;
                                        }
                                    }
                                }
                            }
                        } else {
                            view = null;
                        }
                    }
                    if (kotlin.jvm.internal.l.a(view, d10)) {
                        view = null;
                    }
                    if (view != null) {
                        Rect y10 = x2 != null ? AbstractC1362A.y(x2) : null;
                        if (y10 == null) {
                            throw new IllegalStateException("Invalid rect");
                        }
                        int[] iArr = d10.f1625f0;
                        view.getLocationInWindow(iArr);
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        d10.getLocationInWindow(iArr);
                        y10.offset(iArr[0] - i10, iArr[1] - i11);
                        if (AbstractC1217d.z(view, D10, y10)) {
                            return Boolean.TRUE;
                        }
                    }
                }
                if (!((C1221h) d10.getFocusOwner()).b(i7, false, false)) {
                    return Boolean.TRUE;
                }
                Boolean d12 = ((C1221h) d10.getFocusOwner()).d(i7, null, new C0212y(c1216c, 0));
                return Boolean.valueOf(d12 != null ? d12.booleanValue() : true);
            default:
                Rb.a aVar = (Rb.a) obj;
                D d13 = this.f2027b;
                Handler handler = d13.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = d13.getHandler();
                    if (handler2 != null) {
                        handler2.post(new S2(aVar, 4));
                    }
                }
                return Db.q.f3365a;
        }
    }
}
