package okhttp3;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class Cache$urls$1 implements Iterator<String>, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22249a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        this.f22249a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final String next() {
        this.f22249a = false;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f22249a) {
            throw new IllegalStateException("remove() before next()");
        }
        throw null;
    }
}
