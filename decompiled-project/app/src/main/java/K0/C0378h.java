package K0;

/* renamed from: K0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0378h extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f5883a;

    /* renamed from: b, reason: collision with root package name */
    public final D f5884b;

    public C0378h(String str, D d10) {
        this.f5883a = str;
        this.f5884b = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0378h)) {
            return false;
        }
        C0378h c0378h = (C0378h) obj;
        if (!kotlin.jvm.internal.l.a(this.f5883a, c0378h.f5883a)) {
            return false;
        }
        if (!kotlin.jvm.internal.l.a(this.f5884b, c0378h.f5884b)) {
            return false;
        }
        c0378h.getClass();
        return kotlin.jvm.internal.l.a(null, null);
    }

    public final int hashCode() {
        int hashCode = this.f5883a.hashCode() * 31;
        D d10 = this.f5884b;
        return (hashCode + (d10 != null ? d10.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return A3.c.l(new StringBuilder("LinkAnnotation.Clickable(tag="), this.f5883a, ')');
    }
}
