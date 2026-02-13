package j0;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.kt.apps.media.xemtv.beta.R;
import l0.C1443b;
import m0.C1533b;
import m0.C1536e;
import m0.C1538g;
import m0.C1540i;
import m0.InterfaceC1535d;
import n0.AbstractC1693a;
import n0.C1694b;

/* renamed from: j0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1366d implements s {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f18533d = true;

    /* renamed from: a, reason: collision with root package name */
    public final B0.D f18534a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18535b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C1694b f18536c;

    public C1366d(B0.D d10) {
        this.f18534a = d10;
    }

    @Override // j0.s
    public final void a(C1533b c1533b) {
        synchronized (this.f18535b) {
            if (!c1533b.f19699s) {
                c1533b.f19699s = true;
                c1533b.b();
            }
        }
    }

    @Override // j0.s
    public final C1533b b() {
        InterfaceC1535d c1540i;
        C1533b c1533b;
        synchronized (this.f18535b) {
            try {
                B0.D d10 = this.f18534a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    d10.getUniqueDrawingId();
                }
                if (i7 >= 29) {
                    c1540i = new C1538g();
                } else if (f18533d) {
                    try {
                        c1540i = new C1536e(this.f18534a, new m(), new C1443b());
                    } catch (Throwable unused) {
                        f18533d = false;
                        c1540i = new C1540i(c(this.f18534a));
                    }
                } else {
                    c1540i = new C1540i(c(this.f18534a));
                }
                c1533b = new C1533b(c1540i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1533b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [n0.b, n0.a, android.view.View, android.view.ViewGroup] */
    public final AbstractC1693a c(B0.D d10) {
        C1694b c1694b = this.f18536c;
        if (c1694b != null) {
            return c1694b;
        }
        ?? viewGroup = new ViewGroup(d10.getContext());
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        d10.addView((View) viewGroup, -1);
        this.f18536c = viewGroup;
        return viewGroup;
    }
}
