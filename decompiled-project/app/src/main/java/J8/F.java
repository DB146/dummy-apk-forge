package J8;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public class F extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        try {
            return I8.h.i(h02);
        } catch (NumberFormatException e2) {
            StringBuilder n6 = X.c.n("Failed parsing '", h02, "' as BigDecimal; at path ");
            n6.append(aVar.V(true));
            throw new Db.d(4, n6.toString(), e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.d0((BigDecimal) obj);
    }
}
