package E;

import Q.C0506o;
import android.graphics.Typeface;
import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements Rb.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3410b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i7) {
        super(4);
        this.f3409a = i7;
        this.f3410b = obj;
    }

    @Override // Rb.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f3409a) {
            case 0:
                C0248c c0248c = (C0248c) obj;
                ((Number) obj2).intValue();
                C0506o c0506o = (C0506o) obj3;
                int intValue = ((Number) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0506o.g(c0248c) ? 4 : 2;
                }
                if (c0506o.K(intValue & 1, (intValue & 131) != 130)) {
                    ((Y.e) this.f3410b).a(c0248c, c0506o, Integer.valueOf(intValue & 14));
                } else {
                    c0506o.N();
                }
                return Db.q.f3365a;
            case 1:
                int i7 = ((N0.i) obj3).f7137a;
                int i10 = ((N0.j) obj4).f7138a;
                R0.c cVar = (R0.c) this.f3410b;
                N0.s b2 = ((N0.e) cVar.f8787e).b((N0.q) obj, (N0.k) obj2, i7, i10);
                if (b2 instanceof N0.s) {
                    Typeface typeface = b2.f7153a;
                    kotlin.jvm.internal.l.c(typeface, "null cannot be cast to non-null type android.graphics.Typeface");
                    return typeface;
                }
                Q7.h hVar = new Q7.h(b2, cVar.f8792x);
                cVar.f8792x = hVar;
                Object obj5 = hVar.f8697d;
                kotlin.jvm.internal.l.c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) obj5;
            default:
                int intValue2 = ((Number) obj).intValue();
                int intValue3 = ((Number) obj2).intValue();
                ((ViewStructure) this.f3410b).setDimens(intValue2, intValue3, 0, 0, ((Number) obj3).intValue() - intValue2, ((Number) obj4).intValue() - intValue3);
                return Db.q.f3365a;
        }
    }
}
