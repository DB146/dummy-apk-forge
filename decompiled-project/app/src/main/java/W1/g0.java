package W1;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10479c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f10481e;

    public g0(i0 i0Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f10481e = i0Var;
        this.f10477a = obj;
        this.f10478b = arrayList;
        this.f10479c = obj2;
        this.f10480d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        i0 i0Var = this.f10481e;
        Object obj = this.f10477a;
        if (obj != null) {
            i0Var.A(obj, this.f10478b, null);
        }
        Object obj2 = this.f10479c;
        if (obj2 != null) {
            i0Var.A(obj2, this.f10480d, null);
        }
    }
}
