package okhttp3.internal.connection;

import a.AbstractC0672a;
import java.io.IOException;
import okhttp3.internal.connection.RoutePlanner;

/* loaded from: classes2.dex */
public final class SequentialExchangeFinder implements ExchangeFinder {

    /* renamed from: a, reason: collision with root package name */
    public final RealRoutePlanner f22670a;

    public SequentialExchangeFinder(RealRoutePlanner realRoutePlanner) {
        this.f22670a = realRoutePlanner;
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RealConnection a() {
        RoutePlanner.Plan c10;
        IOException iOException = null;
        while (true) {
            RealRoutePlanner realRoutePlanner = this.f22670a;
            if (!realRoutePlanner.f22650l.a()) {
                try {
                    c10 = realRoutePlanner.c();
                } catch (IOException e2) {
                    if (iOException == null) {
                        iOException = e2;
                    } else {
                        AbstractC0672a.c(iOException, e2);
                    }
                    if (!realRoutePlanner.d(null)) {
                        throw iOException;
                    }
                }
                if (c10.b()) {
                    break;
                }
                RoutePlanner.ConnectResult g = c10.g();
                if (g.f22658b == null && g.f22659c == null) {
                    g = c10.d();
                }
                RoutePlanner.Plan plan = g.f22658b;
                Throwable th = g.f22659c;
                if (th != null) {
                    throw th;
                }
                if (plan == null) {
                    break;
                }
                realRoutePlanner.f22654p.addFirst(plan);
            } else {
                throw new IOException("Canceled");
            }
        }
        return c10.e();
    }

    @Override // okhttp3.internal.connection.ExchangeFinder
    public final RoutePlanner b() {
        return this.f22670a;
    }
}
