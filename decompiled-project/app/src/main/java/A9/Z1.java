package A9;

import a2.AbstractC0708a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.widget.TextView;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class Z1 extends AbstractC0132r2 {

    /* renamed from: b, reason: collision with root package name */
    public C9.g f1042b;

    /* renamed from: c, reason: collision with root package name */
    public C0098j f1043c;

    /* renamed from: d, reason: collision with root package name */
    public C0098j f1044d;

    /* renamed from: e, reason: collision with root package name */
    public long f1045e;

    /* renamed from: f, reason: collision with root package name */
    public long f1046f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public C0089g2 f1047h;

    public static Drawable b(Context context, int i7) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.playbackControlsActionIcons, typedValue, false)) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.data, AbstractC0708a.f12490i);
        Drawable drawable = obtainStyledAttributes.getDrawable(i7);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public final AbstractC0074d a(C0098j c0098j, int i7) {
        if (c0098j != this.f1043c && c0098j != this.f1044d) {
            throw new IllegalArgumentException("Invalid adapter");
        }
        for (int i10 = 0; i10 < c0098j.f1233c.size(); i10++) {
            AbstractC0074d abstractC0074d = (AbstractC0074d) c0098j.f1233c.get(i10);
            if (abstractC0074d.f1103e.contains(Integer.valueOf(i7))) {
                return abstractC0074d;
            }
        }
        return null;
    }

    public final void c(long j) {
        if (this.f1046f != j) {
            this.f1046f = j;
            C0089g2 c0089g2 = this.f1047h;
            if (c0089g2 != null) {
                c0089g2.f1202a.e(j);
            }
        }
    }

    public final void d(long j) {
        if (this.f1045e != j) {
            this.f1045e = j;
            C0089g2 c0089g2 = this.f1047h;
            if (c0089g2 != null) {
                C0101j2 c0101j2 = c0089g2.f1202a;
                if (c0101j2.f1258x != j) {
                    c0101j2.f1258x = j;
                    TextView textView = c0101j2.f1254t;
                    if (textView != null) {
                        StringBuilder sb2 = c0101j2.f1260z;
                        C9.d.y(j, sb2);
                        textView.setText(sb2.toString());
                    }
                }
            }
        }
    }
}
