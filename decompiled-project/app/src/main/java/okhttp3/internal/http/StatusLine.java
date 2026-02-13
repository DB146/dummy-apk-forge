package okhttp3.internal.http;

import ac.n;
import java.net.ProtocolException;
import kotlin.jvm.internal.l;
import okhttp3.Protocol;

/* loaded from: classes2.dex */
public final class StatusLine {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f22693d = new Companion(0);

    /* renamed from: a, reason: collision with root package name */
    public final Protocol f22694a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22696c;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }

        public static StatusLine a(String statusLine) {
            Protocol protocol;
            int i7;
            String str;
            l.e(statusLine, "statusLine");
            if (n.Y(statusLine, "HTTP/1.", false)) {
                i7 = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = Protocol.f22415c;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                    protocol = Protocol.f22416d;
                }
            } else if (n.Y(statusLine, "ICY ", false)) {
                protocol = Protocol.f22415c;
                i7 = 4;
            } else {
                if (!n.Y(statusLine, "SOURCETABLE ", false)) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                protocol = Protocol.f22416d;
                i7 = 12;
            }
            int i10 = i7 + 3;
            if (statusLine.length() < i10) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            String substring = statusLine.substring(i7, i10);
            l.d(substring, "substring(...)");
            Integer Z7 = n.Z(substring);
            if (Z7 == null) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int intValue = Z7.intValue();
            if (statusLine.length() <= i10) {
                str = "";
            } else {
                if (statusLine.charAt(i10) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                str = statusLine.substring(i7 + 4);
                l.d(str, "substring(...)");
            }
            return new StatusLine(protocol, intValue, str);
        }
    }

    public StatusLine(Protocol protocol, int i7, String message) {
        l.e(protocol, "protocol");
        l.e(message, "message");
        this.f22694a = protocol;
        this.f22695b = i7;
        this.f22696c = message;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f22694a == Protocol.f22415c) {
            sb2.append("HTTP/1.0");
        } else {
            sb2.append("HTTP/1.1");
        }
        sb2.append(' ');
        sb2.append(this.f22695b);
        sb2.append(' ');
        sb2.append(this.f22696c);
        return sb2.toString();
    }
}
