package q;

import java.util.Iterator;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868b extends AbstractC1871e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public C1869c f23325a;

    /* renamed from: b, reason: collision with root package name */
    public C1869c f23326b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23327c;

    public C1868b(C1869c c1869c, C1869c c1869c2, int i7) {
        this.f23327c = i7;
        this.f23325a = c1869c2;
        this.f23326b = c1869c;
    }

    @Override // q.AbstractC1871e
    public final void a(C1869c c1869c) {
        C1869c c1869c2;
        C1869c c1869c3 = null;
        if (this.f23325a == c1869c && c1869c == this.f23326b) {
            this.f23326b = null;
            this.f23325a = null;
        }
        C1869c c1869c4 = this.f23325a;
        if (c1869c4 == c1869c) {
            switch (this.f23327c) {
                case 0:
                    c1869c2 = c1869c4.f23331d;
                    break;
                default:
                    c1869c2 = c1869c4.f23330c;
                    break;
            }
            this.f23325a = c1869c2;
        }
        C1869c c1869c5 = this.f23326b;
        if (c1869c5 == c1869c) {
            C1869c c1869c6 = this.f23325a;
            if (c1869c5 != c1869c6 && c1869c6 != null) {
                c1869c3 = b(c1869c5);
            }
            this.f23326b = c1869c3;
        }
    }

    public final C1869c b(C1869c c1869c) {
        switch (this.f23327c) {
            case 0:
                return c1869c.f23330c;
            default:
                return c1869c.f23331d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f23326b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C1869c c1869c = this.f23326b;
        C1869c c1869c2 = this.f23325a;
        this.f23326b = (c1869c == c1869c2 || c1869c2 == null) ? null : b(c1869c);
        return c1869c;
    }
}
