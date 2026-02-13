package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class B extends AbstractC1028w {
    private static final B DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile V PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        B b2 = new B();
        DEFAULT_INSTANCE = b2;
        AbstractC1028w.l(B.class, b2);
    }

    public static void m(B b2, String str) {
        b2.getClass();
        str.getClass();
        b2.typeUrl_ = str;
    }

    public static void n(B b2, D d10) {
        b2.getClass();
        b2.outputPrefixType_ = d10.b();
    }

    public static void o(B b2, r rVar) {
        b2.getClass();
        b2.status_ = rVar.a();
    }

    public static void p(B b2, int i7) {
        b2.keyId_ = i7;
    }

    public static A r() {
        return (A) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new B();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (B.class) {
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

    public final int q() {
        return this.keyId_;
    }
}
