package I7;

import T7.q;
import T7.s;
import Y5.r;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5241a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f5242b;

    public e(r rVar) {
        this.f5241a = 3;
        this.f5242b = rVar.f11922a.keySet().iterator();
    }

    public e(Iterator it) {
        this.f5241a = 1;
        it.getClass();
        this.f5242b = it;
    }

    public /* synthetic */ e(Iterator it, int i7) {
        this.f5241a = i7;
        this.f5242b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f5241a) {
            case 0:
                return this.f5242b.hasNext();
            case 1:
                return this.f5242b.hasNext();
            case 2:
                return this.f5242b.hasNext();
            default:
                return this.f5242b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f5241a) {
            case 0:
                return ((Map.Entry) this.f5242b.next()).getKey();
            case 1:
                return ((Map.Entry) this.f5242b.next()).getValue();
            case 2:
                Map.Entry entry = (Map.Entry) this.f5242b.next();
                return new q((T7.c) entry.getKey(), (s) entry.getValue());
            default:
                return (String) this.f5242b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5241a) {
            case 0:
                this.f5242b.remove();
                return;
            case 1:
                this.f5242b.remove();
                return;
            case 2:
                this.f5242b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
