package W1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class V implements Parcelable {
    public static final Parcelable.Creator<V> CREATOR = new U5.a0(17);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f10378a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10379b;

    /* renamed from: c, reason: collision with root package name */
    public C0559b[] f10380c;

    /* renamed from: d, reason: collision with root package name */
    public int f10381d;

    /* renamed from: e, reason: collision with root package name */
    public String f10382e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f10383f;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f10384u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f10385v;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10378a);
        parcel.writeStringList(this.f10379b);
        parcel.writeTypedArray(this.f10380c, i7);
        parcel.writeInt(this.f10381d);
        parcel.writeString(this.f10382e);
        parcel.writeStringList(this.f10383f);
        parcel.writeTypedList(this.f10384u);
        parcel.writeTypedList(this.f10385v);
    }
}
