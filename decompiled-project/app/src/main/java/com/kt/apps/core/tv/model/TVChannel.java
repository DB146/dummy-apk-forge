package com.kt.apps.core.tv.model;

import A3.c;
import Db.g;
import Db.j;
import Eb.B;
import Eb.p;
import Eb.v;
import H8.b;
import N9.a;
import W9.e;
import W9.h;
import ac.n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.kt.apps.core.extensions.ExtensionsChannel;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.utils.StringUtilsKt;
import com.kt.apps.core.utils.UtilsKt;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import y7.u0;

@Keep
/* loaded from: classes2.dex */
public final class TVChannel implements Parcelable {

    @b("channelId")
    private final String channelId;

    @b("channelNumber")
    private int channelNumber;
    private a currentProgramme;

    @b("isFreeContent")
    private boolean isFreeContent;

    @b("logoChannel")
    private String logoChannel;

    @b("referer")
    private String referer;

    @b("sourceFrom")
    private String sourceFrom;

    @b("tvChannelName")
    private String tvChannelName;

    @b("tvChannelWebDetailPage")
    private String tvChannelWebDetailPage;

    @b("tvGroup")
    private String tvGroup;

    @b("urls")
    private final List<Url> urls;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TVChannel> CREATOR = new Creator();
    private static final g radioGroup$delegate = android.support.v4.media.session.b.z(new S9.a(24));

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<String> getRadioGroup() {
            return (List) TVChannel.radioGroup$delegate.getValue();
        }

        public final TVChannel fromChannelExtensions(ExtensionsChannel entity) {
            l.e(entity, "entity");
            String tvChannelName = entity.getTvChannelName();
            return new TVChannel(entity.getTvGroup(), entity.getLogoChannel(), tvChannelName, entity.getTvStreamLink(), entity.getSourceFrom(), entity.getChannelId(), v.f3891a, false, null, 0, 896, null);
        }

        public final TVChannel fromEntity(W9.f entity) {
            l.e(entity, "entity");
            String uri = entity.f10881b.toString();
            l.d(uri, "toString(...)");
            return new TVChannel(entity.f10880a, uri, entity.f10882c, entity.f10883d, entity.f10884e, entity.f10885f, v.f3891a, false, null, 0, 896, null);
        }

        public final TVChannel fromTVChannelDTO(e value) {
            l.e(value, "value");
            String f4 = value.f();
            return new TVChannel(value.g(), value.c().toString(), f4, "", value.e(), value.a(), v.f3891a, false, null, 0, 896, null);
        }

