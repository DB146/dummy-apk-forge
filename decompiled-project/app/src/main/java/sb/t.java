package sb;

import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class t extends nb.b {

    /* renamed from: a, reason: collision with root package name */
    public final gb.l f24326a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f24327b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f24328c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f24329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24330e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24331f;

    public t(gb.l lVar, Iterator it) {
        this.f24326a = lVar;
        this.f24327b = it;
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        this.f24328c = true;
    }

    @Override // yb.InterfaceC2475e
    public final void clear() {
        this.f24330e = true;
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        return this.f24328c;
    }

    @Override // yb.InterfaceC2472b
    public final int i(int i7) {
        this.f24329d = true;
        return 1;
    }

    @Override // yb.InterfaceC2475e
    public final boolean isEmpty() {
        return this.f24330e;
    }

    @Override // yb.InterfaceC2475e
    public final Object poll() {
        if (this.f24330e) {
            return null;
        }
        boolean z8 = this.f24331f;
        Iterator it = this.f24327b;
        if (!z8) {
            this.f24331f = true;
        } else if (!it.hasNext()) {
            this.f24330e = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }
}
