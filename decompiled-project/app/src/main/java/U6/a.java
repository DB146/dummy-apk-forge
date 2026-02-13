package U6;

import E5.o;
import Q7.h;
import W6.C0593b;
import W6.j;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9813a;

    public /* synthetic */ a(int i7) {
        this.f9813a = i7;
    }

    public final X6.d a(AbstractC1007a abstractC1007a) {
        byte[] bArr;
        byte[] bArr2;
        switch (this.f9813a) {
            case 0:
                C0593b c0593b = (C0593b) abstractC1007a;
                AbstractC1014h p10 = c0593b.p();
                int size = p10.size();
                if (size == 0) {
                    bArr = A.f15706b;
                } else {
                    byte[] bArr3 = new byte[size];
                    p10.t(size, bArr3);
                    bArr = bArr3;
                }
                return new X6.d(new h(bArr), c0593b.q().n());
            default:
                j jVar = (j) abstractC1007a;
                W6.h p11 = jVar.q().p();
                AbstractC1014h p12 = jVar.p();
                int size2 = p12.size();
                if (size2 == 0) {
                    bArr2 = A.f15706b;
                } else {
                    byte[] bArr4 = new byte[size2];
                    p12.t(size2, bArr4);
                    bArr2 = bArr4;
                }
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "HMAC");
                int q10 = jVar.q().q();
                int ordinal = p11.ordinal();
                if (ordinal == 1) {
                    return new X6.d(new o("HMACSHA1", secretKeySpec), q10);
                }
                if (ordinal == 3) {
                    return new X6.d(new o("HMACSHA256", secretKeySpec), q10);
                }
                if (ordinal == 4) {
                    return new X6.d(new o("HMACSHA512", secretKeySpec), q10);
                }
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
