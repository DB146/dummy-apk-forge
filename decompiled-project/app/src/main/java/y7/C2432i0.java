package y7;

/* renamed from: y7.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2432i0 {

    /* renamed from: a, reason: collision with root package name */
    public int f27297a;

    /* renamed from: b, reason: collision with root package name */
    public String f27298b;

    /* renamed from: c, reason: collision with root package name */
    public String f27299c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27300d;

    /* renamed from: e, reason: collision with root package name */
    public byte f27301e;

    public final C2434j0 a() {
        String str;
        String str2;
        if (this.f27301e == 3 && (str = this.f27298b) != null && (str2 = this.f27299c) != null) {
            return new C2434j0(str, this.f27297a, str2, this.f27300d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f27301e & 1) == 0) {
            sb2.append(" platform");
        }
        if (this.f27298b == null) {
            sb2.append(" version");
        }
        if (this.f27299c == null) {
            sb2.append(" buildVersion");
        }
        if ((this.f27301e & 2) == 0) {
            sb2.append(" jailbroken");
        }
        throw new IllegalStateException(h3.o.o("Missing required properties:", sb2));
    }
}
