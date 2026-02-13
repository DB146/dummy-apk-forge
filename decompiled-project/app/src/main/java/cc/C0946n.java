package cc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: cc.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0946n extends C0955v {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f14554c = AtomicIntegerFieldUpdater.newUpdater(C0946n.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0946n(C0944m c0944m, Throwable th, boolean z8) {
        super(z8, th);
        if (th == null) {
            th = new CancellationException("Continuation " + c0944m + " was cancelled normally");
        }
        this._resumed = 0;
    }
}
