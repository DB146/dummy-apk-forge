package O0;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f7409e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7410a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7411b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7412c;

    /* renamed from: d, reason: collision with root package name */
    public final Q0.b f7413d;

    static {
        new b();
    }

    public b() {
        Q0.b bVar = Q0.b.f8598c;
        this.f7410a = true;
        this.f7411b = 1;
        this.f7412c = 1;
        this.f7413d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return com.bumptech.glide.c.A(0) && this.f7410a == bVar.f7410a && com.bumptech.glide.d.k(this.f7411b, bVar.f7411b) && a.a(this.f7412c, bVar.f7412c) && l.a(null, null) && l.a(this.f7413d, bVar.f7413d);
    }

    public final int hashCode() {
        return this.f7413d.f8599a.hashCode() + A3.c.c(this.f7412c, A3.c.c(this.f7411b, o.g(this.f7410a, A3.c.c(0, Boolean.hashCode(false) * 31, 31), 31), 31), 961);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=false, capitalization=");
        String str = "None";
        sb2.append((Object) (com.bumptech.glide.c.A(-1) ? "Unspecified" : com.bumptech.glide.c.A(0) ? "None" : com.bumptech.glide.c.A(1) ? "Characters" : com.bumptech.glide.c.A(2) ? "Words" : com.bumptech.glide.c.A(3) ? "Sentences" : "Invalid"));
        sb2.append(", autoCorrect=");
        sb2.append(this.f7410a);
        sb2.append(", keyboardType=");
        int i7 = this.f7411b;
        sb2.append((Object) (com.bumptech.glide.d.k(i7, 0) ? "Unspecified" : com.bumptech.glide.d.k(i7, 1) ? "Text" : com.bumptech.glide.d.k(i7, 2) ? "Ascii" : com.bumptech.glide.d.k(i7, 3) ? "Number" : com.bumptech.glide.d.k(i7, 4) ? "Phone" : com.bumptech.glide.d.k(i7, 5) ? "Uri" : com.bumptech.glide.d.k(i7, 6) ? "Email" : com.bumptech.glide.d.k(i7, 7) ? "Password" : com.bumptech.glide.d.k(i7, 8) ? "NumberPassword" : com.bumptech.glide.d.k(i7, 9) ? "Decimal" : "Invalid"));
        sb2.append(", imeAction=");
        int i10 = this.f7412c;
        if (a.a(i10, -1)) {
            str = "Unspecified";
        } else if (!a.a(i10, 0)) {
            str = a.a(i10, 1) ? "Default" : a.a(i10, 2) ? "Go" : a.a(i10, 3) ? "Search" : a.a(i10, 4) ? "Send" : a.a(i10, 5) ? "Previous" : a.a(i10, 6) ? "Next" : a.a(i10, 7) ? "Done" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f7413d);
        sb2.append(')');
        return sb2.toString();
    }
}
