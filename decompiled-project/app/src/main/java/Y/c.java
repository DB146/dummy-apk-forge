package Y;

import Db.q;
import Q.C0506o;
import V0.p;
import cc.F;
import z.m0;
import z.p0;

/* loaded from: classes.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.a implements Rb.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f11033v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i7, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i7, i10, cls, obj, str, str2);
        this.f11033v = i11;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11033v) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((e) this.f19117a).b((C0506o) obj, intValue);
                return q.f3365a;
            default:
                long j = ((p) obj).f9990a;
                p0 p0Var = (p0) this.f19117a;
                F.B(p0Var.f28058O.c(), null, 0, new m0(p0Var, j, null), 3);
                return q.f3365a;
        }
    }
}
