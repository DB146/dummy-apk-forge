package H2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: H2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0290d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0296j f4658c;

    public /* synthetic */ RunnableC0290d(C0296j c0296j, ArrayList arrayList, int i7) {
        this.f4656a = i7;
        this.f4658c = c0296j;
        this.f4657b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f4656a) {
            case 0:
                ArrayList arrayList = this.f4657b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0296j c0296j = this.f4658c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0296j.f4727m.remove(arrayList);
                        return;
                    }
                    C0295i c0295i = (C0295i) it2.next();
                    i0 i0Var = c0295i.f4701a;
                    c0296j.getClass();
                    View view = i0Var.f4707a;
                    int i7 = c0295i.f4704d - c0295i.f4702b;
                    int i10 = c0295i.f4705e - c0295i.f4703c;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i10 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view.animate();
                    c0296j.f4730p.add(i0Var);
                    animate.setDuration(c0296j.f4609e).setListener(new C0292f(c0296j, i0Var, i7, view, i10, animate)).start();
                }
            case 1:
                ArrayList arrayList2 = this.f4657b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0296j c0296j2 = this.f4658c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0296j2.f4728n.remove(arrayList2);
                        return;
                    }
                    C0294h c0294h = (C0294h) it3.next();
                    c0296j2.getClass();
                    i0 i0Var2 = c0294h.f4688a;
                    View view2 = i0Var2 == null ? null : i0Var2.f4707a;
                    i0 i0Var3 = c0294h.f4689b;
                    View view3 = i0Var3 != null ? i0Var3.f4707a : null;
                    ArrayList arrayList3 = c0296j2.f4732r;
                    long j = c0296j2.f4610f;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList3.add(c0294h.f4688a);
                        duration.translationX(c0294h.f4692e - c0294h.f4690c);
                        duration.translationY(c0294h.f4693f - c0294h.f4691d);
                        it = it3;
                        duration.alpha(0.0f).setListener(new C0293g(c0296j2, c0294h, duration, view2, 0)).start();
                    } else {
                        it = it3;
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator animate2 = view3.animate();
                        arrayList3.add(c0294h.f4689b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C0293g(c0296j2, c0294h, animate2, view3, 1)).start();
                    }
                    it3 = it;
                }
            default:
                ArrayList arrayList4 = this.f4657b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0296j c0296j3 = this.f4658c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0296j3.f4726l.remove(arrayList4);
                        return;
                    }
                    i0 i0Var4 = (i0) it4.next();
                    c0296j3.getClass();
                    View view4 = i0Var4.f4707a;
                    ViewPropertyAnimator animate3 = view4.animate();
                    c0296j3.f4729o.add(i0Var4);
                    animate3.alpha(1.0f).setDuration(c0296j3.f4607c).setListener(new C0291e(c0296j3, i0Var4, view4, animate3)).start();
                }
        }
    }
}
