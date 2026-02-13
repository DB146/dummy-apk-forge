package T7;

/* loaded from: classes.dex */
public final class r extends f {
    @Override // T7.f, java.lang.Comparable
    /* renamed from: b */
    public final int compareTo(s sVar) {
        return sVar == this ? 0 : 1;
    }

    @Override // T7.f, T7.s
    public final s e() {
        return this;
    }

    @Override // T7.f
    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // T7.f, T7.s
    public final s h(c cVar) {
        return cVar.equals(c.f9330d) ? this : k.f9348e;
    }

    @Override // T7.f, T7.s
    public final boolean isEmpty() {
        return false;
    }

    @Override // T7.f, T7.s
    public final boolean n(c cVar) {
        return false;
    }

    @Override // T7.f
    public final String toString() {
        return "<Max Node>";
    }
}
