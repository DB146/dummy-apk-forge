package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1008b;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.InterfaceC1031z;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Y;
import com.google.crypto.tink.shaded.protobuf.Z;
import java.util.List;

/* loaded from: classes.dex */
public final class y extends AbstractC1028w {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private InterfaceC1031z key_ = Y.f15748d;
    private int primaryKeyId_;

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        AbstractC1028w.l(y.class, yVar);
    }

    public static void m(y yVar, int i7) {
        yVar.primaryKeyId_ = i7;
    }

    public static void n(y yVar, x xVar) {
        yVar.getClass();
        InterfaceC1031z interfaceC1031z = yVar.key_;
        if (!((AbstractC1008b) interfaceC1031z).f15755a) {
            int size = interfaceC1031z.size();
            yVar.key_ = interfaceC1031z.j(size == 0 ? 10 : size * 2);
        }
        yVar.key_.add(xVar);
    }

    public static v s() {
        return (v) DEFAULT_INSTANCE.e();
    }

    public static y t(byte[] bArr, C1021o c1021o) {
        return (y) AbstractC1028w.k(DEFAULT_INSTANCE, bArr, c1021o);
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", x.class});
            case 3:
                return new y();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (y.class) {
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

    public final x o(int i7) {
        return (x) this.key_.get(i7);
    }

    public final int p() {
        return this.key_.size();
    }

    public final List q() {
        return this.key_;
    }

    public final int r() {
        return this.primaryKeyId_;
    }
}
