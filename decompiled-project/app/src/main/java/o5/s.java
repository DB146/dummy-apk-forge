package o5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import n5.AbstractC1705a;
import n5.D;

/* loaded from: classes.dex */
public final class s implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final s f22023e = new s();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f22024a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f22025b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f22026c;

    /* renamed from: d, reason: collision with root package name */
    public int f22027d;

    public s() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i7 = D.f21141a;
        Handler handler = new Handler(looper, this);
        this.f22025b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f22024a = j;
        Choreographer choreographer = this.f22026c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        if (i7 == 0) {
            try {
                this.f22026c = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                AbstractC1705a.R(e2, "VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error");
            }
            return true;
        }
        if (i7 == 1) {
            Choreographer choreographer = this.f22026c;
            if (choreographer != null) {
                int i10 = this.f22027d + 1;
                this.f22027d = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i7 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f22026c;
        if (choreographer2 != null) {
            int i11 = this.f22027d - 1;
            this.f22027d = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f22024a = -9223372036854775807L;
            }
        }
        return true;
    }
}
