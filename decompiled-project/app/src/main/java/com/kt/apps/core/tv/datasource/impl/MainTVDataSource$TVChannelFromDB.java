package com.kt.apps.core.tv.datasource.impl;

import A3.c;
import Eb.v;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

@Keep
/* loaded from: classes2.dex */
public final class MainTVDataSource$TVChannelFromDB {
    private int channelNumber;
    private String group;
    private String id;
    private Boolean isRadio;
    private String name;
    private String thumb;
    private List<Url> urls;

    @Keep
    /* loaded from: classes2.dex */
    public static final class Url {
        private final String dynamicId;
        private final String src;
        private final String type;
        private final String url;

        public Url() {
            this(null, null, null, null, 15, null);
        }

        public Url(String str) {
            this(str, null, null, null, 14, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Url(String str, String type) {
            this(str, type, null, null, 12, null);
            l.e(type, "type");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Url(String str, String type, String url) {
            this(str, type, url, null, 8, null);
            l.e(type, "type");
            l.e(url, "url");
        }

        public Url(String str, String type, String url, String str2) {
            l.e(type, "type");
            l.e(url, "url");
            this.src = str;
            this.type = type;
            this.url = url;
            this.dynamicId = str2;
        }

        public /* synthetic */ Url(String str, String str2, String str3, String str4, int i7, f fVar) {
            this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? null : str4);
        }

        public static /* synthetic */ Url copy$default(Url url, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = url.src;
            }
            if ((i7 & 2) != 0) {
                str2 = url.type;
            }
            if ((i7 & 4) != 0) {
                str3 = url.url;
            }
            if ((i7 & 8) != 0) {
                str4 = url.dynamicId;
            }
            return url.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.src;
        }

        public final String component2() {
            return this.type;
        }

        public final String component3() {
            return this.url;
        }

        public final String component4() {
            return this.dynamicId;
        }

        public final Url copy(String str, String type, String url, String str2) {
            l.e(type, "type");
            l.e(url, "url");
            return new Url(str, type, url, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Url)) {
                return false;
            }
            Url url = (Url) obj;
            return l.a(this.src, url.src) && l.a(this.type, url.type) && l.a(this.url, url.url) && l.a(this.dynamicId, url.dynamicId);
        }

        public final String getDynamicId() {
            return this.dynamicId;
        }

        public final String getSrc() {
            return this.src;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.src;
            int d10 = c.d(c.d((str == null ? 0 : str.hashCode()) * 31, 31, this.type), 31, this.url);
            String str2 = this.dynamicId;
            return d10 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.src;
            String str2 = this.type;
            String str3 = this.url;
            String str4 = this.dynamicId;
            StringBuilder o10 = c.o("Url(src=", str, ", type=", str2, ", url=");
            o10.append(str3);
            o10.append(", dynamicId=");
            o10.append(str4);
            o10.append(")");
            return o10.toString();
        }
    }

    public MainTVDataSource$TVChannelFromDB() {
        this(null, null, null, null, null, null, 0, 127, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group) {
        this(group, null, null, null, null, null, 0, 126, null);
        l.e(group, "group");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group, String id) {
        this(group, id, null, null, null, null, 0, 124, null);
        l.e(group, "group");
        l.e(id, "id");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group, String id, Boolean bool) {
        this(group, id, bool, null, null, null, 0, 120, null);
        l.e(group, "group");
        l.e(id, "id");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group, String id, Boolean bool, String name) {
        this(group, id, bool, name, null, null, 0, 112, null);
        l.e(group, "group");
        l.e(id, "id");
        l.e(name, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group, String id, Boolean bool, String name, String thumb) {
        this(group, id, bool, name, thumb, null, 0, 96, null);
        l.e(group, "group");
        l.e(id, "id");
        l.e(name, "name");
        l.e(thumb, "thumb");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainTVDataSource$TVChannelFromDB(String group, String id, Boolean bool, String name, String thumb, List<Url> urls) {
        this(group, id, bool, name, thumb, urls, 0, 64, null);
        l.e(group, "group");
        l.e(id, "id");
        l.e(name, "name");
        l.e(thumb, "thumb");
        l.e(urls, "urls");
    }

    public MainTVDataSource$TVChannelFromDB(String group, String id, Boolean bool, String name, String thumb, List<Url> urls, int i7) {
        l.e(group, "group");
        l.e(id, "id");
        l.e(name, "name");
        l.e(thumb, "thumb");
        l.e(urls, "urls");
        this.group = group;
        this.id = id;
        this.isRadio = bool;
        this.name = name;
        this.thumb = thumb;
        this.urls = urls;
        this.channelNumber = i7;
    }

    public /* synthetic */ MainTVDataSource$TVChannelFromDB(String str, String str2, Boolean bool, String str3, String str4, List list, int i7, int i10, f fVar) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? Boolean.FALSE : bool, (i10 & 8) != 0 ? "" : str3, (i10 & 16) == 0 ? str4 : "", (i10 & 32) != 0 ? v.f3891a : list, (i10 & 64) != 0 ? 0 : i7);
    }

    public static /* synthetic */ MainTVDataSource$TVChannelFromDB copy$default(MainTVDataSource$TVChannelFromDB mainTVDataSource$TVChannelFromDB, String str, String str2, Boolean bool, String str3, String str4, List list, int i7, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = mainTVDataSource$TVChannelFromDB.group;
        }
        if ((i10 & 2) != 0) {
            str2 = mainTVDataSource$TVChannelFromDB.id;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            bool = mainTVDataSource$TVChannelFromDB.isRadio;
        }
        Boolean bool2 = bool;
        if ((i10 & 8) != 0) {
            str3 = mainTVDataSource$TVChannelFromDB.name;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            str4 = mainTVDataSource$TVChannelFromDB.thumb;
        }
        String str7 = str4;
        if ((i10 & 32) != 0) {
            list = mainTVDataSource$TVChannelFromDB.urls;
        }
        List list2 = list;
        if ((i10 & 64) != 0) {
            i7 = mainTVDataSource$TVChannelFromDB.channelNumber;
        }
        return mainTVDataSource$TVChannelFromDB.copy(str, str5, bool2, str6, str7, list2, i7);
    }

