package G;

import A0.K;
import A0.n0;
import Db.q;
import F.C0267k;
import Jb.i;
import Xb.g;
import cc.C0944m;
import cc.E;
import h3.H;
import java.util.concurrent.CancellationException;
import y.C2279A;
import z.C2555g;
import z.C2561j;

/* loaded from: classes.dex */
public final class b extends i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f4224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4225b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f4226c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ K f4227d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, n0 n0Var, K k, Hb.d dVar) {
        super(2, dVar);
        this.f4225b = eVar;
        this.f4226c = n0Var;
        this.f4227d = k;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new b(this.f4225b, this.f4226c, this.f4227d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00ce, code lost:
    
        if (r14 == Ib.a.f5345a) goto L40;
     */
    @Override // Jb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f4224a;
        q qVar = q.f3365a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            e eVar = this.f4225b;
            C2561j c2561j = eVar.f4236C;
            a aVar2 = new a(eVar, this.f4226c, this.f4227d);
            this.f4224a = 1;
            c2561j.getClass();
            i0.c cVar = (i0.c) aVar2.invoke();
            if (cVar != null && !c2561j.r0(cVar, c2561j.f28011J)) {
                C0944m c0944m = new C0944m(1, com.bumptech.glide.c.F(this));
                c0944m.s();
                C2555g c2555g = new C2555g(aVar2, c0944m);
                C0267k c0267k = c2561j.f28007F;
                c0267k.getClass();
                i0.c cVar2 = (i0.c) aVar2.invoke();
                if (cVar2 == null) {
                    c0944m.resumeWith(qVar);
                } else {
                    c0944m.u(new C2279A(1, c0267k, c2555g));
                    S.e eVar2 = c0267k.f3980a;
                    g I6 = H.I(0, eVar2.f8961c);
                    int i10 = I6.f11025a;
                    int i11 = I6.f11026b;
                    if (i10 <= i11) {
                        while (true) {
                            i0.c cVar3 = (i0.c) ((C2555g) eVar2.f8959a[i11]).f27979a.invoke();
                            if (cVar3 != null) {
                                i0.c c10 = cVar2.c(cVar3);
                                if (c10.equals(cVar2)) {
                                    eVar2.a(i11 + 1, c2555g);
                                    break;
                                }
                                if (!c10.equals(cVar3)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i12 = eVar2.f8961c - 1;
                                    if (i12 <= i11) {
                                        while (true) {
                                            ((C2555g) eVar2.f8959a[i11]).f27980b.d(cancellationException);
                                            if (i12 == i11) {
                                                break;
                                            }
                                            i12++;
                                        }
                                    }
                                }
                            }
                            if (i11 == i10) {
                                break;
                            }
                            i11--;
                        }
                    }
                    eVar2.a(0, c2555g);
                    if (!c2561j.f28012K) {
                        c2561j.s0();
                    }
                }
                obj2 = c0944m.r();
            }
            obj2 = qVar;
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return qVar;
    }
}
