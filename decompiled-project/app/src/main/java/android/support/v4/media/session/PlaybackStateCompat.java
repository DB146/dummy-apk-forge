package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);

    /* renamed from: a, reason: collision with root package name */
    public final int f12861a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12862b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12863c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12864d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12865e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12866f;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f12867u;

    /* renamed from: v, reason: collision with root package name */
    public final long f12868v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f12869w;

    /* renamed from: x, reason: collision with root package name */
    public final long f12870x;

    /* renamed from: y, reason: collision with root package name */
    public final Bundle f12871y;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: a, reason: collision with root package name */
        public final String f12872a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f12873b;

        /* renamed from: c, reason: collision with root package name */
        public final int f12874c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f12875d;

        public CustomAction(Parcel parcel) {
            this.f12872a = parcel.readString();
            this.f12873b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f12874c = parcel.readInt();
            this.f12875d = parcel.readBundle(b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f12873b) + ", mIcon=" + this.f12874c + ", mExtras=" + this.f12875d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f12872a);
            TextUtils.writeToParcel(this.f12873b, parcel, i7);
            parcel.writeInt(this.f12874c);
            parcel.writeBundle(this.f12875d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f12861a = parcel.readInt();
        this.f12862b = parcel.readLong();
        this.f12864d = parcel.readFloat();
        this.f12868v = parcel.readLong();
        this.f12863c = parcel.readLong();
        this.f12865e = parcel.readLong();
        this.f12867u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f12869w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f12870x = parcel.readLong();
        this.f12871y = parcel.readBundle(b.class.getClassLoader());
        this.f12866f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f12861a);
        sb2.append(", position=");
        sb2.append(this.f12862b);
        sb2.append(", buffered position=");
        sb2.append(this.f12863c);
        sb2.append(", speed=");
        sb2.append(this.f12864d);
        sb2.append(", updated=");
        sb2.append(this.f12868v);
        sb2.append(", actions=");
        sb2.append(this.f12865e);
        sb2.append(", error code=");
        sb2.append(this.f12866f);
        sb2.append(", error message=");
        sb2.append(this.f12867u);
        sb2.append(", custom actions=");
        sb2.append(this.f12869w);
        sb2.append(", active item id=");
        return X.c.f(this.f12870x, "}", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f12861a);
        parcel.writeLong(this.f12862b);
        parcel.writeFloat(this.f12864d);
        parcel.writeLong(this.f12868v);
        parcel.writeLong(this.f12863c);
        parcel.writeLong(this.f12865e);
        TextUtils.writeToParcel(this.f12867u, parcel, i7);
        parcel.writeTypedList(this.f12869w);
        parcel.writeLong(this.f12870x);
        parcel.writeBundle(this.f12871y);
        parcel.writeInt(this.f12866f);
    }
}
