package qb;

import gb.AbstractC1204a;
import hb.InterfaceC1269b;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb.InterfaceC1394e;
import kb.EnumC1437b;
import y7.u0;

/* loaded from: classes2.dex */
public final class k extends AtomicReference implements gb.g, gb.b, InterfaceC1269b, gb.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23616a;

    /* renamed from: b, reason: collision with root package name */
    public final gb.b f23617b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1394e f23618c;

    public /* synthetic */ k(gb.b bVar, InterfaceC1394e interfaceC1394e, int i7) {
        this.f23616a = i7;
        this.f23617b = bVar;
        this.f23618c = interfaceC1394e;
    }

    @Override // gb.g
    public final void a() {
        switch (this.f23616a) {
            case 0:
                this.f23617b.a();
                return;
            default:
                this.f23617b.a();
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final void b() {
        switch (this.f23616a) {
            case 0:
                EnumC1437b.a(this);
                return;
            default:
                EnumC1437b.a(this);
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void c(InterfaceC1269b interfaceC1269b) {
        switch (this.f23616a) {
            case 0:
                EnumC1437b.f(this, interfaceC1269b);
                return;
            default:
                EnumC1437b.f(this, interfaceC1269b);
                return;
        }
    }

    @Override // hb.InterfaceC1269b
    public final boolean g() {
        switch (this.f23616a) {
            case 0:
                return EnumC1437b.d((InterfaceC1269b) get());
            default:
                return EnumC1437b.d((InterfaceC1269b) get());
        }
    }

    @Override // gb.g, gb.q
    public final void onError(Throwable th) {
        switch (this.f23616a) {
            case 0:
                this.f23617b.onError(th);
                return;
            default:
                this.f23617b.onError(th);
                return;
        }
    }

    @Override // gb.g, gb.q
    public final void onSuccess(Object obj) {
        switch (this.f23616a) {
            case 0:
                try {
                    Object apply = this.f23618c.apply(obj);
                    Objects.requireNonNull(apply, "The mapper returned a null CompletableSource");
                    AbstractC1204a abstractC1204a = (AbstractC1204a) apply;
                    if (g()) {
                        return;
                    }
                    abstractC1204a.c(this);
                    return;
                } catch (Throwable th) {
                    u0.L(th);
                    onError(th);
                    return;
                }
            default:
                try {
                    Object apply2 = this.f23618c.apply(obj);
                    Objects.requireNonNull(apply2, "The mapper returned a null CompletableSource");
                    AbstractC1204a abstractC1204a2 = (AbstractC1204a) apply2;
                    if (g()) {
                        return;
                    }
                    abstractC1204a2.c(this);
                    return;
                } catch (Throwable th2) {
                    u0.L(th2);
                    onError(th2);
                    return;
                }
        }
    }
}
