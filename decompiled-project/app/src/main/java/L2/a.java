package L2;

import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements T2.a {

    /* renamed from: a, reason: collision with root package name */
    public final U2.a f6264a;

    public a(U2.a db2) {
        l.e(db2, "db");
        this.f6264a = db2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f6264a.close();
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [L2.g, L2.e] */
    @Override // T2.a
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final g R(String sql) {
        String str;
        int i7;
        l.e(sql, "sql");
        U2.a db2 = this.f6264a;
        l.e(db2, "db");
        String upperCase = ac.g.v0(sql).toString().toUpperCase(Locale.ROOT);
        l.d(upperCase, "toUpperCase(...)");
        int length = upperCase.length() - 2;
        int i10 = -1;
        if (length >= 0) {
            int i11 = 0;
            loop0: while (i11 < length) {
                char charAt = upperCase.charAt(i11);
                if (l.f(charAt, 32) > 0) {
                    if (charAt != '-') {
                        if (charAt == '/') {
                            int i12 = i11 + 1;
                            if (upperCase.charAt(i12) != '*') {
                            }
                            do {
                                i12 = ac.g.e0(upperCase, '*', i12 + 1, 4);
                                if (i12 >= 0) {
                                    i7 = i12 + 1;
                                    if (i7 >= length) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } while (upperCase.charAt(i7) != '/');
                            i11 = i12 + 2;
                        }
                        i10 = i11;
                        break;
                    }
                    if (upperCase.charAt(i11 + 1) == '-') {
                        i11 = ac.g.e0(upperCase, '\n', i11 + 2, 4);
                        if (i11 < 0) {
                            break;
                        }
                    } else {
                        i10 = i11;
                        break;
                    }
                }
                i11++;
            }
        }
        if (i10 < 0 || i10 > upperCase.length()) {
            str = null;
        } else {
            str = upperCase.substring(i10, Math.min(i10 + 3, upperCase.length()));
            l.d(str, "substring(...)");
        }
        if (str == null) {
            return new f(db2, sql);
        }
        int hashCode = str.hashCode();
        if (hashCode == 79487 ? !str.equals("PRA") : hashCode == 81978 ? !str.equals("SEL") : !(hashCode == 85954 && str.equals("WIT"))) {
            return new f(db2, sql);
        }
        ?? gVar = new g(db2, sql);
        gVar.f6272d = new int[0];
        gVar.f6273e = new long[0];
        gVar.f6274f = new double[0];
        gVar.f6275u = new String[0];
        gVar.f6276v = new byte[0];
        return gVar;
    }
}
