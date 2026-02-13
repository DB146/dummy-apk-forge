package H2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class G extends U {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f4591a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f4592b = new l0(this);

    /* renamed from: c, reason: collision with root package name */
    public D f4593c;

    /* renamed from: d, reason: collision with root package name */
    public D f4594d;

    public static int b(View view, E e2) {
        return ((e2.e(view) / 2) + e2.g(view)) - ((e2.n() / 2) + e2.m());
    }

    public static View c(androidx.recyclerview.widget.a aVar, E e2) {
        int y10 = aVar.y();
        View view = null;
        if (y10 == 0) {
            return null;
        }
        int n6 = (e2.n() / 2) + e2.m();
        int i7 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < y10; i10++) {
            View x2 = aVar.x(i10);
            int abs = Math.abs(((e2.e(x2) / 2) + e2.g(x2)) - n6);
            if (abs < i7) {
                view = x2;
                i7 = abs;
            }
        }
        return view;
    }

    public final int[] a(androidx.recyclerview.widget.a aVar, View view) {
        int[] iArr = new int[2];
        if (aVar.f()) {
            iArr[0] = b(view, d(aVar));
        } else {
            iArr[0] = 0;
        }
        if (aVar.g()) {
            iArr[1] = b(view, e(aVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final E d(androidx.recyclerview.widget.a aVar) {
        D d10 = this.f4594d;
        if (d10 == null || ((androidx.recyclerview.widget.a) d10.f4587b) != aVar) {
            this.f4594d = new D(aVar, 0);
        }
        return this.f4594d;
    }

    public final E e(androidx.recyclerview.widget.a aVar) {
        D d10 = this.f4593c;
        if (d10 == null || ((androidx.recyclerview.widget.a) d10.f4587b) != aVar) {
            this.f4593c = new D(aVar, 1);
        }
        return this.f4593c;
    }

    public final void f() {
        androidx.recyclerview.widget.a layoutManager;
        RecyclerView recyclerView = this.f4591a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View c10 = layoutManager.g() ? c(layoutManager, e(layoutManager)) : layoutManager.f() ? c(layoutManager, d(layoutManager)) : null;
        if (c10 == null) {
            return;
        }
        int[] a9 = a(layoutManager, c10);
        int i7 = a9[0];
        if (i7 == 0 && a9[1] == 0) {
            return;
        }
        this.f4591a.j0(i7, a9[1]);
    }
}
