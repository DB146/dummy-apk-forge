package k5;

import N6.s0;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class l implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f18927a;

    public l(q qVar) {
        this.f18927a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z8) {
        q qVar = this.f18927a;
        s0 s0Var = q.j;
        qVar.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z8) {
        q qVar = this.f18927a;
        s0 s0Var = q.j;
        qVar.f();
    }
}
