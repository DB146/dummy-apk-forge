package D9;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f3290a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3291b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3292c;

    /* renamed from: d, reason: collision with root package name */
    public int f3293d;

    /* renamed from: e, reason: collision with root package name */
    public int f3294e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3295f;
    public ArrayList g;

    public b(String str) {
        this(str, false, true);
    }

    public b(String str, boolean z8, boolean z10) {
        this.f3293d = 0;
        this.f3294e = 0;
        this.f3290a = str;
        this.f3291b = z8;
        this.f3292c = z10;
    }

    public final void a(c cVar) {
        if (this.f3295f == null) {
            this.f3295f = new ArrayList();
        }
        this.f3295f.add(cVar);
    }

    public final void b(c cVar) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(cVar);
    }

    public void c() {
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(this.f3290a);
        sb2.append(" ");
        return A3.c.k(sb2, this.f3293d, "]");
    }
}
