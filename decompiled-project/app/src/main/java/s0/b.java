package s0;

import android.view.KeyEvent;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f24020a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return l.a(this.f24020a, ((b) obj).f24020a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24020a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f24020a + ')';
    }
}
