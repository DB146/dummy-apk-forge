package W9;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f10894a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10895b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10896c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10897d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10898e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10899f;
    public final i g;

    public j(String id, String url, String title, String category, String logoUrl, String sourceFrom, i type) {
        l.e(id, "id");
        l.e(url, "url");
        l.e(title, "title");
        l.e(category, "category");
        l.e(logoUrl, "logoUrl");
        l.e(sourceFrom, "sourceFrom");
        l.e(type, "type");
        this.f10894a = id;
        this.f10895b = url;
        this.f10896c = title;
        this.f10897d = category;
        this.f10898e = logoUrl;
        this.f10899f = sourceFrom;
        this.g = type;
    }

    public final String toString() {
        return "VideoFavoriteDTO(id='" + this.f10894a + "', url='" + this.f10895b + "', title='" + this.f10896c + "', category='" + this.f10897d + "', logoUrl='" + this.f10898e + "', sourceFrom='" + this.f10899f + "', type=" + this.g + ")";
    }
}
