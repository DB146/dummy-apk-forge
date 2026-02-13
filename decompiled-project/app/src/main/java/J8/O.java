package J8;

import java.util.UUID;

/* loaded from: classes.dex */
public class O extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        try {
            return UUID.fromString(h02);
        } catch (IllegalArgumentException e2) {
            StringBuilder n6 = X.c.n("Failed parsing '", h02, "' as UUID; at path ");
            n6.append(aVar.V(true));
            throw new Db.d(4, n6.toString(), e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        UUID uuid = (UUID) obj;
        bVar.e0(uuid == null ? null : uuid.toString());
    }
}
