package okhttp3.internal.ws;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class WebSocketExtensions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22944a = false;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f22945b = null;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22946c = false;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f22947d = null;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22948e = false;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22949f = false;

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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.f22944a == webSocketExtensions.f22944a && l.a(this.f22945b, webSocketExtensions.f22945b) && this.f22946c == webSocketExtensions.f22946c && l.a(this.f22947d, webSocketExtensions.f22947d) && this.f22948e == webSocketExtensions.f22948e && this.f22949f == webSocketExtensions.f22949f;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f22944a) * 31;
        Integer num = this.f22945b;
        int g = o.g(this.f22946c, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        Integer num2 = this.f22947d;
        return Boolean.hashCode(this.f22949f) + o.g(this.f22948e, (g + (num2 != null ? num2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f22944a + ", clientMaxWindowBits=" + this.f22945b + ", clientNoContextTakeover=" + this.f22946c + ", serverMaxWindowBits=" + this.f22947d + ", serverNoContextTakeover=" + this.f22948e + ", unknownValues=" + this.f22949f + ')';
    }
}
