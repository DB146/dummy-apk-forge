package v1;

import java.util.List;
import java.util.Objects;

/* renamed from: v1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2126a {

    /* renamed from: a, reason: collision with root package name */
    public String f24930a;

    /* renamed from: b, reason: collision with root package name */
    public String f24931b;

    /* renamed from: c, reason: collision with root package name */
    public List f24932c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2126a)) {
            return false;
        }
        C2126a c2126a = (C2126a) obj;
        return Objects.equals(this.f24930a, c2126a.f24930a) && Objects.equals(this.f24931b, c2126a.f24931b) && Objects.equals(this.f24932c, c2126a.f24932c);
    }

    public final int hashCode() {
        return Objects.hash(this.f24930a, this.f24931b, this.f24932c);
    }
}
