package y;

import cc.InterfaceC0937i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import mc.C1659d;
import mc.InterfaceC1656a;
import z.C2566m;
import z.C2568o;

/* loaded from: classes.dex */
public final class P extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1656a f26421a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26422b;

    /* renamed from: c, reason: collision with root package name */
    public C2568o f26423c;

    /* renamed from: d, reason: collision with root package name */
    public Q f26424d;

    /* renamed from: e, reason: collision with root package name */
    public int f26425e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f26426f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ EnumC2292N f26427u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Q f26428v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C2566m f26429w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C2568o f26430x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(EnumC2292N enumC2292N, Q q10, C2566m c2566m, C2568o c2568o, Hb.d dVar) {
        super(2, dVar);
        this.f26427u = enumC2292N;
        this.f26428v = q10;
        this.f26429w = c2566m;
        this.f26430x = c2568o;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        P p10 = new P(this.f26427u, this.f26428v, this.f26429w, this.f26430x, dVar);
        p10.f26426f = obj;
        return p10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((P) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, mc.a] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Q q10;
        C2568o c2568o;
        O o10;
        InterfaceC1656a interfaceC1656a;
        Rb.e eVar;
        O o11;
        Q q11;
        Throwable th;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        Ib.a aVar = Ib.a.f5345a;
        ?? r12 = this.f26425e;
        try {
            try {
                if (r12 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    Hb.g gVar = ((cc.E) this.f26426f).l().get(cc.B.f14467b);
                    kotlin.jvm.internal.l.b(gVar);
                    O o12 = new O(this.f26427u, (InterfaceC0937i0) gVar);
                    while (true) {
                        q10 = this.f26428v;
                        AtomicReference atomicReference3 = q10.f26431a;
                        O o13 = (O) atomicReference3.get();
                        if (o13 != null && o12.f26419a.compareTo(o13.f26419a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(o13, o12)) {
                            if (atomicReference3.get() != o13) {
                                break;
                            }
                        }
                        if (o13 != null) {
                            o13.f26420b.cancel(new c0.n("Mutation interrupted", 3));
                        }
                        this.f26426f = o12;
                        C1659d c1659d = q10.f26432b;
                        this.f26421a = c1659d;
                        C2566m c2566m = this.f26429w;
                        this.f26422b = c2566m;
                        C2568o c2568o2 = this.f26430x;
                        this.f26423c = c2568o2;
                        this.f26424d = q10;
                        this.f26425e = 1;
                        if (c1659d.n(this) == aVar) {
                            return aVar;
                        }
                        c2568o = c2568o2;
                        o10 = o12;
                        interfaceC1656a = c1659d;
                        eVar = c2566m;
                    }
                } else {
                    if (r12 != 1) {
                        if (r12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        q11 = (Q) this.f26422b;
                        interfaceC1656a = this.f26421a;
                        o11 = (O) this.f26426f;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            atomicReference2 = q11.f26431a;
                            while (!atomicReference2.compareAndSet(o11, null) && atomicReference2.get() == o11) {
                            }
                            interfaceC1656a.l(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = q11.f26431a;
                            while (!atomicReference.compareAndSet(o11, null)) {
                            }
                            throw th;
                        }
                    }
                    Q q12 = this.f26424d;
                    c2568o = this.f26423c;
                    eVar = (Rb.e) this.f26422b;
                    InterfaceC1656a interfaceC1656a2 = this.f26421a;
                    o10 = (O) this.f26426f;
                    com.bumptech.glide.c.c0(obj);
                    q10 = q12;
                    interfaceC1656a = interfaceC1656a2;
                }
                this.f26426f = o10;
                this.f26421a = interfaceC1656a;
                this.f26422b = q10;
                this.f26423c = null;
                this.f26424d = null;
                this.f26425e = 2;
                Object invoke = eVar.invoke(c2568o, this);
                if (invoke == aVar) {
                    return aVar;
                }
                q11 = q10;
                obj = invoke;
                o11 = o10;
                atomicReference2 = q11.f26431a;
                while (!atomicReference2.compareAndSet(o11, null)) {
                }
                interfaceC1656a.l(null);
                return obj;
            } catch (Throwable th3) {
                o11 = o10;
                q11 = q10;
                th = th3;
                atomicReference = q11.f26431a;
                while (!atomicReference.compareAndSet(o11, null) && atomicReference.get() == o11) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r12.l(null);
            throw th4;
        }
    }
}
