package Q2;

import Db.j;
import Eb.o;
import a.AbstractC0672a;
import android.os.Bundle;
import i.AbstractActivityC1287g;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.l;
import q3.s;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8617a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8618b;

    public a(AbstractActivityC1287g abstractActivityC1287g) {
        this.f8618b = abstractActivityC1287g;
    }

    public a(s registry) {
        l.e(registry, "registry");
        this.f8618b = new LinkedHashSet();
        registry.D("androidx.savedstate.Restarter", this);
    }

    @Override // Q2.d
    public final Bundle a() {
        switch (this.f8617a) {
            case 0:
                Bundle f4 = com.bumptech.glide.c.f((j[]) Arrays.copyOf(new j[0], 0));
                AbstractC0672a.p(f4, "classes_to_restore", o.s0((LinkedHashSet) this.f8618b));
                return f4;
            default:
                Bundle bundle = new Bundle();
                ((AbstractActivityC1287g) this.f8618b).l().getClass();
                return bundle;
        }
    }
}
