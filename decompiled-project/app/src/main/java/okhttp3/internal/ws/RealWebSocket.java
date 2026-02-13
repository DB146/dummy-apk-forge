package okhttp3.internal.ws;

import java.io.Closeable;
import java.util.List;
import okhttp3.Protocol;
import okhttp3.WebSocket;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.ws.WebSocketReader;
import y7.u0;

/* loaded from: classes2.dex */
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22943a;

    /* loaded from: classes2.dex */
    public static final class Close {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Message {
    }

    /* loaded from: classes2.dex */
    public static abstract class Streams implements Closeable {
    }

    /* loaded from: classes2.dex */
    public final class WriterTask extends Task {
        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            throw null;
        }
    }

    static {
        new Companion(0);
        f22943a = u0.x(Protocol.f22416d);
    }
}
