package q;

import java.util.Map;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1869c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23328a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23329b;

    /* renamed from: c, reason: collision with root package name */
    public C1869c f23330c;

    /* renamed from: d, reason: collision with root package name */
    public C1869c f23331d;

    public C1869c(Object obj, Object obj2) {
        this.f23328a = obj;
        this.f23329b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1869c)) {
            return false;
        }
        C1869c c1869c = (C1869c) obj;
        return this.f23328a.equals(c1869c.f23328a) && this.f23329b.equals(c1869c.f23329b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f23328a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f23329b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f23328a.hashCode() ^ this.f23329b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f23328a + "=" + this.f23329b;
    }
}
