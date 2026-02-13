package f9;

import e9.C1102b;
import e9.C1103c;
import java.util.Objects;

/* renamed from: f9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1144a {

    /* renamed from: a, reason: collision with root package name */
    public final C1102b f17016a;

    /* renamed from: b, reason: collision with root package name */
    public final C1102b f17017b;

    /* renamed from: c, reason: collision with root package name */
    public final C1103c f17018c;

    public C1144a(C1102b c1102b, C1102b c1102b2, C1103c c1103c) {
        this.f17016a = c1102b;
        this.f17017b = c1102b2;
        this.f17018c = c1103c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1144a)) {
            return false;
        }
        C1144a c1144a = (C1144a) obj;
        return Objects.equals(this.f17016a, c1144a.f17016a) && Objects.equals(this.f17017b, c1144a.f17017b) && Objects.equals(this.f17018c, c1144a.f17018c);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.f17016a) ^ Objects.hashCode(this.f17017b)) ^ Objects.hashCode(this.f17018c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f17016a);
        sb2.append(" , ");
        sb2.append(this.f17017b);
        sb2.append(" : ");
        C1103c c1103c = this.f17018c;
        sb2.append(c1103c == null ? "null" : Integer.valueOf(c1103c.f16816a));
        sb2.append(" ]");
        return sb2.toString();
    }
}
