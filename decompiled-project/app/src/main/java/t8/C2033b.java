package t8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: t8.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2033b {

    /* renamed from: a, reason: collision with root package name */
    public final String f24509a;

    /* renamed from: b, reason: collision with root package name */
    public final C2034c f24510b;

    public C2033b(Set set, C2034c c2034c) {
        this.f24509a = b(set);
        this.f24510b = c2034c;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C2032a c2032a = (C2032a) it.next();
            sb2.append(c2032a.f24507a);
            sb2.append('/');
            sb2.append(c2032a.f24508b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C2034c c2034c = this.f24510b;
        synchronized (((HashSet) c2034c.f24513b)) {
            unmodifiableSet = Collections.unmodifiableSet((HashSet) c2034c.f24513b);
        }
        boolean isEmpty = unmodifiableSet.isEmpty();
        String str = this.f24509a;
        if (isEmpty) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) c2034c.f24513b)) {
            unmodifiableSet2 = Collections.unmodifiableSet((HashSet) c2034c.f24513b);
        }
        sb2.append(b(unmodifiableSet2));
        return sb2.toString();
    }
}
