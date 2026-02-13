package A9;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class X extends AbstractC0117n2 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1034a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1035b = new HashMap();

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2 a(Object obj) {
        Object obj2;
        AbstractC0113m2 a9;
        Class<?> cls = obj.getClass();
        do {
            obj2 = this.f1035b.get(cls);
            if ((obj2 instanceof AbstractC0117n2) && (a9 = ((AbstractC0117n2) obj2).a(obj)) != null) {
                return a9;
            }
            cls = cls.getSuperclass();
            if (obj2 != null) {
                break;
            }
        } while (cls != null);
        return (AbstractC0113m2) obj2;
    }

    @Override // A9.AbstractC0117n2
    public final AbstractC0113m2[] b() {
        ArrayList arrayList = this.f1034a;
        return (AbstractC0113m2[]) arrayList.toArray(new AbstractC0113m2[arrayList.size()]);
    }

    public final void c(Class cls, AbstractC0113m2 abstractC0113m2) {
        this.f1035b.put(cls, abstractC0113m2);
        ArrayList arrayList = this.f1034a;
        if (arrayList.contains(abstractC0113m2)) {
            return;
        }
        arrayList.add(abstractC0113m2);
    }
}
