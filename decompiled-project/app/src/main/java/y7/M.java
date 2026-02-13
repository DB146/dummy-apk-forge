package y7;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public int f27150a;

    /* renamed from: b, reason: collision with root package name */
    public String f27151b;

    /* renamed from: c, reason: collision with root package name */
    public int f27152c;

    /* renamed from: d, reason: collision with root package name */
    public long f27153d;

    /* renamed from: e, reason: collision with root package name */
    public long f27154e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27155f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public String f27156h;

    /* renamed from: i, reason: collision with root package name */
    public String f27157i;
    public byte j;

    public final N a() {
        String str;
        String str2;
        String str3;
        if (this.j == 63 && (str = this.f27151b) != null && (str2 = this.f27156h) != null && (str3 = this.f27157i) != null) {
            return new N(this.f27150a, str, this.f27152c, this.f27153d, this.f27154e, this.f27155f, this.g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f27151b == null) {
            sb2.append(" model");
        }
        if ((this.j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.f27156h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f27157i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
