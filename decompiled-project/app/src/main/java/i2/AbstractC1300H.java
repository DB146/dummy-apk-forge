package i2;

import android.view.View;
import android.view.ViewGroup;
import u.C2052e;

/* renamed from: i2.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1300H {

    /* renamed from: a, reason: collision with root package name */
    public C2052e f18215a;

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

    public abstract void b(C9.h hVar, Object obj);

    public abstract C9.h c(ViewGroup viewGroup);

    public abstract void d(C9.h hVar);

    public void e(C9.h hVar) {
    }

    public void f(C9.h hVar) {
        a((View) hVar.f3094a);
    }
}
