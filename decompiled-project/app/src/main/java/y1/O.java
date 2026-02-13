package y1;

import Eb.C0252c;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class O extends Jb.h implements Rb.e {

    /* renamed from: b, reason: collision with root package name */
    public int f26651b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26652c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f26653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(View view, Hb.d dVar) {
        super(dVar);
        this.f26653d = view;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        O o10 = new O(this.f26653d, dVar);
        o10.f26652c = obj;
        return o10;
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((Zb.h) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = Ib.a.f5345a;
        int i7 = this.f26651b;
        View view = this.f26653d;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            Zb.h hVar = (Zb.h) this.f26652c;
            this.f26652c = hVar;
            this.f26651b = 1;
            hVar.c(this, view);
            return obj3;
        }
        Object obj4 = Db.q.f3365a;
        if (i7 == 1) {
            Zb.h hVar2 = (Zb.h) this.f26652c;
            com.bumptech.glide.c.c0(obj);
            if (view instanceof ViewGroup) {
                this.f26652c = null;
                this.f26651b = 2;
                hVar2.getClass();
                Zb.k kVar = new Zb.k(new C0252c((ViewGroup) view, 4));
                if (kVar.f12356b.hasNext()) {
                    hVar2.f12350c = kVar;
                    hVar2.f12348a = 2;
                    hVar2.f12351d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return obj4;
    }
}
