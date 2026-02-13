package hc;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public static final x f17974b = new x(2, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f17975c = new x(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final x f17976d = new x(2, 2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17977a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i7, int i10) {
        super(i7);
        this.f17977a = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17977a) {
            case 0:
                Hb.g gVar = (Hb.g) obj2;
                if (!(gVar instanceof y)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? gVar : Integer.valueOf(intValue + 1);
            case 1:
                y yVar = (y) obj;
                Hb.g gVar2 = (Hb.g) obj2;
                if (yVar != null) {
                    return yVar;
                }
                if (gVar2 instanceof y) {
                    return (y) gVar2;
                }
                return null;
            default:
                C1272B c1272b = (C1272B) obj;
                Hb.g gVar3 = (Hb.g) obj2;
                if (gVar3 instanceof y) {
                    y yVar2 = (y) gVar3;
                    Object b2 = yVar2.b(c1272b.f17925a);
                    int i7 = c1272b.f17928d;
                    c1272b.f17926b[i7] = b2;
                    c1272b.f17928d = i7 + 1;
                    c1272b.f17927c[i7] = yVar2;
                }
                return c1272b;
        }
    }
}
