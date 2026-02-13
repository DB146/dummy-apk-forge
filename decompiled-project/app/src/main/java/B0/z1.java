package B0;

import A0.C0005a;
import Q.C0517u;
import a0.AbstractC0688o;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public abstract class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f2030a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final y1 a(AbstractC0167b abstractC0167b, Q.r rVar, Y.e eVar) {
        D d10;
        y1 y1Var;
        if (D0.f1652a.compareAndSet(false, true)) {
            ec.d a9 = Q5.e.a(1, 0, 6);
            cc.F.B(cc.F.b((Hb.i) C0182i0.f1909A.getValue()), null, 0, new C0(a9, null), 3);
            C0005a c0005a = new C0005a(a9, 4);
            synchronized (AbstractC0688o.f12405b) {
                AbstractC0688o.f12410h = Eb.o.h0(AbstractC0688o.f12410h, c0005a);
            }
            AbstractC0688o.a();
        }
        if (abstractC0167b.getChildCount() > 0) {
            View childAt = abstractC0167b.getChildAt(0);
            if (childAt instanceof D) {
                d10 = (D) childAt;
                if (d10 == null) {
                    d10 = new D(abstractC0167b.getContext(), rVar.h());
                    abstractC0167b.addView(d10.getView(), f2030a);
                }
                Object tag = d10.getView().getTag(R.id.wrapped_composition_tag);
                y1Var = tag instanceof y1 ? (y1) tag : null;
                if (y1Var == null) {
                    y1Var = new y1(d10, new C0517u(rVar, new A0.G0(d10.getRoot())));
                    d10.getView().setTag(R.id.wrapped_composition_tag, y1Var);
                }
                y1Var.b(eVar);
                if (!kotlin.jvm.internal.l.a(d10.getCoroutineContext(), rVar.h())) {
                    d10.setCoroutineContext(rVar.h());
                }
                return y1Var;
            }
        } else {
            abstractC0167b.removeAllViews();
        }
        d10 = null;
        if (d10 == null) {
        }
        Object tag2 = d10.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof y1) {
        }
        if (y1Var == null) {
        }
        y1Var.b(eVar);
        if (!kotlin.jvm.internal.l.a(d10.getCoroutineContext(), rVar.h())) {
        }
        return y1Var;
    }
}
