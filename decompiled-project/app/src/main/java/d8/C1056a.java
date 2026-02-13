package d8;

/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final int f16550a;

    public C1056a(int i7) {
        this.f16550a = i7;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        C1056a c1056a = (C1056a) ((e) obj);
        if (this.f16550a == c1056a.f16550a) {
            Object obj2 = d.f16552a;
            c1056a.getClass();
            if (obj2.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f16550a) + (d.f16552a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16550a + "intEncoding=" + d.f16552a + ')';
    }
}
