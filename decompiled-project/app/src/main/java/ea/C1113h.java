package ea;

import com.kt.apps.core.tv.usecase.GetChannelLinkStreamById;
import da.C1065c;
import da.C1066d;
import fa.C1146a;
import kotlin.jvm.internal.l;

/* renamed from: ea.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1113h {

    /* renamed from: a, reason: collision with root package name */
    public final C1065c f16842a;

    /* renamed from: b, reason: collision with root package name */
    public final C1066d f16843b;

    /* renamed from: c, reason: collision with root package name */
    public final GetChannelLinkStreamById f16844c;

    /* renamed from: d, reason: collision with root package name */
    public final C1146a f16845d;

    /* renamed from: e, reason: collision with root package name */
    public final fa.b f16846e;

    /* renamed from: f, reason: collision with root package name */
    public final R7.a f16847f;

    public C1113h(C1065c getListChannel, C1066d c1066d, GetChannelLinkStreamById getChannelLinkStreamById, C1146a c1146a, fa.b bVar, R7.a aVar) {
        l.e(getListChannel, "getListChannel");
        this.f16842a = getListChannel;
        this.f16843b = c1066d;
        this.f16844c = getChannelLinkStreamById;
        this.f16845d = c1146a;
        this.f16846e = bVar;
        this.f16847f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1113h)) {
            return false;
        }
        C1113h c1113h = (C1113h) obj;
        return l.a(this.f16842a, c1113h.f16842a) && l.a(this.f16843b, c1113h.f16843b) && l.a(this.f16844c, c1113h.f16844c) && l.a(this.f16845d, c1113h.f16845d) && l.a(this.f16846e, c1113h.f16846e) && l.a(this.f16847f, c1113h.f16847f);
    }

    public final int hashCode() {
        return this.f16847f.hashCode() + ((this.f16846e.hashCode() + ((this.f16845d.hashCode() + ((this.f16844c.hashCode() + ((this.f16843b.hashCode() + (this.f16842a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TVChannelInteractors(getListChannel=" + this.f16842a + ", getChannelLinkStream=" + this.f16843b + ", getChannelLinkStreamById=" + this.f16844c + ", getCurrentProgrammeForChannel=" + this.f16845d + ", getListProgrammeForChannel=" + this.f16846e + ", saveChannelNumber=" + this.f16847f + ")";
    }
}
