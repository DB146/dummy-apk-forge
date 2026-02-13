package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class a0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f13374a = -1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13375b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f13376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y f13377d;

    public a0(Y y10) {
        this.f13377d = y10;
    }

    public final Iterator a() {
        if (this.f13376c == null) {
            this.f13376c = this.f13377d.f13367b.entrySet().iterator();
        }
        return this.f13376c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.f13374a + 1;
        Y y10 = this.f13377d;
        if (i7 >= y10.f13366a.size()) {
            return !y10.f13367b.isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f13375b = true;
        int i7 = this.f13374a + 1;
        this.f13374a = i7;
        Y y10 = this.f13377d;
        return i7 < y10.f13366a.size() ? (Map.Entry) y10.f13366a.get(this.f13374a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f13375b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f13375b = false;
        int i7 = Y.f13365f;
        Y y10 = this.f13377d;
        y10.b();
        if (this.f13374a >= y10.f13366a.size()) {
            a().remove();
            return;
        }
        int i10 = this.f13374a;
        this.f13374a = i10 - 1;
        y10.h(i10);
    }
}
