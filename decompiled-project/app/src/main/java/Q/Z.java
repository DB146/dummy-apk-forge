package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class Z implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8372a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f8372a) {
            case 0:
                return new C0479a0(parcel.readFloat());
            case 1:
                return new C0481b0(parcel.readInt());
            default:
                return new C0483c0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f8372a) {
            case 0:
                return new C0479a0[i7];
            case 1:
                return new C0481b0[i7];
            default:
                return new C0483c0[i7];
        }
    }
}
