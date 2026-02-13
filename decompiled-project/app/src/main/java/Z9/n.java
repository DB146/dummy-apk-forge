package Z9;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ba.i f12288b;

    public /* synthetic */ n(Ba.i iVar, int i7) {
        this.f12287a = i7;
        this.f12288b = iVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12287a) {
            case 0:
                Ba.i iVar = this.f12288b;
                return q3.f.h((Comparable) iVar.invoke(obj), (Comparable) iVar.invoke(obj2));
            default:
                Ba.i iVar2 = this.f12288b;
                return q3.f.h((Comparable) iVar2.invoke(obj), (Comparable) iVar2.invoke(obj2));
        }
    }
}
