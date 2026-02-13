package La;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Ra.c f6433a;

    public d(Ra.c cVar) {
        this.f6433a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.a(this.f6433a, ((d) obj).f6433a);
    }

    public final int hashCode() {
        return this.f6433a.hashCode();
    }

    public final String toString() {
        return "VoiceSelectorInteractor(checkVoiceInput=" + this.f6433a + ")";
    }
}
