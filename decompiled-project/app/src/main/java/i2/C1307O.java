package i2;

import android.graphics.Paint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: i2.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1307O extends AbstractC1300H {

    /* renamed from: b, reason: collision with root package name */
    public final int f18223b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18224c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18225d;

    public C1307O() {
        new Paint(1);
        this.f18223b = R.layout.lb_row_header;
        this.f18225d = true;
    }

    @Override // i2.AbstractC1300H
    public final void b(C9.h hVar, Object obj) {
        C1306N c1306n = (C1306N) hVar;
        if ((obj == null ? null : ((AbstractC1304L) obj).f18220a) == null) {
            c1306n.getClass();
            TextView textView = c1306n.f18222c;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            ((View) hVar.f3094a).setContentDescription(null);
            if (this.f18224c) {
                ((View) hVar.f3094a).setVisibility(8);
                return;
            }
            return;
        }
        c1306n.getClass();
        TextView textView2 = c1306n.f18222c;
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView2.setText((CharSequence) null);
        }
        ((View) hVar.f3094a).setContentDescription(null);
        ((View) hVar.f3094a).setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i2.N, C9.h] */
    @Override // i2.AbstractC1300H
    public final C9.h c(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f18223b, viewGroup, false);
        ?? hVar = new C9.h(inflate);
        if (inflate.findViewById(R.id.row_header) != null) {
            throw new ClassCastException();
        }
        hVar.f18222c = (TextView) inflate.findViewById(R.id.row_header_description);
        hVar.f18221b = inflate.getResources().getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
        if (this.f18225d) {
            g(hVar, 0.0f);
        }
        return hVar;
    }

    @Override // i2.AbstractC1300H
    public final void d(C9.h hVar) {
        C1306N c1306n = (C1306N) hVar;
        c1306n.getClass();
        TextView textView = c1306n.f18222c;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f18225d) {
            g(c1306n, 0.0f);
        }
    }

    public final void g(C1306N c1306n, float f4) {
        c1306n.getClass();
        if (this.f18225d) {
            float f10 = c1306n.f18221b;
            ((View) c1306n.f3094a).setAlpha(h3.o.d(1.0f, f10, f4, f10));
        }
    }
}
