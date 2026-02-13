package E9;

import Db.j;
import Eb.B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.l;
import m4.C1549C;
import m4.v0;

/* loaded from: classes2.dex */
public final class h extends c {
    @Override // E9.c
    public final void d(List linkStreams, boolean z8, Map itemMetaData, v0 v0Var, Map map) {
        LinkedHashMap linkedHashMap;
        l.e(linkStreams, "linkStreams");
        l.e(itemMetaData, "itemMetaData");
        if (itemMetaData.containsKey("inputstream.adaptive.license_key")) {
            Object obj = itemMetaData.get("inputstream.adaptive.license_key");
            l.b(obj);
            linkedHashMap = B.I(new j("inputstream.adaptive.license_key", obj));
            if (itemMetaData.containsKey("inputstream.adaptive.manifest_type")) {
                Object obj2 = itemMetaData.get("inputstream.adaptive.manifest_type");
                l.b(obj2);
                linkedHashMap.put("inputstream.adaptive.manifest_type", obj2);
            }
            if (itemMetaData.containsKey("inputstream.adaptive.license_type")) {
                Object obj3 = itemMetaData.get("inputstream.adaptive.license_type");
                l.b(obj3);
                linkedHashMap.put("inputstream.adaptive.license_type", obj3);
            }
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if (itemMetaData.containsKey("user-agent")) {
            Object obj4 = itemMetaData.get("user-agent");
            l.b(obj4);
            linkedHashMap2.put("user-agent", obj4);
        }
        if (itemMetaData.containsKey("http-user-agent")) {
            Object obj5 = itemMetaData.get("http-user-agent");
            l.b(obj5);
            linkedHashMap2.put("http-user-agent", obj5);
        }
        super.d(linkStreams, z8, itemMetaData, v0Var, linkedHashMap2);
        C1549C c1549c = this.f3807c;
        if (c1549c != null) {
            c1549c.q0(true);
        }
    }

    @Override // E9.c
    public final void e() {
        C1549C c1549c = this.f3807c;
        if (c1549c == null) {
            if (c1549c != null) {
                c1549c.y0();
            }
            C1549C c1549c2 = this.f3807c;
            if (c1549c2 != null) {
                c1549c2.l0();
            }
            this.f3807c = a();
        }
    }
}
