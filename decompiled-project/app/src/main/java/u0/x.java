package u0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import cc.E;

/* loaded from: classes.dex */
public final class x extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f24809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f24810b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Hb.d dVar) {
        super(2, dVar);
        this.f24810b = yVar;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new x(this.f24810b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f24809a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            y yVar = this.f24810b;
            yVar.getClass();
            PointerInputEventHandler pointerInputEventHandler = yVar.f24813E;
            this.f24809a = 2;
            if (pointerInputEventHandler.invoke(yVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1 && i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return Db.q.f3365a;
    }
}
