package com.kt.apps.core.extensions;

import A3.c;
import Db.j;
import Eb.B;
import M9.a;
import ac.g;
import ac.n;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import h3.o;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Keep
/* loaded from: classes2.dex */
public final class ExtensionsChannel implements Parcelable {
    public static final Parcelable.Creator<ExtensionsChannel> CREATOR = new a(0);
    private final String catchupSource;
    private final String channelId;
    private final long channelPreviewProviderId;
    private N9.a currentProgramme;
    private final String extensionSourceId;
    private final boolean isHls;
    private final String logoChannel;
    private final Map<String, String> props;
    private final String referer;
    private final String sourceFrom;
    private final String tvChannelName;
    private String tvGroup;
    private final String tvStreamLink;
    private final String userAgent;

    public ExtensionsChannel(String tvGroup, String logoChannel, String tvChannelName, String tvStreamLink, String sourceFrom, String channelId, long j, boolean z8, String catchupSource, String userAgent, String referer, Map<String, String> map, String extensionSourceId) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(tvStreamLink, "tvStreamLink");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        l.e(catchupSource, "catchupSource");
        l.e(userAgent, "userAgent");
        l.e(referer, "referer");
        l.e(extensionSourceId, "extensionSourceId");
        this.tvGroup = tvGroup;
        this.logoChannel = logoChannel;
        this.tvChannelName = tvChannelName;
        this.tvStreamLink = tvStreamLink;
        this.sourceFrom = sourceFrom;
        this.channelId = channelId;
        this.channelPreviewProviderId = j;
        this.isHls = z8;
        this.catchupSource = catchupSource;
        this.userAgent = userAgent;
        this.referer = referer;
        this.props = map;
        this.extensionSourceId = extensionSourceId;
    }

    public /* synthetic */ ExtensionsChannel(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z8, String str7, String str8, String str9, Map map, String str10, int i7, f fVar) {
        this(str, str2, str3, str4, str5, str6, (i7 & 64) != 0 ? -1L : j, z8, (i7 & 256) != 0 ? "" : str7, (i7 & 512) != 0 ? "" : str8, (i7 & 1024) != 0 ? "" : str9, (i7 & 2048) != 0 ? null : map, str10);
    }

    public static /* synthetic */ void getCurrentProgramme$annotations() {
    }

    public final String component1() {
        return this.tvGroup;
    }

    public final String component10() {
        return this.userAgent;
    }

    public final String component11() {
        return this.referer;
    }

    public final Map<String, String> component12() {
        return this.props;
    }

    public final String component13() {
        return this.extensionSourceId;
    }

    public final String component2() {
        return this.logoChannel;
    }

    public final String component3() {
        return this.tvChannelName;
    }

    public final String component4() {
        return this.tvStreamLink;
    }

    public final String component5() {
        return this.sourceFrom;
    }

    public final String component6() {
        return this.channelId;
    }

    public final long component7() {
        return this.channelPreviewProviderId;
    }

    public final boolean component8() {
        return this.isHls;
    }

    public final String component9() {
        return this.catchupSource;
    }

    public final ExtensionsChannel copy(String tvGroup, String logoChannel, String tvChannelName, String tvStreamLink, String sourceFrom, String channelId, long j, boolean z8, String catchupSource, String userAgent, String referer, Map<String, String> map, String extensionSourceId) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(tvStreamLink, "tvStreamLink");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        l.e(catchupSource, "catchupSource");
        l.e(userAgent, "userAgent");
        l.e(referer, "referer");
        l.e(extensionSourceId, "extensionSourceId");
        return new ExtensionsChannel(tvGroup, logoChannel, tvChannelName, tvStreamLink, sourceFrom, channelId, j, z8, catchupSource, userAgent, referer, map, extensionSourceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtensionsChannel)) {
            return false;
        }
        ExtensionsChannel extensionsChannel = (ExtensionsChannel) obj;
        return l.a(this.tvGroup, extensionsChannel.tvGroup) && l.a(this.logoChannel, extensionsChannel.logoChannel) && l.a(this.tvChannelName, extensionsChannel.tvChannelName) && l.a(this.tvStreamLink, extensionsChannel.tvStreamLink) && l.a(this.sourceFrom, extensionsChannel.sourceFrom) && l.a(this.channelId, extensionsChannel.channelId) && this.channelPreviewProviderId == extensionsChannel.channelPreviewProviderId && this.isHls == extensionsChannel.isHls && l.a(this.catchupSource, extensionsChannel.catchupSource) && l.a(this.userAgent, extensionsChannel.userAgent) && l.a(this.referer, extensionsChannel.referer) && l.a(this.props, extensionsChannel.props) && l.a(this.extensionSourceId, extensionsChannel.extensionSourceId);
    }

    public final String getCatchupSource() {
        return this.catchupSource;
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final long getChannelPreviewProviderId() {
        return this.channelPreviewProviderId;
    }

    public final N9.a getCurrentProgramme() {
        return this.currentProgramme;
    }

    public final String getExtensionSourceId() {
        return this.extensionSourceId;
    }

    public final String getLogoChannel() {
        return this.logoChannel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map<String, String> getMapData() {
        String str;
        j jVar = new j("extra:media_id", this.channelId);
        j jVar2 = new j("extra:media_title", this.tvChannelName);
        N9.a aVar = this.currentProgramme;
        if (aVar != null && (str = aVar.f7394f) != null) {
            if (g.h0(str)) {
                str = null;
            }
        }
        str = this.tvGroup;
        return B.H(jVar, jVar2, new j("extra:media_description", str), new j("extra:media_album_title", this.tvGroup), new j("extra:media_thumb", this.logoChannel), new j("extra:media_album_artist", this.extensionSourceId), new j("extra:media_source_type", "IPTV"));
    }

    public final Map<String, String> getProps() {
        return this.props;
    }

    public final String getReferer() {
        return this.referer;
    }

    public final String getSourceFrom() {
        return this.sourceFrom;
    }

    public final String getTvChannelName() {
        return this.tvChannelName;
    }

    public final String getTvGroup() {
        return this.tvGroup;
    }

    public final String getTvStreamLink() {
        return this.tvStreamLink;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public int hashCode() {
        int d10 = c.d(c.d(c.d(o.g(this.isHls, o.f(c.d(c.d(c.d(c.d(c.d(this.tvGroup.hashCode() * 31, 31, this.logoChannel), 31, this.tvChannelName), 31, this.tvStreamLink), 31, this.sourceFrom), 31, this.channelId), 31, this.channelPreviewProviderId), 31), 31, this.catchupSource), 31, this.userAgent), 31, this.referer);
        Map<String, String> map = this.props;
        return this.extensionSourceId.hashCode() + ((d10 + (map == null ? 0 : map.hashCode())) * 31);
    }

    public final boolean isHls() {
        return this.isHls;
    }

    public final boolean isValidChannel() {
        if (g.h0(this.tvGroup) || Uri.parse(this.tvStreamLink).getHost() == null || g.b0(this.tvChannelName, "Donate")) {
            return false;
        }
        String str = this.tvChannelName;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        l.d(lowerCase, "toLowerCase(...)");
        if (n.Y(lowerCase, "tham gia group", false)) {
            return false;
        }
        String lowerCase2 = this.tvChannelName.toLowerCase(locale);
        l.d(lowerCase2, "toLowerCase(...)");
        return !n.Y(lowerCase2, "nhóm zalo", false);
    }

    public final void setCurrentProgramme(N9.a aVar) {
        this.currentProgramme = aVar;
    }

    public final void setTvGroup(String str) {
        l.e(str, "<set-?>");
        this.tvGroup = str;
    }

    public String toString() {
        String str = this.channelId;
        String str2 = this.tvGroup;
        String str3 = this.logoChannel;
        String str4 = this.tvChannelName;
        String str5 = this.tvStreamLink;
        String str6 = this.sourceFrom;
        long j = this.channelPreviewProviderId;
        boolean z8 = this.isHls;
        String str7 = this.catchupSource;
        String str8 = this.userAgent;
        String str9 = this.referer;
        String str10 = this.extensionSourceId;
        Map<String, String> map = this.props;
        N9.a aVar = this.currentProgramme;
        StringBuilder o10 = c.o("{channelId=", str, ",\ntvGroup=", str2, ",\nlogoChannel=");
        o.v(o10, str3, ",\ntvChannelName=", str4, ",\ntvStreamLink=");
        o.v(o10, str5, ",\nsourceFrom=", str6, ",\nchannelPreviewProviderId=");
        o10.append(j);
        o10.append(",\nisHls=");
        o10.append(z8);
        o.v(o10, ",\ncatchupSource=", str7, ",\nuserAgent=", str8);
        o.v(o10, ",\nreferer=", str9, ",\nextensionSourceId=", str10);
        o10.append(",\nprops=");
        o10.append(map);
        o10.append(",currentProgramme: ");
        o10.append(aVar);
        o10.append("}");
        return o10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.tvGroup);
        dest.writeString(this.logoChannel);
        dest.writeString(this.tvChannelName);
        dest.writeString(this.tvStreamLink);
        dest.writeString(this.sourceFrom);
        dest.writeString(this.channelId);
        dest.writeLong(this.channelPreviewProviderId);
        dest.writeInt(this.isHls ? 1 : 0);
        dest.writeString(this.catchupSource);
        dest.writeString(this.userAgent);
        dest.writeString(this.referer);
        Map<String, String> map = this.props;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        dest.writeString(this.extensionSourceId);
    }
}
