package y;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Context f26537a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26538b;

    /* renamed from: c, reason: collision with root package name */
    public long f26539c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f26540d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f26541e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f26542f;
    public EdgeEffect g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f26543h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f26544i;
    public EdgeEffect j;
    public EdgeEffect k;

    public y(Context context, int i7) {
        this.f26537a = context;
        this.f26538b = i7;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? l3.d.b(edgeEffect) : 0.0f) == 0.0f);
    }

    public final EdgeEffect a(z.V v10) {
        int i7 = Build.VERSION.SDK_INT;
        Context context = this.f26537a;
        EdgeEffect a9 = i7 >= 31 ? l3.d.a(context) : new C2283E(context);
        a9.setColor(this.f26538b);
        if (!V0.k.a(this.f26539c, 0L)) {
            if (v10 == z.V.f27943a) {
                long j = this.f26539c;
                a9.setSize((int) (j >> 32), (int) (j & 4294967295L));
            } else {
                long j10 = this.f26539c;
                a9.setSize((int) (j10 & 4294967295L), (int) (j10 >> 32));
            }
        }
        return a9;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f26541e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a9 = a(z.V.f27943a);
        this.f26541e = a9;
        return a9;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f26542f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a9 = a(z.V.f27944b);
        this.f26542f = a9;
        return a9;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a9 = a(z.V.f27944b);
        this.g = a9;
        return a9;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f26540d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a9 = a(z.V.f27943a);
        this.f26540d = a9;
        return a9;
    }
}
