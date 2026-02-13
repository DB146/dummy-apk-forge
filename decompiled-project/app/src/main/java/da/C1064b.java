package da;

import Eb.p;
import W9.e;
import W9.h;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb.InterfaceC1394e;
import kotlin.jvm.internal.l;

/* renamed from: da.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1064b implements InterfaceC1394e {

    /* renamed from: a, reason: collision with root package name */
    public static final C1064b f16608a = new Object();

    @Override // jb.InterfaceC1394e
    public final Object apply(Object obj) {
        Object obj2;
        String d10;
        List<h> it = (List) obj;
        l.e(it, "it");
        ArrayList arrayList = new ArrayList(p.S(it, 10));
        for (h hVar : it) {
            String g = hVar.f10888a.g();
            W9.e eVar = hVar.f10888a;
            String f4 = eVar.f();
            List<e.a> list = hVar.f10889b;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (l.a(((e.a) obj2).c(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                    break;
                }
            }
            e.a aVar = (e.a) obj2;
            if (aVar == null || (d10 = aVar.d()) == null) {
                d10 = ((e.a) list.get(0)).d();
            }
            String str = d10;
            ArrayList arrayList2 = new ArrayList(p.S(list, 10));
            for (e.a aVar2 : list) {
                arrayList2.add(new TVChannel.Url(aVar2.a(), aVar2.c(), aVar2.d(), null, null, null, null, 120, null));
            }
            arrayList.add(new TVChannel(g, eVar.c(), f4, str, "MAIN_SOURCE", eVar.a(), arrayList2, false, null, eVar.b(), 384, null));
        }
        return arrayList;
    }
}
