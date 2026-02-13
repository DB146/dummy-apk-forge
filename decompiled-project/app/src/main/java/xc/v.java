package xc;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f26380a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26381b;

    /* renamed from: c, reason: collision with root package name */
    public final int f26382c;

    public v(int i7, int i10, int i11) {
        this.f26380a = i7;
        this.f26381b = i10;
        this.f26382c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f26380a == vVar.f26380a && this.f26381b == vVar.f26381b && this.f26382c == vVar.f26382c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f26380a), Integer.valueOf(this.f26381b), Integer.valueOf(this.f26382c));
    }

    public final String toString() {
        return this.f26381b + "," + this.f26382c + ":" + this.f26380a;
    }
}
