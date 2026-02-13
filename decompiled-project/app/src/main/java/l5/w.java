package l5;

import H2.i0;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;
import m4.x0;

/* loaded from: classes.dex */
public final class w extends H2.K {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f19547d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f19548e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable[] f19549f;
    public final /* synthetic */ B g;

    public w(B b2, String[] strArr, Drawable[] drawableArr) {
        this.g = b2;
        this.f19547d = strArr;
        this.f19548e = new String[strArr.length];
        this.f19549f = drawableArr;
    }

    @Override // H2.K
    public final int a() {
        return this.f19547d.length;
    }

    @Override // H2.K
    public final long b(int i7) {
        return i7;
    }

    @Override // H2.K
    public final void e(i0 i0Var, int i7) {
        v vVar = (v) i0Var;
        boolean m10 = m(i7);
        View view = vVar.f4707a;
        if (m10) {
            view.setLayoutParams(new H2.T(-1, -2));
        } else {
            view.setLayoutParams(new H2.T(0, 0));
        }
        vVar.f19543u.setText(this.f19547d[i7]);
        String str = this.f19548e[i7];
        TextView textView = vVar.f19544v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f19549f[i7];
        ImageView imageView = vVar.f19545w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // H2.K
    public final i0 g(ViewGroup viewGroup, int i7) {
        B b2 = this.g;
        return new v(b2, LayoutInflater.from(b2.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean m(int i7) {
        B b2 = this.g;
        x0 x0Var = b2.f19322v0;
        if (x0Var == null) {
            return false;
        }
        if (i7 == 0) {
            return ((C9.h) x0Var).o(13);
        }
        if (i7 != 1) {
            return true;
        }
        return ((C9.h) x0Var).o(30) && ((C9.h) b2.f19322v0).o(29);
    }
}
