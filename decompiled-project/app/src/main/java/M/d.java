package M;

import Q.C0480b;
import Q.C0498k;
import Q.C0506o;
import Q.W;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import y.InterfaceC2286H;
import y.InterfaceC2287I;

/* loaded from: classes.dex */
public final class d implements InterfaceC2286H {

    /* renamed from: a, reason: collision with root package name */
    public final W f6484a;

    public d(W w10) {
        this.f6484a = w10;
    }

    @Override // y.InterfaceC2286H
    public final InterfaceC2287I a(A.i iVar, C0506o c0506o) {
        long b2;
        c0506o.S(988743187);
        m mVar = (m) c0506o.k(o.f6511a);
        W w10 = this.f6484a;
        if (((j0.n) w10.getValue()).f18554a != 16) {
            c0506o.S(-303557454);
            c0506o.p(false);
            b2 = ((j0.n) w10.getValue()).f18554a;
        } else {
            c0506o.S(-303499670);
            b2 = mVar.b(c0506o);
            c0506o.p(false);
        }
        W r10 = C0480b.r(new j0.n(b2), c0506o);
        W r11 = C0480b.r(mVar.a(c0506o), c0506o);
        c0506o.S(331259447);
        ViewGroup d10 = q3.f.d((View) c0506o.k(AndroidCompositionLocals_androidKt.f13211f));
        boolean g = c0506o.g(iVar) | c0506o.g(this) | c0506o.g(d10);
        Object H10 = c0506o.H();
        Object obj = C0498k.f8409a;
        if (g || H10 == obj) {
            H10 = new a(r10, r11, d10);
            c0506o.d0(H10);
        }
        a aVar = (a) H10;
        c0506o.p(false);
        boolean g2 = c0506o.g(iVar) | c0506o.i(aVar);
        Object H11 = c0506o.H();
        if (g2 || H11 == obj) {
            H11 = new e(iVar, aVar, null);
            c0506o.d0(H11);
        }
        C0480b.f(aVar, iVar, (Rb.e) H11, c0506o);
        c0506o.p(false);
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        dVar.getClass();
        return V0.f.a(Float.NaN, Float.NaN) && this.f6484a.equals(dVar.f6484a);
    }

    public final int hashCode() {
        return this.f6484a.hashCode() + h3.o.e(Float.NaN, Boolean.hashCode(true) * 31, 31);
    }
}
