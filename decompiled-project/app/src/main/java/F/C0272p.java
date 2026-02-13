package F;

import java.util.Comparator;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A4.s f3990b;

    public /* synthetic */ C0272p(A4.s sVar, int i7) {
        this.f3989a = i7;
        this.f3990b = sVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3989a) {
            case 0:
                Object obj3 = ((E.t) obj).f3490i;
                A4.s sVar = this.f3990b;
                return q3.f.h(Integer.valueOf(sVar.m(obj3)), Integer.valueOf(sVar.m(((E.t) obj2).f3490i)));
            case 1:
                Object obj4 = ((E.t) obj).f3490i;
                A4.s sVar2 = this.f3990b;
                return q3.f.h(Integer.valueOf(sVar2.m(obj4)), Integer.valueOf(sVar2.m(((E.t) obj2).f3490i)));
            case 2:
                Object obj5 = ((E.t) obj2).f3490i;
                A4.s sVar3 = this.f3990b;
                return q3.f.h(Integer.valueOf(sVar3.m(obj5)), Integer.valueOf(sVar3.m(((E.t) obj).f3490i)));
            default:
                Object obj6 = ((E.t) obj2).f3490i;
                A4.s sVar4 = this.f3990b;
                return q3.f.h(Integer.valueOf(sVar4.m(obj6)), Integer.valueOf(sVar4.m(((E.t) obj).f3490i)));
        }
    }
}
