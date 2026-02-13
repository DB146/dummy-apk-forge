package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: N6.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0443p {

    /* renamed from: a, reason: collision with root package name */
    public transient Set f7326a;

    /* renamed from: b, reason: collision with root package name */
    public transient Collection f7327b;

    /* renamed from: c, reason: collision with root package name */
    public transient Map f7328c;

    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0443p) {
            return a().equals(((AbstractC0443p) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
