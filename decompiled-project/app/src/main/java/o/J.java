package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import ma.C1654e;

/* loaded from: classes.dex */
public final class J extends View.BaseSavedState {
    public static final Parcelable.Creator<J> CREATOR = new C1654e(16);

    /* renamed from: a, reason: collision with root package name */
    public boolean f21395a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeByte(this.f21395a ? (byte) 1 : (byte) 0);
    }
}
