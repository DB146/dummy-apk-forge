package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.l;
import okhttp3.TlsVersion;
import okhttp3.internal._UtilCommonKt;
import y7.u0;

/* loaded from: classes2.dex */
public final class ConnectionSpec {

    /* renamed from: e, reason: collision with root package name */
    public static final List f22286e;

    /* renamed from: f, reason: collision with root package name */
    public static final List f22287f;
    public static final ConnectionSpec g;

    /* renamed from: h, reason: collision with root package name */
    public static final ConnectionSpec f22288h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22289a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22290b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f22291c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f22292d;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public boolean f22293a;

        /* renamed from: b, reason: collision with root package name */
        public String[] f22294b;

        /* renamed from: c, reason: collision with root package name */
        public String[] f22295c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f22296d;

        public Builder(boolean z8) {
            this.f22293a = z8;
        }

        public final ConnectionSpec a() {
            return new ConnectionSpec(this.f22293a, this.f22296d, this.f22294b, this.f22295c);
        }

        public final void b(String... cipherSuites) {
            l.e(cipherSuites, "cipherSuites");
            if (!this.f22293a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
            l.d(copyOf, "copyOf(...)");
            this.f22294b = (String[]) copyOf;
        }

        public final void c(CipherSuite... cipherSuites) {
            l.e(cipherSuites, "cipherSuites");
            if (!this.f22293a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (CipherSuite cipherSuite : cipherSuites) {
                arrayList.add(cipherSuite.f22284a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final void d(String... tlsVersions) {
            l.e(tlsVersions, "tlsVersions");
            if (!this.f22293a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
            l.d(copyOf, "copyOf(...)");
            this.f22295c = (String[]) copyOf;
        }

        public final void e(TlsVersion... tlsVersionArr) {
            if (!this.f22293a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersionArr.length);
            for (TlsVersion tlsVersion : tlsVersionArr) {
                arrayList.add(tlsVersion.f22480a);
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            d((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

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
        CipherSuite cipherSuite = CipherSuite.f22281r;
        CipherSuite cipherSuite2 = CipherSuite.f22282s;
        CipherSuite cipherSuite3 = CipherSuite.f22283t;
        CipherSuite cipherSuite4 = CipherSuite.f22275l;
        CipherSuite cipherSuite5 = CipherSuite.f22277n;
        CipherSuite cipherSuite6 = CipherSuite.f22276m;
        CipherSuite cipherSuite7 = CipherSuite.f22278o;
        CipherSuite cipherSuite8 = CipherSuite.f22280q;
        CipherSuite cipherSuite9 = CipherSuite.f22279p;
        List y10 = u0.y(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9);
        f22286e = y10;
        List y11 = u0.y(cipherSuite, cipherSuite2, cipherSuite3, cipherSuite4, cipherSuite5, cipherSuite6, cipherSuite7, cipherSuite8, cipherSuite9, CipherSuite.j, CipherSuite.k, CipherSuite.f22273h, CipherSuite.f22274i, CipherSuite.f22272f, CipherSuite.g, CipherSuite.f22271e);
        f22287f = y11;
        Builder builder = new Builder(true);
        CipherSuite[] cipherSuiteArr = (CipherSuite[]) y10.toArray(new CipherSuite[0]);
        builder.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length));
        TlsVersion tlsVersion = TlsVersion.f22474c;
        TlsVersion tlsVersion2 = TlsVersion.f22475d;
        builder.e(tlsVersion, tlsVersion2);
        if (!builder.f22293a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder.f22296d = true;
        builder.a();
        Builder builder2 = new Builder(true);
        CipherSuite[] cipherSuiteArr2 = (CipherSuite[]) y11.toArray(new CipherSuite[0]);
        builder2.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length));
        builder2.e(tlsVersion, tlsVersion2);
        if (!builder2.f22293a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder2.f22296d = true;
        g = builder2.a();
        Builder builder3 = new Builder(true);
        CipherSuite[] cipherSuiteArr3 = (CipherSuite[]) y11.toArray(new CipherSuite[0]);
        builder3.c((CipherSuite[]) Arrays.copyOf(cipherSuiteArr3, cipherSuiteArr3.length));
        builder3.e(tlsVersion, tlsVersion2, TlsVersion.f22476e, TlsVersion.f22477f);
        if (!builder3.f22293a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections");
        }
        builder3.f22296d = true;
        builder3.a();
        f22288h = new Builder(false).a();
    }

    public ConnectionSpec(boolean z8, boolean z10, String[] strArr, String[] strArr2) {
        this.f22289a = z8;
        this.f22290b = z10;
        this.f22291c = strArr;
        this.f22292d = strArr2;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [okhttp3.ConnectionSpec$Builder, java.lang.Object] */
    public final void a(SSLSocket sSLSocket, boolean z8) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        l.b(enabledCipherSuites);
        String[] strArr = this.f22291c;
        if (strArr != null) {
            CipherSuite.f22268b.getClass();
            enabledCipherSuites = _UtilCommonKt.h(strArr, enabledCipherSuites, CipherSuite.f22269c);
        }
        String[] strArr2 = this.f22292d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            l.d(enabledProtocols2, "getEnabledProtocols(...)");
            enabledProtocols = _UtilCommonKt.h(enabledProtocols2, strArr2, Gb.a.f4452b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        l.b(supportedCipherSuites);
        CipherSuite.f22268b.getClass();
        CipherSuite$Companion$ORDER_BY_NAME$1 comparator = CipherSuite.f22269c;
        byte[] bArr = _UtilCommonKt.f22495a;
        l.e(comparator, "comparator");
        int length = supportedCipherSuites.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            } else if (comparator.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i7++;
            }
        }
        if (z8 && i7 != -1) {
            String str = supportedCipherSuites[i7];
            l.d(str, "get(...)");
            l.e(enabledCipherSuites, "<this>");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            l.d(copyOf, "copyOf(...)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        ?? obj = new Object();
        obj.f22293a = this.f22289a;
        obj.f22294b = strArr;
        obj.f22295c = strArr2;
        obj.f22296d = this.f22290b;
        obj.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        obj.d((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        ConnectionSpec a9 = obj.a();
        if (a9.c() != null) {
            sSLSocket.setEnabledProtocols(a9.f22292d);
        }
        if (a9.b() != null) {
            sSLSocket.setEnabledCipherSuites(a9.f22291c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.f22291c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(CipherSuite.f22268b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.f22292d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            TlsVersion.f22473b.getClass();
            arrayList.add(TlsVersion.Companion.a(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionSpec)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ConnectionSpec connectionSpec = (ConnectionSpec) obj;
        boolean z8 = connectionSpec.f22289a;
        boolean z10 = this.f22289a;
        if (z10 != z8) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f22291c, connectionSpec.f22291c) && Arrays.equals(this.f22292d, connectionSpec.f22292d) && this.f22290b == connectionSpec.f22290b);
    }

    public final int hashCode() {
        if (!this.f22289a) {
            return 17;
        }
        String[] strArr = this.f22291c;
        int hashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f22292d;
        return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f22290b ? 1 : 0);
    }

    public final String toString() {
        if (!this.f22289a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.f22290b + ')';
    }
}
