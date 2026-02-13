package Q0;

import java.util.Locale;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Locale f8597a;

    public a(Locale locale) {
        this.f8597a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return l.a(this.f8597a.toLanguageTag(), ((a) obj).f8597a.toLanguageTag());
    }

    public final int hashCode() {
        return this.f8597a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.f8597a.toLanguageTag();
    }
}
