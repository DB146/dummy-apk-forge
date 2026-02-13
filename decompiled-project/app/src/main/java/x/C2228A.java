package x;

import cc.InterfaceC0937i0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import mc.InterfaceC1656a;

/* renamed from: x.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2228A extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC1656a f25896a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25897b;

    /* renamed from: c, reason: collision with root package name */
    public C2229B f25898c;

    /* renamed from: d, reason: collision with root package name */
    public int f25899d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f25900e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C2229B f25901f;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Jb.i f25902u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2228A(C2229B c2229b, Rb.c cVar, Hb.d dVar) {
        super(2, dVar);
        EnumC2254y enumC2254y = EnumC2254y.f26162a;
        this.f25901f = c2229b;
        this.f25902u = (Jb.i) cVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Jb.i, Rb.c] */
    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        ?? r12 = this.f25902u;
        EnumC2254y enumC2254y = EnumC2254y.f26162a;
        C2228A c2228a = new C2228A(this.f25901f, r12, dVar);
        c2228a.f25900e = obj;
        return c2228a;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2228A) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [mc.a, java.lang.Object, Ib.a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [Rb.c] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        C2255z c2255z;
        C2229B c2229b;
        InterfaceC1656a interfaceC1656a;
        ?? r32;
        C2229B c2229b2;
        Throwable th;
        InterfaceC1656a interfaceC1656a2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        ?? r12 = Ib.a.f5345a;
        int i7 = this.f25899d;
        try {
            try {
                if (i7 == 0) {
                    com.bumptech.glide.c.c0(obj);
                    Hb.g gVar = ((cc.E) this.f25900e).l().get(cc.B.f14467b);
                    kotlin.jvm.internal.l.b(gVar);
                    EnumC2254y enumC2254y = EnumC2254y.f26162a;
                    c2255z = new C2255z((InterfaceC0937i0) gVar);
                    while (true) {
                        c2229b = this.f25901f;
                        AtomicReference atomicReference3 = c2229b.f25903a;
                        C2255z c2255z2 = (C2255z) atomicReference3.get();
                        if (c2255z2 != null) {
                            EnumC2254y enumC2254y2 = EnumC2254y.f26162a;
                            if (enumC2254y2.compareTo(enumC2254y2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(c2255z2, c2255z)) {
                            if (atomicReference3.get() != c2255z2) {
                                break;
                            }
                        }
                        if (c2255z2 != null) {
                            c2255z2.f26164a.cancel(new c0.n("Mutation interrupted", 2));
                        }
                        this.f25900e = c2255z;
                        interfaceC1656a = c2229b.f25904b;
                        this.f25896a = interfaceC1656a;
                        Jb.i iVar = this.f25902u;
                        this.f25897b = iVar;
                        this.f25898c = c2229b;
                        this.f25899d = 1;
                        if (interfaceC1656a.n(this) == r12) {
                            return r12;
                        }
                        r32 = iVar;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c2229b2 = (C2229B) this.f25897b;
                        interfaceC1656a2 = this.f25896a;
                        c2255z = (C2255z) this.f25900e;
                        try {
                            com.bumptech.glide.c.c0(obj);
                            atomicReference2 = c2229b2.f25903a;
                            while (!atomicReference2.compareAndSet(c2255z, null) && atomicReference2.get() == c2255z) {
                            }
                            interfaceC1656a2.l(null);
                            return obj;
                        } catch (Throwable th2) {
                            th = th2;
                            atomicReference = c2229b2.f25903a;
                            while (!atomicReference.compareAndSet(c2255z, null)) {
                            }
                            throw th;
                        }
                    }
                    C2229B c2229b3 = this.f25898c;
                    Rb.c cVar = (Rb.c) this.f25897b;
                    interfaceC1656a = this.f25896a;
                    C2255z c2255z3 = (C2255z) this.f25900e;
                    com.bumptech.glide.c.c0(obj);
                    c2229b = c2229b3;
                    c2255z = c2255z3;
                    r32 = cVar;
                }
                this.f25900e = c2255z;
                this.f25896a = interfaceC1656a;
                this.f25897b = c2229b;
                this.f25898c = null;
                this.f25899d = 2;
                Object invoke = r32.invoke(this);
                if (invoke == r12) {
                    return r12;
                }
                interfaceC1656a2 = interfaceC1656a;
                c2229b2 = c2229b;
                obj = invoke;
                atomicReference2 = c2229b2.f25903a;
                while (!atomicReference2.compareAndSet(c2255z, null)) {
                }
                interfaceC1656a2.l(null);
                return obj;
            } catch (Throwable th3) {
                c2229b2 = c2229b;
                th = th3;
                atomicReference = c2229b2.f25903a;
                while (!atomicReference.compareAndSet(c2255z, null) && atomicReference.get() == c2255z) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            r12.l(null);
            throw th4;
        }
    }
}
