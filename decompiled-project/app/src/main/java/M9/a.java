package M9;

import android.os.Parcel;
import android.os.Parcelable;
import com.kt.apps.core.extensions.ExtensionsChannel;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6843a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        switch (this.f6843a) {
            case 0:
                kotlin.jvm.internal.l.e(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                long readLong = parcel.readLong();
                boolean z8 = parcel.readInt() != 0;
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                String readString9 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    int i7 = 0;
                    while (i7 != readInt) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                        i7++;
                        readInt = readInt;
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new ExtensionsChannel(readString, readString2, readString3, readString4, readString5, readString6, readLong, z8, readString7, readString8, readString9, linkedHashMap, parcel.readString());
            default:
                kotlin.jvm.internal.l.e(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), c.valueOf(parcel.readString()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f6843a) {
            case 0:
                return new ExtensionsChannel[i7];
            default:
                return new d[i7];
        }
    }
}
