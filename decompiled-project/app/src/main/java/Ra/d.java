package Ra;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Pa.a f8951a;

    public d(Pa.a aVar) {
        this.f8951a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && l.a(this.f8951a, ((d) obj).f8951a);
    }

    public final int hashCode() {
        Pa.a aVar = this.f8951a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public final String toString() {
        return "VoiceInputInfo(appInfo=" + this.f8951a + ")";
    }
}
