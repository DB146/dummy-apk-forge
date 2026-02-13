package r2;

import D5.d;
import l2.H;
import l2.I;
import l2.InterfaceC1479x;

/* renamed from: r2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1916a extends H {

    /* renamed from: l, reason: collision with root package name */
    public final d f23646l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1479x f23647m;

    /* renamed from: n, reason: collision with root package name */
    public b f23648n;

    public C1916a(d dVar) {
        this.f23646l = dVar;
        if (dVar.f3241a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        dVar.f3241a = this;
    }

    @Override // l2.AbstractC1456G
    public final void g() {
        d dVar = this.f23646l;
        dVar.f3242b = true;
        dVar.f3244d = false;
        dVar.f3243c = false;
        dVar.f3248i.drainPermits();
        dVar.c();
    }

    @Override // l2.AbstractC1456G
    public final void h() {
        this.f23646l.f3242b = false;
    }

    @Override // l2.AbstractC1456G
    public final void i(I i7) {
        super.i(i7);
        this.f23647m = null;
        this.f23648n = null;
    }

    public final void m() {
        InterfaceC1479x interfaceC1479x = this.f23647m;
        b bVar = this.f23648n;
        if (interfaceC1479x == null || bVar == null) {
            return;
        }
        super.i(bVar);
        e(interfaceC1479x, bVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        Class<?> cls = this.f23646l.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
