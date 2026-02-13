package N;

import Q.C0480b;
import Q.C0506o;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p0.d f7051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f7052b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7053c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p0.d dVar, c0.m mVar, long j, int i7) {
        super(2);
        this.f7051a = dVar;
        this.f7052b = mVar;
        this.f7053c = j;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int u3 = C0480b.u(3121);
        l.a(this.f7051a, this.f7052b, this.f7053c, (C0506o) obj, u3);
        return Db.q.f3365a;
    }
}
