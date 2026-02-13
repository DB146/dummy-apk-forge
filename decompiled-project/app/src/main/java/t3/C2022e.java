package t3;

import Db.q;
import cc.D0;
import cc.E;
import cc.F;
import h3.x;
import h3.y;
import h3.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import q3.p;

/* renamed from: t3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2022e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public R6.a f24452a;

    /* renamed from: b, reason: collision with root package name */
    public D0 f24453b;

    /* renamed from: c, reason: collision with root package name */
    public int f24454c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f24456e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ O3.c f24457f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p f24458u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2022e(y yVar, O3.c cVar, p pVar, Hb.d dVar) {
        super(2, dVar);
        this.f24456e = yVar;
        this.f24457f = cVar;
        this.f24458u = pVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2022e c2022e = new C2022e(this.f24456e, this.f24457f, this.f24458u, dVar);
        c2022e.f24455d = obj;
        return c2022e;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2022e) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [cc.i0] */
    /* JADX WARN: Type inference failed for: r2v5, types: [cc.i0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v8, types: [R6.a] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a1.l lVar;
        boolean z8;
        a1.l lVar2;
        AtomicInteger atomicInteger;
        Object c10;
        Ib.a aVar = Ib.a.f5345a;
        ?? r22 = this.f24454c;
        y yVar = this.f24456e;
        try {
            try {
                if (r22 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    E e2 = (E) this.f24455d;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    a1.l b2 = yVar.b();
                    lVar = b2;
                    D0 B10 = F.B(e2, null, 0, new C2021d(this.f24457f, this.f24458u, atomicInteger2, b2, null), 3);
                    try {
                        this.f24455d = atomicInteger2;
                        this.f24452a = lVar;
                        this.f24453b = B10;
                        z8 = true;
                    } catch (CancellationException e10) {
                        e = e10;
                        z8 = true;
                    }
                    try {
                        this.f24454c = 1;
                        c10 = Y6.b.c(lVar, this);
                        if (c10 == aVar) {
                            return aVar;
                        }
                        atomicInteger = atomicInteger2;
                        r22 = B10;
                    } catch (CancellationException e11) {
                        e = e11;
                        lVar2 = lVar;
                        atomicInteger = atomicInteger2;
                        String str = k.f24475a;
                        z.e().b(str, "Delegated worker " + yVar.getClass() + " was cancelled", e);
                        if (atomicInteger.get() != -256) {
                        }
                        if (lVar2.isCancelled()) {
                        }
                        throw e;
                    }
                } else {
                    if (r22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    D0 d02 = this.f24453b;
                    ?? r92 = this.f24452a;
                    atomicInteger = (AtomicInteger) this.f24455d;
                    try {
                        com.bumptech.glide.c.c0(obj);
                        z8 = true;
                        lVar = r92;
                        c10 = obj;
                        r22 = d02;
                    } catch (CancellationException e12) {
                        e = e12;
                        z8 = true;
                        lVar2 = r92;
                        String str2 = k.f24475a;
                        z.e().b(str2, "Delegated worker " + yVar.getClass() + " was cancelled", e);
                        if (atomicInteger.get() != -256) {
                        }
                        if (lVar2.isCancelled()) {
                        }
                        throw e;
                    }
                }
                try {
                    x xVar = (x) c10;
                    r22.cancel(null);
                    return xVar;
                } catch (CancellationException e13) {
                    e = e13;
                    lVar2 = lVar;
                    String str22 = k.f24475a;
                    z.e().b(str22, "Delegated worker " + yVar.getClass() + " was cancelled", e);
                    boolean z10 = atomicInteger.get() != -256 ? z8 : false;
                    if (lVar2.isCancelled() || !z10) {
                        throw e;
                    }
                    throw new C2018a(atomicInteger.get());
                }
            } catch (Throwable th) {
                String str3 = k.f24475a;
                z.e().b(str3, "Delegated worker " + yVar.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r22.cancel(null);
            throw th2;
        }
    }
}
