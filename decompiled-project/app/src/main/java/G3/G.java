package G3;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class G implements s {

    /* renamed from: b, reason: collision with root package name */
    public static final Set f4291b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final s f4292a;

    public G(s sVar) {
        this.f4292a = sVar;
    }

    @Override // G3.s
    public final r a(Object obj, int i7, int i10, A3.l lVar) {
        return this.f4292a.a(new i(((Uri) obj).toString()), i7, i10, lVar);
    }

    @Override // G3.s
    public final boolean b(Object obj) {
        return f4291b.contains(((Uri) obj).getScheme());
    }
}
