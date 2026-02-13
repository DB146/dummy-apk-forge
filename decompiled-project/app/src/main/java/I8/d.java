package I8;

import G8.A;
import G8.z;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d implements A, Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public static final d f5268c = new d();

    /* renamed from: a, reason: collision with root package name */
    public final List f5269a = Collections.emptyList();

    /* renamed from: b, reason: collision with root package name */
    public final List f5270b = Collections.emptyList();

    @Override // G8.A
    public final z a(G8.m mVar, N8.a aVar) {
        Class cls = aVar.f7386a;
        boolean b2 = b(cls, true);
        boolean b10 = b(cls, false);
        if (b2 || b10) {
            return new c(this, b10, b2, mVar, aVar);
        }
        return null;
    }

    public final boolean b(Class cls, boolean z8) {
        if (!z8 && !Enum.class.isAssignableFrom(cls)) {
            com.bumptech.glide.d dVar = L8.c.f6421a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z8 ? this.f5269a : this.f5270b).iterator();
        if (it.hasNext()) {
            throw h3.o.j(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
