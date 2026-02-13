package z;

import B0.C0166a0;
import x.AbstractC2232b;

/* renamed from: z.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2554f0 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f27974a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f27975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f27976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f27977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f27978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2554f0(w0 w0Var, long j, kotlin.jvm.internal.s sVar, Hb.d dVar) {
        super(2, dVar);
        this.f27976c = w0Var;
        this.f27977d = j;
        this.f27978e = sVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        C2554f0 c2554f0 = new C2554f0(this.f27976c, this.f27977d, this.f27978e, dVar);
        c2554f0.f27975b = obj;
        return c2554f0;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2554f0) create((t0) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f27974a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            t0 t0Var = (t0) this.f27975b;
            w0 w0Var = this.f27976c;
            float f4 = w0Var.f(this.f27977d);
            C0166a0 c0166a0 = new C0166a0(this.f27978e, w0Var, t0Var, 4);
            this.f27974a = 1;
            if (AbstractC2232b.c(0.0f, f4, null, c0166a0, this, 12) == aVar) {
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
