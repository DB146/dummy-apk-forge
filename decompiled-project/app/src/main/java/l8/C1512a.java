package l8;

/* renamed from: l8.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1512a {

    /* renamed from: a, reason: collision with root package name */
    public String f19594a;

    /* renamed from: b, reason: collision with root package name */
    public int f19595b;

    /* renamed from: c, reason: collision with root package name */
    public String f19596c;

    /* renamed from: d, reason: collision with root package name */
    public String f19597d;

    /* renamed from: e, reason: collision with root package name */
    public Long f19598e;

    /* renamed from: f, reason: collision with root package name */
    public Long f19599f;
    public String g;

    public final C1513b a() {
        String str = this.f19595b == 0 ? " registrationStatus" : "";
        if (this.f19598e == null) {
            str = str.concat(" expiresInSecs");
        }
        if (this.f19599f == null) {
            str = X.c.h(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new C1513b(this.f19594a, this.f19595b, this.f19596c, this.f19597d, this.f19598e.longValue(), this.f19599f.longValue(), this.g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }
}
