package G3;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class F implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f4289b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f4290a;

    public F(E e2) {
        this.f4290a = e2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [G3.E, java.lang.Object] */
    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        Uri uri = (Uri) obj;
        return new r(new V3.d(uri), this.f4290a.h(uri));
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        return f4289b.contains(((Uri) obj).getScheme());
    }
}
