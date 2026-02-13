package A0;

import B0.S0;
import B0.f1;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public interface t0 {
    static s0 a(t0 t0Var, Rb.e eVar, k0 k0Var, boolean z8, int i7) {
        Reference poll;
        S.e eVar2;
        Object obj;
        if ((i7 & 8) != 0) {
            z8 = false;
        }
        B0.D d10 = (B0.D) t0Var;
        if (z8) {
            if (d10.isHardwareAccelerated() && d10.f1631l0) {
                try {
                    return new S0(d10, eVar, k0Var);
                } catch (Throwable unused) {
                    d10.f1631l0 = false;
                }
            }
            if (d10.f1615a0 == null) {
                if (!f1.f1889G) {
                    B0.X.r(new View(d10.getContext()));
                }
                B0.B0 b02 = f1.f1890H ? new B0.B0(d10.getContext()) : new B0.B0(d10.getContext());
                d10.f1615a0 = b02;
                d10.addView(b02, -1);
            }
            B0.B0 b03 = d10.f1615a0;
            kotlin.jvm.internal.l.b(b03);
            return new f1(d10, b03, eVar, k0Var);
        }
        do {
            q3.s sVar = d10.f1589G0;
            poll = ((ReferenceQueue) sVar.f23439c).poll();
            eVar2 = (S.e) sVar.f23438b;
            if (poll != null) {
                eVar2.k(poll);
            }
        } while (poll != null);
        while (true) {
            int i10 = eVar2.f8961c;
            if (i10 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.l(i10 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        s0 s0Var = (s0) obj;
        if (s0Var == null) {
            return new B0.E0(d10.getGraphicsContext().b(), d10.getGraphicsContext(), d10, eVar, k0Var);
        }
        s0Var.e(eVar, k0Var);
        return s0Var;
    }
}
