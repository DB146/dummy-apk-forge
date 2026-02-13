package za;

import Db.q;
import android.view.View;
import cc.E;
import cc.F;
import com.kt.apps.core.utils.AnimationUtilsKt;
import com.kt.apps.media.xemtv.ui.main.MainActivity;
import v2.C2132d;

/* loaded from: classes2.dex */
public final class i extends Jb.i implements Rb.e {

    /* renamed from: a, reason: collision with root package name */
    public int f28359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f28360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(MainActivity mainActivity, Hb.d dVar) {
        super(2, dVar);
        this.f28360b = mainActivity;
    }

    @Override // Jb.a
    public final Hb.d create(Object obj, Hb.d dVar) {
        return new i(this.f28360b, dVar);
    }

    @Override // Rb.e
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (Hb.d) obj2)).invokeSuspend(q.f3365a);
    }

    @Override // Jb.a
    public final Object invokeSuspend(Object obj) {
        Ib.a aVar = Ib.a.f5345a;
        int i7 = this.f28359a;
        if (i7 == 0) {
            com.bumptech.glide.c.c0(obj);
            this.f28359a = 1;
            if (F.l(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.c.c0(obj);
        }
        MainActivity mainActivity = this.f28360b;
        View view = mainActivity.f16203c0;
        if (view != null) {
            AnimationUtilsKt.fadeOut$default(view, false, new C2132d(mainActivity, 7), 1, null);
        }
        return q.f3365a;
    }
}
