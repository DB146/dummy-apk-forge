package y1;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2361i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f26714a;

    public C2361i(DisplayCutout displayCutout) {
        this.f26714a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2361i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f26714a, ((C2361i) obj).f26714a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f26714a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f26714a + "}";
    }
}
