package H2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class H implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4595a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f4596b;

    public /* synthetic */ H(RecyclerView recyclerView, int i7) {
        this.f4595a = i7;
        this.f4596b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f4596b;
        switch (this.f4595a) {
            case 0:
                if (!recyclerView.f13629J || recyclerView.isLayoutRequested()) {
                    return;
                }
                if (!recyclerView.f13625H) {
                    recyclerView.requestLayout();
                    return;
                } else if (recyclerView.f13634M) {
                    recyclerView.L = true;
                    return;
                } else {
                    recyclerView.p();
                    return;
                }
            default:
                P p10 = recyclerView.f13654d0;
                if (p10 != null) {
                    C0296j c0296j = (C0296j) p10;
                    ArrayList arrayList = c0296j.f4724h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0296j.j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0296j.k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0296j.f4725i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j = c0296j.f4608d;
                            if (hasNext) {
                                i0 i0Var = (i0) it.next();
                                View view = i0Var.f4707a;
                                ViewPropertyAnimator animate = view.animate();
                                c0296j.f4731q.add(i0Var);
                                animate.setDuration(j).alpha(0.0f).setListener(new C0291e(c0296j, i0Var, animate, view)).start();
                                it = it;
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0296j.f4727m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0290d runnableC0290d = new RunnableC0290d(c0296j, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0290d.run();
                                    } else {
                                        View view2 = ((C0295i) arrayList5.get(0)).f4701a.f4707a;
                                        WeakHashMap weakHashMap = y1.K.f26642a;
                                        view2.postOnAnimationDelayed(runnableC0290d, j);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0296j.f4728n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0290d runnableC0290d2 = new RunnableC0290d(c0296j, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0290d2.run();
                                    } else {
                                        View view3 = ((C0294h) arrayList6.get(0)).f4688a.f4707a;
                                        WeakHashMap weakHashMap2 = y1.K.f26642a;
                                        view3.postOnAnimationDelayed(runnableC0290d2, j);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0296j.f4726l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0290d runnableC0290d3 = new RunnableC0290d(c0296j, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0290d3.run();
                                    } else {
                                        if (isEmpty) {
                                            j = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0296j.f4609e : 0L, isEmpty3 ? 0L : c0296j.f4610f) + j;
                                        View view4 = ((i0) arrayList7.get(0)).f4707a;
                                        WeakHashMap weakHashMap3 = y1.K.f26642a;
                                        view4.postOnAnimationDelayed(runnableC0290d3, max);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f13615B0 = false;
                return;
        }
    }
}
