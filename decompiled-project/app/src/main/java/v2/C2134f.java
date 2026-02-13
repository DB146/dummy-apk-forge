package v2;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2134f {

    /* renamed from: a, reason: collision with root package name */
    public final E5.o f24974a;

    /* JADX WARN: Type inference failed for: r0v3, types: [E5.o, java.lang.Object] */
    public C2134f(Bundle state) {
        kotlin.jvm.internal.l.e(state, "state");
        state.setClassLoader(C2134f.class.getClassLoader());
        kotlin.jvm.internal.l.e(state, "state");
        ?? obj = new Object();
        String string = state.getString("nav-entry-state:id");
        if (string == null) {
            Z9.x.E("nav-entry-state:id");
            throw null;
        }
        obj.f3713b = string;
        int i7 = state.getInt("nav-entry-state:destination-id", Integer.MIN_VALUE);
        if (i7 == Integer.MIN_VALUE && state.getInt("nav-entry-state:destination-id", com.google.android.gms.common.api.f.API_PRIORITY_OTHER) == Integer.MAX_VALUE) {
            Z9.x.E("nav-entry-state:destination-id");
            throw null;
        }
        obj.f3712a = i7;
        obj.f3714c = Y6.b.n("nav-entry-state:args", state);
        obj.f3715d = Y6.b.n("nav-entry-state:saved-state", state);
        this.f24974a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E5.o, java.lang.Object] */
    public C2134f(C2133e c2133e) {
        int i7 = c2133e.f24967b.f25017b.f4638a;
        ?? obj = new Object();
        obj.f3713b = c2133e.f24971f;
        obj.f3712a = i7;
        y2.c cVar = c2133e.f24973v;
        obj.f3714c = cVar.a();
        Bundle f4 = com.bumptech.glide.c.f((Db.j[]) Arrays.copyOf(new Db.j[0], 0));
        obj.f3715d = f4;
        cVar.f26754h.x(f4);
        this.f24974a = obj;
    }
}
