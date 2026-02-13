package com.kt.apps.core.tv.model;

import A3.c;
import android.os.Parcel;
import android.os.Parcelable;
import h3.o;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class ChannelSourceConfig implements Parcelable {
    public static final Parcelable.Creator<ChannelSourceConfig> CREATOR = new Creator();
    private String baseUrl;
    private String getLinkStreamPath;
    private String mainPagePath;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ChannelSourceConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelSourceConfig createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            return new ChannelSourceConfig(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelSourceConfig[] newArray(int i7) {
            return new ChannelSourceConfig[i7];
        }
    }

    public ChannelSourceConfig(String baseUrl, String mainPagePath, String str) {
        l.e(baseUrl, "baseUrl");
        l.e(mainPagePath, "mainPagePath");
        this.baseUrl = baseUrl;
        this.mainPagePath = mainPagePath;
        this.getLinkStreamPath = str;
    }

    public /* synthetic */ ChannelSourceConfig(String str, String str2, String str3, int i7, f fVar) {
        this(str, str2, (i7 & 4) != 0 ? null : str3);
    }

    public static /* synthetic */ ChannelSourceConfig copy$default(ChannelSourceConfig channelSourceConfig, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = channelSourceConfig.baseUrl;
        }
        if ((i7 & 2) != 0) {
            str2 = channelSourceConfig.mainPagePath;
        }
        if ((i7 & 4) != 0) {
            str3 = channelSourceConfig.getLinkStreamPath;
        }
        return channelSourceConfig.copy(str, str2, str3);
    }

    public final String component1() {
        return this.baseUrl;
    }

    public final String component2() {
        return this.mainPagePath;
    }

    public final String component3() {
        return this.getLinkStreamPath;
    }

    public final ChannelSourceConfig copy(String baseUrl, String mainPagePath, String str) {
        l.e(baseUrl, "baseUrl");
        l.e(mainPagePath, "mainPagePath");
        return new ChannelSourceConfig(baseUrl, mainPagePath, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelSourceConfig)) {
            return false;
        }
        ChannelSourceConfig channelSourceConfig = (ChannelSourceConfig) obj;
        return l.a(this.baseUrl, channelSourceConfig.baseUrl) && l.a(this.mainPagePath, channelSourceConfig.mainPagePath) && l.a(this.getLinkStreamPath, channelSourceConfig.getLinkStreamPath);
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getGetLinkStreamPath() {
        return this.getLinkStreamPath;
    }

    public final String getMainPagePath() {
        return this.mainPagePath;
    }

    public int hashCode() {
        int d10 = c.d(this.baseUrl.hashCode() * 31, 31, this.mainPagePath);
        String str = this.getLinkStreamPath;
        return d10 + (str == null ? 0 : str.hashCode());
    }

    public final void setBaseUrl(String str) {
        l.e(str, "<set-?>");
        this.baseUrl = str;
    }

    public final void setGetLinkStreamPath(String str) {
        this.getLinkStreamPath = str;
    }

    public final void setMainPagePath(String str) {
        l.e(str, "<set-?>");
        this.mainPagePath = str;
    }

    public String toString() {
        String str = this.baseUrl;
        String str2 = this.mainPagePath;
        return o.p(c.o("ChannelSourceConfig(baseUrl=", str, ", mainPagePath=", str2, ", getLinkStreamPath="), this.getLinkStreamPath, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        dest.writeString(this.baseUrl);
        dest.writeString(this.mainPagePath);
        dest.writeString(this.getLinkStreamPath);
    }
}
