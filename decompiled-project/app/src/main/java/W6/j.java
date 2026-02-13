package W6;

import com.google.crypto.tink.shaded.protobuf.AbstractC1014h;
import com.google.crypto.tink.shaded.protobuf.AbstractC1026u;
import com.google.crypto.tink.shaded.protobuf.AbstractC1028w;
import com.google.crypto.tink.shaded.protobuf.C1013g;
import com.google.crypto.tink.shaded.protobuf.C1021o;
import com.google.crypto.tink.shaded.protobuf.V;
import com.google.crypto.tink.shaded.protobuf.Z;

/* loaded from: classes.dex */
public final class j extends AbstractC1028w {
    private static final j DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile V PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private AbstractC1014h keyValue_ = AbstractC1014h.f15775b;
    private n params_;
    private int version_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        AbstractC1028w.l(j.class, jVar);
    }

    public static void m(j jVar) {
        jVar.version_ = 0;
    }

    public static void n(j jVar, n nVar) {
        jVar.getClass();
        nVar.getClass();
        jVar.params_ = nVar;
    }

    public static void o(j jVar, C1013g c1013g) {
        jVar.getClass();
        jVar.keyValue_ = c1013g;
    }

    public static i s() {
        return (i) DEFAULT_INSTANCE.e();
    }

    public static j t(AbstractC1014h abstractC1014h, C1021o c1021o) {
        return (j) AbstractC1028w.j(DEFAULT_INSTANCE, abstractC1014h, c1021o);
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
                return new Z(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new j();
            case 4:
                return new AbstractC1026u(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v10 = PARSER;
                V v11 = v10;
                if (v10 == null) {
                    synchronized (j.class) {
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

    public final n q() {
        n nVar = this.params_;
        return nVar == null ? n.o() : nVar;
    }

    public final int r() {
        return this.version_;
    }
}
