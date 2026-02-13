package sb;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class r extends nb.b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24320a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f24321b;

    /* renamed from: c, reason: collision with root package name */
    public int f24322c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24323d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f24324e;

    public r(gb.l lVar, Object[] objArr) {
        this.f24320a = lVar;
        this.f24321b = objArr;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24324e = true;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f24322c = this.f24321b.length;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24324e;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        this.f24323d = true;
        return 1;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f24322c == this.f24321b.length;
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        int i7 = this.f24322c;
        Object[] objArr = this.f24321b;
        if (i7 == objArr.length) {
            return null;
        }
        this.f24322c = i7 + 1;
        Object obj = objArr[i7];
        Objects.requireNonNull(obj, "The array element is null");
        return obj;
    }
}
