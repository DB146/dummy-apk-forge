package i2;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.kt.apps.media.xemtv.beta.R;

/* renamed from: i2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316d extends AbstractC1300H {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18256b;

    @Override // i2.AbstractC1300H
    public final void b(C9.h hVar, Object obj) {
        switch (this.f18256b) {
            case 0:
                g(hVar, obj);
                ((C1315c) hVar).f18254b.setText(((C1314b) obj).f18252a);
                return;
            default:
                g(hVar, obj);
                C1314b c1314b = (C1314b) obj;
                C1315c c1315c = (C1315c) hVar;
                String str = c1314b.f18252a;
                String str2 = c1314b.f18253b;
                if (TextUtils.isEmpty(str)) {
                    c1315c.f18254b.setText(str2);
                    return;
                }
                if (TextUtils.isEmpty(str2)) {
                    c1315c.f18254b.setText(str);
                    return;
                }
                c1315c.f18254b.setText(((Object) str) + "\n" + ((Object) str2));
                return;
        }
    }

    @Override // i2.AbstractC1300H
    public final C9.h c(ViewGroup viewGroup) {
        switch (this.f18256b) {
            case 0:
                return new C1315c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_action_1_line, viewGroup, false), viewGroup.getLayoutDirection());
            default:
                return new C1315c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lb_action_2_lines, viewGroup, false), viewGroup.getLayoutDirection());
        }
    }

    @Override // i2.AbstractC1300H
    public final void d(C9.h hVar) {
        C1315c c1315c = (C1315c) hVar;
        c1315c.f18254b.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        ((View) c1315c.f3094a).setPadding(0, 0, 0, 0);
    }

    public final void g(C9.h hVar, Object obj) {
        C1315c c1315c = (C1315c) hVar;
        c1315c.getClass();
        ((C1314b) obj).getClass();
        View view = (View) c1315c.f3094a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.lb_action_padding_horizontal);
        view.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, 0);
        int i7 = c1315c.f18255c;
        Button button = c1315c.f18254b;
        if (i7 == 1) {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            button.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }
}
