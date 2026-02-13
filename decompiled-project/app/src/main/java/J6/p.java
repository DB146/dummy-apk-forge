package J6;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class p extends j implements q {
    @Override // J6.j
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 == 2) {
            Bundle bundle = (Bundle) k.a(parcel, Bundle.CREATOR);
            k.b(parcel);
            e(bundle);
            return true;
        }
        if (i7 == 3) {
            Bundle bundle2 = (Bundle) k.a(parcel, Bundle.CREATOR);
            k.b(parcel);
            c(bundle2);
            return true;
        }
        if (i7 == 4) {
            Bundle bundle3 = (Bundle) k.a(parcel, Bundle.CREATOR);
            k.b(parcel);
            d(bundle3);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) k.a(parcel, Bundle.CREATOR);
        k.b(parcel);
        b(bundle4);
        return true;
    }
}
