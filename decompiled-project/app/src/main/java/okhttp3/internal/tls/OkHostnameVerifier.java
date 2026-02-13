package okhttp3.internal.tls;

import A3.c;
import Eb.v;
import ac.e;
import ac.g;
import ac.n;
import h3.o;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.l;
import okhttp3.internal._HostnamesCommonKt;

/* loaded from: classes2.dex */
public final class OkHostnameVerifier implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final OkHostnameVerifier f22941a = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    public static List a(X509Certificate x509Certificate, int i7) {
        Object obj;
        v vVar = v.f3891a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return vVar;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && l.a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return vVar;
        }
    }

    public static boolean b(String str) {
        int i7;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(c.f(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder r10 = o.r(length2, "endIndex > string.length: ", " > ");
            r10.append(str.length());
            throw new IllegalArgumentException(r10.toString().toString());
        }
        long j = 0;
        int i10 = 0;
        while (i10 < length2) {
            char charAt = str.charAt(i10);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i7 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i7 = 3;
                } else {
                    int i11 = i10 + 1;
                    char charAt2 = i11 < length2 ? str.charAt(i11) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i10 = i11;
                    } else {
                        j += 4;
                        i10 += 2;
                    }
                }
                j += i7;
            }
            i10++;
        }
        return length == ((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[LOOP:1: B:23:0x0065->B:54:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String host, X509Certificate x509Certificate) {
        boolean z8;
        int length;
        l.e(host, "host");
        e eVar = _HostnamesCommonKt.f22494a;
        if (_HostnamesCommonKt.f22494a.d(host)) {
            String b2 = _HostnamesCommonKt.b(host);
            List a9 = a(x509Certificate, 7);
            if (!a9.isEmpty()) {
                Iterator it = a9.iterator();
                while (it.hasNext()) {
                    if (l.a(b2, _HostnamesCommonKt.b((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(host)) {
                Locale US = Locale.US;
                l.d(US, "US");
                host = host.toLowerCase(US);
                l.d(host, "toLowerCase(...)");
            }
            List<String> a10 = a(x509Certificate, 2);
            if (!a10.isEmpty()) {
                for (String str : a10) {
                    f22941a.getClass();
                    if (host.length() != 0 && !n.Y(host, ".", false) && !n.S(host, "..", false) && str != null && str.length() != 0 && !n.Y(str, ".", false) && !n.S(str, "..", false)) {
                        String concat = !n.S(host, ".", false) ? host.concat(".") : host;
                        if (!n.S(str, ".", false)) {
                            str = str.concat(".");
                        }
                        if (b(str)) {
                            Locale US2 = Locale.US;
                            l.d(US2, "US");
                            str = str.toLowerCase(US2);
                            l.d(str, "toLowerCase(...)");
                        }
                        if (!g.b0(str, "*")) {
                            z8 = l.a(concat, str);
                        } else if (n.Y(str, "*.", false) && g.e0(str, '*', 1, 4) == -1 && concat.length() >= str.length() && !"*.".equals(str)) {
                            String substring = str.substring(1);
                            l.d(substring, "substring(...)");
                            if (n.S(concat, substring, false) && ((length = concat.length() - substring.length()) <= 0 || g.j0(concat, '.', length - 1, 4) == -1)) {
                                z8 = true;
                            }
                        }
                        if (!z8) {
                            return true;
                        }
                    }
                    z8 = false;
                    if (!z8) {
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Certificate certificate;
        l.e(host, "host");
        l.e(session, "session");
        if (b(host)) {
            try {
                certificate = session.getPeerCertificates()[0];
                l.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return c(host, (X509Certificate) certificate);
    }
}
