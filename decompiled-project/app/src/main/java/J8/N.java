package J8;

import java.net.InetAddress;

/* loaded from: classes.dex */
public class N extends G8.z {
    @Override // G8.z
    public final Object b(O8.a aVar) {
        if (aVar.j0() != 9) {
            return InetAddress.getByName(aVar.h0());
        }
        aVar.f0();
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        bVar.e0(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
