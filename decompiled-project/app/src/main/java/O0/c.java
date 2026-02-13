package O0;

import K0.C0374d;
import K0.E;
import Z.n;
import h3.o;
import kotlin.jvm.internal.l;
import q3.s;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final C0374d f7414a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7415b;

    /* renamed from: c, reason: collision with root package name */
    public final E f7416c;

    static {
        s sVar = n.f12102a;
    }

    public c(C0374d c0374d, long j) {
        this.f7414a = c0374d;
        int length = c0374d.f5871b.length();
        int i7 = E.f5852c;
        int i10 = (int) (j >> 32);
        int i11 = i10 < 0 ? 0 : i10;
        i11 = i11 > length ? length : i11;
        int i12 = (int) (4294967295L & j);
        int i13 = i12 >= 0 ? i12 : 0;
        length = i13 <= length ? i13 : length;
        this.f7415b = (i11 == i10 && length == i12) ? j : E6.b.a(i11, length);
        this.f7416c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = cVar.f7415b;
        int i7 = E.f5852c;
        return this.f7415b == j && l.a(this.f7416c, cVar.f7416c) && l.a(this.f7414a, cVar.f7414a);
    }

    public final int hashCode() {
        int hashCode = this.f7414a.hashCode() * 31;
        int i7 = E.f5852c;
        int f4 = o.f(hashCode, 31, this.f7415b);
        E e2 = this.f7416c;
        return f4 + (e2 != null ? Long.hashCode(e2.f5853a) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.f7414a) + "', selection=" + ((Object) E.a(this.f7415b)) + ", composition=" + this.f7416c + ')';
    }
}
