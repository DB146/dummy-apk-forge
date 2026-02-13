package N3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e extends T3.c {

    /* renamed from: d, reason: collision with root package name */
    public final Handler f7184d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7185e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7186f;

    /* renamed from: u, reason: collision with root package name */
    public Bitmap f7187u;

    public e(Handler handler, int i7, long j) {
        this.f7184d = handler;
        this.f7185e = i7;
        this.f7186f = j;
    }

    @Override // T3.i
    public final void h(Drawable drawable) {
        this.f7187u = null;
    }

    @Override // T3.i
    public final void i(Object obj) {
        this.f7187u = (Bitmap) obj;
        Handler handler = this.f7184d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f7186f);
    }
}
