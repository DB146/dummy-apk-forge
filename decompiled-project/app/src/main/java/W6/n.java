package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class n extends AbstractC1028w {
    private static final n DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile V PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [W6.n, com.google.crypto.tink.shaded.protobuf.w] */
    static {
        ?? abstractC1028w = new AbstractC1028w();
        DEFAULT_INSTANCE = abstractC1028w;
        AbstractC1028w.l(n.class, abstractC1028w);
    }

    public static void m(n nVar) {
        nVar.getClass();
        nVar.hash_ = 3;
    }

    public static void n(n nVar) {
        nVar.tagSize_ = 16;
    }

    public static n o() {
        return DEFAULT_INSTANCE;
    }

    public static m r() {
        return (m) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
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
                    synchronized (n.class) {
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

    public final h p() {
        int i7 = this.hash_;
        h hVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : h.SHA512 : h.SHA256 : h.SHA384 : h.SHA1 : h.UNKNOWN_HASH;
        return hVar == null ? h.UNRECOGNIZED : hVar;
    }

    public final int q() {
        return this.tagSize_;
    }
}
