package P2;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f7791a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7792b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7793c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7794d;

    public h(int i7, int i10, String from, String to) {
        kotlin.jvm.internal.l.e(from, "from");
        kotlin.jvm.internal.l.e(to, "to");
        this.f7791a = i7;
        this.f7792b = i10;
        this.f7793c = from;
        this.f7794d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h other = (h) obj;
        kotlin.jvm.internal.l.e(other, "other");
        int i7 = this.f7791a - other.f7791a;
        return i7 == 0 ? this.f7792b - other.f7792b : i7;
    }
}
