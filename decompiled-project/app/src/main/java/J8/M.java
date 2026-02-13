package J8;

import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class M extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        try {
            String h02 = aVar.h0();
            if (h02.equals("null")) {
                return null;
            }
            return new URI(h02);
        } catch (URISyntaxException e2) {
            throw new Db.d(4, e2);
        }
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        URI uri = (URI) obj;
        bVar.e0(uri == null ? null : uri.toASCIIString());
    }
}
