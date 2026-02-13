package H;

import V0.f;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4455a;

    public a(float f4) {
        this.f4455a = f4;
    }

    public final float a(long j, V0.c cVar) {
        return cVar.p(this.f4455a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && f.a(this.f4455a, ((a) obj).f4455a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4455a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4455a + ".dp)";
    }
}
