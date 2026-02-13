package A9;

import android.view.View;
import android.view.ViewGroup;
import u.C2052e;

/* renamed from: A9.m2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0113m2 implements InterfaceC0150w0 {

    /* renamed from: a, reason: collision with root package name */
    public C2052e f1282a;

    public static void a(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; view.hasTransientState() && i7 < childCount; i7++) {
                a(viewGroup.getChildAt(i7));
            }
        }
    }

    @Override // A9.InterfaceC0150w0
    public final Object b() {
        C2052e c2052e = this.f1282a;
        if (c2052e == null) {
            return null;
        }
        return c2052e.get(C0120o1.class);
    }

    public abstract void c(C0109l2 c0109l2, Object obj);

    public abstract C0109l2 d(ViewGroup viewGroup);

    public abstract void e(C0109l2 c0109l2);

    public void f(C0109l2 c0109l2) {
    }

    public void g(C0109l2 c0109l2) {
        a(c0109l2.f1271a);
    }

    public void h(C0109l2 c0109l2, View.OnClickListener onClickListener) {
        c0109l2.f1271a.setOnClickListener(onClickListener);
    }
}
