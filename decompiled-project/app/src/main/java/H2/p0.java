package H2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new B5.c(13);

    /* renamed from: a, reason: collision with root package name */
    public int f4773a;

    /* renamed from: b, reason: collision with root package name */
    public int f4774b;

    /* renamed from: c, reason: collision with root package name */
    public int f4775c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f4776d;

    /* renamed from: e, reason: collision with root package name */
    public int f4777e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4778f;

    /* renamed from: u, reason: collision with root package name */
    public ArrayList f4779u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4780v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4781w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4782x;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f4773a);
        parcel.writeInt(this.f4774b);
        parcel.writeInt(this.f4775c);
        if (this.f4775c > 0) {
            parcel.writeIntArray(this.f4776d);
        }
        parcel.writeInt(this.f4777e);
        if (this.f4777e > 0) {
            parcel.writeIntArray(this.f4778f);
        }
        parcel.writeInt(this.f4780v ? 1 : 0);
        parcel.writeInt(this.f4781w ? 1 : 0);
        parcel.writeInt(this.f4782x ? 1 : 0);
        parcel.writeList(this.f4779u);
    }
}
