package okhttp3;

import A9.N2;
import Db.o;
import Eb.p;
import Eb.v;
import Ga.d;
import android.support.v4.media.session.b;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.l;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes2.dex */
public final class Handshake {

    /* renamed from: e, reason: collision with root package name */
    public static final Companion f22326e = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final TlsVersion f22327a;

    /* renamed from: b, reason: collision with root package name */
    public final CipherSuite f22328b;

    /* renamed from: c, reason: collision with root package name */
    public final List f22329c;

    /* renamed from: d, reason: collision with root package name */
    public final o f22330d;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static Handshake a(SSLSession sSLSession) {
            Object obj;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null");
            }
            if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException("cipherSuite == ".concat(cipherSuite));
            }
            CipherSuite b2 = CipherSuite.f22268b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            }
            if ("NONE".equals(protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            TlsVersion.f22473b.getClass();
            TlsVersion a9 = TlsVersion.Companion.a(protocol);
            try {
                obj = _UtilJvmKt.l(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                obj = v.f3891a;
            }
            return new Handshake(a9, b2, _UtilJvmKt.l(sSLSession.getLocalCertificates()), new N2(obj, 27));
        }
    }

    public Handshake(TlsVersion tlsVersion, CipherSuite cipherSuite, List list, Rb.a aVar) {
        this.f22327a = tlsVersion;
        this.f22328b = cipherSuite;
        this.f22329c = list;
        this.f22330d = b.z(new d(1, aVar));
    }

    public final List a() {
        return (List) this.f22330d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.f22327a == this.f22327a && l.a(handshake.f22328b, this.f22328b) && l.a(handshake.a(), a()) && l.a(handshake.f22329c, this.f22329c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f22329c.hashCode() + ((a().hashCode() + ((this.f22328b.hashCode() + ((this.f22327a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> a9 = a();
        ArrayList arrayList = new ArrayList(p.S(a9, 10));
        for (Certificate certificate : a9) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                l.d(type2, "getType(...)");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f22327a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f22328b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f22329c;
        ArrayList arrayList2 = new ArrayList(p.S(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                l.d(type, "getType(...)");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
