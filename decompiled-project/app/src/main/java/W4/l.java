package W4;

import N6.y0;
import m4.L;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10721b;

    /* renamed from: c, reason: collision with root package name */
    public final L f10722c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f10723d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10724e;

    public l(L l10, int i7, int i10, y0 y0Var, String str) {
        this.f10720a = i7;
        this.f10721b = i10;
        this.f10722c = l10;
        this.f10723d = y0.b(y0Var);
        this.f10724e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f10720a == lVar.f10720a && this.f10721b == lVar.f10721b && this.f10722c.equals(lVar.f10722c)) {
            y0 y0Var = this.f10723d;
            y0Var.getClass();
            if (N6.r.h(lVar.f10723d, y0Var) && this.f10724e.equals(lVar.f10724e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10724e.hashCode() + ((this.f10723d.hashCode() + ((this.f10722c.hashCode() + ((((217 + this.f10720a) * 31) + this.f10721b) * 31)) * 31)) * 31);
    }
}
