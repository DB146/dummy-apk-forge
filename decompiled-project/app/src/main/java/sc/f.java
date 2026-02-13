package sc;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import rc.C1961e;

/* loaded from: classes2.dex */
public final class f extends C1961e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f24371m;

    public f(Socket socket) {
        this.f24371m = socket;
    }

    @Override // rc.C1961e
    public final void j() {
        Socket socket = this.f24371m;
        try {
            socket.close();
        } catch (AssertionError e2) {
            if (!j.a(e2)) {
                throw e2;
            }
            j.f24400a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        } catch (Exception e10) {
            j.f24400a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
