package okhttp3.internal.publicsuffix;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.l;
import rc.AbstractC1958b;
import rc.C;
import rc.C1967k;
import rc.H;
import tc.b;

/* loaded from: classes2.dex */
public abstract class BasePublicSuffixList implements PublicSuffixList {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22925b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final CountDownLatch f22926c = new CountDownLatch(1);

    /* renamed from: d, reason: collision with root package name */
    public C1967k f22927d;

    /* renamed from: e, reason: collision with root package name */
    public C1967k f22928e;

    public final C1967k a() {
        C1967k c1967k = this.f22927d;
        if (c1967k != null) {
            return c1967k;
        }
        l.j("bytes");
        throw null;
    }

    public abstract H b();

    public final void c() {
        try {
            C c10 = AbstractC1958b.c(b());
            try {
                C1967k K10 = c10.K(c10.P());
                C1967k K11 = c10.K(c10.P());
                b.o(c10, null);
                synchronized (this) {
                    l.b(K10);
                    this.f22927d = K10;
                    l.b(K11);
                    this.f22928e = K11;
                }
            } finally {
            }
        } finally {
            this.f22926c.countDown();
        }
    }
}
