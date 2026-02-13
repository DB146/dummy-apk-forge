package Z9;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements gb.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12286b;

    public /* synthetic */ m(Object obj, int i7) {
        this.f12285a = i7;
        this.f12286b = obj;
    }

    @Override // gb.k
    public final void b(gb.l observer) {
        switch (this.f12285a) {
            case 0:
                kotlin.jvm.internal.l.e(observer, "observer");
                s t5 = (s) this.f12286b;
                kotlin.jvm.internal.l.e(t5, "t");
                observer.onError(new Throwable("Empty Data"));
                return;
            default:
                kotlin.jvm.internal.l.e(observer, "it");
                StringBuilder sb2 = new StringBuilder("Empty program for channel id: ");
                sb2.append(this.f12286b);
                observer.onError(new Throwable(sb2.toString()));
                return;
        }
    }
}
