package D2;

import Db.q;
import E2.f;
import Jb.i;
import Rb.e;
import android.net.Uri;
import cc.E;

/* loaded from: classes.dex */
public final class c extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f3160a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3161b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f3162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Uri uri, Hb.d dVar2) {
        super(2, dVar2);
        this.f3161b = dVar;
        this.f3162c = uri;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new c(this.f3161b, this.f3162c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3160a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            f fVar = this.f3161b.f3163a;
            this.f3160a = 1;
            if (fVar.i(this.f3162c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        return q.f3365a;
    }
}
