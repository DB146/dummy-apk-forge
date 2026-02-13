package V;

import java.util.Map;

/* loaded from: classes.dex */
public class a implements Map.Entry, Sb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9934a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9935b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9936c;

    public /* synthetic */ a(int i7, Object obj, Object obj2) {
        this.f9934a = i7;
        this.f9935b = obj;
        this.f9936c = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.f9934a) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && kotlin.jvm.internal.l.a(entry.getKey(), this.f9935b) && kotlin.jvm.internal.l.a(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.f9934a) {
            case 0:
                return this.f9935b;
            default:
                return this.f9935b;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.f9934a) {
            case 0:
                return this.f9936c;
            default:
                return this.f9936c;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.f9934a) {
            case 0:
                Object obj = this.f9935b;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ hashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.f9934a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.f9934a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f9935b);
                sb2.append('=');
                sb2.append(getValue());
                return sb2.toString();
            default:
                return super.toString();
        }
    }
}
