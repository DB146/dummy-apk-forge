package K2;

import a.AbstractC0672a;
import bc.C0849a;
import bc.EnumC0851c;
import cc.C0944m;
import cc.F;
import cc.H0;
import h3.H;
import java.util.concurrent.locks.ReentrantLock;
import u.C2054g;
import y7.u0;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f6066a;

    /* renamed from: b, reason: collision with root package name */
    public final Rb.a f6067b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f6068c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public int f6069d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6070e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f6071f;
    public final mc.h g;

    /* renamed from: h, reason: collision with root package name */
    public final C2054g f6072h;

    public p(int i7, Rb.a aVar) {
        this.f6066a = i7;
        this.f6067b = aVar;
        this.f6071f = new i[i7];
        int i10 = mc.i.f20852a;
        this.g = new mc.h(i7, 0);
        this.f6072h = new C2054g(i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0064, code lost:
    
        r0.b(r5, r8.f20851b);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x008a, B:17:0x008f, B:19:0x0095, B:22:0x009c, B:23:0x00b6, B:25:0x00bc, B:29:0x00d2, B:30:0x00d7, B:31:0x00d8, B:32:0x00df), top: B:14:0x008a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:15:0x008a, B:17:0x008f, B:19:0x0095, B:22:0x009c, B:23:0x00b6, B:25:0x00bc, B:29:0x00d2, B:30:0x00d7, B:31:0x00d8, B:32:0x00df), top: B:14:0x008a, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Jb.c cVar) {
        m mVar;
        int i7;
        int andDecrement;
        int i10;
        p pVar;
        ReentrantLock reentrantLock;
        try {
            try {
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i11 = mVar.f6054d;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        mVar.f6054d = i11 - Integer.MIN_VALUE;
                        Object obj = mVar.f6052b;
                        Object obj2 = Ib.a.f5345a;
                        i7 = mVar.f6054d;
                        if (i7 != 0) {
                            com.bumptech.glide.c.c0(obj);
                            mc.h hVar = this.g;
                            mVar.f6051a = this;
                            mVar.f6054d = 1;
                            hVar.getClass();
                            do {
                                andDecrement = mc.h.f20849u.getAndDecrement(hVar);
                                i10 = hVar.f20850a;
                            } while (andDecrement > i10);
                            Object obj3 = Db.q.f3365a;
                            if (andDecrement <= 0) {
                                C0944m s3 = F.s(com.bumptech.glide.c.F(mVar));
                                try {
                                    if (!hVar.a(s3)) {
                                        while (true) {
                                            int andDecrement2 = mc.h.f20849u.getAndDecrement(hVar);
                                            if (andDecrement2 <= i10) {
                                                if (andDecrement2 > 0) {
                                                    break;
                                                }
                                                if (hVar.a(s3)) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    Object r10 = s3.r();
                                    Object obj4 = r10;
                                    if (r10 != obj2) {
                                        obj4 = obj3;
                                    }
                                    if (obj4 == obj2) {
                                        obj3 = obj4;
                                    }
                                } catch (Throwable th) {
                                    s3.z();
                                    throw th;
                                }
                            }
                            if (obj3 == obj2) {
                                return obj2;
                            }
                            pVar = this;
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pVar = mVar.f6051a;
                            com.bumptech.glide.c.c0(obj);
                        }
                        reentrantLock = pVar.f6068c;
                        C2054g c2054g = pVar.f6072h;
                        reentrantLock.lock();
                        if (!pVar.f6070e) {
                            AbstractC0672a.s(21, "Connection pool is closed");
                            throw null;
                        }
                        if (c2054g.f24673a == c2054g.f24674b && pVar.f6069d < pVar.f6066a) {
                            i iVar = new i((T2.a) pVar.f6067b.invoke());
                            int i12 = pVar.f6069d;
                            pVar.f6069d = i12 + 1;
                            pVar.f6071f[i12] = iVar;
                            c2054g.b(iVar);
                        }
                        int i13 = c2054g.f24673a;
                        if (i13 == c2054g.f24674b) {
                            throw new ArrayIndexOutOfBoundsException();
                        }
                        Object[] objArr = c2054g.f24676d;
                        Object obj5 = objArr[i13];
                        objArr[i13] = null;
                        c2054g.f24673a = (i13 + 1) & c2054g.f24675c;
                        return (i) obj5;
                    }
                }
                if (!pVar.f6070e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = pVar.f6068c;
            C2054g c2054g2 = pVar.f6072h;
            reentrantLock.lock();
        } catch (Throwable th2) {
            pVar.g.b();
            throw th2;
        }
        mVar = new m(this, cVar);
        Object obj6 = mVar.f6052b;
        Object obj22 = Ib.a.f5345a;
        i7 = mVar.f6054d;
        if (i7 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|10|11|12|13|14|(1:(1:42)(2:39|(1:41)))(1:16)|17|18|19|20|(3:22|(1:28)(1:26)|27)|29|(1:31)(12:33|12|13|14|(0)(0)|17|18|19|20|(0)|29|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r15 = r15;
        r14 = r14;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:14:0x008d, B:16:0x0091, B:39:0x0099, B:42:0x00a0), top: B:13:0x008d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a A[Catch: all -> 0x0086, TryCatch #2 {all -> 0x0086, blocks: (B:20:0x0043, B:22:0x005a, B:24:0x005e, B:26:0x0064, B:27:0x006d, B:28:0x0067, B:29:0x0073), top: B:19:0x0043 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r15v2, types: [kotlin.jvm.internal.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [Rb.a] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007a -> B:12:0x007c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, d dVar, Jb.c cVar) {
        n nVar;
        int i7;
        p pVar;
        kotlin.jvm.internal.v vVar;
        n nVar2;
        Throwable th;
        o oVar;
        long j10;
        d dVar2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f6061u;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f6061u = i10 - Integer.MIN_VALUE;
                Object obj = nVar.f6059e;
                Ib.a aVar = Ib.a.f5345a;
                i7 = nVar.f6061u;
                if (i7 != 0) {
                    com.bumptech.glide.c.c0(obj);
                    pVar = this;
                    ?? obj2 = new Object();
                    oVar = new o(obj2, pVar, null);
                    nVar.f6055a = pVar;
                    nVar.f6056b = dVar;
                    nVar.f6057c = obj2;
                    nVar.f6058d = j;
                    nVar.f6061u = 1;
                    j10 = 0;
                    if (C0849a.d(j, 0L) > 0) {
                    }
                    if (F.L(j10, oVar, nVar) == aVar) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = nVar.f6058d;
                    kotlin.jvm.internal.v vVar2 = nVar.f6057c;
                    ?? r22 = nVar.f6056b;
                    pVar = nVar.f6055a;
                    try {
                        com.bumptech.glide.c.c0(obj);
                        dVar2 = r22;
                    } catch (Throwable th2) {
                        vVar = vVar2;
                        dVar = r22;
                        nVar2 = nVar;
                        th = th2;
                    }
                    vVar = vVar2;
                    dVar = dVar2;
                    nVar2 = nVar;
                    th = null;
                    try {
                        if (th instanceof H0) {
                            dVar.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj3 = vVar.f19134a;
                            if (obj3 != null) {
                                return obj3;
                            }
                        }
                        nVar = nVar2;
                        ?? obj22 = new Object();
                        oVar = new o(obj22, pVar, null);
                        nVar.f6055a = pVar;
                        nVar.f6056b = dVar;
                        nVar.f6057c = obj22;
                        nVar.f6058d = j;
                        nVar.f6061u = 1;
                        j10 = 0;
                        if (C0849a.d(j, 0L) > 0) {
                            j10 = H.g(((((int) j) & 1) != 1 || C0849a.f(j)) ? C0849a.g(j, EnumC0851c.f13998c) : j >> 1, 1L);
                        }
                        if (F.L(j10, oVar, nVar) == aVar) {
                            return aVar;
                        }
                        dVar2 = dVar;
                        vVar2 = obj22;
                        vVar = vVar2;
                        dVar = dVar2;
                        nVar2 = nVar;
                        th = null;
                        if (th instanceof H0) {
                        }
                        nVar = nVar2;
                        ?? obj222 = new Object();
                        oVar = new o(obj222, pVar, null);
                        nVar.f6055a = pVar;
                        nVar.f6056b = dVar;
                        nVar.f6057c = obj222;
                        nVar.f6058d = j;
                        nVar.f6061u = 1;
                        j10 = 0;
                        if (C0849a.d(j, 0L) > 0) {
                        }
                        if (F.L(j10, oVar, nVar) == aVar) {
                        }
                    } catch (Throwable th3) {
                        i iVar = (i) vVar.f19134a;
                        if (iVar != null) {
                            pVar.e(iVar);
                        }
                        throw th3;
                    }
                }
            }
        }
        nVar = new n(this, cVar);
        Object obj4 = nVar.f6059e;
        Ib.a aVar2 = Ib.a.f5345a;
        i7 = nVar.f6061u;
        if (i7 != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f6068c;
        reentrantLock.lock();
        try {
            this.f6070e = true;
            for (i iVar : this.f6071f) {
                if (iVar != null) {
                    iVar.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb2) {
        C2054g c2054g = this.f6072h;
        ReentrantLock reentrantLock = this.f6068c;
        reentrantLock.lock();
        try {
            Fb.b m10 = u0.m();
            int h10 = c2054g.h();
            for (int i7 = 0; i7 < h10; i7++) {
                m10.add(c2054g.d(i7));
            }
            Fb.b i10 = u0.i(m10);
            sb2.append('\t' + toString() + " (");
            sb2.append("capacity=" + this.f6066a + ", ");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("permits=");
            mc.h hVar = this.g;
            hVar.getClass();
            sb3.append(Math.max(mc.h.f20849u.get(hVar), 0));
            sb3.append(", ");
            sb2.append(sb3.toString());
            sb2.append("queue=(size=" + i10.b() + ")[" + Eb.o.d0(i10, null, null, null, null, 63) + "], ");
            sb2.append(")");
            sb2.append('\n');
            i[] iVarArr = this.f6071f;
            int length = iVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                i iVar = iVarArr[i12];
                i11++;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("\t\t[");
                sb4.append(i11);
                sb4.append("] - ");
                sb4.append(iVar != null ? iVar.f6035a.toString() : null);
                sb2.append(sb4.toString());
                sb2.append('\n');
                if (iVar != null) {
                    iVar.F(sb2);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(i connection) {
        kotlin.jvm.internal.l.e(connection, "connection");
        ReentrantLock reentrantLock = this.f6068c;
        reentrantLock.lock();
        try {
            this.f6072h.b(connection);
            reentrantLock.unlock();
            this.g.b();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
