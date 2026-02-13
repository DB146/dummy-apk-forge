package nb;

import gb.l;

/* loaded from: classes2.dex */
public class f extends AbstractC1719a {

    /* renamed from: a, reason: collision with root package name */
    public final l f21344a;

    /* renamed from: b, reason: collision with root package name */
    public Object f21345b;

    public f(l lVar) {
        this.f21344a = lVar;
    }

    @Override // hb.InterfaceC1269b
    public void b() {
        set(4);
        this.f21345b = null;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        lazySet(32);
        this.f21345b = null;
    }

    public final void d(Object obj) {
        int i7 = get();
        if ((i7 & 54) != 0) {
            return;
        }
        l lVar = this.f21344a;
        if (i7 == 8) {
            this.f21345b = obj;
            lazySet(16);
            lVar.e(null);
        } else {
            lazySet(2);
            lVar.e(obj);
        }
        if (get() != 4) {
            lVar.a();
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return get() == 4;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        lazySet(8);
        return 2;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return get() != 16;
    }

    public void onSuccess(Object obj) {
        d(obj);
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f21345b;
        this.f21345b = null;
        lazySet(32);
        return obj;
    }
}
