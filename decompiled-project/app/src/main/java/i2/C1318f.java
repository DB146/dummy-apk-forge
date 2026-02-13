package i2;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: i2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1318f extends AbstractC1301I {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18260a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18261b = new HashMap();

    @Override // i2.AbstractC1301I
    public final AbstractC1300H a(Object obj) {
        Object obj2;
        AbstractC1300H a9;
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        do {
            obj2 = this.f18261b.get(cls);
            if ((obj2 instanceof AbstractC1301I) && (a9 = ((AbstractC1301I) obj2).a(obj)) != null) {
                return a9;
            }
            cls = cls.getSuperclass();
            if (obj2 != null) {
                break;
            }
        } while (cls != null);
        return (AbstractC1300H) obj2;
    }

    @Override // i2.AbstractC1301I
    public final AbstractC1300H[] b() {
        ArrayList arrayList = this.f18260a;
        return (AbstractC1300H[]) arrayList.toArray(new AbstractC1300H[arrayList.size()]);
    }
}
