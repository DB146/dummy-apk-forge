package E4;

import A9.C0146v0;
import android.os.HandlerThread;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements M6.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3546b;

    public /* synthetic */ b(int i7, int i10) {
        this.f3545a = i10;
        this.f3546b = i7;
    }

    @Override // M6.q
    public final Object get() {
        switch (this.f3545a) {
            case 0:
                return new HandlerThread(C0146v0.c(this.f3546b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(C0146v0.c(this.f3546b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
