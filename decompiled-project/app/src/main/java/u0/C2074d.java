package u0;

import u.C2042E;
import y0.InterfaceC2345m;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2074d {

    /* renamed from: a, reason: collision with root package name */
    public final S.e f24752a = new S.e(new C2073c[16]);

    /* renamed from: b, reason: collision with root package name */
    public final C2042E f24753b = new C2042E(10);

    public boolean a(u.r rVar, InterfaceC2345m interfaceC2345m, P3.p pVar, boolean z8) {
        S.e eVar = this.f24752a;
        Object[] objArr = eVar.f8959a;
        int i7 = eVar.f8961c;
        boolean z10 = false;
        for (int i10 = 0; i10 < i7; i10++) {
            z10 = ((C2073c) objArr[i10]).a(rVar, interfaceC2345m, pVar, z8) || z10;
        }
        return z10;
    }

    public void b(P3.p pVar) {
        S.e eVar = this.f24752a;
        int i7 = eVar.f8961c;
        while (true) {
            i7--;
            if (-1 >= i7) {
                return;
            }
            if (((C2073c) eVar.f8959a[i7]).f24747d.f21191b == 0) {
                eVar.l(i7);
            }
        }
    }
}
