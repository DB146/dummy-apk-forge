package A9;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kt.apps.core.base.leanback.RowHeaderView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.u2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0144u2 extends AbstractC0113m2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f1411d;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1410c = new Paint(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f1409b = R.layout.base_lb_row_header;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1412e = true;

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        C0096i1 c0096i1 = obj == null ? null : ((AbstractC0132r2) obj).f1358a;
        C0140t2 c0140t2 = (C0140t2) c0109l2;
        if (c0096i1 == null) {
            RowHeaderView rowHeaderView = c0140t2.f1373c;
            if (rowHeaderView != null) {
                rowHeaderView.setText((CharSequence) null);
            }
            TextView textView = c0140t2.f1374d;
            if (textView != null) {
                textView.setText((CharSequence) null);
            }
            c0109l2.f1271a.setContentDescription(null);
            if (this.f1411d) {
                c0109l2.f1271a.setVisibility(8);
                return;
            }
            return;
        }
        if (c0140t2.f1373c != null) {
            boolean isEmpty = TextUtils.isEmpty((SpannableString) c0096i1.f1229c);
            RowHeaderView rowHeaderView2 = c0140t2.f1373c;
            if (isEmpty) {
                rowHeaderView2.setText((String) c0096i1.f1227a);
            } else {
                rowHeaderView2.setText((SpannableString) c0096i1.f1229c);
            }
        }
        TextView textView2 = c0140t2.f1374d;
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
            textView2.setText((CharSequence) null);
        }
        c0109l2.f1271a.setContentDescription((SpannableString) c0096i1.f1229c);
        c0109l2.f1271a.setVisibility(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [A9.l2, A9.t2] */
    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f1409b, viewGroup, false);
        ?? c0109l2 = new C0109l2(inflate);
        RowHeaderView rowHeaderView = (RowHeaderView) inflate.findViewById(R.id.row_header);
        c0109l2.f1373c = rowHeaderView;
        c0109l2.f1374d = (TextView) inflate.findViewById(R.id.row_header_description);
        if (rowHeaderView != null) {
            rowHeaderView.getCurrentTextColor();
        }
        c0109l2.f1372b = inflate.getResources().getFraction(R.fraction.lb_browse_header_unselect_alpha, 1, 1);
        if (this.f1412e) {
            i(c0109l2, 0.0f);
        }
        return c0109l2;
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        C0140t2 c0140t2 = (C0140t2) c0109l2;
        RowHeaderView rowHeaderView = c0140t2.f1373c;
        if (rowHeaderView != null) {
            rowHeaderView.setText((CharSequence) null);
        }
        TextView textView = c0140t2.f1374d;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        if (this.f1412e) {
            i(c0140t2, 0.0f);
        }
    }

    public final void i(C0140t2 c0140t2, float f4) {
        c0140t2.getClass();
        if (this.f1412e) {
            float f10 = c0140t2.f1372b;
            c0140t2.f1271a.setAlpha(h3.o.d(1.0f, f10, f4, f10));
        }
    }
}
