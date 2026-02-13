package cc;

import java.util.concurrent.locks.LockSupport;

/* renamed from: cc.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0934h extends AbstractC0920a {

    /* renamed from: d, reason: collision with root package name */
    public final Thread f14539d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0921a0 f14540e;

    public C0934h(Hb.i iVar, Thread thread, AbstractC0921a0 abstractC0921a0) {
        super(iVar, true, true);
        this.f14539d = thread;
        this.f14540e = abstractC0921a0;
    }

    @Override // cc.w0
    public final void k(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.f14539d;
        if (kotlin.jvm.internal.l.a(currentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
