package T;

import Eb.AbstractC0255f;
import U.c;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0255f {

    /* renamed from: a, reason: collision with root package name */
    public final c f9193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9194b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9195c;

    public a(c cVar, int i7, int i10) {
        this.f9193a = cVar;
        this.f9194b = i7;
        Tb.a.f(i7, i10, cVar.b());
        this.f9195c = i10 - i7;
    }

    @Override // Eb.AbstractC0250a
    public final int b() {
        return this.f9195c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Tb.a.d(i7, this.f9195c);
        return this.f9193a.get(this.f9194b + i7);
    }

    @Override // Eb.AbstractC0255f, java.util.List
    public final List subList(int i7, int i10) {
        Tb.a.f(i7, i10, this.f9195c);
        int i11 = this.f9194b;
        return new a(this.f9193a, i7 + i11, i11 + i10);
    }
}
