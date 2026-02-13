package y7;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public long f27205a;

    /* renamed from: b, reason: collision with root package name */
    public String f27206b;

    /* renamed from: c, reason: collision with root package name */
    public String f27207c;

    /* renamed from: d, reason: collision with root package name */
    public long f27208d;

    /* renamed from: e, reason: collision with root package name */
    public int f27209e;

    /* renamed from: f, reason: collision with root package name */
    public byte f27210f;

    public final Y a() {
        String str;
        if (this.f27210f == 7 && (str = this.f27206b) != null) {
            return new Y(this.f27205a, str, this.f27207c, this.f27208d, this.f27209e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f27210f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f27206b == null) {
            sb2.append(" symbol");
        }
        if ((this.f27210f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f27210f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
