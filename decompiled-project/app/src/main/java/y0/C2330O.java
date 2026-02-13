package y0;

/* renamed from: y0.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2330O extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26568a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2331P f26569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2330O(C2331P c2331p, int i7) {
        super(2);
        this.f26568a = i7;
        this.f26569b = c2331p;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26568a) {
            case 0:
                this.f26569b.a().f26621b = (Q.r) obj2;
                return Db.q.f3365a;
            case 1:
                ((A0.L) obj).X(new t(this.f26569b.a(), (Rb.e) obj2));
                return Db.q.f3365a;
            default:
                A0.L l10 = (A0.L) obj;
                w wVar = l10.f62U;
                C2331P c2331p = this.f26569b;
                if (wVar == null) {
                    wVar = new w(l10, c2331p.f26570a);
                    l10.f62U = wVar;
                }
                c2331p.f26571b = wVar;
                c2331p.a().b();
                w a9 = c2331p.a();
                S s3 = a9.f26622c;
                S s10 = c2331p.f26570a;
                if (s3 != s10) {
                    a9.f26622c = s10;
                    a9.c(false);
                    A0.L.S(a9.f26620a, false, 7);
                }
                return Db.q.f3365a;
        }
    }
}
