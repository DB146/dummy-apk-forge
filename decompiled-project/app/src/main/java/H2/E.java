package H2;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public int f4586a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4587b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4588c;

    public /* synthetic */ E(int i7, Comparable comparable, Object obj) {
        this.f4586a = i7;
        this.f4587b = obj;
        this.f4588c = comparable;
    }

    public E(androidx.recyclerview.widget.a aVar) {
        this.f4586a = Integer.MIN_VALUE;
        this.f4588c = new Rect();
        this.f4587b = aVar;
    }

    public static E b(androidx.recyclerview.widget.a aVar, int i7) {
        if (i7 == 0) {
            return new D(aVar, 0);
        }
        if (i7 == 1) {
            return new D(aVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(T2.a aVar);

    public abstract void c(T2.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f4586a) {
            return 0;
        }
        return n() - this.f4586a;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i7);

    public abstract void s(T2.a aVar);

    public abstract void t(T2.a aVar);

    public abstract void u(T2.a aVar);

    public abstract void v(T2.a aVar);

    public abstract I2.F w(T2.a aVar);

    public abstract E x(T7.c cVar);
}
