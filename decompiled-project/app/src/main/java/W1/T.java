package W1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class T implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f10339a;

    public T(U u3) {
        this.f10339a = u3;
    }

    @Override // W1.Q
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        U u3 = this.f10339a;
        C0558a c0558a = (C0558a) h3.o.k(1, u3.f10358d);
        u3.f10361h = c0558a;
        Iterator it = c0558a.f10409c.iterator();
        while (it.hasNext()) {
            C c10 = ((c0) it.next()).f10453b;
            if (c10 != null) {
                c10.f10259B = true;
            }
        }
        boolean U8 = u3.U(arrayList, arrayList2, -1, 0);
        if (!u3.f10365n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet<C> linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(U.G((C0558a) it2.next()));
            }
            Iterator it3 = u3.f10365n.iterator();
            while (it3.hasNext()) {
                A9.L l10 = (A9.L) it3.next();
                for (C c11 : linkedHashSet) {
                    l10.getClass();
                }
            }
        }
        return U8;
    }
}
