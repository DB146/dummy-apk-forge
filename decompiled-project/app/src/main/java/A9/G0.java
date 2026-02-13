package A9;

import H2.C0305t;

/* loaded from: classes2.dex */
public abstract class G0 {

    /* renamed from: b, reason: collision with root package name */
    public T f825b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f826c;

    /* renamed from: d, reason: collision with root package name */
    public int f827d;

    /* renamed from: e, reason: collision with root package name */
    public int f828e;

    /* renamed from: h, reason: collision with root package name */
    public A4.h[] f830h;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f824a = new Object[1];

    /* renamed from: f, reason: collision with root package name */
    public int f829f = -1;
    public int g = -1;

    /* renamed from: i, reason: collision with root package name */
    public int f831i = -1;

    public final boolean a() {
        return b(this.f826c ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : Integer.MIN_VALUE, true);
    }

    public abstract boolean b(int i7, boolean z8);

    public final boolean c(int i7) {
        if (this.g < 0) {
            return false;
        }
        if (this.f826c) {
            if (h(true, null) > i7 + this.f827d) {
                return false;
            }
        } else if (f(false, null) < i7 - this.f827d) {
            return false;
        }
        return true;
    }

    public final boolean d(int i7) {
        if (this.g < 0) {
            return false;
        }
        if (this.f826c) {
            if (f(false, null) < i7 - this.f827d) {
                return false;
            }
        } else if (h(true, null) > i7 + this.f827d) {
            return false;
        }
        return true;
    }

    public void e(int i7, int i10, C0305t c0305t) {
    }

    public final int f(boolean z8, int[] iArr) {
        return g(iArr, this.f826c ? this.f829f : this.g, z8);
    }

    public abstract int g(int[] iArr, int i7, boolean z8);

    public final int h(boolean z8, int[] iArr) {
        return i(iArr, this.f826c ? this.g : this.f829f, z8);
    }

    public abstract int i(int[] iArr, int i7, boolean z8);

    public abstract A4.h[] j(int i7, int i10);

    public abstract C0154x0 k(int i7);

    public void l(int i7) {
        int i10;
        if (i7 >= 0 && (i10 = this.g) >= 0) {
            if (i10 >= i7) {
                this.g = i7 - 1;
            }
            if (this.g < this.f829f) {
                this.g = -1;
                this.f829f = -1;
            }
            if (this.f829f < 0) {
                this.f831i = i7;
            }
        }
    }

    public abstract boolean m(int i7, boolean z8);

    public final void n(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f828e == i7) {
            return;
        }
        this.f828e = i7;
        this.f830h = new A4.h[i7];
        for (int i10 = 0; i10 < this.f828e; i10++) {
            this.f830h[i10] = new A4.h(7);
        }
    }
}
