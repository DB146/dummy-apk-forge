package B0;

import Q.C0518u0;
import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes.dex */
public final class l1 extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f1928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0518u0 f1929b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1930c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(C0518u0 c0518u0, View view, Hb.d dVar) {
        super(2, dVar);
        this.f1929b = c0518u0;
        this.f1930c = view;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new l1(this.f1929b, this.f1930c, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((cc.E) obj, (Hb.d) obj2)).invokeSuspend(Db.q.f3365a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Jb.i, Rb.e] */
    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f1928a;
        Db.q qVar = Db.q.f3365a;
        C0518u0 c0518u0 = this.f1929b;
        View view = this.f1930c;
        try {
            if (i7 == 0) {
                com.bumptech.glide.c.c0(obj);
                this.f1928a = 1;
                Object k = fc.Q.k(c0518u0.f8558t, new Jb.i(2, null), this);
                if (k != aVar) {
                    k = qVar;
                }
                if (k == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.c.c0(obj);
            }
            if (u1.b(view) == c0518u0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return qVar;
        } finally {
            if (u1.b(view) == c0518u0) {
                view.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
        }
    }
}
