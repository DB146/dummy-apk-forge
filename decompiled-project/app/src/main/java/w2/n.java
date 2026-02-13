package w2;

import Q.C0506o;
import v2.C2133e;
import w.C2182i;

/* loaded from: classes.dex */
public final class n implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25693b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f25694c;

    public /* synthetic */ n(int i7, Object obj, Object obj2) {
        this.f25692a = i7;
        this.f25693b = obj;
        this.f25694c = obj2;
    }

    public n(C2133e c2133e, C2182i c2182i) {
        this.f25692a = 2;
        this.f25694c = c2133e;
        this.f25693b = c2182i;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25692a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o.x()) {
                    c0506o.N();
                } else {
                    ((q) this.f25693b).f25704u.a((C2133e) this.f25694c, c0506o, 0);
                }
                return Db.q.f3365a;
            case 1:
                C0506o c0506o2 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o2.x()) {
                    c0506o2.N();
                } else {
                    c2.q.e((Z.g) this.f25693b, (Y.e) this.f25694c, c0506o2, 0);
                }
                return Db.q.f3365a;
            default:
                C0506o c0506o3 = (C0506o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c0506o3.x()) {
                    c0506o3.N();
                } else {
                    C2133e c2133e = (C2133e) this.f25694c;
                    v2.q qVar = c2133e.f24967b;
                    kotlin.jvm.internal.l.c(qVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                    ((h) qVar).f25680f.f((C2182i) this.f25693b, c2133e, c0506o3, 0);
                }
                return Db.q.f3365a;
        }
    }
}
