package E4;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class e extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f3560b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f3561c;

    /* renamed from: h, reason: collision with root package name */
    public MediaFormat f3565h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f3566i;
    public MediaCodec.CodecException j;
    public long k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3567l;

    /* renamed from: m, reason: collision with root package name */
    public IllegalStateException f3568m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3559a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final A4.i f3562d = new A4.i();

    /* renamed from: e, reason: collision with root package name */
    public final A4.i f3563e = new A4.i();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayDeque f3564f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public e(HandlerThread handlerThread) {
        this.f3560b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.f3566i = (MediaFormat) arrayDeque.getLast();
        }
        A4.i iVar = this.f3562d;
        iVar.f388a = 0;
        iVar.f389b = -1;
        iVar.f390c = 0;
        A4.i iVar2 = this.f3563e;
        iVar2.f388a = 0;
        iVar2.f389b = -1;
        iVar2.f390c = 0;
        this.f3564f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f3559a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i7) {
        synchronized (this.f3559a) {
            this.f3562d.b(i7);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f3559a) {
            try {
                MediaFormat mediaFormat = this.f3566i;
                if (mediaFormat != null) {
                    this.f3563e.b(-2);
                    this.g.add(mediaFormat);
                    this.f3566i = null;
                }
                this.f3563e.b(i7);
                this.f3564f.add(bufferInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f3559a) {
            this.f3563e.b(-2);
            this.g.add(mediaFormat);
            this.f3566i = null;
        }
    }
}
