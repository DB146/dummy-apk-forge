package E5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3679a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f3679a) {
            case 0:
                int d02 = com.bumptech.glide.c.d0(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < d02) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        com.bumptech.glide.c.b0(readInt, parcel);
                    } else {
                        intent = (Intent) com.bumptech.glide.c.q(parcel, readInt, Intent.CREATOR);
                    }
                }
                com.bumptech.glide.c.y(d02, parcel);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        switch (this.f3679a) {
            case 0:
                return new a[i7];
            default:
                return new g[i7];
        }
    }
}
