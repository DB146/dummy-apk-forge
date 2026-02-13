package Ha;

import Db.q;
import Q.C0480b;
import Q.C0506o;
import Rb.e;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f4910c;

    public /* synthetic */ a(boolean z8, e eVar, int i7, int i10) {
        this.f4908a = i10;
        this.f4909b = z8;
        this.f4910c = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f4908a;
        C0506o c0506o = (C0506o) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                int u3 = C0480b.u(385);
                b.a(this.f4909b, (Y.e) this.f4910c, c0506o, u3);
                return q.f3365a;
            default:
                O5.b.c(this.f4909b, this.f4910c, c0506o, C0480b.u(1));
                return q.f3365a;
        }
    }
}
