package H2;

import A9.I1;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public final I1 f4599a = new I1(1);

    /* renamed from: b, reason: collision with root package name */
    public boolean f4600b = false;

    /* renamed from: c, reason: collision with root package name */
    public final int f4601c = 1;

    public abstract int a();

    public long b(int i7) {
        return -1L;
    }

    public int c(int i7) {
        return 0;
    }

    public final void d() {
        this.f4599a.b();
    }

    public abstract void e(i0 i0Var, int i7);

    public void f(i0 i0Var, int i7) {
        e(i0Var, i7);
    }

    public abstract i0 g(ViewGroup viewGroup, int i7);

    public void h(i0 i0Var) {
    }

    public void i(i0 i0Var) {
    }

    public void j(i0 i0Var) {
    }

    public void k(i0 i0Var) {
    }

    public final void l(boolean z8) {
        if (this.f4599a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f4600b = z8;
    }
}
