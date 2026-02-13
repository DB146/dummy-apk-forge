package a3;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: a3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0712D {

    /* renamed from: b, reason: collision with root package name */
    public final View f12499b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12498a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12500c = new ArrayList();

    public C0712D(View view) {
        this.f12499b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0712D)) {
            return false;
        }
        C0712D c0712d = (C0712D) obj;
        return this.f12499b == c0712d.f12499b && this.f12498a.equals(c0712d.f12498a);
    }

    public final int hashCode() {
        return this.f12498a.hashCode() + (this.f12499b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder n6 = A3.c.n("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        n6.append(this.f12499b);
        n6.append("\n");
        String h10 = X.c.h(n6.toString(), "    values:");
        HashMap hashMap = this.f12498a;
        for (String str : hashMap.keySet()) {
            h10 = h10 + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return h10;
    }
}
