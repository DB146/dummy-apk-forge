package F;

import Q.C0480b;
import Q.C0506o;

/* loaded from: classes.dex */
public final class O extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3929a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y.e f3930b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Y.e eVar) {
        super(2);
        this.f3930b = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(Y.e eVar, int i7) {
        super(2);
        this.f3930b = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3929a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(7);
                x.c(this.f3930b, (C0506o) obj, u3);
                return Db.q.f3365a;
            default:
                C0506o c0506o = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
                    c0506o.N();
                } else {
                    this.f3930b.invoke(c0506o, 0);
                }
                return Db.q.f3365a;
        }
    }
}
