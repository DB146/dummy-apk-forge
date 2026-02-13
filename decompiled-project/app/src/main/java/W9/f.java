package W9;

import android.net.Uri;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f10880a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10882c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10883d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10884e;

    /* renamed from: f, reason: collision with root package name */
    public final String f10885f;
    public final long g;

    public f(String tvGroup, Uri logoChannel, String tvChannelName, String tvChannelWebDetailPage, String sourceFrom, String channelId, long j) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(tvChannelWebDetailPage, "tvChannelWebDetailPage");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        this.f10880a = tvGroup;
        this.f10881b = logoChannel;
        this.f10882c = tvChannelName;
        this.f10883d = tvChannelWebDetailPage;
        this.f10884e = sourceFrom;
        this.f10885f = channelId;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return l.a(this.f10880a, fVar.f10880a) && l.a(this.f10881b, fVar.f10881b) && l.a(this.f10882c, fVar.f10882c) && l.a(this.f10883d, fVar.f10883d) && l.a(this.f10884e, fVar.f10884e) && l.a(this.f10885f, fVar.f10885f) && this.g == fVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + A3.c.d(A3.c.d(A3.c.d(A3.c.d((this.f10881b.hashCode() + (this.f10880a.hashCode() * 31)) * 31, 31, this.f10882c), 31, this.f10883d), 31, this.f10884e), 31, this.f10885f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TVChannelEntity(tvGroup=");
        sb2.append(this.f10880a);
        sb2.append(", logoChannel=");
        sb2.append(this.f10881b);
        sb2.append(", tvChannelName=");
        sb2.append(this.f10882c);
        sb2.append(", tvChannelWebDetailPage=");
        sb2.append(this.f10883d);
        sb2.append(", sourceFrom=");
        sb2.append(this.f10884e);
        sb2.append(", channelId=");
        sb2.append(this.f10885f);
        sb2.append(", channelPreviewProviderId=");
        return X.c.f(this.g, ")", sb2);
    }
}
