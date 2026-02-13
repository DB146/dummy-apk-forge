package m4;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1561c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1563d f20263b;

    public C1561c(C1563d c1563d, Handler handler) {
        this.f20263b = c1563d;
        this.f20262a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        this.f20262a.post(new RunnableC1559b(this, i7, 0));
    }
}
