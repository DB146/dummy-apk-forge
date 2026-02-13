package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* renamed from: W6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0593b extends AbstractC1028w {
    private static final C0593b DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1014h keyValue_ = AbstractC1014h.f15775b;
    private C0596e params_;
    private int version_;

    static {
        C0593b c0593b = new C0593b();
        DEFAULT_INSTANCE = c0593b;
        AbstractC1028w.l(C0593b.class, c0593b);
    }

    public static void m(C0593b c0593b) {
        c0593b.version_ = 0;
    }

    public static void n(C0593b c0593b, C1013g c1013g) {
        c0593b.getClass();
        c0593b.keyValue_ = c1013g;
    }

    public static void o(C0593b c0593b, C0596e c0596e) {
        c0593b.getClass();
        c0596e.getClass();
        c0593b.params_ = c0596e;
    }

    public static C0592a s() {
        return (C0592a) DEFAULT_INSTANCE.e();
    }

    public static C0593b t(AbstractC1014h abstractC1014h, C1021o c1021o) {
        return (C0593b) AbstractC1028w.j(DEFAULT_INSTANCE, abstractC1014h, c1021o);
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new C0593b();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (C0593b.class) {
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

    public final AbstractC1014h p() {
        return this.keyValue_;
    }

    public final C0596e q() {
        C0596e c0596e = this.params_;
        return c0596e == null ? C0596e.m() : c0596e;
    }

    public final int r() {
        return this.version_;
    }
}
