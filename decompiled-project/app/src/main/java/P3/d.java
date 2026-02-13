package P3;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f7822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f7823b;

    public d(e eVar, View view) {
        this.f7823b = eVar;
        this.f7822a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        W3.o.f().post(new E5.k(8, this, this, false));
    }
}
