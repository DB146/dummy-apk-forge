package com.google.android.recaptcha.internal;

import A6.f;
import E6.b;
import Hb.d;
import Hb.g;
import Hb.h;
import Hb.i;
import Ib.a;
import Rb.c;
import Rb.e;
import Y5.A;
import cc.B;
import cc.C0939j0;
import cc.C0953t;
import cc.I;
import cc.InterfaceC0937i0;
import cc.InterfaceC0950p;
import cc.InterfaceC0952s;
import cc.S;
import cc.r;
import cc.t0;
import cc.u0;
import cc.v0;
import cc.w0;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;
import lc.InterfaceC1517a;
import lc.InterfaceC1518b;

/* loaded from: classes.dex */
public final class zzbw implements I {
    private final /* synthetic */ InterfaceC0952s zza;

    public zzbw(InterfaceC0952s interfaceC0952s) {
        this.zza = interfaceC0952s;
    }

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0950p attachChild(r rVar) {
        return this.zza.attachChild(rVar);
    }

    @Override // cc.I
    public final Object await(d dVar) {
        Object o10 = ((C0953t) this.zza).o(dVar);
        a aVar = a.f5345a;
        return o10;
    }

    @Db.a
    public final /* synthetic */ void cancel() {
        ((w0) this.zza).cancel(null);
    }

    @Override // cc.InterfaceC0937i0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Db.a
    public final /* synthetic */ boolean cancel(Throwable th) {
        w0 w0Var = (w0) this.zza;
        w0Var.getClass();
        w0Var.q(th != null ? w0.U(w0Var, th) : new C0939j0(w0Var.s(), null, w0Var));
        return true;
    }

    @Override // Hb.i
    public final Object fold(Object obj, e operation) {
        w0 w0Var = (w0) this.zza;
        w0Var.getClass();
        l.e(operation, "operation");
        return operation.invoke(obj, w0Var);
    }

    @Override // Hb.i
    public final g get(h hVar) {
        w0 w0Var = (w0) this.zza;
        w0Var.getClass();
        return b.l(w0Var, hVar);
    }

    @Override // cc.InterfaceC0937i0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // cc.InterfaceC0937i0
    public final Zb.g getChildren() {
        return this.zza.getChildren();
    }

    @Override // cc.I
    public final Object getCompleted() {
        return ((C0953t) this.zza).x();
    }

    @Override // cc.I
    public final Throwable getCompletionExceptionOrNull() {
        return ((w0) this.zza).getCompletionExceptionOrNull();
    }

    @Override // Hb.g
    public final h getKey() {
        this.zza.getClass();
        return B.f14467b;
    }

    public final InterfaceC1518b getOnAwait() {
        C0953t c0953t = (C0953t) this.zza;
        c0953t.getClass();
        y.b(3, t0.f14575a);
        y.b(3, u0.f14581a);
        return new f(c0953t);
    }

    public final InterfaceC1517a getOnJoin() {
        w0 w0Var = (w0) this.zza;
        w0Var.getClass();
        y.b(3, v0.f14584a);
        return new A(w0Var);
    }

    @Override // cc.InterfaceC0937i0
    public final InterfaceC0937i0 getParent() {
        return ((w0) this.zza).getParent();
    }

    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(c cVar) {
        return this.zza.invokeOnCompletion(cVar);
    }

    @Override // cc.InterfaceC0937i0
    public final S invokeOnCompletion(boolean z8, boolean z10, c cVar) {
        return ((w0) this.zza).invokeOnCompletion(z8, z10, cVar);
    }

    @Override // cc.InterfaceC0937i0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // cc.InterfaceC0937i0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return ((w0) this.zza).H();
    }

    @Override // cc.InterfaceC0937i0
    public final Object join(d dVar) {
        return this.zza.join(dVar);
    }

    @Override // Hb.i
    public final i minusKey(h hVar) {
        return this.zza.minusKey(hVar);
    }

    @Override // Hb.i
    public final i plus(i iVar) {
        return this.zza.plus(iVar);
    }

    @Db.a
    public final InterfaceC0937i0 plus(InterfaceC0937i0 interfaceC0937i0) {
        this.zza.getClass();
        return interfaceC0937i0;
    }

    @Override // cc.InterfaceC0937i0
    public final boolean start() {
        return this.zza.start();
    }
}
