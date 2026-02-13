package U4;

import java.util.List;

/* loaded from: classes.dex */
public final class f extends R4.b {

    /* renamed from: d, reason: collision with root package name */
    public final List f9524d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9525e;

    public f(long j, List list) {
        super(0L, list.size() - 1);
        this.f9525e = j;
        this.f9524d = list;
    }

    @Override // R4.l
    public final long a() {
        b();
        V4.g gVar = (V4.g) this.f9524d.get((int) this.f8852c);
        return this.f9525e + gVar.f10070e + gVar.f10068c;
    }

    @Override // R4.l
    public final long c() {
        b();
        return this.f9525e + ((V4.g) this.f9524d.get((int) this.f8852c)).f10070e;
    }
}
