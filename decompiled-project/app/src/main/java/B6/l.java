package B6;

import android.view.View;

/* loaded from: classes.dex */
public final class l implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2137a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f2138b;

    public l(m mVar, View view) {
        this.f2138b = mVar;
        this.f2137a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        View view2 = this.f2137a;
        if (view2.getVisibility() == 0) {
            this.f2138b.d(view2);
        }
    }
}
