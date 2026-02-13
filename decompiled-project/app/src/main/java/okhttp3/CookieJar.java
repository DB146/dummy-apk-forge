package okhttp3;

import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public interface CookieJar {

    /* renamed from: a, reason: collision with root package name */
    public static final CookieJar f22309a;

    /* loaded from: classes2.dex */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f22310a = 0;

        /* loaded from: classes2.dex */
        public static final class NoCookies implements CookieJar {
            @Override // okhttp3.CookieJar
            public final void a(HttpUrl url) {
                l.e(url, "url");
            }

            @Override // okhttp3.CookieJar
            public final void b(HttpUrl url, List list) {
                l.e(url, "url");
            }
        }

        static {
            new Companion();
        }

        private Companion() {
        }
    }

    static {
        int i7 = Companion.f22310a;
        f22309a = new Companion.NoCookies();
    }

    void a(HttpUrl httpUrl);

    void b(HttpUrl httpUrl, List list);
}
