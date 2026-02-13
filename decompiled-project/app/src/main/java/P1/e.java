package P1;

import androidx.datastore.preferences.protobuf.A;
import androidx.datastore.preferences.protobuf.AbstractC0799b;
import androidx.datastore.preferences.protobuf.AbstractC0815s;
import androidx.datastore.preferences.protobuf.AbstractC0817u;
import androidx.datastore.preferences.protobuf.AbstractC0819w;
import androidx.datastore.preferences.protobuf.C0804g;
import androidx.datastore.preferences.protobuf.InterfaceC0818v;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.U;
import androidx.datastore.preferences.protobuf.V;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e extends AbstractC0817u {
    private static final e DEFAULT_INSTANCE;
    private static volatile Q PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private InterfaceC0818v strings_ = U.f13355d;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0817u.l(e.class, eVar);
    }

    public static void n(e eVar, Iterable iterable) {
        InterfaceC0818v interfaceC0818v = eVar.strings_;
        if (!((AbstractC0799b) interfaceC0818v).f13378a) {
            U u3 = (U) interfaceC0818v;
            int i7 = u3.f13357c;
            eVar.strings_ = u3.o(i7 == 0 ? 10 : i7 * 2);
        }
        RandomAccess randomAccess = eVar.strings_;
        Charset charset = AbstractC0819w.f13467a;
        iterable.getClass();
        if (iterable instanceof A) {
            List a9 = ((A) iterable).a();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((U) randomAccess).getClass();
            Iterator it = a9.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof C0804g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                C0804g.o(0, bArr, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof S) {
            ((AbstractC0799b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((U) randomAccess).f13357c);
        }
        U u10 = (U) randomAccess;
        int i10 = u10.f13357c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (u10.f13357c - i10) + " is null.";
                for (int i11 = u10.f13357c - 1; i11 >= i10; i11--) {
                    u10.remove(i11);
                }
                throw new NullPointerException(str);
            }
            u10.add(obj);
        }
    }

    public static e o() {
        return DEFAULT_INSTANCE;
    }

    public static d q() {
        return (d) ((AbstractC0815s) DEFAULT_INSTANCE.e(5));
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
                return new V(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new e();
            case 4:
                return new AbstractC0815s(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                Q q10 = PARSER;
                Q q11 = q10;
                if (q10 == null) {
                    synchronized (e.class) {
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

    public final InterfaceC0818v p() {
        return this.strings_;
    }
}
