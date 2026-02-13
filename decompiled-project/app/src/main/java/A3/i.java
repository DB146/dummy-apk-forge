package A3;

import C3.A;
import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements p {

    /* renamed from: b, reason: collision with root package name */
    public final List f354b;

    public i(p... pVarArr) {
        if (pVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f354b = Arrays.asList(pVarArr);
    }

    @Override // A3.p
    public final A a(Context context, A a9, int i7, int i10) {
        Iterator it = this.f354b.iterator();
        A a10 = a9;
        while (it.hasNext()) {
            A a11 = ((p) it.next()).a(context, a10, i7, i10);
            if (a10 != null && !a10.equals(a9) && !a10.equals(a11)) {
                a10.d();
            }
            a10 = a11;
        }
        return a10;
    }

    @Override // A3.h
    public final void b(MessageDigest messageDigest) {
        Iterator it = this.f354b.iterator();
        while (it.hasNext()) {
            ((p) it.next()).b(messageDigest);
        }
    }

    @Override // A3.h
    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f354b.equals(((i) obj).f354b);
        }
        return false;
    }

    @Override // A3.h
    public final int hashCode() {
        return this.f354b.hashCode();
    }
}
