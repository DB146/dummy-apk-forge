package jc;

import Hb.i;
import a.AbstractC0672a;
import cc.AbstractC0920a;
import gb.g;
import hb.InterfaceC1269b;
import java.util.concurrent.atomic.AtomicReference;
import kb.EnumC1437b;
import ob.C1836d;
import tb.C2037a;

/* renamed from: jc.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1398b extends AbstractC0920a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18676d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f18677e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1398b(i iVar, AtomicReference atomicReference, int i7) {
        super(iVar, false, true);
        this.f18676d = i7;
        this.f18677e = atomicReference;
    }

    @Override // cc.AbstractC0920a
    public final void W(boolean z8, Throwable th) {
        switch (this.f18676d) {
            case 0:
                try {
                    if (((C1836d) this.f18677e).d(th)) {
                        return;
                    }
                } catch (Throwable th2) {
                    AbstractC0672a.c(th, th2);
                }
                Y6.b.p(this.f14514c, th);
                return;
            case 1:
                try {
                    if (((qb.c) this.f18677e).e(th)) {
                        return;
                    }
                } catch (Throwable th3) {
                    AbstractC0672a.c(th, th3);
                }
                Y6.b.p(this.f14514c, th);
                return;
            default:
                try {
                    if (((C2037a) this.f18677e).d(th)) {
                        return;
                    }
                } catch (Throwable th4) {
                    AbstractC0672a.c(th, th4);
                }
                Y6.b.p(this.f14514c, th);
                return;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // cc.AbstractC0920a
    public final void X(Object obj) {
        InterfaceC1269b interfaceC1269b;
        switch (this.f18676d) {
            case 0:
                try {
                    ((C1836d) this.f18677e).a();
                    return;
                } catch (Throwable th) {
                    Y6.b.p(this.f14514c, th);
                    return;
                }
            case 1:
                qb.c cVar = (qb.c) this.f18677e;
                try {
                    if (obj != null) {
                        cVar.d(obj);
                        return;
                    }
                    Object obj2 = cVar.get();
                    EnumC1437b enumC1437b = EnumC1437b.f19070a;
                    if (obj2 == enumC1437b || (interfaceC1269b = (InterfaceC1269b) cVar.getAndSet(enumC1437b)) == enumC1437b) {
                        return;
                    }
                    try {
                        ((g) cVar.f23597b).a();
                        if (interfaceC1269b != null) {
                            interfaceC1269b.b();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        if (interfaceC1269b != null) {
                            interfaceC1269b.b();
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    Y6.b.p(this.f14514c, th3);
                    return;
                }
            default:
                try {
                    ((C2037a) this.f18677e).c(obj);
                    return;
                } catch (Throwable th4) {
                    Y6.b.p(this.f14514c, th4);
                    return;
                }
        }
    }
}
