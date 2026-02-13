package C6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class z extends H1.b {
    public static final Parcelable.Creator<z> CREATOR = new y(0);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3036c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3037d;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3036c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3037d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f3036c) + "}";
    }

    @Override // H1.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        TextUtils.writeToParcel(this.f3036c, parcel, i7);
        parcel.writeInt(this.f3037d ? 1 : 0);
    }
}
