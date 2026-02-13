package A9;

/* renamed from: A9.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0088g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1200a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0092h1 f1201b;

    public /* synthetic */ C0088g1(C0092h1 c0092h1, int i7) {
        this.f1200a = i7;
        this.f1201b = c0092h1;
    }

    public void a(P0 p02) {
        switch (this.f1200a) {
            case 1:
                C0092h1 c0092h1 = this.f1201b;
                c0092h1.s0(p02);
                C0084f1 c0084f1 = c0092h1.f1211o0;
                if (c0084f1.f1153r == null) {
                    p02.getClass();
                    return;
                } else {
                    if (c0084f1 == null || c0084f1.f1140b == null) {
                        return;
                    }
                    c0084f1.a(true);
                    return;
                }
            case 2:
                this.f1201b.s0(p02);
                return;
            default:
                C0084f1 c0084f12 = this.f1201b.f1211o0;
                if (c0084f12.f1154s != null || c0084f12 == null || c0084f12.f1140b == null) {
                    return;
                }
                c0084f12.a(true);
                return;
        }
    }
}
