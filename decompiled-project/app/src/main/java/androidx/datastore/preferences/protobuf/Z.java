package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: classes.dex */
public final class Z implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f13371a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f13373c;

    public Z(Y y10, Comparable comparable, Object obj) {
        this.f13373c = y10;
        this.f13371a = comparable;
        this.f13372b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13371a.compareTo(((Z) obj).f13371a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f13371a;
        if (comparable == null ? key == null : comparable.equals(key)) {
            Object obj2 = this.f13372b;
            Object value = entry.getValue();
            if (obj2 == null ? value == null : obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13371a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13372b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f13371a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f13372b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f13373c.b();
        Object obj2 = this.f13372b;
        this.f13372b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f13371a + "=" + this.f13372b;
    }
}
