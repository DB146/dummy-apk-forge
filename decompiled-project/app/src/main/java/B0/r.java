package B0;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final r f1960b = new r(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final r f1961c = new r(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final r f1962d = new r(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final r f1963e = new r(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final r f1964f = new r(1, 4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1965a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i7, int i10) {
        super(i7);
        this.f1965a = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3.f4494a.c(H0.q.f4530C) != false) goto L14;
     */
    @Override // Rb.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z8;
        switch (this.f1965a) {
            case 0:
                return Db.q.f3365a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                H0.i v10 = ((A0.L) obj).v();
                if (v10 != null) {
                    z8 = true;
                    if (v10.f4496c) {
                        break;
                    }
                }
                z8 = false;
                return Boolean.valueOf(z8);
            default:
                return Boolean.valueOf(X.b(obj));
        }
    }
}
