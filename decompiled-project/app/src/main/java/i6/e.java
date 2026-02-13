package i6;

import C6.y;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class e extends H1.b {
    public static final Parcelable.Creator<e> CREATOR = new y(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f18438c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18439d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18440e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f18441f;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f18442u;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18438c = parcel.readInt();
        this.f18439d = parcel.readInt();
        this.f18440e = parcel.readInt() == 1;
        this.f18441f = parcel.readInt() == 1;
        this.f18442u = parcel.readInt() == 1;
    }

    public e(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f18438c = bottomSheetBehavior.L;
        this.f18439d = bottomSheetBehavior.f15214e;
        this.f18440e = bottomSheetBehavior.f15208b;
        this.f18441f = bottomSheetBehavior.f15189I;
        this.f18442u = bottomSheetBehavior.f15190J;
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeInt(this.f18438c);
        parcel.writeInt(this.f18439d);
        parcel.writeInt(this.f18440e ? 1 : 0);
        parcel.writeInt(this.f18441f ? 1 : 0);
        parcel.writeInt(this.f18442u ? 1 : 0);
    }
}
