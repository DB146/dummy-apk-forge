package A9;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: A9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0086g extends AbstractC0078e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1199c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086g(int i7) {
        super(0);
        this.f1199c = i7;
    }

    @Override // A9.AbstractC0078e, A9.AbstractC0113m2
    public final void c(C0109l2 c0109l2, Object obj) {
        switch (this.f1199c) {
            case 0:
                super.c(c0109l2, obj);
                ((C0082f) c0109l2).f1133b.setText(((AbstractC0074d) obj).f1101c);
                return;
            default:
                super.c(c0109l2, obj);
                AbstractC0074d abstractC0074d = (AbstractC0074d) obj;
                C0082f c0082f = (C0082f) c0109l2;
                CharSequence charSequence = abstractC0074d.f1101c;
                CharSequence charSequence2 = abstractC0074d.f1102d;
                if (TextUtils.isEmpty(charSequence)) {
                    c0082f.f1133b.setText(charSequence2);
                    return;
                }
                if (TextUtils.isEmpty(charSequence2)) {
                    c0082f.f1133b.setText(charSequence);
                    return;
                }
                c0082f.f1133b.setText(((Object) charSequence) + "\n" + ((Object) charSequence2));
                return;
        }
    }

    @Override // A9.AbstractC0078e, A9.AbstractC0113m2
    public final C0109l2 d(ViewGroup viewGroup) {
        switch (this.f1199c) {
            case 0:
                return new C0082f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_action_1_line, viewGroup, false), viewGroup.getLayoutDirection());
            default:
                return new C0082f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_action_2_lines, viewGroup, false), viewGroup.getLayoutDirection());
        }
    }
}
