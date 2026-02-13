package n5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import r4.C1941m;

/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1707c implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f21164a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f21165b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set f21166c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public List f21167d = Collections.emptyList();

    public final int b(C1941m c1941m) {
        int intValue;
        synchronized (this.f21164a) {
            try {
                intValue = this.f21165b.containsKey(c1941m) ? ((Integer) this.f21165b.get(c1941m)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return intValue;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.f21164a) {
            it = this.f21167d.iterator();
        }
        return it;
    }
}
