package E;

import androidx.appcompat.widget.ActionBarContextView;
import y1.T;

/* renamed from: E.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246a implements T {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3389a;

    /* renamed from: b, reason: collision with root package name */
    public int f3390b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3391c;

    @Override // y1.T
    public void a() {
        if (this.f3389a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f3391c;
        actionBarContextView.f12936f = null;
        super/*android.view.View*/.setVisibility(this.f3390b);
    }

    @Override // y1.T
    public void b() {
        this.f3389a = true;
    }

    @Override // y1.T
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f3389a = false;
    }
}
