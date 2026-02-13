package J;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f5396a;

    /* renamed from: b, reason: collision with root package name */
    public String f5397b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5398c = false;

    /* renamed from: d, reason: collision with root package name */
    public d f5399d = null;

    public e(String str, String str2) {
        this.f5396a = str;
        this.f5397b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return l.a(this.f5396a, eVar.f5396a) && l.a(this.f5397b, eVar.f5397b) && this.f5398c == eVar.f5398c && l.a(this.f5399d, eVar.f5399d);
    }

    public final int hashCode() {
        int g = o.g(this.f5398c, A3.c.d(this.f5396a.hashCode() * 31, 31, this.f5397b), 31);
        d dVar = this.f5399d;
        return g + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f5399d + ", isShowingSubstitution=" + this.f5398c + ')';
    }
}
