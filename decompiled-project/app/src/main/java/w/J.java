package w;

import x.InterfaceC2249t;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2249t f25514a;

    public J(InterfaceC2249t interfaceC2249t) {
        this.f25514a = interfaceC2249t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        j.getClass();
        return Float.compare(0.0f, 0.0f) == 0 && kotlin.jvm.internal.l.a(this.f25514a, j.f25514a);
    }

    public final int hashCode() {
        return this.f25514a.hashCode() + (Float.hashCode(0.0f) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f25514a + ')';
    }
}
