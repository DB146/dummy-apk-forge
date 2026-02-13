package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* renamed from: W6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595d extends AbstractC1028w {
    private static final C0595d DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile V PARSER;
    private int keySize_;
    private C0596e params_;

    /* JADX WARN: Type inference failed for: r0v0, types: [W6.d, com.google.crypto.tink.shaded.protobuf.w] */
    static {
        ?? abstractC1028w = new AbstractC1028w();
        DEFAULT_INSTANCE = abstractC1028w;
        AbstractC1028w.l(C0595d.class, abstractC1028w);
    }

    public static C0595d o(AbstractC1014h abstractC1014h, C1021o c1021o) {
        return (C0595d) AbstractC1028w.j(DEFAULT_INSTANCE, abstractC1014h, c1021o);
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
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
                    synchronized (C0595d.class) {
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

    public final int m() {
        return this.keySize_;
    }

    public final C0596e n() {
        C0596e c0596e = this.params_;
        return c0596e == null ? C0596e.m() : c0596e;
    }
}
