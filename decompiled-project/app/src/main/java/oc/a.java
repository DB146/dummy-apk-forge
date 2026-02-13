package oc;

import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import okhttp3.internal._UtilJvmKt;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f22237a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22238b;

    public /* synthetic */ a(String str, boolean z8) {
        this.f22237a = str;
        this.f22238b = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        TimeZone timeZone = _UtilJvmKt.f22497a;
        Thread thread = new Thread(runnable, this.f22237a);
        thread.setDaemon(this.f22238b);
        return thread;
    }
}
