package o9;

import V8.f;
import m9.C1649f;
import m9.EnumC1647d;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC1647d f22134a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22135b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22136c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22137d;

    /* renamed from: e, reason: collision with root package name */
    public final d f22138e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22139f;

    public d(R7.c cVar, EnumC1647d enumC1647d, int i7, int i10, int i11, d dVar, C1649f c1649f) {
        this.f22134a = enumC1647d;
        this.f22135b = i7;
        EnumC1647d enumC1647d2 = EnumC1647d.BYTE;
        int i12 = (enumC1647d == enumC1647d2 || dVar == null) ? i10 : dVar.f22136c;
        this.f22136c = i12;
        this.f22137d = i11;
        this.f22138e = dVar;
        boolean z8 = false;
        int i13 = dVar != null ? dVar.f22139f : 0;
        if ((enumC1647d == enumC1647d2 && dVar == null && i12 != 0) || (dVar != null && i12 != dVar.f22136c)) {
            z8 = true;
        }
        i13 = (dVar == null || enumC1647d != dVar.f22134a || z8) ? i13 + enumC1647d.a(c1649f) + 4 : i13;
        int ordinal = enumC1647d.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                i13 += i11 != 1 ? 11 : 6;
            } else if (ordinal == 4) {
                i13 += ((String) cVar.f8933d).substring(i7, i11 + i7).getBytes(((f) cVar.f8934e).f10215a[i10].charset()).length * 8;
                if (z8) {
                    i13 += 12;
                }
            } else if (ordinal == 6) {
                i13 += 13;
            }
        } else {
            i13 += i11 != 1 ? i11 == 2 ? 7 : 10 : 4;
        }
        this.f22139f = i13;
    }
}
