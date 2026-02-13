package d2;

import A9.Q1;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import q3.n;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1043c {

    /* renamed from: e, reason: collision with root package name */
    public static final Q1 f16489e;

    /* renamed from: f, reason: collision with root package name */
    public static final Q1 f16490f;

    /* renamed from: a, reason: collision with root package name */
    public final n f16491a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f16492b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f16493c;

    /* renamed from: d, reason: collision with root package name */
    public final C1044d f16494d;

    static {
        Class<Integer> cls = Integer.class;
        f16489e = new Q1(11, cls, "absoluteTop");
        f16490f = new Q1(12, cls, "absoluteBottom");
        new Q1(13, cls, "absoluteLeft");
        new Q1(14, cls, "absoluteRight");
        Class<Float> cls2 = Float.class;
        new Q1(15, cls2, "fractionTop");
        new Q1(16, cls2, "fractionBottom");
        new Q1(17, cls2, "fractionLeft");
        new Q1(18, cls2, "fractionRight");
    }

    public C1043c(Drawable drawable, C1044d c1044d) {
        this.f16493c = new Rect();
        this.f16492b = drawable;
        this.f16494d = c1044d;
        this.f16491a = new n(7);
        drawable.setCallback(c1044d);
    }

    public C1043c(C1043c c1043c, C1044d c1044d) {
        Drawable drawable;
        this.f16493c = new Rect();
        Drawable drawable2 = c1043c.f16492b;
        if (drawable2 != null) {
            drawable = drawable2.getConstantState().newDrawable();
            drawable.setCallback(c1044d);
            drawable.setLayoutDirection(drawable2.getLayoutDirection());
            drawable.setBounds(drawable2.getBounds());
            drawable.setLevel(drawable2.getLevel());
        } else {
            drawable = null;
        }
        n nVar = c1043c.f16491a;
        if (nVar != null) {
            n nVar2 = new n(7);
            C1041a c1041a = (C1041a) nVar.f23396b;
            nVar2.f23396b = c1041a != null ? new C1041a(c1041a) : null;
            C1041a c1041a2 = (C1041a) nVar.f23398d;
            nVar2.f23398d = c1041a2 != null ? new C1041a(c1041a2) : null;
            C1041a c1041a3 = (C1041a) nVar.f23397c;
            nVar2.f23397c = c1041a3 != null ? new C1041a(c1041a3) : null;
            C1041a c1041a4 = (C1041a) nVar.f23399e;
            nVar2.f23399e = c1041a4 != null ? new C1041a(c1041a4) : null;
            this.f16491a = nVar2;
        } else {
            this.f16491a = new n(7);
        }
        this.f16492b = drawable;
        this.f16494d = c1044d;
    }

    public final void a() {
        b(this.f16494d.getBounds());
    }

    public final void b(Rect rect) {
        n nVar = this.f16491a;
        C1041a c1041a = (C1041a) nVar.f23396b;
        Rect rect2 = this.f16493c;
        if (c1041a == null) {
            rect2.left = rect.left;
        } else {
            rect2.left = n.b(rect.left, c1041a, rect.width());
        }
        C1041a c1041a2 = (C1041a) nVar.f23398d;
        if (c1041a2 == null) {
            rect2.right = rect.right;
        } else {
            rect2.right = n.b(rect.left, c1041a2, rect.width());
        }
        C1041a c1041a3 = (C1041a) nVar.f23397c;
        if (c1041a3 == null) {
            rect2.top = rect.top;
        } else {
            rect2.top = n.b(rect.top, c1041a3, rect.height());
        }
        C1041a c1041a4 = (C1041a) nVar.f23399e;
        if (c1041a4 == null) {
            rect2.bottom = rect.bottom;
        } else {
            rect2.bottom = n.b(rect.top, c1041a4, rect.height());
        }
        this.f16492b.setBounds(rect2);
    }
}
