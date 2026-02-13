package J1;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class i implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f5425a;

    public i(k kVar) {
        this.f5425a = kVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f5425a.f5431b.run();
    }
}
