package Ba;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jb.InterfaceC1393d;
import y9.G;

/* loaded from: classes2.dex */
public final class d implements InterfaceC1393d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f2246b;

    public /* synthetic */ d(h hVar, int i7) {
        this.f2245a = i7;
        this.f2246b = hVar;
    }

    @Override // jb.InterfaceC1393d
    public final void accept(Object obj) {
        int i7;
        switch (this.f2245a) {
            case 0:
                Throwable it = (Throwable) obj;
                kotlin.jvm.internal.l.e(it, "it");
                A3.c.r(it, this.f2246b.b());
                return;
            case 1:
                M9.b it2 = (M9.b) obj;
                kotlin.jvm.internal.l.e(it2, "it");
                this.f2246b.c().l(new G(it2));
                return;
            case 2:
                Throwable it3 = (Throwable) obj;
                kotlin.jvm.internal.l.e(it3, "it");
                it3.getMessage();
                h t5 = this.f2246b;
                kotlin.jvm.internal.l.e(t5, "t");
                A3.c.r(it3, t5.c());
                return;
            default:
                Map it4 = (Map) obj;
                kotlin.jvm.internal.l.e(it4, "it");
                h hVar = this.f2246b;
                ((g) hVar.k.getValue()).removeCallbacks(hVar.a());
                b a9 = hVar.a();
                String str = hVar.g;
                kotlin.jvm.internal.l.b(str);
                a9.getClass();
                a9.f2240a = str;
                b a10 = hVar.a();
                Collection values = it4.values();
                if (values.isEmpty()) {
                    values = null;
                }
                if (values != null) {
                    Collection collection = values;
                    ArrayList arrayList = new ArrayList(Eb.p.S(collection, 10));
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        arrayList.add(Integer.valueOf(((List) it5.next()).size()));
                    }
                    Iterator it6 = arrayList.iterator();
                    if (!it6.hasNext()) {
                        throw new UnsupportedOperationException("Empty collection can't be reduced.");
                    }
                    Object next = it6.next();
                    while (it6.hasNext()) {
                        next = Integer.valueOf(((Number) next).intValue() + ((Number) it6.next()).intValue());
                    }
                    i7 = ((Number) next).intValue();
                } else {
                    i7 = 0;
                }
                a10.f2241b = i7;
                ((g) hVar.k.getValue()).postDelayed(hVar.a(), 2000L);
                return;
        }
    }
}
