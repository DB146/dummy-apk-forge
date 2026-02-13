package N;

import Q.C0480b;
import Q.C0506o;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0.s f7054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f7055b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7056c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p0.s sVar, c0.m mVar, long j, int i7) {
        super(2);
        this.f7054a = sVar;
        this.f7055b = mVar;
        this.f7056c = j;
        this.f7057d = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int u3 = C0480b.u(this.f7057d | 1);
        long j = this.f7056c;
        l.b(this.f7054a, this.f7055b, j, (C0506o) obj, u3);
        return Db.q.f3365a;
    }
}
