package n9;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class d implements Comparator, Serializable {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Float.compare(((c) obj).f21321c, ((c) obj2).f21321c);
    }
}
