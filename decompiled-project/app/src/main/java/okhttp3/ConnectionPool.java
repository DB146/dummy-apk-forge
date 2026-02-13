package okhttp3;

import Rb.f;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.l;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.ConnectionListener;
import okhttp3.internal.connection.ConnectionListener$Companion$NONE$1;
import okhttp3.internal.connection.ConnectionUser;
import okhttp3.internal.connection.FastFallbackExchangeFinder;
import okhttp3.internal.connection.ForceConnectRoutePlanner;
import okhttp3.internal.connection.RealConnectionPool;
import okhttp3.internal.connection.RealRoutePlanner;
import okhttp3.internal.connection.RouteDatabase;

/* loaded from: classes2.dex */
public final class ConnectionPool {

    /* renamed from: a, reason: collision with root package name */
    public final RealConnectionPool f22285a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ConnectionPool() {
        this(timeUnit, r2, ConnectionListener.f22564b, 0, 0, 0, 0, false, false, null, 8160);
        TimeUnit timeUnit = TimeUnit.MINUTES;
        l.e(timeUnit, "timeUnit");
        TaskRunner taskRunner = TaskRunner.f22521z;
        ConnectionListener.f22563a.getClass();
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [okhttp3.a] */
    public ConnectionPool(TimeUnit timeUnit, TaskRunner taskRunner, ConnectionListener$Companion$NONE$1 connectionListener$Companion$NONE$1, int i7, int i10, int i11, int i12, boolean z8, boolean z10, RouteDatabase routeDatabase, int i13) {
        ConnectionListener$Companion$NONE$1 connectionListener;
        TimeUnit timeUnit2 = (i13 & 4) != 0 ? TimeUnit.MINUTES : timeUnit;
        TaskRunner taskRunner2 = (i13 & 8) != 0 ? TaskRunner.f22521z : taskRunner;
        if ((i13 & 16) != 0) {
            ConnectionListener.f22563a.getClass();
            connectionListener = ConnectionListener.f22564b;
        } else {
            connectionListener = connectionListener$Companion$NONE$1;
        }
        int i14 = (i13 & 32) != 0 ? 10000 : i7;
        int i15 = (i13 & 64) != 0 ? 10000 : i10;
        int i16 = (i13 & 128) != 0 ? 10000 : i11;
        int i17 = (i13 & 256) != 0 ? 10000 : i12;
        int i18 = (i13 & 512) == 0 ? 0 : 10000;
        boolean z11 = (i13 & 1024) != 0 ? true : z8;
        boolean z12 = (i13 & 2048) == 0 ? z10 : true;
        RouteDatabase routeDatabase2 = (i13 & 4096) != 0 ? new RouteDatabase() : routeDatabase;
        l.e(timeUnit2, "timeUnit");
        l.e(taskRunner2, "taskRunner");
        l.e(connectionListener, "connectionListener");
        final TaskRunner taskRunner3 = taskRunner2;
        final int i19 = i14;
        final int i20 = i15;
        final int i21 = i16;
        final int i22 = i17;
        final int i23 = i18;
        final boolean z13 = z11;
        final boolean z14 = z12;
        final RouteDatabase routeDatabase3 = routeDatabase2;
        this.f22285a = new RealConnectionPool(taskRunner3, 5, 5L, timeUnit2, connectionListener, new f() { // from class: okhttp3.a
            @Override // Rb.f
            public final Object a(Object obj, Object obj2, Object obj3) {
                RealConnectionPool pool = (RealConnectionPool) obj;
                Address address = (Address) obj2;
                l.e(pool, "pool");
                l.e(address, "address");
                TaskRunner taskRunner4 = TaskRunner.this;
                RouteDatabase routeDatabase4 = routeDatabase3;
                return new FastFallbackExchangeFinder(new ForceConnectRoutePlanner(new RealRoutePlanner(taskRunner4, pool, i19, i20, i21, i22, i23, z13, z14, address, routeDatabase4, (ConnectionUser) obj3)), taskRunner4);
            }
        });
    }
}
