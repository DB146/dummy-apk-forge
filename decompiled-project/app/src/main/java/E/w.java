package E;

import A0.G0;
import F.E;
import F.S;
import a0.AbstractC0682i;
import a0.AbstractC0692s;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements Rb.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3504a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i7, Collection collection) {
        super(1);
        this.f3505b = i7;
        this.f3506c = collection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(A a9, int i7) {
        super(1);
        this.f3506c = a9;
        this.f3505b = i7;
    }

    @Override // Rb.c
    public final Object invoke(Object obj) {
        switch (this.f3504a) {
            case 0:
                F.B b2 = (F.B) obj;
                C0246a c0246a = ((A) this.f3506c).f3369a;
                AbstractC0682i c10 = AbstractC0692s.c();
                AbstractC0692s.f(c10, AbstractC0692s.d(c10), c10 != null ? c10.e() : null);
                for (int i7 = 0; i7 < 2; i7++) {
                    int i10 = this.f3505b + i7;
                    b2.getClass();
                    long j = E.f3904a;
                    F.D d10 = b2.f3900b;
                    G0 g02 = d10.f3903c;
                    if (g02 != null) {
                        b2.f3899a.add(new S(g02, i10, j, d10.f3902b));
                    }
                }
                return Db.q.f3365a;
            default:
                return Boolean.valueOf(((List) obj).addAll(this.f3505b, (Collection) this.f3506c));
        }
    }
}
