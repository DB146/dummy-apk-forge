package M6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class f extends h implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final f f6803a = new h();

    @Override // M6.h
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // M6.h
    public final int b(Object obj) {
        return obj.hashCode();
    }
}
