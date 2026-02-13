package U6;

import B0.C0178g0;
import W6.i;
import W6.j;
import W6.l;
import W6.n;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class d extends S6.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f9815b;

    public d(c cVar) {
        this.f9815b = cVar;
    }

    @Override // S6.a
    public final Object a(AbstractC1007a abstractC1007a) {
        l lVar = (l) abstractC1007a;
        i s3 = j.s();
        this.f9815b.getClass();
        s3.c();
        j.m((j) s3.f15819b);
        n p10 = lVar.p();
        s3.c();
        j.n((j) s3.f15819b, p10);
        int o10 = lVar.o();
        C0178g0 c0178g0 = X6.e.f11001a;
        byte[] bArr = new byte[o10];
        ((SecureRandom) X6.e.f11001a.get()).nextBytes(bArr);
        C1013g o11 = AbstractC1014h.o(0, bArr, o10);
        s3.c();
        j.o((j) s3.f15819b, o11);
        return (j) s3.a();
    }

    @Override // S6.a
    public final AbstractC1007a b(AbstractC1014h abstractC1014h) {
        return l.r(abstractC1014h, C1021o.a());
    }

    @Override // S6.a
    public final void c(AbstractC1007a abstractC1007a) {
        l lVar = (l) abstractC1007a;
        if (lVar.o() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        c.p(lVar.p());
    }
}
