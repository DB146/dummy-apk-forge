package W9;

import h3.o;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @H8.b("tvGroup")
    private String f10870a;

    /* renamed from: b, reason: collision with root package name */
    @H8.b("logoChannel")
    private String f10871b;

    /* renamed from: c, reason: collision with root package name */
    @H8.b("tvChannelName")
    private String f10872c;

    /* renamed from: d, reason: collision with root package name */
    @H8.b("sourceFrom")
    private String f10873d;

    /* renamed from: e, reason: collision with root package name */
    @H8.b("channelId")
    private final String f10874e;

    /* renamed from: f, reason: collision with root package name */
    @H8.b("searchKey")
    private final String f10875f;

    @H8.b("channelNumber")
    private final int g;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @H8.b("src")
        private final String f10876a;

        /* renamed from: b, reason: collision with root package name */
        @H8.b("type")
        private final String f10877b;

        /* renamed from: c, reason: collision with root package name */
        @H8.b("url")
        private final String f10878c;

        /* renamed from: d, reason: collision with root package name */
        @H8.b("tvChannelId")
        private final String f10879d;

        public a(String str, String type, String url, String tvChannelId) {
            l.e(type, "type");
            l.e(url, "url");
            l.e(tvChannelId, "tvChannelId");
            this.f10876a = str;
            this.f10877b = type;
            this.f10878c = url;
            this.f10879d = tvChannelId;
        }

        public final String a() {
            return this.f10876a;
        }

        public final String b() {
            return this.f10879d;
        }

        public final String c() {
            return this.f10877b;
        }

        public final String d() {
            return this.f10878c;
        }

        public final String toString() {
            String str = this.f10876a;
            String str2 = this.f10877b;
            String str3 = this.f10878c;
            String str4 = this.f10879d;
            StringBuilder o10 = A3.c.o("{\"src\": \"", str, "\", \"type\": \"", str2, "\", \"url\": \"");
            o10.append(str3);
            o10.append("\", \"tvChannelId\": \"");
            o10.append(str4);
            o10.append("\"}");
            return o10.toString();
        }
    }

    public e(String tvGroup, String logoChannel, String tvChannelName, String sourceFrom, String channelId, String searchKey, int i7) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        l.e(searchKey, "searchKey");
        this.f10870a = tvGroup;
        this.f10871b = logoChannel;
        this.f10872c = tvChannelName;
        this.f10873d = sourceFrom;
        this.f10874e = channelId;
        this.f10875f = searchKey;
        this.g = i7;
    }

    public final String a() {
        return this.f10874e;
    }

    public final int b() {
        return this.g;
    }

    public final String c() {
        return this.f10871b;
    }

    public final String d() {
        return this.f10875f;
    }

    public final String e() {
        return this.f10873d;
    }

    public final String f() {
        return this.f10872c;
    }

    public final String g() {
        return this.f10870a;
    }

    public final String toString() {
        String str = this.f10870a;
        String str2 = this.f10871b;
        String str3 = this.f10872c;
        String str4 = this.f10873d;
        String str5 = this.f10874e;
        String str6 = this.f10875f;
        StringBuilder o10 = A3.c.o("{\"tvGroup\": \"", str, "\", \"logoChannel\": \"", str2, "\", \"tvChannelName\": \"");
        o.v(o10, str3, "\", \"sourceFrom\": \"", str4, "\", \"channelId\": \"");
        o10.append(str5);
        o10.append("\", \"searchKey\": \"");
        o10.append(str6);
        o10.append("\"}");
        return o10.toString();
    }
}
