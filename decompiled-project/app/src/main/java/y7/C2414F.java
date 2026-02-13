package y7;

/* renamed from: y7.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2414F extends r0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27120b;

    public C2414F(String str, String str2) {
        this.f27119a = str;
        this.f27120b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f27119a.equals(((C2414F) r0Var).f27119a) && this.f27120b.equals(((C2414F) r0Var).f27120b);
    }

    public final int hashCode() {
        return ((this.f27119a.hashCode() ^ 1000003) * 1000003) ^ this.f27120b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f27119a);
        sb2.append(", value=");
        return h3.o.p(sb2, this.f27120b, "}");
    }
}
