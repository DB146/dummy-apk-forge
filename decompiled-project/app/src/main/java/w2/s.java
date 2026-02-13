package w2;

import Q.C0480b;
import Q.C0506o;
import cc.E;
import cc.F;
import v2.C2133e;
import x.O;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25705a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2133e f25706b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25707c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f25708d;

    public /* synthetic */ s(E e2, O o10, C2133e c2133e) {
        this.f25707c = e2;
        this.f25708d = o10;
        this.f25706b = c2133e;
    }

    public /* synthetic */ s(C2133e c2133e, Z.g gVar, Y.e eVar, int i7) {
        this.f25706b = c2133e;
        this.f25707c = gVar;
        this.f25708d = eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25705a) {
            case 0:
                ((Integer) obj2).getClass();
                int u3 = C0480b.u(385);
                C2133e c2133e = this.f25706b;
                Y.e eVar = (Y.e) this.f25708d;
                c2.q.d(c2133e, (Z.g) this.f25707c, eVar, (C0506o) obj, u3);
                return Db.q.f3365a;
            default:
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                F.B((E) this.f25707c, null, 0, new z(floatValue, (O) this.f25708d, this.f25706b, null), 3);
                return Db.q.f3365a;
        }
    }
}
