package l2;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f19210a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f19210a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((Y) it.next()).clear$lifecycle_viewmodel_release();
        }
        linkedHashMap.clear();
    }
}
