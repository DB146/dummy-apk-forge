package O1;

import Db.q;
import I2.A;
import M1.InterfaceC0387b;
import M1.P;
import M1.a0;
import M1.r;
import a.AbstractC0672a;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import mc.AbstractC1660e;
import mc.C1659d;
import mc.InterfaceC1656a;
import rc.w;
import rc.z;

/* loaded from: classes.dex */
public final class i implements InterfaceC0387b {

    /* renamed from: a, reason: collision with root package name */
    public final w f7451a;

    /* renamed from: b, reason: collision with root package name */
    public final z f7452b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f7453c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7454d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7455e;

    /* renamed from: f, reason: collision with root package name */
    public final C1659d f7456f;

    public i(w fileSystem, z path, a0 coordinator, e eVar) {
        l.e(fileSystem, "fileSystem");
        l.e(path, "path");
        l.e(coordinator, "coordinator");
        this.f7451a = fileSystem;
        this.f7452b = path;
        this.f7453c = coordinator;
        this.f7454d = eVar;
        this.f7455e = new a();
        this.f7456f = AbstractC1660e.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(3:10|11|12)(2:32|33))(2:34|(6:36|37|38|40|41|(1:43)(1:44))(2:53|54))|13|14|15|(2:(1:18)|19)(1:21)))|7|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:21:0x007c, B:31:0x008a, B:28:0x008d, B:27:0x0085), top: B:7:0x0020, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r0v10, types: [O1.i] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, O1.g] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [O1.i] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [M1.r] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, Jb.c cVar) {
        ?? r02;
        int i7;
        c cVar2;
        Throwable th;
        i iVar;
        boolean z8;
        try {
            if (cVar instanceof g) {
                g gVar = (g) cVar;
                int i10 = gVar.f7443f;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    gVar.f7443f = i10 - Integer.MIN_VALUE;
                    r02 = gVar;
                    Object obj = r02.f7441d;
                    Ib.a aVar = Ib.a.f5345a;
                    i7 = r02.f7443f;
                    if (i7 != 0) {
                        com.bumptech.glide.c.c0(obj);
                        if (this.f7455e.f7420a.get()) {
                            throw new IllegalStateException("StorageConnection has already been disposed.");
                        }
                        boolean d10 = this.f7456f.d();
                        try {
                            c cVar3 = new c(this.f7451a, this.f7452b);
                            try {
                                Boolean valueOf = Boolean.valueOf(d10);
                                r02.f7438a = this;
                                r02.f7439b = cVar3;
                                r02.f7440c = d10;
                                r02.f7443f = 1;
                                Object a9 = rVar.a(cVar3, valueOf, r02);
                                if (a9 == aVar) {
                                    return aVar;
                                }
                                iVar = this;
                                cVar2 = cVar3;
                                obj = a9;
                                z8 = d10;
                            } catch (Throwable th2) {
                                r02 = this;
                                cVar2 = cVar3;
                                th = th2;
                                rVar = d10;
                                cVar2.close();
                                throw th;
                            }
                        } catch (Throwable th3) {
                            r02 = this;
                            th = th3;
                            rVar = d10;
                            if (rVar != 0) {
                                r02.f7456f.l(null);
                            }
                            throw th;
                        }
                    } else {
                        if (i7 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        rVar = r02.f7440c;
                        cVar2 = r02.f7439b;
                        r02 = r02.f7438a;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            iVar = r02;
                            z8 = rVar;
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                cVar2.close();
                            } catch (Throwable th5) {
                                AbstractC0672a.c(th, th5);
                            }
                            throw th;
                        }
                    }
                    cVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (z8) {
                        iVar.f7456f.l(null);
                    }
                    return obj;
                }
            }
            if (i7 != 0) {
            }
            cVar2.close();
            th = null;
            if (th == null) {
            }
        } catch (Throwable th6) {
            th = th6;
            if (rVar != 0) {
            }
            throw th;
        }
        r02 = new g(this, cVar);
        Object obj2 = r02.f7441d;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = r02.f7443f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112 A[Catch: all -> 0x0122, IOException -> 0x0125, TRY_ENTER, TryCatch #9 {IOException -> 0x0125, all -> 0x0122, blocks: (B:19:0x0112, B:21:0x011a, B:25:0x012f, B:34:0x013a, B:31:0x013d, B:30:0x0135), top: B:7:0x0023, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f A[Catch: all -> 0x0122, IOException -> 0x0125, TRY_ENTER, TRY_LEAVE, TryCatch #9 {IOException -> 0x0125, all -> 0x0122, blocks: (B:19:0x0112, B:21:0x011a, B:25:0x012f, B:34:0x013a, B:31:0x013d, B:30:0x0135), top: B:7:0x0023, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [rc.z] */
    /* JADX WARN: Type inference failed for: r0v5, types: [rc.z] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [rc.z] */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v9, types: [Rb.e] */
    /* JADX WARN: Type inference failed for: r13v14, types: [java.lang.Object, mc.d] */
    /* JADX WARN: Type inference failed for: r1v11, types: [O1.i] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [O1.h, java.lang.Object, Jb.c] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [rc.o, rc.w] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, rc.w] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, Ib.a] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8, types: [mc.a] */
    /* JADX WARN: Type inference failed for: r8v6, types: [rc.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(P p10, Jb.c cVar) {
        ?? r12;
        ?? r22;
        int i7;
        InterfaceC1656a interfaceC1656a;
        i iVar;
        z d10;
        A n6;
        ?? r122;
        c cVar2;
        Throwable th;
        InterfaceC0387b interfaceC0387b;
        InterfaceC1656a interfaceC1656a2;
        i iVar2;
        z zVar;
        ?? r02 = ".tmp";
        try {
            try {
                try {
                    try {
                        if (cVar instanceof h) {
                            h hVar = (h) cVar;
                            int i10 = hVar.f7450u;
                            if ((i10 & Integer.MIN_VALUE) != 0) {
                                hVar.f7450u = i10 - Integer.MIN_VALUE;
                                r12 = hVar;
                                Object obj = r12.f7448e;
                                r22 = Ib.a.f5345a;
                                i7 = r12.f7450u;
                                if (i7 != 0) {
                                    com.bumptech.glide.c.c0(obj);
                                    if (this.f7455e.f7420a.get()) {
                                        throw new IllegalStateException("StorageConnection has already been disposed.");
                                    }
                                    d10 = this.f7452b.d();
                                    if (d10 == null) {
                                        throw new IllegalStateException("must have a parent path");
                                    }
                                    w wVar = this.f7451a;
                                    wVar.getClass();
                                    Eb.l lVar = new Eb.l();
                                    for (z zVar2 = d10; zVar2 != null && !wVar.l(zVar2); zVar2 = zVar2.d()) {
                                        lVar.addFirst(zVar2);
                                    }
                                    Iterator it = lVar.iterator();
                                    while (it.hasNext()) {
                                        z dir = (z) it.next();
                                        wVar.getClass();
                                        l.e(dir, "dir");
                                        if (!dir.i().mkdir() && ((n6 = wVar.n(dir)) == null || !n6.f5002c)) {
                                            throw new IOException("failed to create directory: " + dir);
                                        }
                                    }
                                    r12.f7444a = this;
                                    r12.f7445b = p10;
                                    r12.f7446c = d10;
                                    ?? r13 = this.f7456f;
                                    r12.f7447d = r13;
                                    r12.f7450u = 1;
                                    if (r13.n(r12) == r22) {
                                        return r22;
                                    }
                                    iVar = this;
                                    r122 = p10;
                                    interfaceC1656a = r13;
                                } else {
                                    if (i7 != 1) {
                                        if (i7 != 2) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        interfaceC0387b = (InterfaceC0387b) r12.f7447d;
                                        r02 = r12.f7446c;
                                        r22 = (InterfaceC1656a) r12.f7445b;
                                        r12 = r12.f7444a;
                                        try {
                                            com.bumptech.glide.c.c0(obj);
                                            zVar = r02;
                                            iVar2 = r12;
                                            interfaceC1656a2 = r22;
                                            try {
                                                interfaceC0387b.close();
                                                th = null;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                            if (th == null) {
                                                throw th;
                                            }
                                            if (iVar2.f7451a.l(zVar)) {
                                                iVar2.f7451a.P(zVar, iVar2.f7452b);
                                            }
                                            interfaceC1656a2.l(null);
                                            return q.f3365a;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            try {
                                                interfaceC0387b.close();
                                            } catch (Throwable th4) {
                                                AbstractC0672a.c(th, th4);
                                            }
                                            throw th;
                                        }
                                    }
                                    InterfaceC1656a interfaceC1656a3 = (InterfaceC1656a) r12.f7447d;
                                    d10 = r12.f7446c;
                                    Rb.e eVar = (Rb.e) r12.f7445b;
                                    iVar = r12.f7444a;
                                    com.bumptech.glide.c.c0(obj);
                                    interfaceC1656a = interfaceC1656a3;
                                    r122 = eVar;
                                }
                                z zVar3 = iVar.f7452b;
                                ?? r82 = iVar.f7451a;
                                r02 = d10.g(zVar3.b().concat(".tmp"));
                                r82.T(r02);
                                cVar2 = new c(r82, r02);
                                r12.f7444a = iVar;
                                r12.f7445b = interfaceC1656a;
                                r12.f7446c = r02;
                                r12.f7447d = cVar2;
                                r12.f7450u = 2;
                                if (r122.invoke(cVar2, r12) != r22) {
                                    return r22;
                                }
                                interfaceC1656a2 = interfaceC1656a;
                                interfaceC0387b = cVar2;
                                iVar2 = iVar;
                                zVar = r02;
                                interfaceC0387b.close();
                                th = null;
                                if (th == null) {
                                }
                            }
                        }
                        r12.f7444a = iVar;
                        r12.f7445b = interfaceC1656a;
                        r12.f7446c = r02;
                        r12.f7447d = cVar2;
                        r12.f7450u = 2;
                        if (r122.invoke(cVar2, r12) != r22) {
                        }
                    } catch (Throwable th5) {
                        r22 = interfaceC1656a;
                        r12 = iVar;
                        th = th5;
                        interfaceC0387b = cVar2;
                        interfaceC0387b.close();
                        throw th;
                    }
                    r82.T(r02);
                    cVar2 = new c(r82, r02);
                } catch (IOException e2) {
                    e = e2;
                    if (iVar.f7451a.l(r02)) {
                        try {
                            ?? r14 = iVar.f7451a;
                            r14.getClass();
                            r14.T(r02);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                z zVar32 = iVar.f7452b;
                ?? r822 = iVar.f7451a;
                r02 = d10.g(zVar32.b().concat(".tmp"));
            } catch (Throwable th6) {
                th = th6;
                interfaceC1656a.l(null);
                throw th;
            }
            if (i7 != 0) {
            }
        } catch (IOException e10) {
            e = e10;
            iVar = r12;
            interfaceC1656a = r22;
            if (iVar.f7451a.l(r02)) {
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            interfaceC1656a = r22;
            interfaceC1656a.l(null);
            throw th;
        }
        r12 = new h(this, cVar);
        Object obj2 = r12.f7448e;
        r22 = Ib.a.f5345a;
        i7 = r12.f7450u;
    }

    @Override // M1.InterfaceC0387b
    public final void close() {
        this.f7455e.f7420a.set(true);
        this.f7454d.invoke();
    }
}
