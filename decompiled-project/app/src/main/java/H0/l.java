package H0;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4499a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4500b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(String str, int i7) {
        super(1);
        this.f4499a = i7;
        this.f4500b = str;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f4499a) {
            case 0:
                s.c((i) obj, this.f4500b);
                return Db.q.f3365a;
            default:
                i semantics = (i) obj;
                kotlin.jvm.internal.l.e(semantics, "$this$semantics");
                String str = this.f4500b;
                if (str != null) {
                    s.c(semantics, str);
                }
                s.d(semantics);
                return Db.q.f3365a;
        }
    }
}