        public final TVChannel mapToTVChannel(h hVar) {
            Object obj;
            String d10;
            l.e(hVar, "<this>");
            e eVar = hVar.f10888a;
            String g = eVar.g();
            String f4 = eVar.f();
            List<e.a> list = hVar.f10889b;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (l.a(((e.a) obj).c(), MainTVDataSource$TVChannelUrlType.WEB_PAGE.getValue())) {
                    break;
                }
            }
            e.a aVar = (e.a) obj;
            if (aVar == null || (d10 = aVar.d()) == null) {
                d10 = ((e.a) list.get(0)).d();
            }
            String str = d10;
            ArrayList arrayList = new ArrayList(p.S(list, 10));
            for (e.a aVar2 : list) {
                arrayList.add(new Url(aVar2.a(), aVar2.c(), aVar2.d(), null, null, null, null, 120, null));
            }
            return new TVChannel(g, eVar.c(), f4, str, "MAIN_SOURCE", eVar.a(), arrayList, false, null, 0, 896, null);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<TVChannel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TVChannel createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 != readInt; i7++) {
                arrayList.add(Url.CREATOR.createFromParcel(parcel));
            }
            return new TVChannel(readString, readString2, readString3, readString4, readString5, readString6, arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TVChannel[] newArray(int i7) {
            return new TVChannel[i7];
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class Url implements Parcelable {

        @b("dataSource")
        private final String dataSource;

        @b("dynamicId")
        private final String dynamicId;

        @b("origin")
        private final String origin;

        @b("props")
        private final Map<String, String> props;

        @b("referer")
        private final String referer;

        @b("type")
        private final String type;

        @b("url")
        private String url;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Url> CREATOR = new Creator();

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }

            public final Url fromUrl(String url, String type, String str, String str2, String str3, String str4, Map<String, String> map) {
                l.e(url, "url");
                l.e(type, "type");
                return new Url(str, type, url, str2, str3, str4, map);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Url> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Url createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                l.e(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i7 = 0; i7 != readInt; i7++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Url(readString, readString2, readString3, readString4, readString5, readString6, linkedHashMap);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Url[] newArray(int i7) {
                return new Url[i7];
            }
        }

        public Url(String str, String type, String url, String str2, String str3, String str4, Map<String, String> map) {
            l.e(type, "type");
            l.e(url, "url");
            this.dataSource = str;
            this.type = type;
            this.url = url;
            this.referer = str2;
            this.origin = str3;
            this.dynamicId = str4;
            this.props = map;
        }

        public /* synthetic */ Url(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i7, f fVar) {
            this((i7 & 1) != 0 ? null : str, str2, str3, (i7 & 8) != 0 ? null : str4, (i7 & 16) != 0 ? null : str5, (i7 & 32) != 0 ? null : str6, (i7 & 64) != 0 ? null : map);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = url.dataSource;
            }
            if ((i7 & 2) != 0) {
                str2 = url.type;
            }
            String str7 = str2;
            if ((i7 & 4) != 0) {
                str3 = url.url;
            }
            String str8 = str3;
            if ((i7 & 8) != 0) {
                str4 = url.referer;
            }
            String str9 = str4;
            if ((i7 & 16) != 0) {
                str5 = url.origin;
            }
            String str10 = str5;
            if ((i7 & 32) != 0) {
                str6 = url.dynamicId;
            }
            String str11 = str6;
            if ((i7 & 64) != 0) {
                map = url.props;
            }
            return url.copy(str, str7, str8, str9, str10, str11, map);
        }

        public final String component1() {
            return this.dataSource;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.referer;
        }

        public final String component5() {
            return this.origin;
        }

        public final String component6() {
            return this.dynamicId;
        }

        public final Map<String, String> component7() {
            return this.props;
        }

        public final Url copy(String str, String type, String url, String str2, String str3, String str4, Map<String, String> map) {
            l.e(type, "type");
            l.e(url, "url");
            return new Url(str, type, url, str2, str3, str4, map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return l.a(this.dataSource, url.dataSource) && l.a(this.type, url.type) && l.a(this.url, url.url) && l.a(this.referer, url.referer) && l.a(this.origin, url.origin) && l.a(this.dynamicId, url.dynamicId) && l.a(this.props, url.props);
        }

        public final String getDataSource() {
            return this.dataSource;
        }

        public final String getDynamicId() {
            return this.dynamicId;
        }

        public final String getOrigin() {
            return this.origin;
        }

        public final Map<String, String> getProps() {
            return this.props;
        }

        public final String getReferer() {
            return this.referer;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.dataSource;
            int d10 = c.d(c.d((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.url);
            String str2 = this.referer;
            int hashCode = (d10 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.origin;
            int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.dynamicId;
            int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Map<String, String> map = this.props;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        public final boolean isHls() {
            return ac.g.b0(this.url, "m3u8");
        }

        public final void setUrl(String str) {
            l.e(str, "<set-?>");
            this.url = str;
        }

        public String toString() {
            String str = this.dataSource;
            String str2 = this.type;
            String str3 = this.url;
            String str4 = this.referer;
            String str5 = this.origin;
            String str6 = this.dynamicId;
            Map<String, String> map = this.props;
            StringBuilder o10 = c.o("Url(dataSource=", str, ", type=", str2, ", url=");
            o.v(o10, str3, ", referer=", str4, ", origin=");
            o.v(o10, str5, ", dynamicId=", str6, ", props=");
            o10.append(map);
            o10.append(")");
            return o10.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            l.e(dest, "dest");
            dest.writeString(this.dataSource);
            dest.writeString(this.type);
            dest.writeString(this.url);
            dest.writeString(this.referer);
            dest.writeString(this.origin);
            dest.writeString(this.dynamicId);
            Map<String, String> map = this.props;
            if (map == null) {
                dest.writeInt(0);
                return;
            }
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
    }

    public TVChannel(String tvGroup, String logoChannel, String tvChannelName, String tvChannelWebDetailPage, String sourceFrom, String channelId, List<Url> urls, boolean z8, String referer, int i7) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(tvChannelWebDetailPage, "tvChannelWebDetailPage");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        l.e(urls, "urls");
        l.e(referer, "referer");
        this.tvGroup = tvGroup;
        this.logoChannel = logoChannel;
        this.tvChannelName = tvChannelName;
        this.tvChannelWebDetailPage = tvChannelWebDetailPage;
        this.sourceFrom = sourceFrom;
        this.channelId = channelId;
        this.urls = urls;
        this.isFreeContent = z8;
        this.referer = referer;
        this.channelNumber = i7;
    }

    public /* synthetic */ TVChannel(String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z8, String str7, int i7, int i10, f fVar) {
        this(str, str2, str3, str4, str5, str6, (i10 & 64) != 0 ? v.f3891a : list, (i10 & 128) != 0 ? true : z8, (i10 & 256) != 0 ? "" : str7, (i10 & 512) != 0 ? 0 : i7);
    }

    public static /* synthetic */ void getCurrentProgramme$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List radioGroup_delegate$lambda$0() {
        return u0.y("VOV", "VOH");
    }

    public final String component1() {
        return this.tvGroup;
    }

    public final int component10() {
        return this.channelNumber;
    }

    public final String component2() {
        return this.logoChannel;
    }

    public final String component3() {
        return this.tvChannelName;
    }

    public final String component4() {
        return this.tvChannelWebDetailPage;
    }

    public final String component5() {
        return this.sourceFrom;
    }

    public final String component6() {
        return this.channelId;
    }

    public final List<Url> component7() {
        return this.urls;
    }

    public final boolean component8() {
        return this.isFreeContent;
    }

    public final String component9() {
        return this.referer;
    }

    public final TVChannel copy(String tvGroup, String logoChannel, String tvChannelName, String tvChannelWebDetailPage, String sourceFrom, String channelId, List<Url> urls, boolean z8, String referer, int i7) {
        l.e(tvGroup, "tvGroup");
        l.e(logoChannel, "logoChannel");
        l.e(tvChannelName, "tvChannelName");
        l.e(tvChannelWebDetailPage, "tvChannelWebDetailPage");
        l.e(sourceFrom, "sourceFrom");
        l.e(channelId, "channelId");
        l.e(urls, "urls");
        l.e(referer, "referer");
        return new TVChannel(tvGroup, logoChannel, tvChannelName, tvChannelWebDetailPage, sourceFrom, channelId, urls, z8, referer, i7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof TVChannel ? n.T(((TVChannel) obj).channelId, this.channelId, true) : super.equals(obj);
    }

    public final String getChannelId() {
        return this.channelId;
    }

    public final String getChannelIdWithoutSpecialChars() {
        return ac.g.o0(ac.g.n0(UtilsKt.removeAllSpecialChars(this.channelId), "viechannel"), "hd");
    }

    public final int getChannelNumber() {
        return this.channelNumber;
    }

    public final a getCurrentProgramme() {
        return this.currentProgramme;
    }

    public final String getLogoChannel() {
        return this.logoChannel;
    }

    public final Map<String, String> getMapData() {
        j jVar = new j("extra:media_id", this.channelId);
        j jVar2 = new j("extra:media_title", this.tvChannelName);
        a aVar = this.currentProgramme;
        return B.H(jVar, jVar2, new j("extra:media_description", aVar != null ? aVar.b() : ""), new j("extra:media_album_title", this.tvGroup), new j("extra:media_thumb", this.logoChannel), new j("extra:media_album_artist", this.sourceFrom), new j("extra:media_source_type", "TV"));
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

    public final String getTvChannelWebDetailPage() {
        return this.tvChannelWebDetailPage;
    }

    public final String getTvGroup() {
        return this.tvGroup;
    }

    public final String getTvGroupLocalName() {
        return TVChannelGroup.valueOf(this.tvGroup).getValue();
    }

    public final List<Url> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        return this.channelId.hashCode() + c.d(c.d(c.d(c.d(this.tvGroup.hashCode() * 31, 31, this.logoChannel), 31, this.tvChannelName), 31, this.tvChannelWebDetailPage), 31, this.sourceFrom);
    }

    public final boolean isFreeContent() {
        return this.isFreeContent;
    }

    public final boolean isHls() {
        return ac.g.b0(this.tvChannelWebDetailPage, "m3u8");
    }

    public final boolean isRadio() {
        return Companion.getRadioGroup().contains(this.tvGroup);
    }

    public final void setChannelNumber(int i7) {
        this.channelNumber = i7;
    }

    public final void setCurrentProgramme(a aVar) {
        this.currentProgramme = aVar;
    }

    public final void setFreeContent(boolean z8) {
        this.isFreeContent = z8;
    }

    public final void setLogoChannel(String str) {
        l.e(str, "<set-?>");
        this.logoChannel = str;
    }

    public final void setReferer(String str) {
        l.e(str, "<set-?>");
        this.referer = str;
    }

    public final void setSourceFrom(String str) {
        l.e(str, "<set-?>");
        this.sourceFrom = str;
    }

    public final void setTvChannelName(String str) {
        l.e(str, "<set-?>");
        this.tvChannelName = str;
    }

    public final void setTvChannelWebDetailPage(String str) {
        l.e(str, "<set-?>");
        this.tvChannelWebDetailPage = str;
    }

    public final void setTvGroup(String str) {
        l.e(str, "<set-?>");
        this.tvGroup = str;
    }

    public final e toChannelDto() {
        String str = this.tvGroup;
        String str2 = this.logoChannel;
        String str3 = this.tvChannelName;
        String str4 = this.sourceFrom;
        String str5 = this.channelId;
        String lowerCase = str3.toLowerCase(Locale.ROOT);
        l.d(lowerCase, "toLowerCase(...)");
        return new e(str, str2, str3, str4, str5, UtilsKt.removeAllSpecialChars(StringUtilsKt.replaceVNCharsToLatinChars(lowerCase)), this.channelNumber);
    }

    public String toString() {
        String str = this.tvGroup;
        String str2 = this.logoChannel;
        String str3 = this.tvChannelName;
        String str4 = this.tvChannelWebDetailPage;
        String str5 = this.sourceFrom;
        String str6 = this.channelId;
        StringBuilder o10 = c.o("{tvGroup: ", str, ",logoChannel: ", str2, ",tvChannelName: ");
        o.v(o10, str3, ",tvChannelWebDetailPage: \"", str4, "\",sourceFrom: ");
        o10.append(str5);
        o10.append(",channelId: ");
        o10.append(str6);
        o10.append("}");
        return o10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.tvGroup);
        dest.writeString(this.logoChannel);
        dest.writeString(this.tvChannelName);
        dest.writeString(this.tvChannelWebDetailPage);
        dest.writeString(this.sourceFrom);
        dest.writeString(this.channelId);
        List<Url> list = this.urls;
        dest.writeInt(list.size());
        Iterator<Url> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i7);
        }
        dest.writeInt(this.isFreeContent ? 1 : 0);
        dest.writeString(this.referer);
        dest.writeInt(this.channelNumber);
    }
}
