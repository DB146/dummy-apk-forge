package E4;

import A0.G0;
import A9.C0146v0;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import n5.D;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o5.h f3543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f3544c;

    public /* synthetic */ a(j jVar, o5.h hVar, int i7) {
        this.f3542a = i7;
        this.f3544c = jVar;
        this.f3543b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j10) {
        switch (this.f3542a) {
            case 0:
                ((C0146v0) this.f3544c).getClass();
                o5.h hVar = this.f3543b;
                hVar.getClass();
                if (D.f21141a >= 30) {
                    hVar.a(j);
                    return;
                } else {
                    Handler handler = hVar.f21964a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
            default:
                ((G0) this.f3544c).getClass();
                o5.h hVar2 = this.f3543b;
                hVar2.getClass();
                if (D.f21141a >= 30) {
                    hVar2.a(j);
                    return;
                } else {
                    Handler handler2 = hVar2.f21964a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
        }
    }
}
