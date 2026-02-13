package j5;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f18630a;

    /* renamed from: b, reason: collision with root package name */
    public final C1379b f18631b;

    public f(int i7, C1379b c1379b) {
        this.f18630a = i7;
        this.f18631b = c1379b;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f18630a, ((f) obj).f18630a);
    }
}
