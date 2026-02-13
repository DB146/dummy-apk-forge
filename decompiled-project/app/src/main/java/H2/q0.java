package H2;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4784a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f4785b = Integer.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f4786c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f4787d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f4788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4789f;

    public q0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i7) {
        this.f4789f = staggeredGridLayoutManager;
        this.f4788e = i7;
    }

    public final void a() {
        View view = (View) h3.o.k(1, this.f4784a);
        n0 n0Var = (n0) view.getLayoutParams();
        this.f4786c = this.f4789f.f13698r.d(view);
        n0Var.getClass();
    }

    public final void b() {
        this.f4784a.clear();
        this.f4785b = Integer.MIN_VALUE;
        this.f4786c = Integer.MIN_VALUE;
        this.f4787d = 0;
    }

    public final int c() {
        return this.f4789f.f13703w ? e(r1.size() - 1, -1) : e(0, this.f4784a.size());
    }

    public final int d() {
        return this.f4789f.f13703w ? e(0, this.f4784a.size()) : e(r1.size() - 1, -1);
    }

    public final int e(int i7, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4789f;
        int m10 = staggeredGridLayoutManager.f13698r.m();
        int i11 = staggeredGridLayoutManager.f13698r.i();
        int i12 = i10 > i7 ? 1 : -1;
        while (i7 != i10) {
            View view = (View) this.f4784a.get(i7);
            int g = staggeredGridLayoutManager.f13698r.g(view);
            int d10 = staggeredGridLayoutManager.f13698r.d(view);
            boolean z8 = g <= i11;
            boolean z10 = d10 >= m10;
            if (z8 && z10 && (g < m10 || d10 > i11)) {
                return androidx.recyclerview.widget.a.O(view);
            }
            i7 += i12;
        }
        return -1;
    }

    public final int f(int i7) {
        int i10 = this.f4786c;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f4784a.size() == 0) {
            return i7;
        }
        a();
        return this.f4786c;
    }

    public final View g(int i7, int i10) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4789f;
        ArrayList arrayList = this.f4784a;
        View view = null;
        if (i10 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f13703w && androidx.recyclerview.widget.a.O(view2) >= i7) || ((!staggeredGridLayoutManager.f13703w && androidx.recyclerview.widget.a.O(view2) <= i7) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                View view3 = (View) arrayList.get(i11);
                if ((staggeredGridLayoutManager.f13703w && androidx.recyclerview.widget.a.O(view3) <= i7) || ((!staggeredGridLayoutManager.f13703w && androidx.recyclerview.widget.a.O(view3) >= i7) || !view3.hasFocusable())) {
                    break;
                }
                i11++;
                view = view3;
            }
        }
        return view;
    }

    public final int h(int i7) {
        int i10 = this.f4785b;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (this.f4784a.size() == 0) {
            return i7;
        }
        View view = (View) this.f4784a.get(0);
        n0 n0Var = (n0) view.getLayoutParams();
        this.f4785b = this.f4789f.f13698r.g(view);
        n0Var.getClass();
        return this.f4785b;
    }
}
