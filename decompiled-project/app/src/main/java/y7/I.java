package y7;

import java.util.List;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public String f27125a;

    /* renamed from: b, reason: collision with root package name */
    public String f27126b;

    /* renamed from: c, reason: collision with root package name */
    public String f27127c;

    /* renamed from: d, reason: collision with root package name */
    public long f27128d;

    /* renamed from: e, reason: collision with root package name */
    public Long f27129e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f27130f;
    public K g;

    /* renamed from: h, reason: collision with root package name */
    public C2436k0 f27131h;

    /* renamed from: i, reason: collision with root package name */
    public C2434j0 f27132i;
    public N j;
    public List k;

    /* renamed from: l, reason: collision with root package name */
    public int f27133l;

    /* renamed from: m, reason: collision with root package name */
    public byte f27134m;

    public final J a() {
        String str;
        String str2;
        K k;
        if (this.f27134m == 7 && (str = this.f27125a) != null && (str2 = this.f27126b) != null && (k = this.g) != null) {
            return new J(str, str2, this.f27127c, this.f27128d, this.f27129e, this.f27130f, k, this.f27131h, this.f27132i, this.j, this.k, this.f27133l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27125a == null) {
            sb2.append(" generator");
        }
        if (this.f27126b == null) {
            sb2.append(" identifier");
        }
        if ((this.f27134m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f27134m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.g == null) {
            sb2.append(" app");
        }
        if ((this.f27134m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
