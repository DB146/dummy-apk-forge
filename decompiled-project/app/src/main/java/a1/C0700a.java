package a1;

import java.util.concurrent.CancellationException;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0700a f12447c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0700a f12448d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12449a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f12450b;

    static {
        if (AbstractC0707h.f12464d) {
            f12448d = null;
            f12447c = null;
        } else {
            f12448d = new C0700a(false, null);
            f12447c = new C0700a(true, null);
        }
    }

    public C0700a(boolean z8, CancellationException cancellationException) {
        this.f12449a = z8;
        this.f12450b = cancellationException;
    }
}
