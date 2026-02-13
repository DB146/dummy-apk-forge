package a6;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.N;
import com.google.android.gms.common.api.internal.Y;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: a6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0780d extends zab {
    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i10) {
        switch (i7) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case P1.g.BYTES_FIELD_NUMBER /* 8 */:
                h hVar = (h) zac.zaa(parcel, h.CREATOR);
                zac.zab(parcel);
                N n6 = (N) this;
                n6.f14948b.post(new Y(2, n6, hVar));
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
