package E4;

import A8.c0;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d {
    public static final ArrayDeque g = new ArrayDeque();

    /* renamed from: h, reason: collision with root package name */
    public static final Object f3552h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f3553a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f3554b;

    /* renamed from: c, reason: collision with root package name */
    public c0 f3555c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f3556d;

    /* renamed from: e, reason: collision with root package name */
    public final N7.a f3557e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3558f;

    /* JADX WARN: Type inference failed for: r0v0, types: [N7.a, java.lang.Object] */
    public d(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ?? obj = new Object();
        this.f3553a = mediaCodec;
        this.f3554b = handlerThread;
        this.f3557e = obj;
        this.f3556d = new AtomicReference();
    }

    public static c b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new c();
                }
                return (c) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        if (this.f3558f) {
            try {
                c0 c0Var = this.f3555c;
                c0Var.getClass();
                c0Var.removeCallbacksAndMessages(null);
                N7.a aVar = this.f3557e;
                aVar.a();
                c0 c0Var2 = this.f3555c;
                c0Var2.getClass();
                c0Var2.obtainMessage(2).sendToTarget();
                synchronized (aVar) {
                    while (!aVar.f7385a) {
                        aVar.wait();
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e2);
            }
        }
    }
}
