package J8;

import java.net.URL;

/* loaded from: classes.dex */
public class L extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        if (h02.equals("null")) {
            return null;
        }
        return new URL(h02);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        URL url = (URL) obj;
        bVar.e0(url == null ? null : url.toExternalForm());
    }
}
