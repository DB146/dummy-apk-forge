package N6;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: N6.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0449w extends s0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator f7361a;

    public C0449w(Comparator comparator) {
        this.f7361a = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f7361a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0449w) {
            return this.f7361a.equals(((C0449w) obj).f7361a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7361a.hashCode();
    }

    public final String toString() {
        return this.f7361a.toString();
    }
}
