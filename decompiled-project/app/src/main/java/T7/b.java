package T7;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: e, reason: collision with root package name */
    public final int f9327e;

    public b(String str, int i7) {
        super(str);
        this.f9327e = i7;
    }

    @Override // T7.c, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return compareTo((c) obj);
    }

    @Override // T7.c
    public final int d() {
        return this.f9327e;
    }

    @Override // T7.c
    public final String toString() {
        return h3.o.p(new StringBuilder("IntegerChildName(\""), this.f9331a, "\")");
    }
}
