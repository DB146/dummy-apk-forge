package V9;

import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f10234a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10235b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10236c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10237d;

    public a(String configSourceUrl, String categoryName, String tvChannelName, String logoChannel, String tvStreamLink, String sourceFrom) {
        l.e(configSourceUrl, "configSourceUrl");
        l.e(categoryName, "categoryName");
        l.e(tvChannelName, "tvChannelName");
        l.e(logoChannel, "logoChannel");
        l.e(tvStreamLink, "tvStreamLink");
        l.e(sourceFrom, "sourceFrom");
        this.f10234a = categoryName;
        this.f10235b = tvChannelName;
        this.f10236c = logoChannel;
        this.f10237d = tvStreamLink;
    }
}
