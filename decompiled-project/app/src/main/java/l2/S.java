package l2;

import A9.N2;
import B0.C0215z0;
import a.AbstractC0672a;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes.dex */
public final class S implements Q2.d {

    /* renamed from: a, reason: collision with root package name */
    public final q3.s f19178a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19179b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f19180c;

    /* renamed from: d, reason: collision with root package name */
    public final Db.o f19181d;

    public S(q3.s savedStateRegistry, e0 viewModelStoreOwner) {
        kotlin.jvm.internal.l.e(savedStateRegistry, "savedStateRegistry");
        kotlin.jvm.internal.l.e(viewModelStoreOwner, "viewModelStoreOwner");
        this.f19178a = savedStateRegistry;
        this.f19181d = android.support.v4.media.session.b.z(new N2(viewModelStoreOwner, 26));
    }

    @Override // Q2.d
    public final Bundle a() {
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        Bundle bundle = this.f19180c;
        if (bundle != null) {
            f4.putAll(bundle);
        }
        for (Map.Entry entry : ((T) this.f19181d.getValue()).f19182a.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a9 = ((C0215z0) ((N) entry.getValue()).f19170b.f926e).a();
            if (!a9.isEmpty()) {
                AbstractC0672a.n(f4, str, a9);
            }
        }
        this.f19179b = false;
        return f4;
    }

    public final void b() {
        if (this.f19179b) {
            return;
        }
        Bundle o10 = this.f19178a.o("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        Bundle bundle = this.f19180c;
        if (bundle != null) {
            f4.putAll(bundle);
        }
        if (o10 != null) {
            f4.putAll(o10);
        }
        this.f19180c = f4;
        this.f19179b = true;
    }
}
