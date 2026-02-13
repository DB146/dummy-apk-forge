package a4;

/* renamed from: a4.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766q extends AbstractC0742C {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f12671a;

    public C0766q(Integer num) {
        this.f12671a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0742C)) {
            return false;
        }
        Integer num = this.f12671a;
        C0766q c0766q = (C0766q) ((AbstractC0742C) obj);
        return num == null ? c0766q.f12671a == null : num.equals(c0766q.f12671a);
    }

    public final int hashCode() {
        Integer num = this.f12671a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f12671a + "}";
    }
}
