package g4;

import b4.q;
import c4.C0904f;
import d4.InterfaceC1049b;
import h4.d;
import j4.InterfaceC1377c;
import java.util.concurrent.Executor;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1197b implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final Cb.a f17452a;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f17453b;

    /* renamed from: c, reason: collision with root package name */
    public final q f17454c;

    /* renamed from: d, reason: collision with root package name */
    public final Cb.a f17455d;

    /* renamed from: e, reason: collision with root package name */
    public final Cb.a f17456e;

    public C1197b(Cb.a aVar, Cb.a aVar2, q qVar, Cb.a aVar3, Cb.a aVar4) {
        this.f17452a = aVar;
        this.f17453b = aVar2;
        this.f17454c = qVar;
        this.f17455d = aVar3;
        this.f17456e = aVar4;
    }

    @Override // Cb.a
    public final Object get() {
        return new C1196a((Executor) this.f17452a.get(), (C0904f) this.f17453b.get(), (d) this.f17454c.get(), (i4.d) this.f17455d.get(), (InterfaceC1377c) this.f17456e.get());
    }
}
