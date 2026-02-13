package W1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: W1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0560c implements Parcelable {
    public static final Parcelable.Creator<C0560c> CREATOR = new U5.a0(15);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10450a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f10451b;

    public C0560c(Parcel parcel) {
        this.f10450a = parcel.createStringArrayList();
        this.f10451b = parcel.createTypedArrayList(C0559b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f10450a);
        parcel.writeTypedList(this.f10451b);
    }
}
