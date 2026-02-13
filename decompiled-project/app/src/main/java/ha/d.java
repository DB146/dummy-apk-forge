package ha;

import android.text.SpannableString;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d extends e {

    /* renamed from: b, reason: collision with root package name */
    public final W9.e f17903b;

    /* renamed from: c, reason: collision with root package name */
    public final List f17904c;

    /* renamed from: d, reason: collision with root package name */
    public final SpannableString f17905d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17906e;

    public d(W9.e eVar, List list, SpannableString spannableString, int i7) {
        super(i7);
        this.f17903b = eVar;
        this.f17904c = list;
        this.f17905d = spannableString;
        this.f17906e = i7;
    }

    @Override // ha.e
    public final int a() {
        return this.f17906e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return l.a(this.f17903b, dVar.f17903b) && l.a(this.f17904c, dVar.f17904c) && l.a(this.f17905d, dVar.f17905d) && this.f17906e == dVar.f17906e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17906e) + ((this.f17905d.hashCode() + ((this.f17904c.hashCode() + (this.f17903b.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TV(data=" + this.f17903b + ", urls=" + this.f17904c + ", highlightTitle=" + ((Object) this.f17905d) + ", score=" + this.f17906e + ")";
    }
}
