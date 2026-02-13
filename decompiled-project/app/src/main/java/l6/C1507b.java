package l6;

import a6.C0779c;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import h3.o;

/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507b extends View.BaseSavedState {
    public static final Parcelable.Creator<C1507b> CREATOR = new C0779c(27);

    /* renamed from: a, reason: collision with root package name */
    public int f19561a;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MaterialCheckBox.SavedState{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" CheckedState=");
        int i7 = this.f19561a;
        return o.p(sb2, i7 != 1 ? i7 != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        parcel.writeValue(Integer.valueOf(this.f19561a));
    }
}
