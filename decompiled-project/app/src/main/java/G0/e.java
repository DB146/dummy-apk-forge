package G0;

import Db.q;
import i0.C1289b;

/* loaded from: classes.dex */
public final class e extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f4258a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ float f4259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f4260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, Hb.d dVar) {
        super(2, dVar);
        this.f4260c = fVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        e eVar = new e(this.f4260c, dVar);
        eVar.f4259b = ((Number) obj).floatValue();
        return eVar;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create(Float.valueOf(((Number) obj).floatValue()), (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f4258a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            float f4 = this.f4259b;
            f fVar = this.f4260c;
            Object g = fVar.f4261a.f4505d.f4494a.g(H0.h.f4475e);
            if (g == null) {
                g = null;
            }
            Rb.e eVar = (Rb.e) g;
            if (eVar == null) {
                throw X.c.c("Required value was null.");
            }
            C1289b c1289b = new C1289b((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            this.f4258a = 1;
            obj = eVar.invoke(c1289b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return new Float(Float.intBitsToFloat((int) (((C1289b) obj).f18172a & 4294967295L)));
    }
}
