package n3;

import android.os.Build;
import h3.z;
import kotlin.jvm.internal.l;
import q3.p;

/* renamed from: n3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1701f extends AbstractC1698c {

    /* renamed from: c, reason: collision with root package name */
    public static final String f21067c;

    /* renamed from: b, reason: collision with root package name */
    public final int f21068b;

    static {
        String g = z.g("NetworkMeteredCtrlr");
        l.d(g, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        f21067c = g;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1701f(o3.e tracker) {
        super(tracker);
        l.e(tracker, "tracker");
        this.f21068b = 7;
    }

    @Override // n3.InterfaceC1700e
    public final boolean b(p workSpec) {
        l.e(workSpec, "workSpec");
        return workSpec.j.f17682a == 5;
    }

    @Override // n3.AbstractC1698c
    public final int d() {
        return this.f21068b;
    }

    @Override // n3.AbstractC1698c
    public final boolean e(Object obj) {
        m3.g value = (m3.g) obj;
        l.e(value, "value");
        int i7 = Build.VERSION.SDK_INT;
        boolean z8 = value.f19787a;
        if (i7 < 26) {
            z.e().a(f21067c, "Metered network constraint is not supported before API 26, only checking for connected state.");
            if (z8) {
                return false;
            }
        } else if (z8 && value.f19789c) {
            return false;
        }
        return true;
    }
}
