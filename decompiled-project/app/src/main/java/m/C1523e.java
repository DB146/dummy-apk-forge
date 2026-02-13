package m;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import n.MenuC1663A;

/* renamed from: m.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1523e extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19632a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1519a f19633b;

    public C1523e(Context context, AbstractC1519a abstractC1519a) {
        this.f19632a = context;
        this.f19633b = abstractC1519a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f19633b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f19633b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1663A(this.f19632a, this.f19633b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f19633b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f19633b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f19633b.f19618a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f19633b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f19633b.f19619b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f19633b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f19633b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f19633b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f19633b.l(i7);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f19633b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f19633b.f19618a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f19633b.n(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f19633b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z8) {
        this.f19633b.p(z8);
    }
}
