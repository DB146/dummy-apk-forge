package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* renamed from: W6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0596e extends AbstractC1028w {
    private static final C0596e DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    /* JADX WARN: Type inference failed for: r0v0, types: [W6.e, com.google.crypto.tink.shaded.protobuf.w] */
    static {
        ?? abstractC1028w = new AbstractC1028w();
        DEFAULT_INSTANCE = abstractC1028w;
        AbstractC1028w.l(C0596e.class, abstractC1028w);
    }

    public static C0596e m() {
        return DEFAULT_INSTANCE;
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
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
                    synchronized (C0596e.class) {
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

    public final int n() {
        return this.tagSize_;
    }
}
