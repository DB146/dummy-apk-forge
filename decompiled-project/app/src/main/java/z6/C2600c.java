package z6;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: z6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2600c extends H1.b {
    public static final Parcelable.Creator<C2600c> CREATOR = new y(10);

    /* renamed from: c, reason: collision with root package name */
    public final int f28332c;

    public C2600c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f28332c = parcel.readInt();
    }

    public C2600c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f28332c = sideSheetBehavior.f15424h;
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f28332c);
    }
}
