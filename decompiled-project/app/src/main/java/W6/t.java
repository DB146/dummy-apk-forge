package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class t extends AbstractC1028w {
    private static final t DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile V PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private AbstractC1014h value_ = AbstractC1014h.f15775b;

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        AbstractC1028w.l(t.class, tVar);
    }

    public static void m(t tVar) {
        tVar.getClass();
        tVar.typeUrl_ = "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public static void n(t tVar, C1013g c1013g) {
        tVar.getClass();
        tVar.value_ = c1013g;
    }

    public static void o(t tVar, D d10) {
        tVar.getClass();
        tVar.outputPrefixType_ = d10.b();
    }

    public static s s() {
        return (s) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new t();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (t.class) {
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

    public final D p() {
        D a9 = D.a(this.outputPrefixType_);
        return a9 == null ? D.UNRECOGNIZED : a9;
    }

    public final String q() {
        return this.typeUrl_;
    }

    public final AbstractC1014h r() {
        return this.value_;
    }
}
