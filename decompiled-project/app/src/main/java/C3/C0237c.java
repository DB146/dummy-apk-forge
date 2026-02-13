package C3;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: C3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0237c extends WeakReference {

    /* renamed from: a, reason: collision with root package name */
    public final s f2511a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2512b;

    /* renamed from: c, reason: collision with root package name */
    public A f2513c;

    public C0237c(s sVar, t tVar, ReferenceQueue referenceQueue) {
        super(tVar, referenceQueue);
        W3.g.c(sVar, "Argument must not be null");
        this.f2511a = sVar;
        boolean z8 = tVar.f2625a;
        this.f2513c = null;
        this.f2512b = z8;
    }
}
