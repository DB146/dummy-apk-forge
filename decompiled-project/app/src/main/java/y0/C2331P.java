package y0;

/* renamed from: y0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2331P {

    /* renamed from: a, reason: collision with root package name */
    public final S f26570a;

    /* renamed from: b, reason: collision with root package name */
    public w f26571b;

    /* renamed from: c, reason: collision with root package name */
    public final C2330O f26572c = new C2330O(this, 2);

    /* renamed from: d, reason: collision with root package name */
    public final C2330O f26573d = new C2330O(this, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C2330O f26574e = new C2330O(this, 1);

    public C2331P(S s3) {
        this.f26570a = s3;
    }

    public final w a() {
        w wVar = this.f26571b;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }
}
