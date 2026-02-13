package W9;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10858a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10859b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10860c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10861d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10862e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10863f;
    public final boolean g;

    /* renamed from: h, reason: collision with root package name */
    public final String f10864h;

    /* renamed from: i, reason: collision with root package name */
    public final String f10865i;
    public final b j;
    public final long k;

    public c(String itemId, String category, String displayName, String thumb, long j, long j10, boolean z8, String description, String linkPlay, b type, long j11) {
        l.e(itemId, "itemId");
        l.e(category, "category");
        l.e(displayName, "displayName");
        l.e(thumb, "thumb");
        l.e(description, "description");
        l.e(linkPlay, "linkPlay");
        l.e(type, "type");
        this.f10858a = itemId;
        this.f10859b = category;
        this.f10860c = displayName;
        this.f10861d = thumb;
        this.f10862e = j;
        this.f10863f = j10;
        this.g = z8;
        this.f10864h = description;
        this.f10865i = linkPlay;
        this.j = type;
        this.k = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return l.a(this.f10858a, cVar.f10858a) && l.a(this.f10859b, cVar.f10859b) && l.a(this.f10860c, cVar.f10860c) && l.a(this.f10861d, cVar.f10861d) && this.f10862e == cVar.f10862e && this.f10863f == cVar.f10863f && this.g == cVar.g && l.a(this.f10864h, cVar.f10864h) && l.a(this.f10865i, cVar.f10865i) && this.j == cVar.j && this.k == cVar.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + ((this.j.hashCode() + A3.c.d(A3.c.d(o.g(this.g, o.f(o.f(A3.c.d(A3.c.d(A3.c.d(this.f10858a.hashCode() * 31, 31, this.f10859b), 31, this.f10860c), 31, this.f10861d), 31, this.f10862e), 31, this.f10863f), 31), 31, this.f10864h), 31, this.f10865i)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{\nitemId: ");
        sb2.append(this.f10858a);
        sb2.append(",category: ");
        sb2.append(this.f10859b);
        sb2.append(",displayName: ");
        sb2.append(this.f10860c);
        sb2.append(",thumb: ");
        sb2.append(this.f10861d);
        sb2.append(",currentPosition: ");
        sb2.append(this.f10862e);
        sb2.append(",contentDuration: ");
        sb2.append(this.f10863f);
        sb2.append(",isLiveStreaming: ");
        sb2.append(this.g);
        sb2.append(",description: ");
        sb2.append(this.f10864h);
        sb2.append(",linkPlay: ");
        sb2.append(this.f10865i);
        sb2.append(",type: ");
        sb2.append(this.j);
        sb2.append(",lastViewTime: ");
        return X.c.f(this.k, "}\n", sb2);
    }
}
