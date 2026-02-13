package h4;

import b4.q;
import d4.InterfaceC1049b;
import j4.InterfaceC1377c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final Cb.a f17766a;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f17767b;

    /* renamed from: c, reason: collision with root package name */
    public final q f17768c;

    /* renamed from: d, reason: collision with root package name */
    public final Cb.a f17769d;

    public l(Cb.a aVar, Cb.a aVar2, q qVar, Cb.a aVar3) {
        this.f17766a = aVar;
        this.f17767b = aVar2;
        this.f17768c = qVar;
        this.f17769d = aVar3;
    }

    @Override // Cb.a
    public final Object get() {
        return new k((Executor) this.f17766a.get(), (i4.d) this.f17767b.get(), (d) this.f17768c.get(), (InterfaceC1377c) this.f17769d.get());
    }
}
