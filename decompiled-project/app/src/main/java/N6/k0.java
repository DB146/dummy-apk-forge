package N6;

import java.util.Map;

/* loaded from: classes.dex */
public final class k0 extends AbstractC0441n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f7302a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0 f7304c;

    public k0(l0 l0Var, Object obj, Object obj2) {
        this.f7304c = l0Var;
        this.f7302a = obj;
        this.f7303b = obj2;
    }

    @Override // N6.AbstractC0441n, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.f7302a.equals(entry.getKey()) && this.f7303b.equals(entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f7302a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f7303b;
    }

    @Override // N6.AbstractC0441n, java.util.Map.Entry
    public final int hashCode() {
        return this.f7302a.hashCode() ^ this.f7303b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object put = this.f7304c.put(this.f7302a, obj);
        this.f7303b = obj;
        return put;
    }
}
