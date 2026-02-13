package P1;

import H2.C0305t;
import androidx.datastore.preferences.protobuf.AbstractC0815s;
import androidx.datastore.preferences.protobuf.AbstractC0817u;
import androidx.datastore.preferences.protobuf.C0806i;
import androidx.datastore.preferences.protobuf.C0810m;
import androidx.datastore.preferences.protobuf.C0821y;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.W;
import androidx.datastore.preferences.protobuf.c0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends AbstractC0817u {
    private static final c DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private H preferences_ = H.f13330b;

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        AbstractC0817u.l(c.class, cVar);
    }

    public static H n(c cVar) {
        H h10 = cVar.preferences_;
        if (!h10.f13331a) {
            cVar.preferences_ = h10.b();
        }
        return cVar.preferences_;
    }

    public static a p() {
        return (a) ((AbstractC0815s) DEFAULT_INSTANCE.e(5));
    }

    public static c q(InputStream inputStream) {
        c cVar = DEFAULT_INSTANCE;
        C0806i c0806i = new C0806i(inputStream);
        C0810m a9 = C0810m.a();
        AbstractC0817u k = cVar.k();
        try {
            T t5 = T.f13352c;
            t5.getClass();
            W a10 = t5.a(k.getClass());
            C0305t c0305t = (C0305t) c0806i.f13418b;
            if (c0305t == null) {
                c0305t = new C0305t(c0806i);
            }
            a10.h(k, c0305t, a9);
            a10.a(k);
            if (AbstractC0817u.h(k, true)) {
                return (c) k;
            }
            throw new IOException(new c0().getMessage());
        } catch (c0 e2) {
            throw new IOException(e2.getMessage());
        } catch (C0821y e10) {
            if (e10.f13469a) {
                throw new IOException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (IOException e11) {
            if (e11.getCause() instanceof C0821y) {
                throw ((C0821y) e11.getCause());
            }
            throw new IOException(e11.getMessage(), e11);
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof C0821y) {
                throw ((C0821y) e12.getCause());
            }
            throw e12;
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f7759a});
            case 3:
                return new c();
            case 4:
                return new AbstractC0815s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q10 = PARSER;
                Q q11 = q10;
                if (q10 == null) {
                    synchronized (c.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
