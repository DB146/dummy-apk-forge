package l5;

import H2.i0;
import P4.m0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.kt.apps.media.xemtv.beta.R;
import java.util.ArrayList;
import java.util.List;
import k5.C1429h;
import m4.C1549C;
import m4.x0;

/* renamed from: l5.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502p extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public List f19534d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ B f19535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19536f;
    public final /* synthetic */ B g;

    public C1502p(B b2, int i7) {
        this.f19536f = i7;
        this.g = b2;
        this.f19535e = b2;
    }

    private final void q(String str) {
    }

    @Override // H2.K
    public final int a() {
        if (this.f19534d.isEmpty()) {
            return 0;
        }
        return this.f19534d.size() + 1;
    }

    @Override // H2.K
    public /* bridge */ /* synthetic */ void e(i0 i0Var, int i7) {
        switch (this.f19536f) {
            case 1:
                o((x) i0Var, i7);
                return;
            default:
                o((x) i0Var, i7);
                return;
        }
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        return new x(LayoutInflater.from(this.f19535e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    public boolean m(k5.i iVar) {
        for (int i7 = 0; i7 < this.f19534d.size(); i7++) {
            if (iVar.f19003M.containsKey(((y) this.f19534d.get(i7)).f19552a.f20108b)) {
                return true;
            }
        }
        return false;
    }

    public void n(List list) {
        boolean z8 = false;
        int i7 = 0;
        while (true) {
            if (i7 >= list.size()) {
                break;
            }
            y yVar = (y) list.get(i7);
            if (yVar.f19552a.f20111e[yVar.f19553b]) {
                z8 = true;
                break;
            }
            i7++;
        }
        B b2 = this.g;
        ImageView imageView = b2.f19280K;
        if (imageView != null) {
            imageView.setImageDrawable(z8 ? b2.f19312n0 : b2.f19313o0);
            b2.f19280K.setContentDescription(z8 ? b2.f19314p0 : b2.f19315q0);
        }
        this.f19534d = list;
    }

    public void o(x xVar, int i7) {
        switch (this.f19536f) {
            case 1:
                p(xVar, i7);
                if (i7 > 0) {
                    y yVar = (y) this.f19534d.get(i7 - 1);
                    xVar.f19551v.setVisibility(yVar.f19552a.f20111e[yVar.f19553b] ? 0 : 4);
                    return;
                }
                return;
            default:
                p(xVar, i7);
                return;
        }
    }

    public final void p(x xVar, int i7) {
        final x0 x0Var = this.f19535e.f19322v0;
        if (x0Var == null) {
            return;
        }
        if (i7 != 0) {
            final y yVar = (y) this.f19534d.get(i7 - 1);
            final m0 m0Var = yVar.f19552a.f20108b;
            boolean z8 = ((C1549C) x0Var).f0().f19003M.get(m0Var) != null && yVar.f19552a.f20111e[yVar.f19553b];
            xVar.f19550u.setText(yVar.f19554c);
            xVar.f19551v.setVisibility(z8 ? 0 : 4);
            xVar.f4707a.setOnClickListener(new View.OnClickListener() { // from class: l5.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1502p c1502p = C1502p.this;
                    c1502p.getClass();
                    C9.h hVar = (C9.h) x0Var;
                    if (hVar.o(29)) {
                        C1549C c1549c = (C1549C) hVar;
                        k5.i f02 = c1549c.f0();
                        f02.getClass();
                        C1429h c1429h = new C1429h(f02);
                        y yVar2 = yVar;
                        k5.v vVar = new k5.v(m0Var, N6.H.K(Integer.valueOf(yVar2.f19553b)));
                        m0 m0Var2 = vVar.f18967a;
                        c1429h.a(m0Var2.f8108c);
                        c1429h.f18990y.put(m0Var2, vVar);
                        c1429h.e(yVar2.f19552a.f20108b.f8108c);
                        c1549c.u0(new k5.i(c1429h));
                        String str = yVar2.f19554c;
                        switch (c1502p.f19536f) {
                            case 0:
                                c1502p.g.f19303f.f19548e[1] = str;
                                break;
                        }
                        c1502p.f19535e.f19327y.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f19536f) {
            case 0:
                xVar.f19550u.setText(R.string.exo_track_selection_auto);
                x0 x0Var2 = this.g.f19322v0;
                x0Var2.getClass();
                xVar.f19551v.setVisibility(m(((C1549C) x0Var2).f0()) ? 4 : 0);
                xVar.f4707a.setOnClickListener(new Aa.q(this, 8));
                return;
            default:
                xVar.f19550u.setText(R.string.exo_track_selection_none);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < this.f19534d.size()) {
                        y yVar2 = (y) this.f19534d.get(i11);
                        if (yVar2.f19552a.f20111e[yVar2.f19553b]) {
                            i10 = 4;
                        } else {
                            i11++;
                        }
                    }
                }
                xVar.f19551v.setVisibility(i10);
                xVar.f4707a.setOnClickListener(new Aa.q(this, 10));
                return;
        }
    }
}