    public final String component1() {
        return this.group;
    }

    public final String component2() {
        return this.id;
    }

    public final Boolean component3() {
        return this.isRadio;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.thumb;
    }

    public final List<Url> component6() {
        return this.urls;
    }

    public final int component7() {
        return this.channelNumber;
    }

    public final MainTVDataSource$TVChannelFromDB copy(String group, String id, Boolean bool, String name, String thumb, List<Url> urls, int i7) {
        l.e(group, "group");
        l.e(id, "id");
        l.e(name, "name");
        l.e(thumb, "thumb");
        l.e(urls, "urls");
        return new MainTVDataSource$TVChannelFromDB(group, id, bool, name, thumb, urls, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainTVDataSource$TVChannelFromDB)) {
            return false;
        }
        MainTVDataSource$TVChannelFromDB mainTVDataSource$TVChannelFromDB = (MainTVDataSource$TVChannelFromDB) obj;
        return l.a(this.group, mainTVDataSource$TVChannelFromDB.group) && l.a(this.id, mainTVDataSource$TVChannelFromDB.id) && l.a(this.isRadio, mainTVDataSource$TVChannelFromDB.isRadio) && l.a(this.name, mainTVDataSource$TVChannelFromDB.name) && l.a(this.thumb, mainTVDataSource$TVChannelFromDB.thumb) && l.a(this.urls, mainTVDataSource$TVChannelFromDB.urls) && this.channelNumber == mainTVDataSource$TVChannelFromDB.channelNumber;
    }

    public final int getChannelNumber() {
        return this.channelNumber;
    }

    public final String getGroup() {
        return this.group;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getThumb() {
        return this.thumb;
    }

    public final List<Url> getUrls() {
        return this.urls;
    }

    public int hashCode() {
        int d10 = c.d(this.group.hashCode() * 31, 31, this.id);
        Boolean bool = this.isRadio;
        return Integer.hashCode(this.channelNumber) + ((this.urls.hashCode() + c.d(c.d((d10 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.name), 31, this.thumb)) * 31);
    }

    public final Boolean isRadio() {
        return this.isRadio;
    }

    public final void setChannelNumber(int i7) {
        this.channelNumber = i7;
    }

    public final void setGroup(String str) {
        l.e(str, "<set-?>");
        this.group = str;
    }

    public final void setId(String str) {
        l.e(str, "<set-?>");
        this.id = str;
    }

    public final void setName(String str) {
        l.e(str, "<set-?>");
        this.name = str;
    }

    public final void setRadio(Boolean bool) {
        this.isRadio = bool;
    }

    public final void setThumb(String str) {
        l.e(str, "<set-?>");
        this.thumb = str;
    }

    public final void setUrls(List<Url> list) {
        l.e(list, "<set-?>");
        this.urls = list;
    }

    public String toString() {
        String str = this.group;
        String str2 = this.id;
        Boolean bool = this.isRadio;
        String str3 = this.name;
        String str4 = this.thumb;
        List<Url> list = this.urls;
        int i7 = this.channelNumber;
        StringBuilder o10 = c.o("TVChannelFromDB(group=", str, ", id=", str2, ", isRadio=");
        o10.append(bool);
        o10.append(", name=");
        o10.append(str3);
        o10.append(", thumb=");
        o10.append(str4);
        o10.append(", urls=");
        o10.append(list);
        o10.append(", channelNumber=");
        return c.k(o10, i7, ")");
    }
}
