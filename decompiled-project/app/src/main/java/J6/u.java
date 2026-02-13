package J6;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class u extends j implements v {
    @Override // J6.j
    public final boolean a(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) k.a(parcel, Bundle.CREATOR);
        k.b(parcel);
        b(bundle);
        return true;
    }
}
