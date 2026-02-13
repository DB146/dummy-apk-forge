package h6;

import android.view.View;
import i1.f;
import i2.C1313a;
import i2.C1322j;
import i2.C1324l;

/* renamed from: h6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1254a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17824a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17825b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1254a(Object obj, int i7) {
        this.f17824a = i7;
        this.f17825b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f17824a) {
            case 0:
                throw null;
            case 1:
                C1313a c1313a = (C1313a) this.f17825b;
                if (c1313a.f18240D != null) {
                    return;
                }
                c1313a.f18240D = new f(c1313a, 1);
                ((View) c1313a.f3094a).getViewTreeObserver().addOnPreDrawListener(c1313a.f18240D);
                return;
            case 2:
                ((C1324l) this.f17825b).getClass();
                throw null;
            default:
                ((C1322j) this.f17825b).d();
                return;
        }
    }
}
