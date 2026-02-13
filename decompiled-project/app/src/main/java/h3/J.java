package h3;

import androidx.work.Worker;

/* loaded from: classes.dex */
public final class J extends kotlin.jvm.internal.m implements Rb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17665a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Worker f17666b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(Worker worker, int i7) {
        super(0);
        this.f17665a = i7;
        this.f17666b = worker;
    }

    @Override // Rb.a
    public final Object invoke() {
        switch (this.f17665a) {
            case 0:
                this.f17666b.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            default:
                return this.f17666b.c();
        }
    }
}
