package Y0;

import A0.AbstractC0017g;
import A0.C0031u;
import A0.L;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import h0.AbstractC1217d;
import h0.C1221h;
import h0.C1229p;
import h0.InterfaceC1220g;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final h8.e f11117a = new h8.e(17);

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(InterfaceC1220g interfaceC1220g, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C1229p g = AbstractC1217d.g(((C1221h) interfaceC1220g).f17607d);
        i0.c j = g != null ? AbstractC1217d.j(g) : null;
        if (j == null) {
            return null;
        }
        int i7 = (int) j.f18174a;
        int i10 = iArr[0];
        int i11 = iArr2[0];
        int i12 = (int) j.f18175b;
        int i13 = iArr[1];
        int i14 = iArr2[1];
        return new Rect((i7 + i10) - i11, (i12 + i13) - i14, (((int) j.f18176c) + i10) - i11, (((int) j.f18177d) + i13) - i14);
    }

    public static final View c(c0.l lVar) {
        q qVar = AbstractC0017g.t(lVar.f14113a).f45C;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, L l10) {
        long A10 = ((C0031u) l10.f60S.f226c).A(0L);
        int round = Math.round(Float.intBitsToFloat((int) (A10 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (A10 & 4294967295L)));
        qVar.layout(round, round2, qVar.getMeasuredWidth() + round, qVar.getMeasuredHeight() + round2);
    }
}
