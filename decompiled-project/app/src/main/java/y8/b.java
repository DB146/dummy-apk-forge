package y8;

import h3.o;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f27418a;

    /* renamed from: b, reason: collision with root package name */
    public String f27419b;

    /* renamed from: c, reason: collision with root package name */
    public String f27420c;

    /* renamed from: d, reason: collision with root package name */
    public String f27421d;

    /* renamed from: e, reason: collision with root package name */
    public long f27422e;

    /* renamed from: f, reason: collision with root package name */
    public byte f27423f;

    public final c a() {
        if (this.f27423f == 1 && this.f27418a != null && this.f27419b != null && this.f27420c != null && this.f27421d != null) {
            return new c(this.f27418a, this.f27419b, this.f27420c, this.f27421d, this.f27422e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27418a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f27419b == null) {
            sb2.append(" variantId");
        }
        if (this.f27420c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f27421d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f27423f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(o.o("Missing required properties:", sb2));
    }
}
