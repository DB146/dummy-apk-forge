package q5;

import H2.T;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import ma.C1654e;

/* renamed from: q5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1893d extends T implements InterfaceC1890a {
    public static final Parcelable.Creator<C1893d> CREATOR = new C1654e(19);

    /* renamed from: A, reason: collision with root package name */
    public boolean f23489A;

    /* renamed from: e, reason: collision with root package name */
    public float f23490e;

    /* renamed from: f, reason: collision with root package name */
    public float f23491f;

    /* renamed from: u, reason: collision with root package name */
    public int f23492u;

    /* renamed from: v, reason: collision with root package name */
    public float f23493v;

    /* renamed from: w, reason: collision with root package name */
    public int f23494w;

    /* renamed from: x, reason: collision with root package name */
    public int f23495x;

    /* renamed from: y, reason: collision with root package name */
    public int f23496y;

    /* renamed from: z, reason: collision with root package name */
    public int f23497z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeFloat(this.f23490e);
        parcel.writeFloat(this.f23491f);
        parcel.writeInt(this.f23492u);
        parcel.writeFloat(this.f23493v);
        parcel.writeInt(this.f23494w);
        parcel.writeInt(this.f23495x);
        parcel.writeInt(this.f23496y);
        parcel.writeInt(this.f23497z);
        parcel.writeByte(this.f23489A ? (byte) 1 : (byte) 0);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
        parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
    }
}
