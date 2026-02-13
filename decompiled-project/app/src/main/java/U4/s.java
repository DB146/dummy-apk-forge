package U4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9673a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f9673a) {
            case 0:
                return new u(parcel);
            default:
                return new t(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f9673a) {
            case 0:
                return new u[i7];
            default:
                return new t[i7];
        }
    }
}
