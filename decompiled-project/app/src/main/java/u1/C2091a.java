package u1;

import android.os.OutcomeReceiver;
import cc.C0944m;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: u1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2091a extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C0944m f24820a;

    public C2091a(C0944m c0944m) {
        super(false);
        this.f24820a = c0944m;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f24820a.resumeWith(com.bumptech.glide.c.n(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f24820a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
