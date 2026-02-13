package N;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: b, reason: collision with root package name */
    public static final B f6950b = new B(1, 0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(int i7, int i10) {
        super(i7);
        this.f6951a = i10;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        Db.q qVar = Db.q.f3365a;
        switch (this.f6951a) {
            case 0:
                Yb.h[] hVarArr = H0.s.f4563a;
                H0.t tVar = H0.q.f4547l;
                Yb.h hVar = H0.s.f4563a[5];
                tVar.a((H0.i) obj, Boolean.TRUE);
                return qVar;
            default:
                H0.i iVar = (H0.i) obj;
                H0.s.c(iVar, "ClosePlayer");
                H0.s.d(iVar);
                return qVar;
        }
    }
}
