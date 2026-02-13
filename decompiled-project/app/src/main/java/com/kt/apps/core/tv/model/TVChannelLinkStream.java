package com.kt.apps.core.tv.model;

import E9.i;
import Eb.p;
import G8.m;
import ac.g;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelURLSrc;
import com.kt.apps.core.tv.datasource.impl.MainTVDataSource$TVChannelUrlType;
import com.kt.apps.core.tv.model.TVChannel;
import h3.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.l;

@Keep
/* loaded from: classes2.dex */
public final class TVChannelLinkStream implements Parcelable {
    public static final Parcelable.Creator<TVChannelLinkStream> CREATOR = new Creator();
    private final TVChannel channel;
    private final List<TVChannel.Url> linkStream;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<TVChannelLinkStream> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TVChannelLinkStream createFromParcel(Parcel parcel) {
            l.e(parcel, "parcel");
            TVChannel createFromParcel = TVChannel.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i7 = 0; i7 != readInt; i7++) {
                arrayList.add(TVChannel.Url.CREATOR.createFromParcel(parcel));
            }
            return new TVChannelLinkStream(createFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TVChannelLinkStream[] newArray(int i7) {
            return new TVChannelLinkStream[i7];
        }
    }

    /* loaded from: classes2.dex */
    public static final class StreamResolution implements Parcelable {
        public static final Parcelable.Creator<StreamResolution> CREATOR = new Creator();
        private final String linkStream;
        private final String type;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<StreamResolution> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StreamResolution createFromParcel(Parcel parcel) {
                l.e(parcel, "parcel");
                return new StreamResolution(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final StreamResolution[] newArray(int i7) {
                return new StreamResolution[i7];
            }
        }

        public StreamResolution(String type, String linkStream) {
            l.e(type, "type");
            l.e(linkStream, "linkStream");
            this.type = type;
            this.linkStream = linkStream;
        }

        public static /* synthetic */ StreamResolution copy$default(StreamResolution streamResolution, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = streamResolution.type;
            }
            if ((i7 & 2) != 0) {
                str2 = streamResolution.linkStream;
            }
            return streamResolution.copy(str, str2);
        }

        public final String component1() {
            return this.type;
        }

        public final String component2() {
            return this.linkStream;
        }

        public final StreamResolution copy(String type, String linkStream) {
            l.e(type, "type");
            l.e(linkStream, "linkStream");
            return new StreamResolution(type, linkStream);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StreamResolution)) {
                return false;
            }
            StreamResolution streamResolution = (StreamResolution) obj;
            return l.a(this.type, streamResolution.type) && l.a(this.linkStream, streamResolution.linkStream);
        }

        public final String getLinkStream() {
            return this.linkStream;
        }

        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            return this.linkStream.hashCode() + (this.type.hashCode() * 31);
        }

        public String toString() {
            return o.n("StreamResolution(type=", this.type, ", linkStream=", this.linkStream, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i7) {
            l.e(dest, "dest");
            dest.writeString(this.type);
            dest.writeString(this.linkStream);
        }
    }

    public TVChannelLinkStream(TVChannel channel, List<TVChannel.Url> linkStream) {
        l.e(channel, "channel");
        l.e(linkStream, "linkStream");
        this.channel = channel;
        this.linkStream = linkStream;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TVChannelLinkStream copy$default(TVChannelLinkStream tVChannelLinkStream, TVChannel tVChannel, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            tVChannel = tVChannelLinkStream.channel;
        }
        if ((i7 & 2) != 0) {
            list = tVChannelLinkStream.linkStream;
        }
        return tVChannelLinkStream.copy(tVChannel, list);
    }

    public final TVChannel component1() {
        return this.channel;
    }

    public final List<TVChannel.Url> component2() {
        return this.linkStream;
    }

    public final TVChannelLinkStream copy(TVChannel channel, List<TVChannel.Url> linkStream) {
        l.e(channel, "channel");
        l.e(linkStream, "linkStream");
        return new TVChannelLinkStream(channel, linkStream);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TVChannelLinkStream)) {
            return false;
        }
        TVChannelLinkStream tVChannelLinkStream = (TVChannelLinkStream) obj;
        return l.a(this.channel, tVChannelLinkStream.channel) && l.a(this.linkStream, tVChannelLinkStream.linkStream);
    }

    public final TVChannel getChannel() {
        return this.channel;
    }

    public final List<i> getInputExoPlayerLink() {
        List<TVChannel.Url> list = this.linkStream;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (l.a(((TVChannel.Url) obj).getType(), MainTVDataSource$TVChannelUrlType.STREAM.getValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (Uri.parse(((TVChannel.Url) next).getUrl()).getHost() != null) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(p.S(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            TVChannel.Url url = (TVChannel.Url) it2.next();
            Log.d("TuanDV", "Map: " + url);
            String url2 = url.getUrl();
            String referer = url.getReferer();
            if (referer == null) {
                referer = this.channel.getReferer();
            }
            arrayList3.add(new i(url2, referer, this.channel.getChannelId(), g.b0(url.getUrl(), "m3u8") || l.a(url.getDataSource(), MainTVDataSource$TVChannelURLSrc.IPTV_BACKUP.getValue())));
        }
        return arrayList3;
    }

    public final List<TVChannel.Url> getLinkReadyToStream() {
        List<TVChannel.Url> list = this.linkStream;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (l.a(((TVChannel.Url) obj).getType(), MainTVDataSource$TVChannelUrlType.STREAM.getValue())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<TVChannel.Url> getLinkStream() {
        return this.linkStream;
    }

    public int hashCode() {
        return this.linkStream.hashCode() + (this.channel.hashCode() * 31);
    }

    public String toString() {
        return "{channel: " + this.channel + ",linkStream: " + new m().f(this.linkStream) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i7) {
        l.e(dest, "dest");
        this.channel.writeToParcel(dest, i7);
        List<TVChannel.Url> list = this.linkStream;
        dest.writeInt(list.size());
        Iterator<TVChannel.Url> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i7);
        }
    }
}
