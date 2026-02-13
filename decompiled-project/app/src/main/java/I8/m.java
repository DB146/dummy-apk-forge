package I8;

import java.util.Map;

/* loaded from: classes.dex */
public final class m implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public m f5287a;

    /* renamed from: b, reason: collision with root package name */
    public m f5288b;

    /* renamed from: c, reason: collision with root package name */
    public m f5289c;

    /* renamed from: d, reason: collision with root package name */
    public m f5290d;

    /* renamed from: e, reason: collision with root package name */
    public m f5291e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f5292f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5293u;

    /* renamed from: v, reason: collision with root package name */
    public Object f5294v;

    /* renamed from: w, reason: collision with root package name */
    public int f5295w;

    public m(boolean z8) {
        this.f5292f = null;
        this.f5293u = z8;
        this.f5291e = this;
        this.f5290d = this;
    }

    public m(boolean z8, m mVar, Object obj, m mVar2, m mVar3) {
        this.f5287a = mVar;
        this.f5292f = obj;
        this.f5293u = z8;
        this.f5295w = 1;
        this.f5290d = mVar2;
        this.f5291e = mVar3;
        mVar3.f5290d = this;
        mVar2.f5291e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f5292f;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f5294v;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f5292f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f5294v;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f5292f;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5294v;
        return (obj2 != null ? obj2.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f5293u) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f5294v;
        this.f5294v = obj;
        return obj2;
    }

    public final String toString() {
        return this.f5292f + "=" + this.f5294v;
    }
}
