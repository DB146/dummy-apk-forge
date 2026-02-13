package okhttp3;

import Z9.x;
import ac.n;
import java.io.IOException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Protocol {

    /* renamed from: b, reason: collision with root package name */
    public static final Companion f22414b;

    /* renamed from: c, reason: collision with root package name */
    public static final Protocol f22415c;

    /* renamed from: d, reason: collision with root package name */
    public static final Protocol f22416d;

    /* renamed from: e, reason: collision with root package name */
    public static final Protocol f22417e;

    /* renamed from: f, reason: collision with root package name */
    public static final Protocol f22418f;

    /* renamed from: u, reason: collision with root package name */
    public static final Protocol f22419u;

    /* renamed from: v, reason: collision with root package name */
    public static final Protocol f22420v;

    /* renamed from: w, reason: collision with root package name */
    public static final Protocol f22421w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ Protocol[] f22422x;

    /* renamed from: a, reason: collision with root package name */
    public final String f22423a;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static Protocol a(String str) {
            Protocol protocol = Protocol.f22415c;
            if (!str.equals("http/1.0")) {
                protocol = Protocol.f22416d;
                if (!str.equals("http/1.1")) {
                    protocol = Protocol.f22419u;
                    if (!str.equals("h2_prior_knowledge")) {
                        protocol = Protocol.f22418f;
                        if (!str.equals("h2")) {
                            protocol = Protocol.f22417e;
                            if (!str.equals("spdy/3.1")) {
                                protocol = Protocol.f22420v;
                                if (!str.equals("quic")) {
                                    protocol = Protocol.f22421w;
                                    if (!n.Y(str, "h3", false)) {
                                        throw new IOException("Unexpected protocol: ".concat(str));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    static {
        Protocol protocol = new Protocol("HTTP_1_0", 0, "http/1.0");
        f22415c = protocol;
        Protocol protocol2 = new Protocol("HTTP_1_1", 1, "http/1.1");
        f22416d = protocol2;
        Protocol protocol3 = new Protocol("SPDY_3", 2, "spdy/3.1");
        f22417e = protocol3;
        Protocol protocol4 = new Protocol("HTTP_2", 3, "h2");
        f22418f = protocol4;
        Protocol protocol5 = new Protocol("H2_PRIOR_KNOWLEDGE", 4, "h2_prior_knowledge");
        f22419u = protocol5;
        Protocol protocol6 = new Protocol("QUIC", 5, "quic");
        f22420v = protocol6;
        Protocol protocol7 = new Protocol("HTTP_3", 6, "h3");
        f22421w = protocol7;
        Protocol[] protocolArr = {protocol, protocol2, protocol3, protocol4, protocol5, protocol6, protocol7};
        f22422x = protocolArr;
        x.k(protocolArr);
        f22414b = new Companion(0);
    }

    public Protocol(String str, int i7, String str2) {
        this.f22423a = str2;
    }

    public static Protocol valueOf(String str) {
        return (Protocol) Enum.valueOf(Protocol.class, str);
    }

    public static Protocol[] values() {
        return (Protocol[]) f22422x.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22423a;
    }
}
