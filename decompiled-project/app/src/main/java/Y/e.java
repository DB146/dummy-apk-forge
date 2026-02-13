package Y;

import F.C0274s;
import Q.C0505n0;
import Q.C0506o;
import java.util.ArrayList;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f11039a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11040b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11041c;

    /* renamed from: d, reason: collision with root package name */
    public C0505n0 f11042d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f11043e;

    public e(int i7, Object obj, boolean z8) {
        this.f11039a = i7;
        this.f11040b = z8;
        this.f11041c = obj;
    }

    @Override // Rb.f
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return c(obj, (C0506o) obj2, ((Number) obj3).intValue());
    }

    public final Object b(C0506o c0506o, int i7) {
        c0506o.U(this.f11039a);
        e(c0506o);
        int a9 = i7 | (c0506o.g(this) ? f.a(2, 0) : f.a(1, 0));
        Object obj = this.f11041c;
        kotlin.jvm.internal.l.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(2, obj);
        Object invoke = ((Rb.e) obj).invoke(c0506o, Integer.valueOf(a9));
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new c(2, this, e.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return invoke;
    }

    public final Object c(Object obj, C0506o c0506o, int i7) {
        c0506o.U(this.f11039a);
        e(c0506o);
        int a9 = c0506o.g(this) ? f.a(2, 1) : f.a(1, 1);
        Object obj2 = this.f11041c;
        kotlin.jvm.internal.l.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(3, obj2);
        Object a10 = ((Rb.f) obj2).a(obj, c0506o, Integer.valueOf(a9 | i7));
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new C0274s(this, obj, i7, 3);
        }
        return a10;
    }

    public final Object d(Object obj, Object obj2, C0506o c0506o, int i7) {
        c0506o.U(this.f11039a);
        e(c0506o);
        int a9 = c0506o.g(this) ? f.a(2, 2) : f.a(1, 2);
        Object obj3 = this.f11041c;
        kotlin.jvm.internal.l.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        y.b(4, obj3);
        Object f4 = ((Rb.g) obj3).f(obj, obj2, c0506o, Integer.valueOf(a9 | i7));
        C0505n0 r10 = c0506o.r();
        if (r10 != null) {
            r10.f8432d = new d(this, obj, obj2, i7, 0);
        }
        return f4;
    }

    public final void e(C0506o c0506o) {
        C0505n0 v10;
        if (!this.f11040b || (v10 = c0506o.v()) == null) {
            return;
        }
        v10.f8429a |= 1;
        if (f.e(this.f11042d, v10)) {
            this.f11042d = v10;
            return;
        }
        ArrayList arrayList = this.f11043e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f11043e = arrayList2;
            arrayList2.add(v10);
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (f.e((C0505n0) arrayList.get(i7), v10)) {
                arrayList.set(i7, v10);
                return;
            }
        }
        arrayList.add(v10);
    }

    @Override // Rb.g
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return d(obj, obj2, (C0506o) obj3, ((Number) obj4).intValue());
    }

    @Override // Rb.e
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return b((C0506o) obj, ((Number) obj2).intValue());
    }
}
