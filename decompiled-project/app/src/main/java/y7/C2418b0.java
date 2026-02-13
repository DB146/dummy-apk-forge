package y7;

/* renamed from: y7.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2418b0 {

    /* renamed from: a, reason: collision with root package name */
    public Double f27237a;

    /* renamed from: b, reason: collision with root package name */
    public int f27238b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27239c;

    /* renamed from: d, reason: collision with root package name */
    public int f27240d;

    /* renamed from: e, reason: collision with root package name */
    public long f27241e;

    /* renamed from: f, reason: collision with root package name */
    public long f27242f;
    public byte g;

    public final C2420c0 a() {
        if (this.g == 31) {
            return new C2420c0(this.f27237a, this.f27238b, this.f27239c, this.f27240d, this.f27241e, this.f27242f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb2.append(" batteryVelocity");
        }
        if ((this.g & 2) == 0) {
            sb2.append(" proximityOn");
        }
        if ((this.g & 4) == 0) {
            sb2.append(" orientation");
        }
        if ((this.g & 8) == 0) {
            sb2.append(" ramUsed");
        }
        if ((this.g & 16) == 0) {
            sb2.append(" diskUsed");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
