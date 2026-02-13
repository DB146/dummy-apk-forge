package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class g extends AbstractC1028w {
    private static final g DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile V PARSER;
    private AbstractC1014h encryptedKeyset_ = AbstractC1014h.f15775b;
    private C keysetInfo_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1028w.l(g.class, gVar);
    }

    public static void m(g gVar, C1013g c1013g) {
        gVar.getClass();
        gVar.encryptedKeyset_ = c1013g;
    }

    public static void n(g gVar, C c10) {
        gVar.getClass();
        gVar.keysetInfo_ = c10;
    }

    public static f p() {
        return (f) DEFAULT_INSTANCE.e();
    }

    public static g q(byte[] bArr, C1021o c1021o) {
        return (g) AbstractC1028w.k(DEFAULT_INSTANCE, bArr, c1021o);
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [com.google.crypto.tink.shaded.protobuf.V, java.lang.Object] */
    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1028w
    public final Object f(int i7) {
        switch (P.c.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new g();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (g.class) {
                        try {
                            V v12 = PARSER;
                            V v13 = v12;
                            if (v12 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                v13 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return v11;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final AbstractC1014h o() {
        return this.encryptedKeyset_;
    }
}
