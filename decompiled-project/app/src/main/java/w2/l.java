package w2;

import Q.C0480b;
import Q.C0506o;
import a0.C0691r;
import h3.H;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25688c;

    public /* synthetic */ l(Object obj, Object obj2, int i7, int i10) {
        this.f25686a = i10;
        this.f25687b = obj;
        this.f25688c = obj2;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        int i7 = this.f25686a;
        C0506o c0506o = (C0506o) obj;
        ((Integer) obj2).getClass();
        switch (i7) {
            case 0:
                H.e((C0691r) this.f25687b, (List) this.f25688c, c0506o, C0480b.u(1));
                return Db.q.f3365a;
            default:
                int u3 = C0480b.u(1);
                c2.q.e((Z.g) this.f25687b, (Y.e) this.f25688c, c0506o, u3);
                return Db.q.f3365a;
        }
    }
}
