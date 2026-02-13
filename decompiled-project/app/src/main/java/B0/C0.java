package B0;

import a0.AbstractC0688o;
import ec.C1116a;
import java.util.concurrent.CancellationException;
import u.C2047J;

/* loaded from: classes.dex */
public final class C0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public ec.t f1571a;

    /* renamed from: b, reason: collision with root package name */
    public C1116a f1572b;

    /* renamed from: c, reason: collision with root package name */
    public int f1573c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec.d f1574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(ec.d dVar, Hb.d dVar2) {
        super(2, dVar2);
        this.f1574d = dVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new C0(this.f1574d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x005b, B:19:0x0027, B:23:0x005e, B:26:0x0062, B:27:0x0063, B:34:0x0021, B:12:0x004b, B:14:0x0051), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ec.t] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ec.d dVar;
        C1116a c1116a;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f1573c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                dVar = this.f1574d;
                c1116a = new C1116a(dVar);
                this.f1571a = dVar;
                this.f1572b = c1116a;
                this.f1573c = 1;
                obj = c1116a.b(this);
                dVar = dVar;
                if (obj == aVar) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1116a = this.f1572b;
                ?? r42 = this.f1571a;
                com.bumptech.glide.c.c0(obj);
                dVar = r42;
                if (((Boolean) obj).booleanValue()) {
                    boolean z8 = false;
                    D0.f1653b.set(false);
                    synchronized (AbstractC0688o.f12405b) {
                        C2047J c2047j = AbstractC0688o.f12411i.f12376h;
                        if (c2047j != null && c2047j.h()) {
                            z8 = true;
                        }
                    }
                    if (z8) {
                        AbstractC0688o.a();
                    }
                    this.f1571a = dVar;
                    this.f1572b = c1116a;
                    this.f1573c = 1;
                    obj = c1116a.b(this);
                    dVar = dVar;
                    if (obj == aVar) {
                        return aVar;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        dVar.cancel(null);
                        return Db.q.f3365a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th);
                }
                dVar.cancel(cancellationException);
                throw th2;
            }
        }
    }
}
