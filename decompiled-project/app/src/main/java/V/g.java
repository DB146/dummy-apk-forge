package V;

import java.util.Iterator;
import java.util.Map;
import p0.p;
import p0.r;

/* loaded from: classes.dex */
public final class g implements Iterator, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9951a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f9952b;

    public g(Y.i iVar) {
        m[] mVarArr = new m[8];
        for (int i7 = 0; i7 < 8; i7++) {
            mVarArr[i7] = new o(this);
        }
        this.f9952b = new e(iVar, mVarArr);
    }

    public g(p pVar) {
        this.f9952b = pVar.f23026b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9951a) {
            case 0:
                return ((e) this.f9952b).f9944c;
            default:
                return this.f9952b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9951a) {
            case 0:
                return (Map.Entry) ((e) this.f9952b).next();
            default:
                return (r) this.f9952b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9951a) {
            case 0:
                ((e) this.f9952b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
