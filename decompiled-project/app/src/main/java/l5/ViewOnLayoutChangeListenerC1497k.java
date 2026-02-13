package l5;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import m4.C1549C;
import m4.J0;
import m4.L0;
import m4.N0;
import m4.v0;
import m4.w0;
import m4.x0;

/* renamed from: l5.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1497k implements v0, View.OnLayoutChangeListener, View.OnClickListener, InterfaceC1495i {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f19516a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public Object f19517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlayerView f19518c;

    public ViewOnLayoutChangeListenerC1497k(PlayerView playerView) {
        this.f19518c = playerView;
    }

    @Override // m4.v0
    public final void J(o5.w wVar) {
        int i7 = PlayerView.f14738N;
        this.f19518c.h();
    }

    @Override // m4.v0
    public final void j(N0 n02) {
        PlayerView playerView = this.f19518c;
        x0 x0Var = playerView.f14739A;
        x0Var.getClass();
        C1549C c1549c = (C1549C) x0Var;
        L0 Y2 = c1549c.Y();
        if (Y2.p()) {
            this.f19517b = null;
        } else {
            boolean isEmpty = c1549c.Z().f20114a.isEmpty();
            J0 j02 = this.f19516a;
            if (isEmpty) {
                Object obj = this.f19517b;
                if (obj != null) {
                    int b2 = Y2.b(obj);
                    if (b2 != -1) {
                        if (c1549c.U() == Y2.f(b2, j02, false).f19965c) {
                            return;
                        }
                    }
                    this.f19517b = null;
                }
            } else {
                this.f19517b = Y2.f(c1549c.V(), j02, true).f19964b;
            }
        }
        playerView.l(false);
    }

    @Override // m4.v0
    public final void m(a5.c cVar) {
        SubtitleView subtitleView = this.f19518c.f14757u;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f12744a);
        }
    }

    @Override // m4.v0
    public final void o() {
        View view = this.f19518c.f14753c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = PlayerView.f14738N;
        this.f19518c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        PlayerView.a((TextureView) view, this.f19518c.f14750M);
    }

    @Override // m4.v0
    public final void t(int i7, boolean z8) {
        int i10 = PlayerView.f14738N;
        PlayerView playerView = this.f19518c;
        playerView.i();
        if (!playerView.b() || !playerView.f14749K) {
            playerView.c(false);
            return;
        }
        C1496j c1496j = playerView.f14760x;
        if (c1496j != null) {
            c1496j.b();
        }
    }

    @Override // m4.v0
    public final void v(int i7) {
        int i10 = PlayerView.f14738N;
        PlayerView playerView = this.f19518c;
        playerView.i();
        playerView.k();
        if (!playerView.b() || !playerView.f14749K) {
            playerView.c(false);
            return;
        }
        C1496j c1496j = playerView.f14760x;
        if (c1496j != null) {
            c1496j.b();
        }
    }

    @Override // m4.v0
    public final void y(int i7, w0 w0Var, w0 w0Var2) {
        C1496j c1496j;
        int i10 = PlayerView.f14738N;
        PlayerView playerView = this.f19518c;
        if (playerView.b() && playerView.f14749K && (c1496j = playerView.f14760x) != null) {
            c1496j.b();
        }
    }
}
