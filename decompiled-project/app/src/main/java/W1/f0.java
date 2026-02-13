package W1;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f10472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10473b;

    public f0(View view, ArrayList arrayList) {
        this.f10472a = view;
        this.f10473b = arrayList;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f10472a.setVisibility(8);
        ArrayList arrayList = this.f10473b;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((View) arrayList.get(i7)).setVisibility(0);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
