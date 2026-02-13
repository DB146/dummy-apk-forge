package B0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class M implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1750b;

    public /* synthetic */ M(Object obj, int i7) {
        this.f1749a = i7;
        this.f1750b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1749a) {
            case 0:
                return ((Number) ((N) this.f1750b).invoke(obj, obj2)).intValue();
            case 1:
                E4.w wVar = (E4.w) this.f1750b;
                return wVar.d(obj2) - wVar.d(obj);
            default:
                for (Rb.c cVar : (Rb.c[]) this.f1750b) {
                    int h10 = q3.f.h((Comparable) cVar.invoke(obj), (Comparable) cVar.invoke(obj2));
                    if (h10 != 0) {
                        return h10;
                    }
                }
                return 0;
        }
    }
}
