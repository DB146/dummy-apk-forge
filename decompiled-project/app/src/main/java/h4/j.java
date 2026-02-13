package h4;

import Y5.B;
import Y5.C0656w;
import android.content.Context;
import b4.q;
import c4.C0903e;
import c4.C0904f;
import d4.InterfaceC1049b;
import j4.InterfaceC1377c;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements InterfaceC1049b {

    /* renamed from: a, reason: collision with root package name */
    public final C0903e f17756a;

    /* renamed from: b, reason: collision with root package name */
    public final Cb.a f17757b;

    /* renamed from: c, reason: collision with root package name */
    public final Cb.a f17758c;

    /* renamed from: d, reason: collision with root package name */
    public final q f17759d;

    /* renamed from: e, reason: collision with root package name */
    public final Cb.a f17760e;

    /* renamed from: f, reason: collision with root package name */
    public final Cb.a f17761f;
    public final Cb.a g;

    public j(C0903e c0903e, Cb.a aVar, Cb.a aVar2, q qVar, Cb.a aVar3, Cb.a aVar4, Cb.a aVar5) {
        this.f17756a = c0903e;
        this.f17757b = aVar;
        this.f17758c = aVar2;
        this.f17759d = qVar;
        this.f17760e = aVar3;
        this.f17761f = aVar4;
        this.g = aVar5;
    }

    @Override // Cb.a
    public final Object get() {
        return new i((Context) this.f17756a.f14341b, (C0904f) this.f17757b.get(), (i4.d) this.f17758c.get(), (d) this.f17759d.get(), (Executor) this.f17760e.get(), (InterfaceC1377c) this.f17761f.get(), new C0656w(12), new B(11), (i4.c) this.g.get());
    }
}
