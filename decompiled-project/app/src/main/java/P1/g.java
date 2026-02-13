package P1;

import androidx.datastore.preferences.protobuf.AbstractC0815s;
import androidx.datastore.preferences.protobuf.AbstractC0817u;
import androidx.datastore.preferences.protobuf.C0804g;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.V;

/* loaded from: classes.dex */
public final class g extends AbstractC0817u {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final g DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile Q PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC0817u.l(g.class, gVar);
    }

    public static f F() {
        return (f) ((AbstractC0815s) DEFAULT_INSTANCE.e(5));
    }

    public static void n(g gVar, long j) {
        gVar.valueCase_ = 4;
        gVar.value_ = Long.valueOf(j);
    }

    public static void o(g gVar, String str) {
        gVar.getClass();
        str.getClass();
        gVar.valueCase_ = 5;
        gVar.value_ = str;
    }

    public static void p(g gVar, e eVar) {
        gVar.getClass();
        gVar.value_ = eVar;
        gVar.valueCase_ = 6;
    }

    public static void q(g gVar, double d10) {
        gVar.valueCase_ = 7;
        gVar.value_ = Double.valueOf(d10);
    }

    public static void r(g gVar, C0804g c0804g) {
        gVar.getClass();
        gVar.valueCase_ = 8;
        gVar.value_ = c0804g;
    }

    public static void s(g gVar, boolean z8) {
        gVar.valueCase_ = 1;
        gVar.value_ = Boolean.valueOf(z8);
    }

    public static void t(g gVar, float f4) {
        gVar.valueCase_ = 2;
        gVar.value_ = Float.valueOf(f4);
    }

    public static void u(g gVar, int i7) {
        gVar.valueCase_ = 3;
        gVar.value_ = Integer.valueOf(i7);
    }

    public static g x() {
        return DEFAULT_INSTANCE;
    }

    public final int A() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final long B() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String C() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final e D() {
        return this.valueCase_ == 6 ? (e) this.value_ : e.o();
    }

    public final int E() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [androidx.datastore.preferences.protobuf.Q, java.lang.Object] */
    @Override // androidx.datastore.preferences.protobuf.AbstractC0817u
    public final Object e(int i7) {
        switch (P.c.b(i7)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new V(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", e.class});
            case 3:
                return new g();
            case 4:
                return new AbstractC0815s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q10 = PARSER;
                Q q11 = q10;
                if (q10 == null) {
                    synchronized (g.class) {
                        try {
                            Q q12 = PARSER;
                            Q q13 = q12;
                            if (q12 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                q13 = obj;
                            }
                        } finally {
                        }
                    }
                }
                return q11;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final boolean v() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C0804g w() {
        return this.valueCase_ == 8 ? (C0804g) this.value_ : C0804g.f13396c;
    }

    public final double y() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float z() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }
}
