package cc;

/* renamed from: cc.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0957x extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final C0957x f14587b = new C0957x(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0957x f14588c = new C0957x(2, 1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14589a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0957x(int i7, int i10) {
        super(i7);
        this.f14589a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14589a) {
            case 0:
                return ((Hb.i) obj).plus((Hb.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((Hb.i) obj).plus((Hb.g) obj2);
        }
    }
}
