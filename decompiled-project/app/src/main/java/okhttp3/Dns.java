package okhttp3;

import Eb.n;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public interface Dns {

    /* renamed from: a, reason: collision with root package name */
    public static final Dns f22318a;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f22319a = 0;

        /* loaded from: classes2.dex */
        public static final class DnsSystem implements Dns {
            @Override // okhttp3.Dns
            public final List a(String hostname) {
                l.e(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    l.d(allByName, "getAllByName(...)");
                    return n.e0(allByName);
                } catch (NullPointerException e2) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
                    unknownHostException.initCause(e2);
                    throw unknownHostException;
                }
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i7 = Companion.f22319a;
        f22318a = new Companion.DnsSystem();
    }

    List a(String str);
}
