package Ua;

import U5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes2.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new a0(5);

    /* renamed from: a, reason: collision with root package name */
    public float f9922a;

    /* renamed from: b, reason: collision with root package name */
    public float f9923b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9924c;

    /* renamed from: d, reason: collision with root package name */
    public float f9925d;

    /* renamed from: e, reason: collision with root package name */
    public int f9926e;

    /* renamed from: f, reason: collision with root package name */
    public int f9927f;

    /* renamed from: u, reason: collision with root package name */
    public int f9928u;

    /* renamed from: v, reason: collision with root package name */
    public int f9929v;

    /* renamed from: w, reason: collision with root package name */
    public int f9930w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f9931x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f9932y;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeFloat(this.f9922a);
        parcel.writeFloat(this.f9923b);
        parcel.writeByte(this.f9924c ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.f9925d);
        parcel.writeInt(this.f9926e);
        parcel.writeInt(this.f9927f);
        parcel.writeInt(this.f9928u);
        parcel.writeInt(this.f9929v);
        parcel.writeInt(this.f9930w);
        parcel.writeByte(this.f9931x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9932y ? (byte) 1 : (byte) 0);
    }
}
