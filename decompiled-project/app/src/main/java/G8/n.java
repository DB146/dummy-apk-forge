package G8;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4392a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof n) && ((n) obj).f4392a.equals(this.f4392a));
    }

    public final int hashCode() {
        return this.f4392a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f4392a.iterator();
    }
}
