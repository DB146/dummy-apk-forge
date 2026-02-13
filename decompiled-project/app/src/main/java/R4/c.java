package R4;

import m4.L;
import m5.InterfaceC1613j;
import n5.D;
import s4.C1981i;
import s4.u;
import s4.v;

/* loaded from: classes.dex */
public final class c implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f8853a;

    /* renamed from: b, reason: collision with root package name */
    public final L f8854b;

    /* renamed from: c, reason: collision with root package name */
    public final C1981i f8855c = new C1981i();

    /* renamed from: d, reason: collision with root package name */
    public L f8856d;

    /* renamed from: e, reason: collision with root package name */
    public v f8857e;

    /* renamed from: f, reason: collision with root package name */
    public long f8858f;

    public c(int i7, int i10, L l10) {
        this.f8853a = i10;
        this.f8854b = l10;
    }

    @Override // s4.v
    public final void a(L l10) {
        L l11 = this.f8854b;
        if (l11 != null) {
            l10 = l10.d(l11);
        }
        this.f8856d = l10;
        v vVar = this.f8857e;
        int i7 = D.f21141a;
        vVar.a(l10);
    }

    @Override // s4.v
    public final void c(int i7, n5.v vVar) {
        v vVar2 = this.f8857e;
        int i10 = D.f21141a;
        vVar2.c(i7, vVar);
    }

    @Override // s4.v
    public final int d(InterfaceC1613j interfaceC1613j, int i7, boolean z8) {
        v vVar = this.f8857e;
        int i10 = D.f21141a;
        return vVar.b(interfaceC1613j, i7, z8);
    }

    @Override // s4.v
    public final void e(long j, int i7, int i10, int i11, u uVar) {
        long j10 = this.f8858f;
        if (j10 != -9223372036854775807L && j >= j10) {
            this.f8857e = this.f8855c;
        }
        v vVar = this.f8857e;
        int i12 = D.f21141a;
        vVar.e(j, i7, i10, i11, uVar);
    }
}
