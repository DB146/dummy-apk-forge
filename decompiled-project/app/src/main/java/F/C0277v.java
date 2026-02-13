package F;

import Q.C0480b;
import Q.C0506o;

/* renamed from: F.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0277v extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Yb.g f4014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f4015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f4016c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Rb.e f4017d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0277v(Yb.g gVar, c0.m mVar, D d10, Rb.e eVar, int i7) {
        super(2);
        this.f4014a = gVar;
        this.f4015b = mVar;
        this.f4016c = d10;
        this.f4017d = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int u3 = C0480b.u(1);
        x.a(this.f4014a, this.f4015b, this.f4016c, this.f4017d, (C0506o) obj, u3);
        return Db.q.f3365a;
    }
}
