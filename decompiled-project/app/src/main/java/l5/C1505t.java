package l5;

import H2.i0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: l5.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505t extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19540d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f19541e;

    /* renamed from: f, reason: collision with root package name */
    public int f19542f;
    public final /* synthetic */ B g;

    public C1505t(B b2, String[] strArr, float[] fArr) {
        this.g = b2;
        this.f19540d = strArr;
        this.f19541e = fArr;
    }

    @Override // H2.K
    public final int a() {
        return this.f19540d.length;
    }

    @Override // H2.K
    public final void e(i0 i0Var, final int i7) {
        x xVar = (x) i0Var;
        String[] strArr = this.f19540d;
        if (i7 < strArr.length) {
            xVar.f19550u.setText(strArr[i7]);
        }
        int i10 = this.f19542f;
        View view = xVar.f19551v;
        View view2 = xVar.f4707a;
        if (i7 == i10) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: l5.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C1505t c1505t = C1505t.this;
                int i11 = c1505t.f19542f;
                int i12 = i7;
                B b2 = c1505t.g;
                if (i12 != i11) {
                    b2.setPlaybackSpeed(c1505t.f19541e[i12]);
                }
                b2.f19327y.dismiss();
            }
        });
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        return new x(LayoutInflater.from(this.g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
