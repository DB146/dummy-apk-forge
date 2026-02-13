package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1008b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.InterfaceC1031z;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class C extends AbstractC1028w {
    private static final C DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC1031z keyInfo_ = Y.f15748d;
    private int primaryKeyId_;

    static {
        C c10 = new C();
        DEFAULT_INSTANCE = c10;
        AbstractC1028w.l(C.class, c10);
    }

    public static void m(C c10, int i7) {
        c10.primaryKeyId_ = i7;
    }

    public static void n(C c10, B b2) {
        c10.getClass();
        InterfaceC1031z interfaceC1031z = c10.keyInfo_;
        if (!((AbstractC1008b) interfaceC1031z).f15755a) {
            int size = interfaceC1031z.size();
            c10.keyInfo_ = interfaceC1031z.j(size == 0 ? 10 : size * 2);
        }
        c10.keyInfo_.add(b2);
    }

    public static z p() {
        return (z) DEFAULT_INSTANCE.e();
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", B.class});
            case 3:
                return new C();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (C.class) {
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

    public final B o() {
        return (B) this.keyInfo_.get(0);
    }
}
