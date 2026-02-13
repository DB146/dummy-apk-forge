package v2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import l2.Y;
import l2.d0;

/* renamed from: v2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2138j extends Y {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f24987a = new LinkedHashMap();

    @Override // l2.Y
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f24987a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((d0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        String concat;
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        int identityHashCode = System.identityHashCode(this);
        com.bumptech.glide.c.g(16);
        long j = identityHashCode & 4294967295L;
        if (j >= 0) {
            com.bumptech.glide.c.g(16);
            concat = Long.toString(j, 16);
            kotlin.jvm.internal.l.d(concat, "toString(...)");
        } else {
            long j10 = 16;
            long j11 = ((j >>> 1) / j10) << 1;
            long j12 = j - (j11 * j10);
            if (j12 >= j10) {
                j12 -= j10;
                j11++;
            }
            com.bumptech.glide.c.g(16);
            String l10 = Long.toString(j11, 16);
            kotlin.jvm.internal.l.d(l10, "toString(...)");
            com.bumptech.glide.c.g(16);
            String l11 = Long.toString(j12, 16);
            kotlin.jvm.internal.l.d(l11, "toString(...)");
            concat = l10.concat(l11);
        }
        sb2.append(concat);
        sb2.append("} ViewModelStores (");
        Iterator it = this.f24987a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
