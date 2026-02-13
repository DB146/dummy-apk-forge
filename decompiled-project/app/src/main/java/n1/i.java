package n1;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f21045a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f21046b;

    public i(Resources resources, Resources.Theme theme) {
        this.f21045a = resources;
        this.f21046b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f21045a.equals(iVar.f21045a) && Objects.equals(this.f21046b, iVar.f21046b);
    }

    public final int hashCode() {
        return Objects.hash(this.f21045a, this.f21046b);
    }
}
