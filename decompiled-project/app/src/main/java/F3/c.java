package F3;

import E5.k;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final b f4062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4063b;

    /* renamed from: c, reason: collision with root package name */
    public final d f4064c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4065d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f4066e;

    public c(b bVar, String str, boolean z8) {
        d dVar = d.f4067a;
        this.f4066e = new AtomicInteger();
        this.f4062a = bVar;
        this.f4063b = str;
        this.f4064c = dVar;
        this.f4065d = z8;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        k kVar = new k(2, this, runnable, false);
        this.f4062a.getClass();
        a aVar = new a(kVar);
        aVar.setName("glide-" + this.f4063b + "-thread-" + this.f4066e.getAndIncrement());
        return aVar;
    }
}
