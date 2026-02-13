package y7;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public String f27216a;

    /* renamed from: b, reason: collision with root package name */
    public int f27217b;

    /* renamed from: c, reason: collision with root package name */
    public int f27218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27219d;

    /* renamed from: e, reason: collision with root package name */
    public byte f27220e;

    public final C2416a0 a() {
        String str;
        if (this.f27220e == 7 && (str = this.f27216a) != null) {
            return new C2416a0(this.f27217b, this.f27218c, str, this.f27219d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27216a == null) {
            sb2.append(" processName");
        }
        if ((this.f27220e & 1) == 0) {
            sb2.append(" pid");
        }
        if ((this.f27220e & 2) == 0) {
            sb2.append(" importance");
        }
        if ((this.f27220e & 4) == 0) {
            sb2.append(" defaultProcess");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
