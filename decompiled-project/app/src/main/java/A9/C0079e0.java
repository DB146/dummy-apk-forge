package A9;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0079e0 extends AbstractC0113m2 {

    /* renamed from: b, reason: collision with root package name */
    public final int f1112b;

    public C0079e0(int i7) {
        this.f1112b = i7;
    }

    @Override // A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        AbstractC0074d abstractC0074d = (AbstractC0074d) obj;
        C0075d0 c0075d0 = (C0075d0) c0109l2;
        c0075d0.f1104b.setImageDrawable(abstractC0074d.f1100b);
        TextView textView = c0075d0.f1105c;
        if (textView != null) {
            if (abstractC0074d.f1100b == null) {
                textView.setText(abstractC0074d.f1101c);
            } else {
                textView.setText((CharSequence) null);
            }
        }
        CharSequence charSequence = TextUtils.isEmpty(abstractC0074d.f1102d) ? abstractC0074d.f1101c : abstractC0074d.f1102d;
        View view = c0075d0.f1106d;
        if (TextUtils.equals(view.getContentDescription(), charSequence)) {
            return;
        }
        view.setContentDescription(charSequence);
        view.sendAccessibilityEvent(32768);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [A9.l2, A9.d0] */
    @Override // A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(this.f1112b, viewGroup, false);
        ?? c0109l2 = new C0109l2(inflate);
        c0109l2.f1104b = (ImageView) inflate.findViewById(R.id.icon);
        c0109l2.f1105c = (TextView) inflate.findViewById(R.id.label);
        c0109l2.f1106d = inflate.findViewById(R.id.button);
        return c0109l2;
    }

    @Override // A9.AbstractC0113m2
    public final void e(C0109l2 c0109l2) {
        C0075d0 c0075d0 = (C0075d0) c0109l2;
        c0075d0.f1104b.setImageDrawable(null);
        TextView textView = c0075d0.f1105c;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        c0075d0.f1106d.setContentDescription(null);
    }

    @Override // A9.AbstractC0113m2
    public final void h(C0109l2 c0109l2, View.OnClickListener onClickListener) {
        ((C0075d0) c0109l2).f1106d.setOnClickListener(onClickListener);
    }
}
