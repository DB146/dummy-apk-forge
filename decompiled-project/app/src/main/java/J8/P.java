package J8;

import java.util.Currency;

/* loaded from: classes.dex */
public class P extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        String h02 = aVar.h0();
        try {
            return Currency.getInstance(h02);
        } catch (IllegalArgumentException e2) {
            StringBuilder n6 = X.c.n("Failed parsing '", h02, "' as Currency; at path ");
            n6.append(aVar.V(true));
            throw new Db.d(4, n6.toString(), e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        bVar.e0(((Currency) obj).getCurrencyCode());
    }
}
