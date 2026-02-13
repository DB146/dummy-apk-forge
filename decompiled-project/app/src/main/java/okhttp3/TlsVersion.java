package okhttp3;

import Z9.x;
import kotlin.jvm.internal.l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TlsVersion {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f22473b;

    /* renamed from: c, reason: collision with root package name */
    public static final TlsVersion f22474c;

    /* renamed from: d, reason: collision with root package name */
    public static final TlsVersion f22475d;

    /* renamed from: e, reason: collision with root package name */
    public static final TlsVersion f22476e;

    /* renamed from: f, reason: collision with root package name */
    public static final TlsVersion f22477f;

    /* renamed from: u, reason: collision with root package name */
    public static final TlsVersion f22478u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ TlsVersion[] f22479v;

    /* renamed from: a, reason: collision with root package name */
    public final String f22480a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static TlsVersion a(String javaName) {
            l.e(javaName, "javaName");
            int hashCode = javaName.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (javaName.equals("TLSv1.1")) {
                                return TlsVersion.f22476e;
                            }
                            break;
                        case -503070502:
                            if (javaName.equals("TLSv1.2")) {
                                return TlsVersion.f22475d;
                            }
                            break;
                        case -503070501:
                            if (javaName.equals("TLSv1.3")) {
                                return TlsVersion.f22474c;
                            }
                            break;
                    }
                } else if (javaName.equals("TLSv1")) {
                    return TlsVersion.f22477f;
                }
            } else if (javaName.equals("SSLv3")) {
                return TlsVersion.f22478u;
            }
            throw new IllegalArgumentException("Unexpected TLS version: ".concat(javaName));
        }
    }

    static {
        TlsVersion tlsVersion = new TlsVersion("TLS_1_3", 0, "TLSv1.3");
        f22474c = tlsVersion;
        TlsVersion tlsVersion2 = new TlsVersion("TLS_1_2", 1, "TLSv1.2");
        f22475d = tlsVersion2;
        TlsVersion tlsVersion3 = new TlsVersion("TLS_1_1", 2, "TLSv1.1");
        f22476e = tlsVersion3;
        TlsVersion tlsVersion4 = new TlsVersion("TLS_1_0", 3, "TLSv1");
        f22477f = tlsVersion4;
        TlsVersion tlsVersion5 = new TlsVersion("SSL_3_0", 4, "SSLv3");
        f22478u = tlsVersion5;
        TlsVersion[] tlsVersionArr = {tlsVersion, tlsVersion2, tlsVersion3, tlsVersion4, tlsVersion5};
        f22479v = tlsVersionArr;
        x.k(tlsVersionArr);
        f22473b = new Companion(0);
    }

    public TlsVersion(String str, int i7, String str2) {
        this.f22480a = str2;
    }

    public static TlsVersion valueOf(String str) {
        return (TlsVersion) Enum.valueOf(TlsVersion.class, str);
    }

    public static TlsVersion[] values() {
        return (TlsVersion[]) f22479v.clone();
    }
}
