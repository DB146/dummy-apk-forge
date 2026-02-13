package q4;

import android.text.TextUtils;
import m4.L;
import n5.AbstractC1705a;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f23464a;

    /* renamed from: b, reason: collision with root package name */
    public final L f23465b;

    /* renamed from: c, reason: collision with root package name */
    public final L f23466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23468e;

    public i(String str, L l10, L l11, int i7, int i10) {
        AbstractC1705a.h(i7 == 0 || i10 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f23464a = str;
        l10.getClass();
        this.f23465b = l10;
        l11.getClass();
        this.f23466c = l11;
        this.f23467d = i7;
        this.f23468e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f23467d == iVar.f23467d && this.f23468e == iVar.f23468e && this.f23464a.equals(iVar.f23464a) && this.f23465b.equals(iVar.f23465b) && this.f23466c.equals(iVar.f23466c);
    }

    public final int hashCode() {
        return this.f23466c.hashCode() + ((this.f23465b.hashCode() + A3.c.d((((527 + this.f23467d) * 31) + this.f23468e) * 31, 31, this.f23464a)) * 31);
    }
}
