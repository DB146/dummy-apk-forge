package q;

import java.util.Iterator;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1870d extends AbstractC1871e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1869c f23332a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23333b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1872f f23334c;

    public C1870d(C1872f c1872f) {
        this.f23334c = c1872f;
    }

    @Override // q.AbstractC1871e
    public final void a(C1869c c1869c) {
        C1869c c1869c2 = this.f23332a;
        if (c1869c == c1869c2) {
            C1869c c1869c3 = c1869c2.f23331d;
            this.f23332a = c1869c3;
            this.f23333b = c1869c3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f23333b) {
            return this.f23334c.f23335a != null;
        }
        C1869c c1869c = this.f23332a;
        return (c1869c == null || c1869c.f23330c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f23333b) {
            this.f23333b = false;
            this.f23332a = this.f23334c.f23335a;
        } else {
            C1869c c1869c = this.f23332a;
            this.f23332a = c1869c != null ? c1869c.f23330c : null;
        }
        return this.f23332a;
    }
}
