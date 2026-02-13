package E;

import F.C0265i;
import Q.C0506o;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f3412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3413b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, int i7) {
        super(2);
        this.f3412a = jVar;
        this.f3413b = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        C0506o c0506o = (C0506o) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
            j jVar = this.f3412a;
            A4.s sVar = jVar.f3415b.f3411a;
            int i7 = this.f3413b;
            C0265i k = sVar.k(i7);
            ((Y.e) k.f3977c.f29d).f(jVar.f3416c, Integer.valueOf(i7 - k.f3975a), c0506o, 0);
        } else {
            c0506o.N();
        }
        return Db.q.f3365a;
    }
}
