package W4;

import A9.S2;
import android.os.Handler;
import android.os.HandlerThread;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final OutputStream f10796a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f10797b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f10798c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f10799d;

    public x(y yVar, OutputStream outputStream) {
        this.f10799d = yVar;
        this.f10796a = outputStream;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:RtspMessageChannel:Sender");
        this.f10797b = handlerThread;
        handlerThread.start();
        this.f10798c = new Handler(handlerThread.getLooper());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.f10798c;
        HandlerThread handlerThread = this.f10797b;
        Objects.requireNonNull(handlerThread);
        handler.post(new S2(handlerThread, 17));
        try {
            handlerThread.join();
        } catch (InterruptedException unused) {
            handlerThread.interrupt();
        }
    }
}
