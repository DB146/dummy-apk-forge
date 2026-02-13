package Q1;

import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f8612a;

    public g(String str) {
        this.f8612a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        return l.a(this.f8612a, ((g) obj).f8612a);
    }

    public final int hashCode() {
        return this.f8612a.hashCode();
    }

    public final String toString() {
        return this.f8612a;
    }
}
