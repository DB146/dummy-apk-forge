package D2;

import Db.q;
import E2.f;
import Jb.i;
import Rb.e;
import android.net.Uri;
import android.view.InputEvent;
import cc.E;

/* loaded from: classes.dex */
public final class b extends i implements e {

    /* renamed from: a, reason: collision with root package name */
    public int f3156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f3158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InputEvent f3159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Uri uri, InputEvent inputEvent, Hb.d dVar2) {
        super(2, dVar2);
        this.f3157b = dVar;
        this.f3158c = uri;
        this.f3159d = inputEvent;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new b(this.f3157b, this.f3158c, this.f3159d, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f3156a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            f fVar = this.f3157b.f3163a;
            this.f3156a = 1;
            if (fVar.f(this.f3158c, this.f3159d, this) == aVar) {
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
