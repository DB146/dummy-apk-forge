package C3;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f2578b = new m(0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f2579c = new m(1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f2580d = new m(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2581a;

    public /* synthetic */ m(int i7) {
        this.f2581a = i7;
    }

    public final boolean a(A3.a aVar) {
        switch (this.f2581a) {
            case 0:
                return false;
            case 1:
                return (aVar == A3.a.f344c || aVar == A3.a.f346e) ? false : true;
            default:
                return aVar == A3.a.f343b;
        }
    }
}
