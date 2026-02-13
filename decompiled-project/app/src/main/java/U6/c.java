package U6;

import I2.I;
import W6.C0593b;
import W6.C0596e;
import W6.D;
import W6.j;
import W6.k;
import W6.l;
import W6.m;
import W6.n;
import W6.s;
import W6.t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1007a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class c extends I {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9814d = 1;

    public c() {
        super(j.class, new a(1));
    }

    public /* synthetic */ c(Class cls, a[] aVarArr) {
        super(cls, aVarArr);
    }

    public static final R7.b n() {
        m r10 = n.r();
        r10.c();
        n.m((n) r10.f15819b);
        r10.c();
        n.n((n) r10.f15819b);
        n nVar = (n) r10.a();
        k q10 = l.q();
        q10.c();
        l.m((l) q10.f15819b, nVar);
        q10.c();
        l.n((l) q10.f15819b);
        l lVar = (l) q10.a();
        new c();
        byte[] c10 = lVar.c();
        s s3 = t.s();
        s3.c();
        t.m((t) s3.f15819b);
        C1013g o10 = AbstractC1014h.o(0, c10, c10.length);
        s3.c();
        t.n((t) s3.f15819b, o10);
        D d10 = D.TINK;
        s3.c();
        t.o((t) s3.f15819b, d10);
        return new R7.b((t) s3.a(), 1);
    }

    public static void o(C0596e c0596e) {
        if (c0596e.n() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0596e.n() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void p(n nVar) {
        if (nVar.q() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = nVar.p().ordinal();
        if (ordinal == 1) {
            if (nVar.q() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 3) {
            if (nVar.q() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (ordinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (nVar.q() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // I2.I
    public final String g() {
        switch (this.f9814d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [S6.a, java.lang.Object] */
    @Override // I2.I
    public final S6.a h() {
        switch (this.f9814d) {
            case 0:
                return new Object();
            default:
                return new d(this);
        }
    }

    @Override // I2.I
    public final AbstractC1007a i(AbstractC1014h abstractC1014h) {
        switch (this.f9814d) {
            case 0:
                return C0593b.t(abstractC1014h, C1021o.a());
            default:
                return j.t(abstractC1014h, C1021o.a());
        }
    }

    @Override // I2.I
    public final void m(AbstractC1007a abstractC1007a) {
        switch (this.f9814d) {
            case 0:
                C0593b c0593b = (C0593b) abstractC1007a;
                int r10 = c0593b.r();
                int i7 = X6.f.f11002a;
                if (r10 < 0 || r10 > 0) {
                    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r10), 0));
                }
                if (c0593b.p().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                o(c0593b.q());
                return;
            default:
                j jVar = (j) abstractC1007a;
                int r11 = jVar.r();
                int i10 = X6.f.f11002a;
                if (r11 < 0 || r11 > 0) {
                    throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", Integer.valueOf(r11), 0));
                }
                if (jVar.p().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                p(jVar.q());
                return;
        }
    }
}
