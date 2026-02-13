package E8;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f3775a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f3776b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f3777c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f3778d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f3779e;

    public h(Boolean bool, Double d10, Integer num, Integer num2, Long l10) {
        this.f3775a = bool;
        this.f3776b = d10;
        this.f3777c = num;
        this.f3778d = num2;
        this.f3779e = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return kotlin.jvm.internal.l.a(this.f3775a, hVar.f3775a) && kotlin.jvm.internal.l.a(this.f3776b, hVar.f3776b) && kotlin.jvm.internal.l.a(this.f3777c, hVar.f3777c) && kotlin.jvm.internal.l.a(this.f3778d, hVar.f3778d) && kotlin.jvm.internal.l.a(this.f3779e, hVar.f3779e);
    }

    public final int hashCode() {
        Boolean bool = this.f3775a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f3776b;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f3777c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f3778d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l10 = this.f3779e;
        return hashCode4 + (l10 != null ? l10.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f3775a + ", sessionSamplingRate=" + this.f3776b + ", sessionRestartTimeout=" + this.f3777c + ", cacheDuration=" + this.f3778d + ", cacheUpdatedTime=" + this.f3779e + ')';
    }
}
