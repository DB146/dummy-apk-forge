package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class x extends AbstractC1028w {
    private static final x DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile V PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private q keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    /* JADX WARN: Type inference failed for: r0v0, types: [W6.x, com.google.crypto.tink.shaded.protobuf.w] */
    static {
        ?? abstractC1028w = new AbstractC1028w();
        DEFAULT_INSTANCE = abstractC1028w;
        AbstractC1028w.l(x.class, abstractC1028w);
    }

    public static void m(x xVar, q qVar) {
        xVar.getClass();
        xVar.keyData_ = qVar;
    }

    public static void n(x xVar, D d10) {
        xVar.getClass();
        xVar.outputPrefixType_ = d10.b();
    }

    public static void o(x xVar) {
        r rVar = r.ENABLED;
        xVar.getClass();
        xVar.status_ = rVar.a();
    }

    public static void p(x xVar, int i7) {
        xVar.keyId_ = i7;
    }

    public static w v() {
        return (w) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
                    synchronized (x.class) {
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

    public final q q() {
        q qVar = this.keyData_;
        return qVar == null ? q.p() : qVar;
    }

    public final int r() {
        return this.keyId_;
    }

    public final D s() {
        D a9 = D.a(this.outputPrefixType_);
        return a9 == null ? D.UNRECOGNIZED : a9;
    }

    public final r t() {
        int i7 = this.status_;
        r rVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? null : r.DESTROYED : r.DISABLED : r.ENABLED : r.UNKNOWN_STATUS;
        return rVar == null ? r.UNRECOGNIZED : rVar;
    }

    public final boolean u() {
        return this.keyData_ != null;
    }
}
