package T7;

/* loaded from: classes.dex */
public final class t extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final t f9361a = new Object();

    @Override // T7.l
    public final String a() {
        throw new IllegalArgumentException("Can't get query definition on priority index!");
    }

    @Override // T7.l
    public final boolean b(s sVar) {
        return !sVar.e().isEmpty();
    }

    @Override // T7.l
    public final q c(c cVar, s sVar) {
        return new q(cVar, new v("[PRIORITY-POST]", sVar));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        int compareTo = qVar.f9360b.e().compareTo(qVar2.f9360b.e());
        return compareTo != 0 ? compareTo : qVar.f9359a.compareTo(qVar2.f9359a);
    }

    @Override // T7.l
    public final q d() {
        return c(c.f9329c, s.k);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    public final int hashCode() {
        return 3155577;
    }

    public final String toString() {
        return "PriorityIndex";
    }
}
