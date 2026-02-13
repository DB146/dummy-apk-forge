package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class l extends AbstractC1028w {
    private static final l DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private n params_;
    private int version_;

    /* JADX WARN: Type inference failed for: r0v0, types: [W6.l, com.google.crypto.tink.shaded.protobuf.w] */
    static {
        ?? abstractC1028w = new AbstractC1028w();
        DEFAULT_INSTANCE = abstractC1028w;
        AbstractC1028w.l(l.class, abstractC1028w);
    }

    public static void m(l lVar, n nVar) {
        lVar.getClass();
        lVar.params_ = nVar;
    }

    public static void n(l lVar) {
        lVar.keySize_ = 32;
    }

    public static k q() {
        return (k) DEFAULT_INSTANCE.e();
    }

    public static l r(AbstractC1014h abstractC1014h, C1021o c1021o) {
        return (l) AbstractC1028w.j(DEFAULT_INSTANCE, abstractC1014h, c1021o);
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new AbstractC1028w();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (l.class) {
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

    public final int o() {
        return this.keySize_;
    }

    public final n p() {
        n nVar = this.params_;
        return nVar == null ? n.o() : nVar;
    }
}
