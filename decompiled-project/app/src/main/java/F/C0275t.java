package F;

import Q.C0480b;
import Q.C0506o;

/* renamed from: F.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275t extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4003a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275t(E.j jVar, Object obj, int i7, Object obj2, int i10) {
        super(2);
        this.f4007e = jVar;
        this.f4004b = obj;
        this.f4005c = i7;
        this.f4008f = obj2;
        this.f4006d = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0275t(Object obj, int i7, A a9, Y.e eVar, int i10) {
        super(2);
        this.f4004b = obj;
        this.f4005c = i7;
        this.f4007e = a9;
        this.f4008f = eVar;
        this.f4006d = i10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4003a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(this.f4006d | 1);
                Object obj3 = this.f4008f;
                x.d((E.j) this.f4007e, this.f4004b, this.f4005c, obj3, (C0506o) obj, u3);
                return Db.q.f3365a;
            default:
                ((Number) obj2).intValue();
                int u10 = C0480b.u(this.f4006d | 1);
                Y.e eVar = (Y.e) this.f4008f;
                x.b(this.f4004b, this.f4005c, (A) this.f4007e, eVar, (C0506o) obj, u10);
                return Db.q.f3365a;
        }
    }
}
