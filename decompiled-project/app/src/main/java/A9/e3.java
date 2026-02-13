package A9;

import android.view.View;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public int f1126a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1127b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1128c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1129d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1130e;

    /* renamed from: f, reason: collision with root package name */
    public int f1131f;
    public float g;

    /* renamed from: h, reason: collision with root package name */
    public float f1132h;

    public static void b(Object obj, int i7, float f4) {
        if (obj != null) {
            if (f4 < 0.0f) {
                f4 = 0.0f;
            } else if (f4 > 1.0f) {
                f4 = 1.0f;
            }
            if (i7 == 2) {
                k3 k3Var = (k3) obj;
                k3Var.f1265a.setAlpha(1.0f - f4);
                k3Var.f1266b.setAlpha(f4);
            } else {
                if (i7 != 3) {
                    return;
                }
                Y2 y22 = a3.f1056a;
                Z2 z22 = (Z2) obj;
                View view = z22.f1048a;
                float f10 = z22.f1049b;
                view.setZ(((z22.f1050c - f10) * f4) + f10);
            }
        }
    }

    public final void a(View view) {
        if (this.f1130e) {
            return;
        }
        if (!this.f1129d) {
            if (this.f1128c) {
                Y6.b.w(view, this.f1131f);
            }
        } else if (this.f1126a == 3) {
            view.setTag(R.id.lb_shadow_impl, Z9.x.c(view, this.g, this.f1132h, this.f1131f));
        } else if (this.f1128c) {
            Y6.b.w(view, this.f1131f);
        }
    }
}
