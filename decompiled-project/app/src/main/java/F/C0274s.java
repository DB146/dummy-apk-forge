package F;

import Q.C0480b;
import Q.C0501l0;
import Q.C0506o;
import java.util.Arrays;
import x.i0;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274s extends kotlin.jvm.internal.m implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3999a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4000b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4002d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0274s(int i7, E.j jVar, Object obj) {
        super(2);
        this.f3999a = 0;
        this.f4001c = jVar;
        this.f4000b = i7;
        this.f4002d = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0274s(Object obj, Object obj2, int i7, int i10) {
        super(2);
        this.f3999a = i10;
        this.f4001c = obj;
        this.f4002d = obj2;
        this.f4000b = i7;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3999a) {
            case 0:
                C0506o c0506o = (C0506o) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0506o.K(intValue & 1, (intValue & 3) != 2)) {
                    E.j jVar = (E.j) this.f4001c;
                    c0506o.S(-462424778);
                    A a9 = jVar.f3414a.f3382q;
                    int i7 = this.f4000b;
                    x.b(this.f4002d, i7, a9, Y.f.d(-824725566, new E.i(jVar, i7), c0506o), c0506o, 3072);
                    c0506o.p(false);
                } else {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 1:
                ((Number) obj2).intValue();
                C0501l0[] c0501l0Arr = (C0501l0[]) this.f4001c;
                C0480b.b((C0501l0[]) Arrays.copyOf(c0501l0Arr, c0501l0Arr.length), (Y.e) this.f4002d, (C0506o) obj, C0480b.u(this.f4000b | 1));
                return Db.q.f3365a;
            case 2:
                ((Number) obj2).intValue();
                int u3 = C0480b.u(this.f4000b | 1);
                C0480b.a((C0501l0) this.f4001c, (Y.e) this.f4002d, (C0506o) obj, u3);
                return Db.q.f3365a;
            case 3:
                ((Number) obj2).intValue();
                ((Y.e) this.f4001c).c(this.f4002d, (C0506o) obj, C0480b.u(this.f4000b) | 1);
                return Db.q.f3365a;
            case 4:
                ((Number) obj2).intValue();
                tc.b.i((c0.m) this.f4001c, (Rb.e) this.f4002d, (C0506o) obj, C0480b.u(this.f4000b | 1));
                return Db.q.f3365a;
            default:
                ((Number) obj2).intValue();
                ((i0) this.f4001c).a(this.f4002d, (C0506o) obj, C0480b.u(this.f4000b | 1));
                return Db.q.f3365a;
        }
    }
}
