package w2;

import Q.C0479a0;
import Q.W;
import fc.C1159f;
import fc.InterfaceC1161h;
import java.util.List;
import java.util.concurrent.CancellationException;
import v2.C2133e;

/* loaded from: classes.dex */
public final class x extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25739a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25740b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f25741c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ W f25742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0479a0 f25743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ W f25744f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i iVar, W w10, C0479a0 c0479a0, W w11, Hb.d dVar) {
        super(2, dVar);
        this.f25741c = iVar;
        this.f25742d = w10;
        this.f25743e = c0479a0;
        this.f25744f = w11;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        x xVar = new x(this.f25741c, this.f25742d, this.f25743e, this.f25744f, dVar);
        xVar.f25740b = obj;
        return xVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((InterfaceC1161h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        C2133e c2133e;
        C2133e c2133e2;
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25739a;
        i iVar = this.f25741c;
        W w10 = this.f25742d;
        W w11 = this.f25744f;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                InterfaceC1161h interfaceC1161h = (InterfaceC1161h) this.f25740b;
                int size = ((List) w10.getValue()).size();
                C0479a0 c0479a0 = this.f25743e;
                if (size > 1) {
                    c0479a0.f(0.0f);
                    c2133e = (C2133e) Eb.o.f0((List) w10.getValue());
                    kotlin.jvm.internal.l.b(c2133e);
                    iVar.g(c2133e);
                    iVar.g((C2133e) ((List) w10.getValue()).get(((List) w10.getValue()).size() - 2));
                } else {
                    c2133e = null;
                }
                C1159f c1159f = new C1159f(w10, w11, c0479a0, 4);
                this.f25740b = c2133e;
                this.f25739a = 1;
                if (interfaceC1161h.a(c1159f, this) == aVar) {
                    return aVar;
                }
                c2133e2 = c2133e;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2133e2 = (C2133e) this.f25740b;
                com.bumptech.glide.c.c0(obj);
            }
            if (((List) w10.getValue()).size() > 1) {
                w11.setValue(Boolean.FALSE);
                kotlin.jvm.internal.l.b(c2133e2);
                iVar.e(c2133e2, false);
            }
        } catch (CancellationException unused) {
            if (((List) w10.getValue()).size() > 1) {
                w11.setValue(Boolean.FALSE);
            }
        }
        return Db.q.f3365a;
    }
}
