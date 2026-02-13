package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12876a;

    public /* synthetic */ a(int i7) {
        this.f12876a = i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f12876a) {
            case 0:
                ?? obj = new Object();
                obj.f12853a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return obj;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f12851a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f12852b;

                    {
                        this.f12851a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f12852b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        StringBuilder sb2 = new StringBuilder("MediaSession.QueueItem {Description=");
                        sb2.append(this.f12851a);
                        sb2.append(", Id=");
                        return X.c.f(this.f12852b, " }", sb2);
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        this.f12851a.writeToParcel(parcel2, i7);
                        parcel2.writeLong(this.f12852b);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: a, reason: collision with root package name */
                    public final Object f12854a;

                    /* renamed from: b, reason: collision with root package name */
                    public final Parcelable f12855b;

                    {
                        this.f12855b = readParcelable;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        if (!(obj2 instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj2;
                        Parcelable parcelable = this.f12855b;
                        if (parcelable == null) {
                            return mediaSessionCompat$Token.f12855b == null;
                        }
                        Parcelable parcelable2 = mediaSessionCompat$Token.f12855b;
                        if (parcelable2 == null) {
                            return false;
                        }
                        return parcelable.equals(parcelable2);
                    }

                    public final int hashCode() {
                        Parcelable parcelable = this.f12855b;
                        if (parcelable == null) {
                            return 0;
                        }
                        return parcelable.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i7) {
                        parcel2.writeParcelable(this.f12855b, i7);
                    }
                };
            case 3:
                ?? obj2 = new Object();
                obj2.f12856a = parcel.readInt();
                obj2.f12858c = parcel.readInt();
                obj2.f12859d = parcel.readInt();
                obj2.f12860e = parcel.readInt();
                obj2.f12857b = parcel.readInt();
                return obj2;
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f12876a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i7];
            case 1:
                return new MediaSessionCompat$QueueItem[i7];
            case 2:
                return new MediaSessionCompat$Token[i7];
            case 3:
                return new ParcelableVolumeInfo[i7];
            default:
                return new PlaybackStateCompat[i7];
        }
    }
}
