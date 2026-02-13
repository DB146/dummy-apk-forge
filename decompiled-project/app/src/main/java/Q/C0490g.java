package Q;

/* renamed from: Q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0490g extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C0490g f8395b = new C0490g(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0490g f8396c = new C0490g(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0490g(int i7, int i10) {
        super(i7);
        this.f8397a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8397a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (!c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    c0506o.N();
                }
                return Db.q.f3365a;
            default:
                C0506o c0506o2 = (C0506o) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (!c0506o2.K(intValue2 & 1, (intValue2 & 3) != 2)) {
                    c0506o2.N();
                }
                return Db.q.f3365a;
        }
    }
}
