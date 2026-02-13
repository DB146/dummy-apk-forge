package r4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import m4.C1586o0;
import m5.C1617n;
import m5.I;
import n5.AbstractC1705a;

/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC1929a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public boolean f23705a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1931c f23706b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1929a(C1931c c1931c, Looper looper) {
        super(looper);
        this.f23706b = c1931c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bd  */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        Exception exc;
        long j;
        C1930b c1930b = (C1930b) message.obj;
        try {
            int i7 = message.what;
            if (i7 == 0) {
                exc = this.f23706b.k.f((x) c1930b.f23709c);
            } else {
                if (i7 != 1) {
                    throw new RuntimeException();
                }
                C1931c c1931c = this.f23706b;
                exc = c1931c.k.d(c1931c.f23719l, (w) c1930b.f23709c);
            }
        } catch (C1927F e2) {
            C1930b c1930b2 = (C1930b) message.obj;
            if (c1930b2.f23708b) {
                int i10 = c1930b2.f23710d + 1;
                c1930b2.f23710d = i10;
                this.f23706b.f23718i.getClass();
                if (i10 <= 3) {
                    SystemClock.elapsedRealtime();
                    SystemClock.elapsedRealtime();
                    Throwable iOException = e2.getCause() instanceof IOException ? (IOException) e2.getCause() : new IOException(e2.getCause());
                    Y5.B b2 = this.f23706b.f23718i;
                    int i11 = c1930b2.f23710d;
                    b2.getClass();
                    if (!(iOException instanceof C1586o0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof m5.z) && !(iOException instanceof I)) {
                        int i12 = C1617n.f20620b;
                        while (iOException != null) {
                            if (!(iOException instanceof C1617n) || ((C1617n) iOException).f20621a != 2008) {
                                iOException = iOException.getCause();
                            }
                        }
                        j = Math.min((i11 - 1) * 1000, 5000);
                        if (j != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f23705a) {
                                        sendMessageDelayed(Message.obtain(message), j);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                    j = -9223372036854775807L;
                    if (j != -9223372036854775807L) {
                    }
                }
            }
            exc = e2;
        } catch (Exception e10) {
            AbstractC1705a.R(e10, "DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.");
            exc = e10;
        }
        Y5.B b10 = this.f23706b.f23718i;
        long j10 = c1930b.f23707a;
        b10.getClass();
        synchronized (this) {
            try {
                if (!this.f23705a) {
                    this.f23706b.f23721n.obtainMessage(message.what, Pair.create(c1930b.f23709c, exc)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
