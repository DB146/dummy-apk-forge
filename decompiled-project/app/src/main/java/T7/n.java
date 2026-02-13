package T7;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f9353a = new Object();

    @Override // T7.l
    public final String a() {
        return ".key";
    }

    @Override // T7.l
    public final boolean b(s sVar) {
        return true;
    }

    @Override // T7.l
    public final q c(c cVar, s sVar) {
        O7.k.c(sVar instanceof v);
        return new q(c.b((String) sVar.getValue()), k.f9348e);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((q) obj).f9359a.compareTo(((q) obj2).f9359a);
    }

    @Override // T7.l
    public final q d() {
        return q.f9358d;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        return obj instanceof n;
    }

    public final int hashCode() {
        return 37;
    }

    public final String toString() {
        return "KeyIndex";
    }
}
