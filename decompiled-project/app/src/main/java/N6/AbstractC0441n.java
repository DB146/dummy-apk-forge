package N6;

import java.util.Map;

/* renamed from: N6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0441n implements Map.Entry {
    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return O5.b.o(getKey(), entry.getKey()) && O5.b.o(getValue(), entry.getValue());
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        Object key = getKey();
        Object value = getValue();
        return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
