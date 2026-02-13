package okhttp3.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class BasicCertificateChainCleaner extends CertificateChainCleaner {

    /* renamed from: b, reason: collision with root package name */
    public final TrustRootIndex f22938b;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public BasicCertificateChainCleaner(TrustRootIndex trustRootIndex) {
        l.e(trustRootIndex, "trustRootIndex");
        this.f22938b = trustRootIndex;
    }

    public static boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2, int i7) {
        if (!l.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN()) || x509Certificate2.getBasicConstraints() < i7) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // okhttp3.internal.tls.CertificateChainCleaner
    public final List a(String hostname, List chain) {
        l.e(chain, "chain");
        l.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        l.d(removeFirst, "removeFirst(...)");
        arrayList.add(removeFirst);
        boolean z8 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            l.c(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate a9 = this.f22938b.a(x509Certificate);
            if (a9 == null) {
                Iterator it = arrayDeque.iterator();
                l.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    l.c(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2, arrayList.size() - 1)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z8) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(a9)) {
                arrayList.add(a9);
            }
            if (b(a9, a9, arrayList.size() - 2)) {
                return arrayList;
            }
            z8 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BasicCertificateChainCleaner) && l.a(((BasicCertificateChainCleaner) obj).f22938b, this.f22938b);
    }

    public final int hashCode() {
        return this.f22938b.hashCode();
    }
}
