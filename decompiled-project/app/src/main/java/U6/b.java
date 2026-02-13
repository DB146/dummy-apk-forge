package U6;

import B0.C0178g0;
import W6.C0592a;
import W6.C0593b;
import W6.C0595d;
import W6.C0596e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class b extends S6.a {
    @Override // S6.a
    public final Object a(AbstractC1007a abstractC1007a) {
        C0595d c0595d = (C0595d) abstractC1007a;
        C0592a s3 = C0593b.s();
        s3.c();
        C0593b.m((C0593b) s3.f15819b);
        int m10 = c0595d.m();
        C0178g0 c0178g0 = X6.e.f11001a;
        byte[] bArr = new byte[m10];
        ((SecureRandom) X6.e.f11001a.get()).nextBytes(bArr);
        C1013g o10 = AbstractC1014h.o(0, bArr, m10);
        s3.c();
        C0593b.n((C0593b) s3.f15819b, o10);
        C0596e n6 = c0595d.n();
        s3.c();
        C0593b.o((C0593b) s3.f15819b, n6);
        return (C0593b) s3.a();
    }

    @Override // S6.a
    public final AbstractC1007a b(AbstractC1014h abstractC1014h) {
        return C0595d.o(abstractC1014h, C1021o.a());
    }

    @Override // S6.a
    public final void c(AbstractC1007a abstractC1007a) {
        C0595d c0595d = (C0595d) abstractC1007a;
        c.o(c0595d.n());
        if (c0595d.m() != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }
}
