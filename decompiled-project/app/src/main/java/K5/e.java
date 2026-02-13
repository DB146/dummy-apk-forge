package K5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int d02 = com.bumptech.glide.c.d0(parcel);
        String str = null;
        String str2 = null;
        J5.b bVar = null;
        int i7 = 0;
        int i10 = 0;
        boolean z8 = false;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        while (parcel.dataPosition() < d02) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i7 = com.bumptech.glide.c.Q(readInt, parcel);
                    break;
                case 2:
                    i10 = com.bumptech.glide.c.Q(readInt, parcel);
                    break;
                case 3:
                    z8 = com.bumptech.glide.c.M(readInt, parcel);
                    break;
                case 4:
                    i11 = com.bumptech.glide.c.Q(readInt, parcel);
                    break;
                case 5:
                    z10 = com.bumptech.glide.c.M(readInt, parcel);
                    break;
                case 6:
                    str = com.bumptech.glide.c.r(readInt, parcel);
                    break;
                case 7:
                    i12 = com.bumptech.glide.c.Q(readInt, parcel);
                    break;
                case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                    str2 = com.bumptech.glide.c.r(readInt, parcel);
                    break;
                case '\t':
                    bVar = (J5.b) com.bumptech.glide.c.q(parcel, readInt, J5.b.CREATOR);
                    break;
                default:
                    com.bumptech.glide.c.b0(readInt, parcel);
                    break;
            }
        }
        com.bumptech.glide.c.y(d02, parcel);
        return new a(i7, i10, z8, i11, z10, str, i12, str2, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new a[i7];
    }
}
