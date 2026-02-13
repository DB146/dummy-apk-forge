package A9;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class Y1 extends AbstractC0074d {

    /* renamed from: f, reason: collision with root package name */
    public int f1037f;
    public final Drawable[] g;

    /* renamed from: h, reason: collision with root package name */
    public final String[] f1038h;

    public Y1(Context context) {
        super(R.id.lb_control_play_pause);
        this.g = new Drawable[]{Z1.b(context, 5), Z1.b(context, 3)};
        a(0);
        this.f1038h = new String[]{context.getString(R.string.lb_playback_controls_play), context.getString(R.string.lb_playback_controls_pause)};
        a(0);
        this.f1103e.add(85);
        this.f1103e.add(126);
        this.f1103e.add(127);
    }

    public final void a(int i7) {
        this.f1037f = i7;
        Drawable[] drawableArr = this.g;
        if (drawableArr != null) {
            this.f1100b = drawableArr[i7];
        }
        String[] strArr = this.f1038h;
        if (strArr != null) {
            this.f1101c = strArr[i7];
        }
    }
}
