package w2;

import Q.C0479a0;
import Q.W;
import cc.E;
import java.util.List;
import v2.C2133e;
import x.O;

/* loaded from: classes.dex */
public final class y extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f25745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f25746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f25747c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0479a0 f25748d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(O o10, W w10, C0479a0 c0479a0, Hb.d dVar) {
        super(2, dVar);
        this.f25746b = o10;
        this.f25747c = w10;
        this.f25748d = c0479a0;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new y(this.f25746b, this.f25747c, this.f25748d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f25745a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            C2133e c2133e = (C2133e) ((List) this.f25747c.getValue()).get(((List) r4.getValue()).size() - 2);
            float e2 = this.f25748d.e();
            this.f25745a = 1;
            if (this.f25746b.R(e2, c2133e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
