package W4;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final TreeSet f10716a = new TreeSet(new A0.B(7));

    /* renamed from: b, reason: collision with root package name */
    public int f10717b;

    /* renamed from: c, reason: collision with root package name */
    public int f10718c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10719d;

    public k() {
        d();
    }

    public static int b(int i7, int i10) {
        int min;
        int i11 = i7 - i10;
        return (Math.abs(i11) <= 1000 || (min = (Math.min(i7, i10) - Math.max(i7, i10)) + 65535) >= 1000) ? i11 : i7 < i10 ? min : -min;
    }

    public final synchronized void a(j jVar) {
        this.f10717b = jVar.f10714a.f10710c;
        this.f10716a.add(jVar);
    }

    public final synchronized C0591i c(long j) {
        if (this.f10716a.isEmpty()) {
            return null;
        }
        j jVar = (j) this.f10716a.first();
        int i7 = jVar.f10714a.f10710c;
        if (i7 != C0591i.a(this.f10718c) && j < jVar.f10715b) {
            return null;
        }
        this.f10716a.pollFirst();
        this.f10718c = i7;
        return jVar.f10714a;
    }

    public final synchronized void d() {
        this.f10716a.clear();
        this.f10719d = false;
        this.f10718c = -1;
        this.f10717b = -1;
    }
}
