package l5;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import m4.C1549C;
import m4.J0;
import m4.L0;
import m4.N0;
import m4.v0;
import m4.w0;
import m4.x0;

/* loaded from: classes.dex */
public final class H implements v0, View.OnLayoutChangeListener, View.OnClickListener, InterfaceC1486A, r {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f19366a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public Object f19367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f19368c;

    public H(StyledPlayerView styledPlayerView) {
        this.f19368c = styledPlayerView;
    }

    @Override // m4.v0
    public final void J(o5.w wVar) {
        StyledPlayerView styledPlayerView;
        x0 x0Var;
        if (wVar.equals(o5.w.f22047e) || (x0Var = (styledPlayerView = this.f19368c).f14764A) == null || ((C1549C) x0Var).d0() == 1) {
            return;
        }
        styledPlayerView.h();
    }

    @Override // m4.v0
    public final void j(N0 n02) {
        StyledPlayerView styledPlayerView = this.f19368c;
        x0 x0Var = styledPlayerView.f14764A;
        x0Var.getClass();
        C9.h hVar = (C9.h) x0Var;
        L0 Y2 = hVar.o(17) ? ((C1549C) x0Var).Y() : L0.f20097a;
        if (Y2.p()) {
            this.f19367b = null;
        } else {
            boolean o10 = hVar.o(30);
            J0 j02 = this.f19366a;
            if (o10) {
                C1549C c1549c = (C1549C) x0Var;
                if (!c1549c.Z().f20114a.isEmpty()) {
                    this.f19367b = Y2.f(c1549c.V(), j02, true).f19964b;
                }
            }
            Object obj = this.f19367b;
            if (obj != null) {
                int b2 = Y2.b(obj);
                if (b2 != -1) {
                    if (((C1549C) x0Var).U() == Y2.f(b2, j02, false).f19965c) {
                        return;
                    }
                }
                this.f19367b = null;
            }
        }
        styledPlayerView.l(false);
    }

    @Override // m4.v0
    public final void m(a5.c cVar) {
        SubtitleView subtitleView = this.f19368c.f14782u;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f12744a);
        }
    }

    @Override // m4.v0
    public final void o() {
        View view = this.f19368c.f14778c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = StyledPlayerView.f14763N;
        this.f19368c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        StyledPlayerView.a((TextureView) view, this.f19368c.f14775M);
    }

    @Override // m4.v0
    public final void t(int i7, boolean z8) {
        int i10 = StyledPlayerView.f14763N;
        StyledPlayerView styledPlayerView = this.f19368c;
        styledPlayerView.i();
        if (!styledPlayerView.b() || !styledPlayerView.f14774K) {
            styledPlayerView.c(false);
            return;
        }
        B b2 = styledPlayerView.f14785x;
        if (b2 != null) {
            b2.g();
        }
    }

    @Override // m4.v0
    public final void v(int i7) {
        int i10 = StyledPlayerView.f14763N;
        StyledPlayerView styledPlayerView = this.f19368c;
        styledPlayerView.i();
        styledPlayerView.k();
        if (!styledPlayerView.b() || !styledPlayerView.f14774K) {
            styledPlayerView.c(false);
            return;
        }
        B b2 = styledPlayerView.f14785x;
        if (b2 != null) {
            b2.g();
        }
    }

    @Override // m4.v0
    public final void y(int i7, w0 w0Var, w0 w0Var2) {
        B b2;
        int i10 = StyledPlayerView.f14763N;
        StyledPlayerView styledPlayerView = this.f19368c;
        if (styledPlayerView.b() && styledPlayerView.f14774K && (b2 = styledPlayerView.f14785x) != null) {
            b2.g();
        }
    }
}
