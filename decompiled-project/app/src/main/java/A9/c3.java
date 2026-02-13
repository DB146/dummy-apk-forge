package A9;

import android.content.Context;
import android.content.res.Resources;
import com.kt.apps.media.xemtv.beta.R;

/* loaded from: classes2.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1093a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1094b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1095c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1097e;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1096d = true;

    /* renamed from: f, reason: collision with root package name */
    public d3 f1098f = d3.f1110a;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, A9.e3] */
    public final e3 a(Context context) {
        ?? obj = new Object();
        obj.f1126a = 1;
        obj.f1127b = this.f1093a;
        boolean z8 = this.f1094b;
        obj.f1128c = z8;
        obj.f1129d = this.f1095c;
        if (z8) {
            this.f1098f.getClass();
            obj.f1131f = context.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius);
        }
        if (!obj.f1129d) {
            obj.f1126a = 1;
            obj.f1130e = this.f1097e && obj.f1127b;
        } else if (this.f1096d) {
            obj.f1126a = 3;
            this.f1098f.getClass();
            Resources resources = context.getResources();
            obj.f1132h = resources.getDimension(R.dimen.lb_material_shadow_focused_z);
            obj.g = resources.getDimension(R.dimen.lb_material_shadow_normal_z);
            obj.f1130e = this.f1097e && obj.f1127b;
        } else {
            obj.f1126a = 2;
            obj.f1130e = true;
        }
        return obj;
    }
}
