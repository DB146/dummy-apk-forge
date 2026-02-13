package y7;

/* renamed from: y7.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2424e0 {

    /* renamed from: a, reason: collision with root package name */
    public C2428g0 f27266a;

    /* renamed from: b, reason: collision with root package name */
    public String f27267b;

    /* renamed from: c, reason: collision with root package name */
    public String f27268c;

    /* renamed from: d, reason: collision with root package name */
    public long f27269d;

    /* renamed from: e, reason: collision with root package name */
    public byte f27270e;

    public final C2426f0 a() {
        C2428g0 c2428g0;
        String str;
        String str2;
        if (this.f27270e == 1 && (c2428g0 = this.f27266a) != null && (str = this.f27267b) != null && (str2 = this.f27268c) != null) {
            return new C2426f0(c2428g0, str, str2, this.f27269d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27266a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f27267b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f27268c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f27270e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
