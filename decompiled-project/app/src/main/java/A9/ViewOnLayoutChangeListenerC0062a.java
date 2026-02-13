package A9;

import android.view.View;

/* renamed from: A9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC0062a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1051a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1052b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0062a(Object obj, int i7) {
        this.f1051a = i7;
        this.f1052b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        switch (this.f1051a) {
            case 0:
                C0070c c0070c = (C0070c) this.f1052b;
                if (c0070c.f1084p != null) {
                    return;
                }
                c0070c.f1084p = new ViewTreeObserverOnPreDrawListenerC0066b(c0070c);
                c0070c.f1271a.getViewTreeObserver().addOnPreDrawListener(c0070c.f1084p);
                return;
            case 1:
                ((E0) this.f1052b).c();
                return;
            default:
                ((C0115n0) this.f1052b).f();
                return;
        }
    }
}
