package m4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1557a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceHolderCallbackC1596z f20212a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f20213b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P3.p f20214c;

    public RunnableC1557a(P3.p pVar, Handler handler, SurfaceHolderCallbackC1596z surfaceHolderCallbackC1596z) {
        this.f20214c = pVar;
        this.f20213b = handler;
        this.f20212a = surfaceHolderCallbackC1596z;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f20213b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20214c.f7841b) {
            this.f20212a.f20525a.B0(false, -1, 3);
        }
    }
}
