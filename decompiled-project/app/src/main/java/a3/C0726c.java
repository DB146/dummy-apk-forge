package a3;

import a.AbstractC0672a;
import android.view.ViewGroup;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0726c extends v {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12523a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f12524b;

    public C0726c(ViewGroup viewGroup) {
        this.f12524b = viewGroup;
    }

    @Override // a3.v, a3.s
    public final void b() {
        AbstractC0672a.r(this.f12524b, false);
    }

    @Override // a3.v, a3.s
    public final void c() {
        AbstractC0672a.r(this.f12524b, true);
    }

    @Override // a3.v, a3.s
    public final void d(u uVar) {
        if (!this.f12523a) {
            AbstractC0672a.r(this.f12524b, false);
        }
        uVar.B(this);
    }

    @Override // a3.v, a3.s
    public final void f(u uVar) {
        AbstractC0672a.r(this.f12524b, false);
        this.f12523a = true;
    }
}
