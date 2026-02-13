package Q;

import B0.C0165a;
import a0.AbstractC0688o;
import a0.C0674a;
import cc.InterfaceC0937i0;
import java.util.List;

/* renamed from: Q.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512r0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public Q9.a f8492a;

    /* renamed from: b, reason: collision with root package name */
    public int f8493b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f8494c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f8495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0516t0 f8496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T f8497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512r0(C0518u0 c0518u0, C0516t0 c0516t0, T t5, Hb.d dVar) {
        super(2, dVar);
        this.f8495d = c0518u0;
        this.f8496e = c0516t0;
        this.f8497f = t5;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C0512r0 c0512r0 = new C0512r0(this.f8495d, this.f8496e, this.f8497f, dVar);
        c0512r0.f8494c = obj;
        return c0512r0;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0512r0) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Collection, java.lang.Object] */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fc.b0 b0Var;
        T.b bVar;
        W.b bVar2;
        InterfaceC0937i0 interfaceC0937i0;
        Throwable th;
        Q9.a aVar;
        List x2;
        C0518u0 c0518u0;
        Ib.a aVar2 = Ib.a.f5345a;
        int i7 = this.f8493b;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            InterfaceC0937i0 r10 = cc.F.r(((cc.E) this.f8494c).l());
            C0518u0 c0518u02 = this.f8495d;
            synchronized (c0518u02.f8543b) {
                Throwable th2 = c0518u02.f8545d;
                if (th2 != null) {
                    throw th2;
                }
                if (((EnumC0507o0) c0518u02.f8558t.getValue()).compareTo(EnumC0507o0.f8475b) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (c0518u02.f8544c != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                c0518u02.f8544c = r10;
                c0518u02.u();
            }
            C0165a c0165a = new C0165a(this.f8495d, 2);
            Q7.h hVar = AbstractC0688o.f12404a;
            AbstractC0688o.f(C0674a.f12366c);
            synchronized (AbstractC0688o.f12405b) {
                AbstractC0688o.g = Eb.o.h0(AbstractC0688o.g, c0165a);
            }
            Q9.a aVar3 = new Q9.a(c0165a);
            fc.b0 b0Var2 = C0518u0.f8540x;
            S s3 = this.f8495d.f8561w;
            try {
                do {
                    b0Var = C0518u0.f8540x;
                    bVar = (T.b) b0Var.getValue();
                    bVar2 = (W.b) bVar;
                    V.c cVar = bVar2.f10246c;
                    if (!cVar.containsKey(s3)) {
                        boolean isEmpty = bVar2.isEmpty();
                        X.b bVar3 = X.b.f10901a;
                        if (isEmpty) {
                            bVar2 = new W.b(s3, s3, cVar.a(s3, new W.a(bVar3, bVar3)));
                        } else {
                            Object obj2 = bVar2.f10245b;
                            Object obj3 = cVar.get(obj2);
                            kotlin.jvm.internal.l.b(obj3);
                            bVar2 = new W.b(bVar2.f10244a, s3, cVar.a(obj2, new W.a(((W.a) obj3).f10241a, s3)).a(s3, new W.a(obj2, bVar3)));
                        }
                    }
                    if (bVar != bVar2) {
                    }
                    break;
                } while (!b0Var.h(bVar, bVar2));
                break;
                C0518u0 c0518u03 = this.f8495d;
                synchronized (c0518u03.f8543b) {
                    x2 = c0518u03.x();
                }
                int size = x2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((C0517u) x2.get(i10)).r();
                }
                C0511q0 c0511q0 = new C0511q0(this.f8496e, this.f8497f, null);
                this.f8494c = r10;
                this.f8492a = aVar3;
                this.f8493b = 1;
                if (cc.F.k(c0511q0, this) == aVar2) {
                    return aVar2;
                }
                interfaceC0937i0 = r10;
                aVar = aVar3;
            } catch (Throwable th3) {
                interfaceC0937i0 = r10;
                th = th3;
                aVar = aVar3;
                aVar.c();
                c0518u0 = this.f8495d;
                synchronized (c0518u0.f8543b) {
                    try {
                        if (c0518u0.f8544c == interfaceC0937i0) {
                            c0518u0.f8544c = null;
                        }
                        c0518u0.u();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                fc.b0 b0Var3 = C0518u0.f8540x;
                S.b(this.f8495d.f8561w);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.f8492a;
            interfaceC0937i0 = (InterfaceC0937i0) this.f8494c;
            try {
                com.bumptech.glide.c.c0(obj);
            } catch (Throwable th5) {
                th = th5;
                aVar.c();
                c0518u0 = this.f8495d;
                synchronized (c0518u0.f8543b) {
                }
            }
        }
        aVar.c();
        C0518u0 c0518u04 = this.f8495d;
        synchronized (c0518u04.f8543b) {
            try {
                if (c0518u04.f8544c == interfaceC0937i0) {
                    c0518u04.f8544c = null;
                }
                c0518u04.u();
            } catch (Throwable th6) {
                throw th6;
            }
        }
        fc.b0 b0Var4 = C0518u0.f8540x;
        S.b(this.f8495d.f8561w);
        return Db.q.f3365a;
    }
}
