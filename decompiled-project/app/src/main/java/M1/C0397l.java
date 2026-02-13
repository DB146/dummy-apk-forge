package M1;

import mc.InterfaceC1656a;

/* renamed from: M1.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1656a f6691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f6692b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f6693c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q f6694d;

    public C0397l(InterfaceC1656a interfaceC1656a, kotlin.jvm.internal.r rVar, kotlin.jvm.internal.v vVar, Q q10) {
        this.f6691a = interfaceC1656a;
        this.f6692b = rVar;
        this.f6693c = vVar;
        this.f6694d = q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ac, B:30:0x00b4), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094 A[Catch: all -> 0x00d2, TRY_LEAVE, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[Catch: all -> 0x00d2, TRY_ENTER, TryCatch #0 {all -> 0x00d2, blocks: (B:40:0x0090, B:42:0x0094, B:46:0x00d5, B:47:0x00dc), top: B:39:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0393h c0393h, Jb.c cVar) {
        C0396k c0396k;
        int i7;
        InterfaceC1656a interfaceC1656a;
        Q q10;
        kotlin.jvm.internal.r rVar;
        kotlin.jvm.internal.v vVar;
        Rb.e eVar;
        InterfaceC1656a interfaceC1656a2;
        InterfaceC1656a interfaceC1656a3;
        Q q11;
        Object obj;
        kotlin.jvm.internal.v vVar2;
        try {
            if (cVar instanceof C0396k) {
                c0396k = (C0396k) cVar;
                int i10 = c0396k.f6690v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0396k.f6690v = i10 - Integer.MIN_VALUE;
                    Object obj2 = c0396k.f6688f;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = c0396k.f6690v;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj2);
                        c0396k.f6683a = c0393h;
                        interfaceC1656a = this.f6691a;
                        c0396k.f6684b = interfaceC1656a;
                        kotlin.jvm.internal.r rVar2 = this.f6692b;
                        c0396k.f6685c = rVar2;
                        kotlin.jvm.internal.v vVar3 = this.f6693c;
                        c0396k.f6686d = vVar3;
                        q10 = this.f6694d;
                        c0396k.f6687e = q10;
                        c0396k.f6690v = 1;
                        if (interfaceC1656a.n(c0396k) == aVar) {
                            return aVar;
                        }
                        rVar = rVar2;
                        vVar = vVar3;
                        eVar = c0393h;
                    } else {
                        if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0396k.f6685c;
                                vVar2 = (kotlin.jvm.internal.v) c0396k.f6684b;
                                interfaceC1656a2 = (InterfaceC1656a) c0396k.f6683a;
                                try {
                                    com.bumptech.glide.c.c0(obj2);
                                    vVar2.f19134a = obj;
                                    vVar = vVar2;
                                    Object obj3 = vVar.f19134a;
                                    interfaceC1656a2.l(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    interfaceC1656a2.l(null);
                                    throw th;
                                }
                            }
                            q11 = (Q) c0396k.f6685c;
                            vVar = (kotlin.jvm.internal.v) c0396k.f6684b;
                            interfaceC1656a3 = (InterfaceC1656a) c0396k.f6683a;
                            try {
                                com.bumptech.glide.c.c0(obj2);
                                if (!kotlin.jvm.internal.l.a(obj2, vVar.f19134a)) {
                                    interfaceC1656a2 = interfaceC1656a3;
                                    Object obj32 = vVar.f19134a;
                                    interfaceC1656a2.l(null);
                                    return obj32;
                                }
                                c0396k.f6683a = interfaceC1656a3;
                                c0396k.f6684b = vVar;
                                c0396k.f6685c = obj2;
                                c0396k.f6690v = 3;
                                if (q11.j(obj2, false, c0396k) == aVar) {
                                    return aVar;
                                }
                                obj = obj2;
                                vVar2 = vVar;
                                interfaceC1656a2 = interfaceC1656a3;
                                vVar2.f19134a = obj;
                                vVar = vVar2;
                                Object obj322 = vVar.f19134a;
                                interfaceC1656a2.l(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                interfaceC1656a2 = interfaceC1656a3;
                                interfaceC1656a2.l(null);
                                throw th;
                            }
                        }
                        Q q12 = c0396k.f6687e;
                        vVar = c0396k.f6686d;
                        rVar = (kotlin.jvm.internal.r) c0396k.f6685c;
                        InterfaceC1656a interfaceC1656a4 = (InterfaceC1656a) c0396k.f6684b;
                        Rb.e eVar2 = (Rb.e) c0396k.f6683a;
                        com.bumptech.glide.c.c0(obj2);
                        interfaceC1656a = interfaceC1656a4;
                        q10 = q12;
                        eVar = eVar2;
                    }
                    if (!rVar.f19130a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = vVar.f19134a;
                    c0396k.f6683a = interfaceC1656a;
                    c0396k.f6684b = vVar;
                    c0396k.f6685c = q10;
                    c0396k.f6686d = null;
                    c0396k.f6687e = null;
                    c0396k.f6690v = 2;
                    Object invoke = eVar.invoke(obj4, c0396k);
                    if (invoke == aVar) {
                        return aVar;
                    }
                    interfaceC1656a3 = interfaceC1656a;
                    obj2 = invoke;
                    q11 = q10;
                    if (!kotlin.jvm.internal.l.a(obj2, vVar.f19134a)) {
                    }
                }
            }
            if (!rVar.f19130a) {
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC1656a2 = interfaceC1656a;
            interfaceC1656a2.l(null);
            throw th;
        }
        c0396k = new C0396k(this, cVar);
        Object obj22 = c0396k.f6688f;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = c0396k.f6690v;
        if (i7 != 0) {
        }
    }
}
