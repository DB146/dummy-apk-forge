package q7;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: q7.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC1897a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f23514e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f23515a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f23516b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23517c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f23518d;

    public ThreadFactoryC1897a(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        this.f23516b = str;
        this.f23517c = i7;
        this.f23518d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f23514e.newThread(new p5.j(4, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.f23516b + " Thread #" + this.f23515a.getAndIncrement());
        return newThread;
    }
}
