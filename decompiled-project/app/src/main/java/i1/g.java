package i1;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class g extends H1.b {
    public static final Parcelable.Creator<g> CREATOR = new y(5);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f18203c;

    public g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f18203c = new SparseArray(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f18203c.append(iArr[i7], readParcelableArray[i7]);
        }
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        SparseArray sparseArray = this.f18203c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f18203c.keyAt(i10);
            parcelableArr[i10] = (Parcelable) this.f18203c.valueAt(i10);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i7);
    }
}
