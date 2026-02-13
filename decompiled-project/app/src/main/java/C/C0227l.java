package C;

import Q.C0480b;
import Q.C0506o;

/* renamed from: C.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0227l extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0.m f2408b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0227l(c0.m mVar, int i7, int i10) {
        super(2);
        this.f2407a = i10;
        this.f2408b = mVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f2407a;
        C0506o c0506o = (C0506o) obj;
        ((Number) obj2).intValue();
        switch (i7) {
            case 0:
                AbstractC0230o.a(this.f2408b, c0506o, C0480b.u(1));
                return Db.q.f3365a;
            default:
                tc.b.h(this.f2408b, c0506o, C0480b.u(1));
                return Db.q.f3365a;
        }
    }
}
