package eb;

import Q5.e;
import Y5.C0658x;
import h3.o;
import java.util.BitSet;
import java.util.Locale;
import java.util.logging.Level;

/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1114a {

    /* renamed from: b, reason: collision with root package name */
    public static final BitSet f16848b;

    /* renamed from: a, reason: collision with root package name */
    public final String f16849a;

    static {
        BitSet bitSet = new BitSet(127);
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        for (char c10 = '0'; c10 <= '9'; c10 = (char) (c10 + 1)) {
            bitSet.set(c10);
        }
        for (char c11 = 'a'; c11 <= 'z'; c11 = (char) (c11 + 1)) {
            bitSet.set(c11);
        }
        f16848b = bitSet;
    }

    public C1114a(String str, C0658x c0658x) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        e.m(lowerCase, "name");
        if (lowerCase.isEmpty()) {
            throw new IllegalArgumentException("token must have at least 1 tchar");
        }
        if (lowerCase.equals("connection")) {
            AbstractC1115b.f16850a.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
        }
        for (int i7 = 0; i7 < lowerCase.length(); i7++) {
            char charAt = lowerCase.charAt(i7);
            if (!f16848b.get(charAt)) {
                throw new IllegalArgumentException(Tb.a.w("Invalid character '%s' in key name '%s'", Character.valueOf(charAt), lowerCase));
            }
        }
        this.f16849a = lowerCase;
        lowerCase.getBytes(M6.e.f6797a);
        if (str.endsWith("-bin")) {
            throw new IllegalArgumentException(Tb.a.w("ASCII header is named %s.  Only binary headers may end with %s", str, "-bin"));
        }
        e.m(c0658x, "marshaller");
    }

    public static void a(String str, C0658x c0658x) {
        new C1114a(str, c0658x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1114a.class != obj.getClass()) {
            return false;
        }
        return this.f16849a.equals(((C1114a) obj).f16849a);
    }

    public final int hashCode() {
        return this.f16849a.hashCode();
    }

    public final String toString() {
        return o.p(new StringBuilder("Key{name='"), this.f16849a, "'}");
    }
}
