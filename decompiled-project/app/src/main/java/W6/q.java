package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class q extends AbstractC1028w {
    private static final q DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile V PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private AbstractC1014h value_ = AbstractC1014h.f15775b;

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        AbstractC1028w.l(q.class, qVar);
    }

    public static void m(q qVar, String str) {
        qVar.getClass();
        str.getClass();
        qVar.typeUrl_ = str;
    }

    public static void n(q qVar, C1013g c1013g) {
        qVar.getClass();
        qVar.value_ = c1013g;
    }

    public static void o(q qVar, p pVar) {
        qVar.getClass();
        if (pVar != p.UNRECOGNIZED) {
            qVar.keyMaterialType_ = pVar.f10839a;
        } else {
            pVar.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static q p() {
        return DEFAULT_INSTANCE;
    }

    public static o t() {
        return (o) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new q();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (q.class) {
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

    public final p q() {
        int i7 = this.keyMaterialType_;
        p pVar = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? null : p.REMOTE : p.ASYMMETRIC_PUBLIC : p.ASYMMETRIC_PRIVATE : p.SYMMETRIC : p.UNKNOWN_KEYMATERIAL;
        return pVar == null ? p.UNRECOGNIZED : pVar;
    }

    public final String r() {
        return this.typeUrl_;
    }

    public final AbstractC1014h s() {
        return this.value_;
    }
}
