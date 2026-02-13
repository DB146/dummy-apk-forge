package Jc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.l;

/* loaded from: classes2.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        l.e(parcel, "parcel");
        String readString = parcel.readString();
        String str = readString == null ? "" : readString;
        String readString2 = parcel.readString();
        String str2 = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        String str3 = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        String str4 = readString4 == null ? "" : readString4;
        Class cls = Double.TYPE;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Double d10 = readValue instanceof Double ? (Double) readValue : null;
        String readString5 = parcel.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        String readString6 = parcel.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        String readString7 = parcel.readString();
        if (readString7 == null) {
            readString7 = "";
        }
        String readString8 = parcel.readString();
        if (readString8 == null) {
            readString8 = "";
        }
        Object readValue2 = parcel.readValue(Integer.TYPE.getClassLoader());
        Integer num = readValue2 instanceof Integer ? (Integer) readValue2 : null;
        Object readValue3 = parcel.readValue(cls.getClassLoader());
        Double d11 = readValue3 instanceof Double ? (Double) readValue3 : null;
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        String readString11 = parcel.readString();
        if (readString11 == null) {
            readString11 = "product";
        }
        return new e(str, str2, str3, str4, d10, readString5, readString6, readString7, readString8, num, d11, readString9, readString10, readString11, parcel.createStringArrayList(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        return new e[i7];
    }
}
