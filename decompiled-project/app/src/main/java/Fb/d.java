package Fb;

import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d implements Map.Entry, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final f f4190a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4191b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4192c;

    public d(f map, int i7) {
        l.e(map, "map");
        this.f4190a = map;
        this.f4191b = i7;
        this.f4192c = map.f4206v;
    }

    public final void a() {
        if (this.f4190a.f4206v != this.f4192c) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (l.a(entry.getKey(), getKey()) && l.a(entry.getValue(), getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.f4190a.f4199a[this.f4191b];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.f4190a.f4200b;
        l.b(objArr);
        return objArr[this.f4191b];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        f fVar = this.f4190a;
        fVar.c();
        Object[] objArr = fVar.f4200b;
        if (objArr == null) {
            int length = fVar.f4199a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            fVar.f4200b = objArr;
        }
        int i7 = this.f4191b;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
