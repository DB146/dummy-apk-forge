package v2;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f25037a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25038b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25039c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25040d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25041e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25042f;
    public final int g;

    public x(boolean z8, boolean z10, int i7, boolean z11, boolean z12, int i10, int i11) {
        this.f25037a = z8;
        this.f25038b = z10;
        this.f25039c = i7;
        this.f25040d = z11;
        this.f25041e = z12;
        this.f25042f = i10;
        this.g = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f25037a == xVar.f25037a && this.f25038b == xVar.f25038b && this.f25039c == xVar.f25039c && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null) && kotlin.jvm.internal.l.a(null, null) && this.f25040d == xVar.f25040d && this.f25041e == xVar.f25041e && this.f25042f == xVar.f25042f && this.g == xVar.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f25037a ? 1 : 0) * 31) + (this.f25038b ? 1 : 0)) * 31) + this.f25039c) * 923521) + (this.f25040d ? 1 : 0)) * 31) + (this.f25041e ? 1 : 0)) * 31) + this.f25042f) * 31) + this.g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(x.class.getSimpleName());
        sb2.append("(");
        if (this.f25037a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f25038b) {
            sb2.append("restoreState ");
        }
        int i7 = this.g;
        int i10 = this.f25042f;
        if (i10 != -1 || i7 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i7));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.l.d(sb3, "toString(...)");
        return sb3;
    }
}
