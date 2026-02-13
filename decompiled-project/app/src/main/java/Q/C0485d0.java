package Q;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: Q.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485d0 implements Parcelable.ClassLoaderCreator {
    public static C0487e0 a(Parcel parcel, ClassLoader classLoader) {
        S s3;
        if (classLoader == null) {
            classLoader = C0485d0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            s3 = S.f8365c;
        } else if (readInt == 1) {
            s3 = S.f8368f;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(A3.c.f(readInt, "Unsupported MutableState policy ", " was restored"));
            }
            s3 = S.f8366d;
        }
        return new C0487e0(readValue, s3);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new C0487e0[i7];
    }
}
