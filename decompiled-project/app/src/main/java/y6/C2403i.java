package y6;

import y7.u0;

/* renamed from: y6.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2403i extends u0 {
    @Override // y7.u0
    public final void p(s sVar, float f4, float f10) {
        sVar.d(f10 * f4, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f4;
        o oVar = new o(0.0f, 0.0f, f11, f11);
        oVar.f27069f = 180.0f;
        oVar.g = 90.0f;
        sVar.f27080f.add(oVar);
        C2407m c2407m = new C2407m(oVar);
        sVar.a(180.0f);
        sVar.g.add(c2407m);
        sVar.f27078d = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        sVar.f27076b = (((float) Math.cos(Math.toRadians(d10))) * f13) + f12;
        sVar.f27077c = (f13 * ((float) Math.sin(Math.toRadians(d10)))) + f12;
    }
}
