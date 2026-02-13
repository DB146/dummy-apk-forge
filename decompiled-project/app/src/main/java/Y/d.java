package Y;

import Db.q;
import Q.C0480b;
import Q.C0506o;
import y0.AbstractC2328M;
import y0.C2331P;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11034a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11035b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11036c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f11038e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i7, int i10) {
        super(2);
        this.f11034a = i10;
        this.f11036c = obj;
        this.f11037d = obj2;
        this.f11038e = obj3;
        this.f11035b = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f11034a) {
            case 0:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(this.f11035b) | 1;
                Object obj3 = this.f11037d;
                Object obj4 = this.f11038e;
                ((e) this.f11036c).d(obj3, obj4, (C0506o) obj, u3);
                return q.f3365a;
            case 1:
                ((Number) obj2).intValue();
                int u10 = C0480b.u(this.f11035b | 1);
                androidx.compose.ui.viewinterop.a.b((Rb.c) this.f11036c, (c0.m) this.f11037d, (Rb.c) this.f11038e, (C0506o) obj, u10);
                return q.f3365a;
            default:
                ((Number) obj2).intValue();
                int u11 = C0480b.u(this.f11035b | 1);
                Rb.e eVar = (Rb.e) this.f11038e;
                AbstractC2328M.b((C2331P) this.f11036c, (c0.m) this.f11037d, eVar, (C0506o) obj, u11);
                return q.f3365a;
        }
    }
}
