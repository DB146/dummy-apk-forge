package Bc;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class l extends LinkedHashMap implements Iterable {
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return keySet().iterator();
    }
}
