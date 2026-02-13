package okhttp3.internal.http1;

import kotlin.jvm.internal.l;
import rc.C;

/* loaded from: classes2.dex */
public final class HeadersReader {

    /* renamed from: a, reason: collision with root package name */
    public final C f22697a;

    /* renamed from: b, reason: collision with root package name */
    public long f22698b;

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

    public HeadersReader(C source) {
        l.e(source, "source");
        this.f22697a = source;
        this.f22698b = 262144L;
    }
}
